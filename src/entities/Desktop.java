package entities;

public class Desktop extends Equipo {
    private String tarjetaGrafica;
    private String tamanoTorre;
    private String capacidadDiscoDuro;

    // Constructor
    public Desktop(String fabricante, String modelo, String microprocesador, String memoria,
                   String tarjetaGrafica, String tamanoTorre, String capacidadDiscoDuro) {
        
        // Llamada al constructor de la clase padre (Equipo)
        super(fabricante, modelo, microprocesador, memoria);
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamanoTorre = tamanoTorre;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    // Métodos getters y setters para los nuevos atributos
    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public String getTamanoTorre() {
        return tamanoTorre;
    }

    public void setTamanoTorre(String tamanoTorre) {
        this.tamanoTorre = tamanoTorre;
    }

    public String getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    public void setCapacidadDiscoDuro(String capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    // Implementación del método abstracto mostrarDetalles()
    @Override
    public String mostrarDetalles() {
        return "Fabricante: " + fabricante + "\n" +
                "Modelo: " + modelo + "\n" +
                "Microprocesador: " + microprocesador + "\n" +
                "Memoria: " + memoria + "\n" +
                "Tarjeta Gráfica: " + tarjetaGrafica + "\n" +
                "Tamaño de Torre: " + tamanoTorre + "\n" +
                "Capacidad de Disco Duro: " + capacidadDiscoDuro;
    }
}
