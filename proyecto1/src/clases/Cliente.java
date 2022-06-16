/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Eddy Guarnizo
 * Fecha: 15 de Junio 
 */
public class Cliente  implements Serializable{
    int identidad;
    String nombres;
    String fechaInicio;

    public Cliente() {
    }

    public Cliente(int identidad, String nombres, String fechaInicio) {
        this.identidad = identidad;
        this.nombres = nombres;
        this.fechaInicio = fechaInicio;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getIdentidad() {
        return identidad;
    }

    public String getNombres() {
        return nombres;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    @Override
    public String toString() {
        return "Cliente{" + "identidad=" + identidad + ", nombres=" + nombres + ", fechaInicio=" + fechaInicio + '}';
    }
    
}
