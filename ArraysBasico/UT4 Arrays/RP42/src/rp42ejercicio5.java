import java.util.Scanner;

public class rp42ejercicio5 {
    public static void main(String[] args) {
        
        // Declarar variables
        String[] palabras = new String[8];
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco",
        "morado"};

        // Pedir palabras al usuario
        System.out.println(" Ingresa a continuación 8 palabras: ");
        // Almacenar palabras en ArrayC
        GuardarPalabrasEnArray(palabras);
        // Ordenar palabras según si son colores o no
        palabras = OrdenarPalabras(palabras, colores);
        // Monstrar palabras reordenadas
        MostrarPalabras(palabras, colores);

    }

    // Función que guarda las palabras ingresadas por el usuario
    public static void GuardarPalabrasEnArray(String[] palabras) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = scanner.nextLine();
        }

        scanner.close();
    }

    // Función que reordena las palabras
    public static void OrdenarPalabras(String[] palabras, String[] colores) {
        boolean esColor = false;
        String guardarColor = "";
        String guardarResto = "";
        while (esColor) {
            for (int i = 0; i < palabras.length; i++) {
                if (palabras[i].equals(colores[i])) {
                    guardarColor = palabras[i];
                    esColor = true;
                }
                else {
                    guardarResto = palabras[i + 1];
                }
            } 
        }
    }

}
