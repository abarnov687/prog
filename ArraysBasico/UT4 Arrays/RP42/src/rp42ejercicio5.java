import java.util.Scanner;

public class rp42ejercicio5 {
    public static void main(String[] args) {

        // Declarar variables
        String[] palabras = new String[8];
        String[] colores = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco",
                "morado" };

        // Pedir palabras al usuario
        System.out.println(" Ingresa a continuación 8 palabras: ");
        // Almacenar palabras en ArrayC
        GuardarPalabrasEnArray(palabras);
        // Ordenar palabras según si son colores o no
        palabras = OrdenarPalabras(palabras, colores);
        // Monstrar palabras reordenadas
        MostrarPalabras(palabras);

    }

    // Función que guarda las palabras ingresadas por el usuario
    public static void GuardarPalabrasEnArray(String[] palabras) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = scanner.nextLine().toLowerCase();
        }
        scanner.close();
    }

    public static String[] OrdenarPalabras(String[] palabras, String[] colores) {
        String[] arrayOrdenado = new String[palabras.length];
        int indiceColores = 0;
        int indiceResto = palabras.length -1;

        for (int i = 0; i < palabras.length; i++) {
            boolean esColor = false;

            for (int j = 0; j < colores.length; j++) {
                if (palabras[i].equals(colores[j])) {
                    esColor = true;
                    break;
                }
            }

            if (esColor) {
                arrayOrdenado[indiceColores] = palabras[i];
                indiceColores++;
            } else {
                arrayOrdenado[indiceResto] = palabras[i];
                indiceResto--;
            }
        }

        return arrayOrdenado;

    }

    public static void MostrarPalabras(String[] palabras) {
        System.out.println("\nPalabras reordenadas:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i] + " ");
        }

        System.out.println();
    }

}
