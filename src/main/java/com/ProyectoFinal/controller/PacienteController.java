package com.ProyectoFinal.controller;

import com.ProyectoFinal.domain.Paciente;
import com.ProyectoFinal.service.PacienteService;
import com.ProyectoFinal.service.FirebaseStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
@RequestMapping("/paciente")
public class PacienteController {
 @Autowired
    private PacienteService pacienteService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var pacientes = pacienteService.getPaciente();
        model.addAttribute("pacientes", pacientes);
        model.addAttribute("totalpacientes", pacientes.size());
        return "/paciente/listado";
    }

    @GetMapping("/nuevo")
    public String pacienteNuevo(Paciente paciente) {
        return "/paciente/modifica";
    }

    @Autowired
    private FirebaseStorageService firebaseStorageService;

    @PostMapping("/guardar")
    public String pacienteGuardar(Paciente paciente,
            @RequestParam("imagenFile") MultipartFile imagenFile) {
        if (!imagenFile.isEmpty()) {
            pacienteService.save(paciente);
            paciente.setRutaImagen(
                    firebaseStorageService.cargaImagen(
                            imagenFile,
                            "paciente",
                            paciente.getCedula()));
        }
        pacienteService.save(paciente);
        return "redirect:/paciente/listado";
    }

    @GetMapping("/eliminar/{idPaciente}")
    public String pacienteEliminar(Paciente paciente) {
        pacienteService.delete(paciente);
        return "redirect:/paciente/listado";
    }

    @GetMapping("/modificar/{idPaciente}")
    public String pacienteModificar(Paciente paciente, Model model) {
        paciente = pacienteService.getPaciente(paciente);
        model.addAttribute("paciente", paciente);
        return "/paciente/modifica";
    }
}
