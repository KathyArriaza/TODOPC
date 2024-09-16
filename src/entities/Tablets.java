public class Tablets extends Equipo {
    private double tamanioPantalla;
    private String tipoPantalla;
    private int tamanioMemoriaNAND;
    private String sistemaOperativo;

    // Constructor
    public Tablets(String fabricante, String modelo, String microprocesador,
                   double tamanioPantalla, String tipoPantalla,
                   int tamanioMemoriaNAND, String sistemaOperativo) {
        super(fabricante, modelo, microprocesador, "Memoria NAND: " + tamanioMemoriaNAND + " GB");
        this.tamanioPantalla = tamanioPantalla;
        this.tipoPantalla = tipoPantalla;
        this.tamanioMemoriaNAND = tamanioMemoriaNAND;
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getTamanioPantalla() {
        return tamanioPantalla;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public int getTamanioMemoriaNAND() {
        return tamanioMemoriaNAND;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    @Override
    public String toString() {
        return "Fabricante: " + getFabricante() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Microprocesador: " + getMicroprocesador() + "\n" +
                "Tamaño diagonal de pantalla: " + tamanioPantalla + "”\n" +
                "Tipo de pantalla: " + tipoPantalla + "\n" +
                "Tamaño memoria NAND: " + tamanioMemoriaNAND + " GB\n" +
                "Sistema Operativo: " + sistemaOperativo;
    }
}
