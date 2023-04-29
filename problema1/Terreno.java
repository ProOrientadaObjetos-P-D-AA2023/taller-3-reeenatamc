/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.costoterreno;

/**
 *
 * @author LENOVO
 */
public class Terreno {
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public Terreno(double ancho, double largo, double valorMetroCuadrado) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetroCuadrado = valorMetroCuadrado;
        this.area = ancho * largo;
        this.costo_terreno = this.area * this.valorMetroCuadrado;
    }

    public double getCosto_terreno() {
        return costo_terreno;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getArea() {
        return area;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }
}
