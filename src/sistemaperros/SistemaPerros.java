package sistemaperros;

import java.util.Scanner;
/**
 *
 * @author fran_
 */
public class SistemaPerros {

    public static void main(String[] args) {
        
        int opc;
        int socio;
        Perro busqueda;
        TablaDispersa tabla = new TablaDispersa();
        tabla.TablaDispersaEnlazada();

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("    .:SISTEMA PERROS:.");
            System.out.println("1 - Agregar un perro");
            System.out.println("2 - Buscar un perro");
            System.out.println("3 - Dar de baja un perro");
            System.out.println("4 - Salir");
            System.out.print("OPCION: ");
            opc = entrada.nextInt();
            entrada.nextLine();

            switch (opc) {

                case 1:
                    Perro perro = new Perro();
                    tabla.insertar(perro);
                    break;

                /*case 2:
                    System.out.println("Ingrese el código(número de socio) del perro a buscar: ");
                    socio = entrada.nextInt();

                    try {
                       
                       tabla.buscar(socio);
                 
                      
                    } catch (Exception e) {

                        System.out.println("No se encontró el perro en el sistema.");
                    }
                    break;*/

                case 3:
                    System.out.println("Ingrese el código(número de socio) del perro a eliminar: ");
                    socio = entrada.nextInt();
                    tabla.eliminar(socio);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opc != 4);
    }
}