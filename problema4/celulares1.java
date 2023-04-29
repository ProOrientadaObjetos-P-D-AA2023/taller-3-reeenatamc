/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Celulares1;

/**
 *
 * @author LENOVO
 */
public class celulares1 {
    private String marca;
    private String modelo;
    private String sistemaOperativo;
    private double tamanoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String informacionIMEI;

    // Constructor
    public celulares1(String marca, String modelo, String sistemaOperativo, double tamanoPantalla, double costoInicial, double ivaPorcentaje, String direccionMac, String informacionIMEI) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.ivaCostoInicial = costoInicial * ivaPorcentaje / 100;
        this.costoFinal = costoInicial + ivaCostoInicial;
        this.direccionMac = direccionMac;
        this.informacionIMEI = informacionIMEI;
    }

    // Métodos establecer (setters)
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
        this.ivaCostoInicial = costoInicial * ivaPorcentaje / 100;
        this.costoFinal = costoInicial + ivaCostoInicial;
    }

    public void setIvaPorcentaje(double ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
        this.ivaCostoInicial = costoInicial * ivaPorcentaje / 100;
        this.costoFinal = costoInicial + ivaCostoInicial;
    }

    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }

    public void setInformacionIMEI(String informacionIMEI) {
        this.informacionIMEI = informacionIMEI;
    }

    // Métodos obtener (getters)
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public double getCostoInicial() {
        return costoInicial;
    }

    public double getIvaPorcentaje() {
        return ivaPorcentaje;
    }

    public double getIvaCostoInicial() {
        return ivaCostoInicial;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public String getDireccionMac() {
        return direccionMac;
    }

    public String getInformacionIMEI() {
        return informacionIMEI;
    }

}
