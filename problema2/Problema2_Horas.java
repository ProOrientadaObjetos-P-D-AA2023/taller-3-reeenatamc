/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema2_horas;

import Hora.Hora;

/**
 *
 * @author LENOVO
 */
public class Problema2_Horas {

    public static void main(String[] args) {
        Hora equivalente = new Hora();
        equivalente.establecerHoras(24);
        equivalente.convertirHoras();
        System.out.println("Horas: " + equivalente.obtenerHoras());
        System.out.println("Minutos: " + equivalente.obtenerMinutos());
        System.out.println("Segundos: " + equivalente.obtenerSegundos());
        System.out.println("Días: " + equivalente.obtenerDias());
    }
}
