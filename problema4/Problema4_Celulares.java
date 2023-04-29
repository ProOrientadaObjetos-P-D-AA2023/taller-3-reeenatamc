/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema4_celulares;

import Celulares1.celulares1;

/**
 *
 * @author LENOVO
 */
public class Problema4_Celulares {

    public static void main(String[] args) {
      // Crear un objeto de la clase celulares1
        celulares1 celular1 = new celulares1("Samsung", "Galaxy S21", "Android", 6.2, 999.99, 19, "AA:BB:CC:DD:EE:FF", "123456789012345");

        // Imprimir los valores de las propiedades del objeto
        System.out.println("Marca: " + celular1.getMarca());
        System.out.println("Modelo: " + celular1.getModelo());
        System.out.println("Sistema operativo: " + celular1.getSistemaOperativo());
        System.out.println("Tamaño de pantalla: " + celular1.getTamanoPantalla() + " pulgadas");
        System.out.println("Costo inicial: $" + celular1.getCostoInicial());
        System.out.println("Porcentaje de IVA: " + celular1.getIvaPorcentaje() + "%");
        System.out.println("Costo inicial con IVA: $" + celular1.getCostoFinal());
        System.out.println("Dirección MAC: " + celular1.getDireccionMac());
        System.out.println("Información IMEI: " + celular1.getInformacionIMEI());
    }
}
