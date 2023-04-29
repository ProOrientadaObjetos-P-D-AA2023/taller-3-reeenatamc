/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejecutor;

import com.mycompany.costoterreno.Terreno;

/**
 *
 * @author LENOVO
 */

public class CostoTerreno {
    public static void main(String[] args) {
        Terreno t1 = new Terreno(10, 20, 100);
        Terreno t2 = new Terreno(5, 30, 150);
        
        System.out.println("Terreno 1:");
        System.out.println("Ancho: " + t1.getAncho());
        System.out.println("Largo: " + t1.getLargo());
        System.out.println("Valor metro cuadrado: " + t1.getValorMetroCuadrado());
        System.out.println("Area: " + t1.getArea());
        System.out.println("Costo terreno: " + t1.getCosto_terreno());
        
        System.out.println("Terreno 2:");
        System.out.println("Ancho: " + t2.getAncho());
        System.out.println("Largo: " + t2.getLargo());
        System.out.println("Valor metro cuadrado: " + t2.getValorMetroCuadrado());
        System.out.println("Area: " + t2.getArea());
        System.out.println("Costo terreno: " + t2.getCosto_terreno());
    }
}
