package com.ProyectoFinal.dao;

import com.ProyectoFinal.domain.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteDao extends JpaRepository<Paciente, Long> {
    
}
