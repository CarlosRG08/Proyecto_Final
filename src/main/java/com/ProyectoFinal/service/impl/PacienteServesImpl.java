package com.ProyectoFinal.service.impl;

import com.ProyectoFinal.dao.PacienteDao;
import com.ProyectoFinal.domain.Paciente;
import com.ProyectoFinal.service.PacienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class PacienteServesImpl {
    
//La anotacion autowired crea un unico objeto sin hacer new.
    @Autowired
    private PacienteDao pacienteDao;

    
    @Transactional(readOnly = true)
    public List<Paciente> getPaciente() {
        var lista = pacienteDao.findAll();
        return lista;
    }

    
    @Transactional(readOnly = true)
    public Paciente getCategoria(Paciente paciente) {
        return pacienteDao.findById(paciente.getCedula()).orElse(null);
    }

    @Transactional
    public void save(Paciente paciente) {
        pacienteDao.save(paciente);
    }

    @Transactional
    public void delete(Paciente paciente) {
        pacienteDao.delete(paciente);
    }
}

