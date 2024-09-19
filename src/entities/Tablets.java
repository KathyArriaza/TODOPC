package entities;

import entities.Equipo;

public class Tablets extends Equipo {
    private String tamanioPantalla;
    private String tipoPantalla;
    private String tamanioMemoriaNAND;
    private String sistemaOperativo;

    // Constructor
    public Tablets(String fabricante, String modelo, String microprocesador,
                   String tamanioPantalla, String tipoPantalla,
                   String tamanioMemoriaNAND, String sistemaOperativo) {
        super(fabricante, modelo, microprocesador, "Memoria NAND: " + tamanioMemoriaNAND + " GB");
        this.tamanioPantalla = tamanioPantalla;
        this.tipoPantalla = tipoPantalla;
        this.tamanioMemoriaNAND = tamanioMemoriaNAND;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getTamanioPantalla() {
        return tamanioPantalla;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public String getTamanioMemoriaNAND() {
        return tamanioMemoriaNAND;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }


    @Override
    public String mostrarDetalles() {
        return null;
    }
}
