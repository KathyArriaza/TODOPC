package entities;

public class Laptops extends Equipo {
    private String tamanioDePantalla;
    private String capacidadDeDiscoDuro;

    public Laptops(String fabricante, String modelo, String microprocesador, String memoria, String tamanioDePantalla, String capacidadDeDiscoDuro) {
        super(fabricante, modelo, microprocesador, memoria);
        this.tamanioDePantalla = tamanioDePantalla;
        this.capacidadDeDiscoDuro = capacidadDeDiscoDuro;
    }

    public String getTamanioDePantalla() {
        return tamanioDePantalla;
    }

    public String getCapacidadDeDiscoDuro() {
        return capacidadDeDiscoDuro;
    }

    @Override
    public String mostrarDetalles() {
        return "Fabricante: " + this.fabricante + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Microprocesador: " + this.microprocesador + "\n" +
                "Memoria: " + this.memoria + "\n" +
                "Tamaño de pantalla: " + this.tamanioDePantalla + "\n" +
                "Capacidad de disco duro: " + this.capacidadDeDiscoDuro;
    }
}






