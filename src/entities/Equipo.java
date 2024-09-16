package entities;

public abstract class Equipo {
    protected String fabricante;
    protected String modelo;
    protected String microprocesador;
    protected String memoria;

    public Equipo(String fabricante, String modelo, String microprocesador, String memoria) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
        this.memoria = memoria;
    }

    public abstract String mostrarDetalles();
}

