public class Dispositivo {
    private String fabricante;
    private String modelo;
    private String microprocesador;
    private double tamanioPantalla;
    private String tipoPantalla;
    private int tamanioMemoriaNAND;
    private String sistemaOperativo;

    // Constructor
    public Dispositivo(String fabricante, String modelo, String microprocesador,
                       double tamanioPantalla, String tipoPantalla,
                       int tamanioMemoriaNAND, String sistemaOperativo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
        this.tamanioPantalla = tamanioPantalla;
        this.tipoPantalla = tipoPantalla;
        this.tamanioMemoriaNAND = tamanioMemoriaNAND;
        this.sistemaOperativo = sistemaOperativo;
    }

    // Getters y Setters
    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getMicroprocesador() { return microprocesador; }
    public void setMicroprocesador(String microprocesador) { this.microprocesador = microprocesador; }

    public double getTamanioPantalla() { return tamanioPantalla; }
    public void setTamanioPantalla(double tamanioPantalla) { this.tamanioPantalla = tamanioPantalla; }

    public String getTipoPantalla() { return tipoPantalla; }
    public void setTipoPantalla(String tipoPantalla) { this.tipoPantalla = tipoPantalla; }

    public int getTamanioMemoriaNAND() { return tamanioMemoriaNAND; }
    public void setTamanioMemoriaNAND(int tamanioMemoriaNAND) { this.tamanioMemoriaNAND = tamanioMemoriaNAND; }

    public String getSistemaOperativo() { return sistemaOperativo; }
    public void setSistemaOperativo(String sistemaOperativo) { this.sistemaOperativo = sistemaOperativo; }

    @Override
    public String toString() {
        return "Dispositivo [fabricante=" + fabricante + ", modelo=" + modelo + ", microprocesador=" + microprocesador
                + ", tamanioPantalla=" + tamanioPantalla + ", tipoPantalla=" + tipoPantalla
                + ", tamanioMemoriaNAND=" + tamanioMemoriaNAND + ", sistemaOperativo=" + sistemaOperativo + "]";
    }
}
