import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String[] clientes = new String[5];
        String[] dniCliente = new String[5];

        System.out.println("Código 1, Descripción “Normal”, precio 100.");
        System.out.println("Código 2, Descripción “Doble”, precio 200");
        System.out.println("Código 3, Descripción “Triple”, precio 300.");
        System.out.println("Código 4, Descripción “Suite”, precio 400");
        System.out.println("Código 5, Descripción “Deluxe”, precio 500.");
        System.out.println("Código 6 para enseñar registro actual de habitaciones.");

        int[] habitaciones = new int[5]; // Array para determinar tipo de habitacion

        System.out.println();
        System.out.print("Elige el tipo de habitación que deseas reservar (6 para ver registro actual) ");
        int habitacionElegida = scanner.nextInt(); // Pedir habitación

        scanner.nextLine();

        String descripcion = "";
        int precio = 0;
        int codigo = 0;

        switch (habitacionElegida) {
            case 1:
                codigo = 1;
                descripcion = "Normal";
                precio = 100;
                break;

            case 2:
                codigo = 2;
                descripcion = "Doble";
                precio = 200;
                break;

            case 3:
                codigo = 3;
                descripcion = "Triple";
                precio = 300;
                break;

            case 4:
                codigo = 1;
                descripcion = "Suite";
                precio = 400;
                break;

            case 5:
                codigo = 1;
                descripcion = "Deluxe";
                precio = 500;
                break;

            case 6:
                MostrarRegistro(habitaciones, clientes);
                break;

            default:
                System.out.println("No se reconoce la orden.");
                break;
        }

        boolean buscaHabitacion = true;
        while (buscaHabitacion) {

            for (int i = 0; i < habitaciones.length; i++) {
                int ocupada = 1;

                if (i != habitacionElegida) {
                    continue;
                }

                if (habitaciones[i] == 0) {

                    System.out.print("La habitación " + i + " está disponible. Se procede al registro: ");
                    habitaciones[i] = ocupada;

                    System.out.println();

                    System.out.print("Registro a nombre de: ");
                    String nombreRegistro = scanner.nextLine();
                    clientes[i] = nombreRegistro; // Guarda el nombre en la posición/habitación elegida en la lista de
                                                  // clientes

                    System.out.print("DNI: ");
                    String dniRegistro = scanner.nextLine().toUpperCase();
                    dniCliente[i] = dniRegistro; // Guarda el dni en la posición/habitación elegida en la lista de Dnis

                    System.out.print("Descuento aplicado: ");
                    int dctoRegistro = scanner.nextInt();

                    System.out.println("Se ha registrado la habitación " + i + "\n Código: " + codigo
                            + "\n Descripción: " + descripcion + "\n Precio: " + precio + "\nA nombre de "
                            + nombreRegistro + " con DNI " + dniRegistro + " y descuento del " + dctoRegistro + "% ");

                    buscaHabitacion = false;
                    MostrarRegistro(habitaciones, clientes);

                    scanner.nextLine();
                    return;
                }

                else {
                    if (habitaciones[i] != 0) {
                        System.out.println("La habitación " + i + " no está disponible.");
                        return;
                    }
                }
            }
        }

        scanner.close();
    }

    public static void MostrarRegistro(int[] habitaciones, String[] clientes) {
        System.out.println("REGISTRO ACTUAL:");
        for (int i = 0; i <= habitaciones.length; i++) {
            if (habitaciones[i] == 0) {
                clientes[i] = "Habitación libre ";
            } else {
                clientes[i] = "Habitación OCUPADA ";
            }

            System.out.print(" " + (i + 1) + " = " + clientes[i] + "\n");
        }
    }
}
