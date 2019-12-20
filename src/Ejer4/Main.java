/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejer4;

/**
 *
 * @author César Fernández
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        ArrayList<pelicula> peliculas = new ArrayList<>();
        ArrayList<pelicula> acumuladas = new ArrayList<>();
        ArrayList<cliente> ClientesE = new ArrayList<>();
        ArrayList<empleados> empleadosA = new ArrayList<>();
        ArrayList<empleadoVentas> empleadoV = new ArrayList<>();
        ArrayList<documental> documentales = new ArrayList<>();
        ArrayList<serie> series = new ArrayList<>();
        String temp;
        int opc;
        do {
            temp = JOptionPane.showInputDialog("Bienvenido" 
                    +"\n*****************************************"
                    +"\n"
                    + "\n1- Cliente "
                    + "\n2- Empleado agente de ventas "
                    + "\n3- Empleado administrador "
                    + "\n4- Película "
                    + "\n5- Serie "
                    + "\n6- Documental "
                    + "\n7- Alquiler"
                    + "\n8- SALIR"
                    +"\n*****************************************"
                    + "\n\n Seleccione una opcion: ");
            opc = Integer.parseInt(temp);
            switch (opc) {
                case 1:
                    temp = JOptionPane.showInputDialog("Digite una opcion: \n "
                            + "\n1- Agregación "
                            + "\n2- Eliminación "
                            + "\n3- Consulta de todos los registros agregados"
                            + "\n4- Consulta de un registro en particula"
                            + "\n5- SALIR"
                            + "\n\n Seleccione una opcion: ");
                    opc = Integer.parseInt(temp);

                    switch (opc) {
                        case 1:
                            cliente clientes = new cliente();
                            clientes.setNombre(JOptionPane.showInputDialog("Digite el nombre del cliente"));
                            clientes.setApellido(JOptionPane.showInputDialog("Digite el apellido del cliente"));
                            clientes.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite la ID del cliente ")));
                            ClientesE.add(clientes);
                            break;
                        case 2:
                            ClientesE.clear();
                            break;
                        case 3:
                            temp = "";
                            int cont = 0,
                             index;
                            for (cliente clientesi : ClientesE) {
                                temp = temp + "\n Indice: " + cont
                                        + "\n Nombre: " + clientesi.getNombre()
                                        + "\n Apellido: " + clientesi.getApellido()
                                        + "\n ID: " + clientesi.getId()
                                        + "\n----------------------------";
                                cont++;
                            }
                            JOptionPane.showMessageDialog(null, temp);
                            break;
                        case 4:
                            int busc = Integer.parseInt(JOptionPane.showInputDialog("Digite la ID del cliente "));
                            for (cliente clientesi : ClientesE) {
                                if (busc == clientesi.getId()) {
                                    temp = temp + "\n Indice: "
                                            + "\n Nombre: " + clientesi.getNombre()
                                            + "\n Apellido: " + clientesi.getApellido()
                                            + "\n ID: " + clientesi.getId();

                                } else {
                                    JOptionPane.showMessageDialog(null, "No se encuentra ese usuario");
                                }

                                JOptionPane.showMessageDialog(null, temp);
                            }
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Salió del submenú");
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Digite una opcion valida");

                    }

                case 2:
                    temp = JOptionPane.showInputDialog("Digite una opcion: \n "
                            + "\n1- Agregación "
                            + "\n2- Eliminación "
                            + "\n3- Consulta de todos los registros agregados"
                            + "\n4- Consulta de un registro en particula"
                            + "\n5- SALIR"
                            + "\n\n Seleccione una opcion: ");
                    opc = Integer.parseInt(temp);

                    switch (opc) {
                        case 1:
                            empleadoVentas empleadoVe = new empleadoVentas();
                            empleadoVe.setNombreE(JOptionPane.showInputDialog("Digite el nombre del empleado agente de Ventas"));
                            empleadoVe.setApellidoE(JOptionPane.showInputDialog("Digite el apellido del empleado agente de ventas"));
                            empleadoVe.setIde(Integer.parseInt(JOptionPane.showInputDialog("Digite la ID del empleado agente de ventas ")));
                            empleadoVe.setHorario(JOptionPane.showInputDialog("Digite el horario del empleado agente de ventas"));
                            empleadoVe.setCantVentas(Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de ventas del empleado agente de ventas ")));

                            empleadoV.add(empleadoVe);
                            break;
                        case 2:
                            empleadoV.clear();
                            break;
                        case 3:
                            temp = "";
                            int cont = 0,
                             index;
                            for (empleadoVentas emple : empleadoV) {
                                temp = temp + "\n Indice: " + cont
                                        + "\n Nombre: " + emple.getNombreE()
                                        + "\n Apellido: " + emple.getApellidoE()
                                        + "\n ID: " + emple.getIde()
                                        + "\n Horario: " + emple.getHorario()
                                        + "\n Cantidad de ventas: " + emple.getCantVentas()
                                        + "\n----------------------------";
                                cont++;
                            }
                            JOptionPane.showMessageDialog(null, temp);
                            break;
                        case 4:
                            int busc = Integer.parseInt(JOptionPane.showInputDialog("Digite la ID del empleado agente de ventas"));
                            for (empleadoVentas emple : empleadoV) {
                                if (busc == emple.getIde()) {
                                    temp = temp + "\n Indice: "
                                            + "\n Nombre: " + emple.getNombreE()
                                            + "\n Apellido: " + emple.getApellidoE()
                                            + "\n ID: " + emple.getIde()
                                            + "\n Horario: " + emple.getHorario()
                                            + "\n Cantidad de ventas: " + emple.getCantVentas();
                                } else {
                                    JOptionPane.showMessageDialog(null, "No se encuentra ese usuario");
                                }
                                JOptionPane.showMessageDialog(null, temp);
                            }
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Salió del submenú");
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Digite una opcion valida");

                    }

                    break;
                case 3:
                    temp = JOptionPane.showInputDialog("Digite una opcion: \n "
                            + "\n1- Agregación "
                            + "\n2- Eliminación "
                            + "\n3- Consulta de todos los registros agregados"
                            + "\n4- Consulta de un registro en particula"
                            + "\n5- SALIR"
                            + "\n\n Seleccione una opcion: ");
                    opc = Integer.parseInt(temp);

                    switch (opc) {
                        case 1:
                            empleados empleadoA = new empleados();
                            empleadoA.setNombreE(JOptionPane.showInputDialog("Digite el nombre del empleado Administrador"));
                            empleadoA.setApellidoE(JOptionPane.showInputDialog("Digite el apellido del empleado agente de ventas"));
                            empleadoA.setIde(Integer.parseInt(JOptionPane.showInputDialog("Digite la ID del empleado agente de ventas ")));
                            empleadoA.setHorario(JOptionPane.showInputDialog("Digite el horario del empleado agente de ventas"));

                            empleadosA.add(empleadoA);
                            break;
                        case 2:
                            empleadosA.clear();
                            break;
                        case 3:
                            temp = "";
                            int cont = 0,
                             index;
                            for (empleados empleA : empleadosA) {
                                temp = temp + "\n Indice: " + cont
                                        + "\n Nombre: " + empleA.getNombreE()
                                        + "\n Apellido: " + empleA.getApellidoE()
                                        + "\n ID: " + empleA.getIde()
                                        + "\n Horario: " + empleA.getHorario()
                                        + "\n----------------------------";
                                cont++;
                            }
                            JOptionPane.showMessageDialog(null, temp);
                            break;
                        case 4:
                            int busc = Integer.parseInt(JOptionPane.showInputDialog("Digite la ID del empleado administrador"));
                            for (empleados empleA : empleadosA) {
                                if (busc == empleA.getIde()) {
                                    temp = temp + "\n Indice: "
                                            + "\n Nombre: " + empleA.getNombreE()
                                            + "\n Apellido: " + empleA.getApellidoE()
                                            + "\n ID: " + empleA.getIde()
                                            + "\n Horario: " + empleA.getHorario();

                                } else {
                                    JOptionPane.showMessageDialog(null, "No se encuentra ese usuario");
                                }
                                JOptionPane.showMessageDialog(null, temp);
                            }
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Salió del submenú");
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Digite una opcion valida");

                    }

                    break;
                case 4:
                    temp = JOptionPane.showInputDialog("Digite una opcion: \n "
                            + "\n1- Agregación "
                            + "\n2- Eliminación "
                            + "\n3- Consulta de todos los registros agregados"
                            + "\n4- Consulta de un registro en particula"
                            + "\n5- SALIR"
                            + "\n\n Seleccione una opcion: ");
                    opc = Integer.parseInt(temp);

                    switch (opc) {
                        case 1:
                            pelicula peliculita = new pelicula();
                            peliculita.setNombre(JOptionPane.showInputDialog("Digite el nombre de la pelicula"));
                            peliculita.setProductor(JOptionPane.showInputDialog("Digite el nombre del productor de la pelicula"));
                            peliculita.setGenero(JOptionPane.showInputDialog("Digite el genero de la pelicula"));
                            peliculita.setDirector(JOptionPane.showInputDialog("Digite el nombre del Director de la pelciula"));
                            peliculita.setDescripcion(JOptionPane.showInputDialog("Digite una descipcion de la pelicula"));
                            peliculita.setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Digite la duración en minutos de la pelicula ")));

                            peliculas.add(peliculita);
                            break;
                        case 2:

                            peliculas.clear();
                            break;
                        case 3:
                            temp = "";
                            int cont = 0,
                             index;
                            for (pelicula peli : peliculas) {
                                temp = temp + "\n Indice: " + cont
                                        + "\n Nombre de la pelicula: " + peli.getNombre()
                                        + "\n Nombre del productor de la pelicula: " + peli.getProductor()
                                        + "\n Genero de la pelicula: " + peli.getGenero()
                                        + "\n Nombre del director de la pelicula: " + peli.getDirector()
                                        + "\n Descripcion de la pelicula: " + peli.getDescripcion()
                                        + "\n Duracion de la pelicula en minutos: " + peli.getDuracion()
                                        + "\n----------------------------";
                                cont++;
                            }
                            JOptionPane.showMessageDialog(null, temp);
                            break;
                        case 4:
                            String busc = JOptionPane.showInputDialog("Digite el nombre de la pelicula ");
                            for (pelicula peli : peliculas) {
                                if (busc == peli.getNombre()) {

                                    temp = temp + "\n Indice: "
                                            + "\n Nombre de la pelicula: " + peli.getNombre()
                                            + "\n Nombre del productor de la pelicula: " + peli.getProductor()
                                            + "\n Genero de la pelicula: " + peli.getGenero()
                                            + "\n Nombre del director de la pelicula: " + peli.getDirector()
                                            + "\n Descripcion de la pelicula: " + peli.getDescripcion()
                                            + "\n Duracion de la pelicula en minutos: " + peli.getDuracion();

                                } else {
                                    JOptionPane.showMessageDialog(null, "No se encuentra esta pelicula");
                                }

                                JOptionPane.showMessageDialog(null, temp);
                            }
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Salió del submenú");
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Digite una opcion valida");

                    }
                    break;
                case 5:
                    temp = JOptionPane.showInputDialog("Digite una opcion: \n "
                            + "\n1- Agregación "
                            + "\n2- Eliminación "
                            + "\n3- Consulta de todos los registros agregados"
                            + "\n4- Consulta de un registro en particula"
                            + "\n5- SALIR"
                            + "\n\n Seleccione una opcion: ");
                    opc = Integer.parseInt(temp);

                    switch (opc) {
                        case 1:
                            serie serier = new serie();
                            serier.setDirector(JOptionPane.showInputDialog("Digite el nombre del Director de la serie"));
                            serier.setProductor(JOptionPane.showInputDialog("Digite el nombre del productor de la serie"));
                            serier.setGenero(JOptionPane.showInputDialog("Digite el genero de la pelicula"));
                            serier.setCapitulos(Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de capitulos de la seria ")));
                            series.add(serier);

                            break;
                        case 2:
                            series.clear();
                            break;
                        case 3:
                            temp = "";
                            int cont = 0,
                             index;
                            for (serie ser : series) {
                                temp = temp + "\n Indice: " + cont
                                        + "\n Nombre del productor de la serie: " + ser.getProductor()
                                        + "\n Genero de la serie: " + ser.getGenero()
                                        + "\n Nombre del director de la serie: " + ser.getDirector()
                                        + "\n Cantidad de capitulos de la serie: " + ser.getCapitulos()
                                        + "\n----------------------------";
                                cont++;
                            }
                            JOptionPane.showMessageDialog(null, temp);
                            break;
                        case 4:
                            String busc = JOptionPane.showInputDialog("Digite el nombre del productor de la serie ");
                            for (serie ser : series) {
                                if (busc == ser.getProductor()) {

                                    temp = temp + "\n Indice: "
                                            + "\n Nombre del productor de la serie: " + ser.getProductor()
                                            + "\n Genero de la serie: " + ser.getGenero()
                                            + "\n Nombre del director de la serie: " + ser.getDirector()
                                            + "\n Cantidad de capitulos de la serie: " + ser.getCapitulos();

                                } else {
                                    JOptionPane.showMessageDialog(null, "No se encuentra esta serie");
                                }

                                JOptionPane.showMessageDialog(null, temp);
                            }
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Salió del submenú");
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Digite una opcion valida");

                    }
                    break;

                case 6:
                    temp = JOptionPane.showInputDialog("Digite una opcion: \n "
                            + "\n1- Agregación "
                            + "\n2- Eliminación "
                            + "\n3- Consulta de todos los registros agregados"
                            + "\n4- Consulta de un registro en particula"
                            + "\n5- SALIR"
                            + "\n\n Seleccione una opcion: ");
                    opc = Integer.parseInt(temp);

                    switch (opc) {
                        case 1:
                            documental document = new documental();
                            document.setNombre(JOptionPane.showInputDialog("Digite el nombre del documental"));
                            document.setProductor(JOptionPane.showInputDialog("Digite el nombre del productor del documental"));
                            document.setGenero(JOptionPane.showInputDialog("Digite el genero del documental"));
                            document.setDirector(JOptionPane.showInputDialog("Digite el nombre del Director del documental"));

                            document.setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Digite la duración en minutos del documental")));

                            documentales.add(document);
                            break;
                        case 2:
                            documentales.clear();
                            break;
                        case 3:
                            temp = "";
                            int cont = 0,
                             index;
                            for (documental doc : documentales) {
                                temp = temp + "\n Indice: " + cont
                                        + "\n Nombre del documental: " + doc.getNombre()
                                        + "\n Nombre del productor del documental: " + doc.getProductor()
                                        + "\n Genero del domuental: " + doc.getGenero()
                                        + "\n Nombre del director del documental " + doc.getDirector()
                                        + "\n Duracion en minutos del documental: " + doc.getDuracion()
                                        + "\n----------------------------";
                                cont++;
                            }
                            JOptionPane.showMessageDialog(null, temp);
                            break;
                        case 4:
                            String busc = JOptionPane.showInputDialog("Digite el nombre del documental ");
                            for (documental doc : documentales) {
                                if (busc == doc.getNombre()) {

                                    temp = temp + "\n Indice: "
                                            + "\n Nombre del documental: " + doc.getNombre()
                                            + "\n Nombre del productor del documental: " + doc.getProductor()
                                            + "\n Genero del domuental: " + doc.getGenero()
                                            + "\n Nombre del director del documental " + doc.getDirector()
                                            + "\n Duracion en minutos del documental: " + doc.getDuracion();

                                } else {
                                    JOptionPane.showMessageDialog(null, "No se encuentra el documental");
                                }

                                JOptionPane.showMessageDialog(null, temp);
                            }
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Salió del submenú");
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Digite una opcion valida");

                    }
                    break;
                case 7:
                    temp = "";
                    int cont = 0,
                     index;
                    for (pelicula peli : peliculas) {
                        temp = temp + "\n Indice: " + cont
                                + "\n Nombre de la pelicula: " + peli.getNombre()
                                + "\n Nombre del productor de la pelicula: " + peli.getProductor()
                                + "\n Genero de la pelicula: " + peli.getGenero()
                                + "\n Nombre del director de la pelicula: " + peli.getDirector()
                                + "\n Descripcion de la pelicula: " + peli.getDescripcion()
                                + "\n Duracion de la pelicula en minutos: " + peli.getDuracion()
                                + "\n----------------------------";
                        cont++;
                    }
                    JOptionPane.showMessageDialog(null, temp);
                    index = Integer.parseInt(JOptionPane.showInputDialog("Digite el indice de la pelicula que desea alquilar"));
                    acumuladas.add(peliculas.get(index));

                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Gracias por preferirnos :)");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Digite una opcion valida");

            }

        } while (opc != 8);
    }
}
