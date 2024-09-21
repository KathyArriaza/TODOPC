import entities.Desktop;
import entities.Laptops;
import entities.Tablets;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Desktop> listaDesktops = new ArrayList<>();
    static List<Tablets> listaTablets = new ArrayList<>();
    static List<Laptops> listaLaptops = new ArrayList<>();

    public static void main(String[] args) {
        menuOpciones();
    }

    private static void menuOpciones() {
        String[] opcionesMenu = {"Registrar equipo", "Ver equipos", "Salir"};
        String[] opcionesEquipos = {"Desktop", "Laptop", "Tablet"};

        boolean continuar = true;

        while (continuar) {
            int seleccionOpcion = JOptionPane.showOptionDialog(
                    null,
                    "Selecciona una opción",
                    "Menú principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcionesMenu,
                    opcionesMenu[0]
            );

            if (seleccionOpcion == -1) {
                continuar = false;
                break;
            }

            if (seleccionOpcion == 0 || seleccionOpcion == 1) {
                String equipoSeleccionado = (String) JOptionPane.showInputDialog(
                        null,
                        "Selecciona el tipo de equipo",
                        seleccionOpcion == 0 ? "Registrar equipo" : "Ver equipo",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        opcionesEquipos,
                        opcionesEquipos[0]
                );

                if (equipoSeleccionado != null && seleccionOpcion == 0) {
                    registrarEquipos(equipoSeleccionado);
                } else if (equipoSeleccionado != null && seleccionOpcion == 1) {
                    mostrarEquipos(equipoSeleccionado);
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna opción.");
                }
            } else if (seleccionOpcion == 2) {
                continuar = false; // Salir
            }
        }
        JOptionPane.showMessageDialog(null, "Programa finalizado.");
    }

    private static String solicitarDatosEntrada(String mensaje) {
        String entrada;
        do {
            entrada = JOptionPane.showInputDialog(mensaje);
            if (entrada == null || entrada.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                        null,
                        "El campo no puede estar vacío. Inténtalo de nuevo.",
                        "Error", JOptionPane.ERROR_MESSAGE
                );
            }
        } while (entrada == null || entrada.trim().isEmpty());

        return entrada;
    }

    public static void registrarEquipos(String equipo) {
        switch (equipo) {
            case "Desktop":
                String fabricanteDesktop = solicitarDatosEntrada("Ingrese el fabricante:");
                String modeloDesktop = solicitarDatosEntrada("Ingrese el modelo:");
                String microprocesadorDesktop = solicitarDatosEntrada("Ingrese el microprocesador:");
                String memoriaDesktop = solicitarDatosEntrada("Ingrese la memoria:");
                String tarjetaGraficaDesktop = solicitarDatosEntrada("Ingrese la tarjeta grafica:");
                String tamanioTorreDesktop = solicitarDatosEntrada("Ingrese el tamaño de la torre:");
                String capacidadDiscoDuroDesktop = solicitarDatosEntrada("Ingrese la capacidad del disco duro:");

                Desktop nuevoDesktop = new Desktop(
                        fabricanteDesktop,
                        modeloDesktop,
                        microprocesadorDesktop,
                        memoriaDesktop,
                        tarjetaGraficaDesktop,
                        tamanioTorreDesktop,
                        capacidadDiscoDuroDesktop
                );

                listaDesktops.add(nuevoDesktop);
                JOptionPane.showMessageDialog(null, "Desktop registrado exitosamente!!!");

                break;
            case "Laptop":
                String fabricanteLaptop = solicitarDatosEntrada("Ingrese el fabricante:");
                String modeloLaptop = solicitarDatosEntrada("Ingrese el modelo:");
                String microprocesadorLaptop = solicitarDatosEntrada("Ingrese el microprocesador:");
                String memoriaLaptop = solicitarDatosEntrada("Ingrese la memoria:");
                String tamanioPantallaLaptop = solicitarDatosEntrada("Ingrese el tamaño de la pantalla:");
                String capacidadDiscoDuroLaptop = solicitarDatosEntrada("Ingrese la capacidad del disco duro:");

                Laptops nuevaLaptop = new Laptops(
                        fabricanteLaptop,
                        modeloLaptop,
                        microprocesadorLaptop,
                        memoriaLaptop,
                        tamanioPantallaLaptop,
                        capacidadDiscoDuroLaptop
                );

                listaLaptops.add(nuevaLaptop);
                JOptionPane.showMessageDialog(null, "Laptop registrada exitosamente!!");

                break;

            case "Tablet":
                String fabricanteTablet = solicitarDatosEntrada("Ingrese el fabricante:");
                String modeloTablet = solicitarDatosEntrada("Ingrese el modelo:");
                String microprocesadorTablet = solicitarDatosEntrada("Ingrese el microprocesador:");
                String tamanioDiagonalPantallaTablet = solicitarDatosEntrada("Ingrese el tamaño diagonal de la pantalla:");
                String capacitivaResistivaTablet = solicitarDatosEntrada("¿Capacitiva/Resistiva?:");
                String tamanioMemoriaNAND = solicitarDatosEntrada("Ingrese el tamaño de la memoria NAND:");
                String sistemaOperativoTablet = solicitarDatosEntrada("Ingrese el sistema operativo:");

                Tablets tablet = new Tablets(
                        fabricanteTablet,
                        modeloTablet,
                        microprocesadorTablet,
                        tamanioDiagonalPantallaTablet,
                        capacitivaResistivaTablet,
                        tamanioMemoriaNAND,
                        sistemaOperativoTablet
                );

                listaTablets.add(tablet);
                JOptionPane.showMessageDialog(null, "Tablet registrada exitosamente!! ");

                break;
        }
    }

    private static void mostrarEquipos(String equipo) {
        // Definimos las columnas que cada equipo tiene en común
        String[] columnas;

        if (!equipo.equals("Tablet")) {
            columnas = new String[]{"Fabricante", "Modelo", "Microprocesador", "Memoria"};
        } else {
            columnas = new String[]{"Fabricante", "Modelo", "Microprocesador"};
        }

        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        switch (equipo) {
            case "Desktop":

                for (Desktop desktop : listaDesktops) {
                    modelo.addColumn("Tarjeta grafica");
                    modelo.addColumn("Tamaño de Torre");
                    modelo.addColumn("Capacidad de disco duro");

                    modelo.addRow(new Object[]{

                            desktop.getFabricante(),
                            desktop.getModelo(),
                            desktop.getMicroprocesador(),
                            desktop.getMemoria(),
                            desktop.getTarjetaGrafica(),
                            desktop.getTamanoTorre(),
                            desktop.getCapacidadDiscoDuro()
                    });
                }

                break;
            case "Laptop":
                modelo.addColumn("Tamaño de Pantalla");
                modelo.addColumn("Capacidad de Disco Duro");

                for (Laptops laptop : listaLaptops) {
                    modelo.addRow(new Object[]{
                            laptop.getFabricante(),
                            laptop.getModelo(),
                            laptop.getMicroprocesador(),
                            laptop.getMemoria(),
                            laptop.getTamanioDePantalla(),
                            laptop.getCapacidadDeDiscoDuro()
                    });
                }

                break;
            case "Tablet":
                modelo.addColumn("Tamaño de Pantalla");
                modelo.addColumn("¿ Capacitiva / Resistiva ?");
                modelo.addColumn("Tamaño de memoria NAND");
                modelo.addColumn("Sistema Operativo");

                for (Tablets tablet : listaTablets) {
                    modelo.addRow(new Object[]{
                            tablet.getFabricante(),
                            tablet.getModelo(),
                            tablet.getMicroprocesador(),
                            tablet.getTamanioPantalla(),
                            tablet.getTipoPantalla(),
                            tablet.getTamanioMemoriaNAND(),
                            tablet.getSistemaOperativo(),

                    });
                }

                break;
        }

        JTable tabla = new JTable(modelo);
        tabla.setFillsViewportHeight(true);

        // Se hace ciclo para ajustar el tamaño de las columnas
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            int width = 0;
            for (int j = 0; j < modelo.getRowCount(); j++) {
                TableCellRenderer renderer = tabla.getCellRenderer(j, i);
                Component comp = renderer.getTableCellRendererComponent(tabla, modelo.getValueAt(j, i), false, false, j, i);
                width = Math.max(width, comp.getPreferredSize().width);
            }
            tabla.getColumnModel().getColumn(i).setPreferredWidth(width + 10); // +10 para padding
        }

        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setPreferredSize(new Dimension(900, 600)); // Ajusta el tamaño según necesites

        JOptionPane.showMessageDialog(
                null,
                scrollPane,
                "Lista de " + equipo,
                JOptionPane.INFORMATION_MESSAGE
        );

    }

}