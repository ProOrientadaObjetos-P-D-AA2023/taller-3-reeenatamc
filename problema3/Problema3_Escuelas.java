/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejecutor;

import com.mycompany.problema3_escuelas.Escuelas;
import com.mycompany.problema3_escuelas.Escuelas;

/**
 *
 * @author LENOVO
 */

public class Problema3_Escuelas {

    public static void main(String[] args) {
        Escuelas institucion = new Escuelas("Bernardo Valdivieso", "Público", 500, 30, 1, 1000.0);

        // Mostrar los datos de la institución
        System.out.println("Nombre de la institución: " + institucion.getNombre());
        System.out.println("Tipo de institución: " + institucion.getTipo());
        System.out.println("Número de alumnos: " + institucion.getNumAlumnos());
        System.out.println("Número de docentes: " + institucion.getNumDocentes());
        System.out.println("Número de sedes: " + institucion.getNumSedes());
        System.out.println("Gastos proyectados por estudiante: $" + institucion.getGastosProyectadoPorEstudiante());
        System.out.println("Presupuesto total: $" + institucion.getPresupuesto());
    }
}
