/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema3_escuelas;

/**
 *
 * @author LENOVO
 */
public class Escuelas {
    
    private String nombre;
    private String tipo;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    private double gastosProyectadoPorEstudiante;
    private double presupuesto;

    // Constructor
    public Escuelas(String nombre, String tipo, int numAlumnos, int numDocentes,
            int numSedes, double gastosProyectadoPorEstudiante) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numAlumnos = numAlumnos;
        this.numDocentes = numDocentes;
        this.numSedes = numSedes;
        this.gastosProyectadoPorEstudiante = gastosProyectadoPorEstudiante;
        this.presupuesto = numAlumnos * gastosProyectadoPorEstudiante;
    }

    // Métodos establecer (setters)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    public void setNumDocentes(int numDocentes) {
        this.numDocentes = numDocentes;
    }

    public void setNumSedes(int numSedes) {
        this.numSedes = numSedes;
    }

    public void setGastosProyectadoPorEstudiante(double gastosProyectadoPorEstudiante) {
        this.gastosProyectadoPorEstudiante = gastosProyectadoPorEstudiante;
    }

    // Métodos obtener (getters)
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public int getNumDocentes() {
        return numDocentes;
    }

    public int getNumSedes() {
        return numSedes;
    }

    public double getGastosProyectadoPorEstudiante() {
        return gastosProyectadoPorEstudiante;
    }

    public double getPresupuesto() {
        return presupuesto;
    }
}

