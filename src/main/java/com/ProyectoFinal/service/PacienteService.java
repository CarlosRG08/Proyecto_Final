package com.ProyectoFinal.service;
import java.util.List;
import com.ProyectoFinal.domain.Paciente;

public interface PacienteService {
    // Se obtiene un listado de condominios en un List

    public List<Paciente> getPaciente();

    // Se obtiene un Condominio, a partir del id de un categoria
    public Paciente getPaciente(Paciente Paciente);

    // Se inserta un nuevo condominio si el id del condominio esta vacío
    public void insert(Paciente Paciente);

    // Se actualiza un condominio si el id del condominio NO esta vacío
    public void save(Paciente Paciente);

    // Se elimina el condominio que tiene el id pasado por parámetro
    public void delete(Paciente Paciente);

}
