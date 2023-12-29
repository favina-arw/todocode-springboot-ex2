/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.favinaarw.ejerciciosspringbootdos.controller;

import com.favinaarw.ejerciciosspringbootdos.model.JugadorBasquet;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author federico
 */
@RestController
public class ExercisesController {
    @GetMapping("/")
    public String holaMundo(){
        return "Hola mundo";
    }
    
    @GetMapping("/promedio")
        public String calcularPromedio( @RequestParam double notaUno, @RequestParam double notaDos, @RequestParam double notaTres){
        return "El promedio del conjunto de sus notas es de: " + ((notaUno + notaDos + notaTres) / 3);
    }
        
    @PostMapping("/jugadores")
    public String calcularPromedioEstatura(@RequestBody List<JugadorBasquet> jugadores){
        double suma_estaturas = 0 ;
        double promedio_estaturas = 0;
        
        List<JugadorBasquet> equipo = new ArrayList<JugadorBasquet>();
        equipo = jugadores;
        
        for (JugadorBasquet jb : equipo) {
            suma_estaturas += jb.getEstatura();
        }
        
        promedio_estaturas = suma_estaturas/equipo.size();
        
        return "Jugadores registrados correctamente. El promedio de estatura del equipo es de " + promedio_estaturas;
    }
        
    @GetMapping("/calcular")
    public String calcularAreaTriangulo(@RequestParam double base, @RequestParam double altura){
        return "El area del triangulo es de " + (base*altura)/2;
    }
    
}
