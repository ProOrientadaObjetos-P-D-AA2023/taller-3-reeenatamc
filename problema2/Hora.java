/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hora;

/**
 *
 * @author LENOVO
 */
public class Hora {
    private int horas;
    private int minutos;
    private int segundos;
    private double dias;

    public void establecerHoras(int horas) {
        this.horas = horas;
    }

    public int obtenerHoras() {
        return horas;
    }

    public int obtenerMinutos() {
        return minutos;
    }

    public int obtenerSegundos() {
        return segundos;
    }

    public double obtenerDias() {
        return dias;
    }

    public void convertirHoras() {
        minutos = horas * 60;
        segundos = horas * 3600;
        dias = (double) horas / 24;
    }
}
