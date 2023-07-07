package com.ProyectoFinal.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "Paciente")

public class Paciente {

    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "cedula_pac")
    private Long cedula;
    private String nombre_comp_pac;
    private int edad_pac;
    private String provincia_pac;
    private String canton_pac;
    private String distrito_pac;
    private String estado_civil_pac;
    private String sintomologia;
    private String rutaImagen;
    private int masa_kg_pac;
    private int altura_pac;
    private boolean artritis;
    private boolean gota;
    private boolean lupus;
    private boolean fibromialgia;

    public Paciente() {

    }

    public Paciente(Long cedula, String nombre_comp_pac, int edad_pac, String provincia_pac, String canton_pac, String distrito_pac, String estado_civil_pac, String sintomologia,String rutaImagen, int masa_kg_pac, int altura_pac, boolean artritis, boolean gota, boolean lupus, boolean fibromialgia) {
        this.cedula = cedula;
        this.nombre_comp_pac = nombre_comp_pac;
        this.edad_pac = edad_pac;
        this.provincia_pac = provincia_pac;
        this.canton_pac = canton_pac;
        this.distrito_pac = distrito_pac;
        this.estado_civil_pac = estado_civil_pac;
        this.sintomologia = sintomologia;
        this.rutaImagen = rutaImagen;
        this.masa_kg_pac = masa_kg_pac;
        this.altura_pac = altura_pac;
        this.artritis = artritis;
        this.gota = gota;
        this.lupus = lupus;
        this.fibromialgia = fibromialgia;
    }
}
