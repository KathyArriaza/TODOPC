package entities;

public class Laptops extends Equipo {
    private String Fabricante;
    private String Modelo;
    private String Microprocesador;
    private String Memoria;
    private String Tamaño_de_pantalla;
    private String Capacidad_de_disco_duro;

    public Laptops(String Fabricante, String Modelo, String Microprocesador, String Memoria, String Tamaño_de_pantalla, String Capacidad_de_disco_duro)
    {


        super(Fabricante, Modelo, Microprocesador, Memoria);
        this.Fabricante = Fabricante;
        this.Modelo = Modelo;
        this.Microprocesador = Microprocesador;
        this.Memoria = Memoria;
        this.Tamaño_de_pantalla = Tamaño_de_pantalla;
        this.Capacidad_de_disco_duro = Capacidad_de_disco_duro;


    }

    public String getFabricante() {
        return Fabricante;
    }

    public String getModelo(String tarjetaGrafica) {
        return Modelo;
    }

    public String getMicroprocesador() {
        return Microprocesador;
    }

    public String getMemoria() {
        return Memoria;
    }

    public String getTamaño_de_pantalla() {
        return Tamaño_de_pantalla;
    }

    public String getCapacidad_de_disco_duro() {
        return Capacidad_de_disco_duro;
    }

    @Override
    public String mostrarDetalles() {
        return "Fabricante: " + this.Fabricante + "\n" +
                "Modelo: " + this.Modelo + "\n" +
                "Microprocesador: " + this.Microprocesador + "\n" +
                "Memoria: " + this.Memoria + "\n" +
                "Tamaño de pantalla: " + this.Tamaño_de_pantalla + "\n" +
                "Capacidad de disco duro: " + this.Capacidad_de_disco_duro;
    }
}





