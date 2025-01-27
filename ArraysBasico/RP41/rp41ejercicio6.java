
import java.util.Random;

public class rp41ejercicio6 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] diezValoresAleatorios = new int[10]; // Array de 10 valores enteros

        // Bucle que genera un valor aleatorio por cada itineración y lo guarda en cada posición del array
        for (int i = 0; i < diezValoresAleatorios.length; i++) {
            diezValoresAleatorios[i] = random.nextInt(100); // Genera valores aleatorios entre 0 y 99
        }

        System.out.println("Del Array: ");
        MetodoImprimirDiezValoresAleatorios(diezValoresAleatorios);

        System.out.println("Incremento en 1 en posiciones pares: ");
        MetodoIncrementarValoresPosicionesPares(diezValoresAleatorios);

        System.out.println("Multiplicación por 3 en posiciones impares: ");
        MetodoMultiplicarValoresPosicionesImpares(diezValoresAleatorios);

    }

    public static void MetodoImprimirDiezValoresAleatorios(int[] array) {
        // Bucle que recorre todas las posiciones del array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Posicion " +  i + ": "); // Imprime el número de posición
            System.out.println(array[i]); // Imprime el valor que contiene cada posición
        }
    }

    public static void MetodoIncrementarValoresPosicionesPares(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if ((i % 2) == 0) {
                array[i]++;
                System.out.println("Posición " + i + ": " + array[i]);
            }
        }
    }

    public static void MetodoMultiplicarValoresPosicionesImpares(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if ((i % 2) != 0) {
                array[i] *= 3;
                System.out.println("Posición " + i + ": " + array[i]);
            }
        }
    }

}
