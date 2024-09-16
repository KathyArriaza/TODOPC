public class Tablets extends Dispositivo {
    // Constructor
    public Tablets(String fabricante, String modelo, String microprocesador,
                   double tamanioPantalla, String tipoPantalla,
                   int tamanioMemoriaNAND, String sistemaOperativo) {
        super(fabricante, modelo, microprocesador, tamanioPantalla, tipoPantalla, tamanioMemoriaNAND, sistemaOperativo);
    }

    @Override
    public String toString() {
        return "Fabricante: " + getFabricante() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Microprocesador: " + getMicroprocesador() + "\n" +
                "Tamaño diagonal de pantalla: " + getTamanioPantalla() + "”\n" +
                "Tipo de pantalla: " + getTipoPantalla() + "\n" +
                "Tamaño memoria NAND: " + getTamanioMemoriaNAND() + " GB\n" +
                "Sistema Operativo: " + getSistemaOperativo();
    }
}
