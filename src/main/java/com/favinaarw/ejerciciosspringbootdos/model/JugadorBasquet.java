/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.favinaarw.ejerciciosspringbootdos.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author federico
 */
@Getter
@Setter
public class JugadorBasquet {
    private Long id;
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private Long peso;
    private Long estatura;

    public JugadorBasquet() {
    }

    public JugadorBasquet(Long id, int dni, String nombre, String apellido, int edad, Long peso, Long estatura) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

}
