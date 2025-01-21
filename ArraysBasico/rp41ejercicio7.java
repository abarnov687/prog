import java.util.Random;

public class rp41ejercicio7 {
 
    public static void main(String[] args) {
        Random random = new Random();

        int[] arrayCincoNumeros = new int[5]; // Array de 5 números enteros

        // Bucle que actualiza el valor de cada posición con el aleatorio generado
        for (int i = 0; i < arrayCincoNumeros.length; i++) {
            arrayCincoNumeros[i] = random.nextInt(100); // Genera números entre 0 y 99
        }

        System.out.println("Del Array: ");
        MetodoImprimirCincoNumeros(arrayCincoNumeros);

        System.out.println();

        System.out.println("La media es: ");
        MetodoMediaCincoNumeros(arrayCincoNumeros);
    }

    public static void MetodoImprimirCincoNumeros(int[] array) {
        // Bucle para recorrer todas las posiciones del array e imprimirlas
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // Imprimir array
        }
    }

    public static void MetodoMediaCincoNumeros(int[] array) {
        int sumaCincoNumeros = 0; // Variable para almacenar la suma
        // Bucle para recorrer todas las posiciones del array y evaluarlas
        for (int i = 0; i < array.length; i++) {
            sumaCincoNumeros += array[i];
        }
        // Variable para almacenar la media
        int mediaCincoNumeros = sumaCincoNumeros / array.length;
        // Imprimir media
        System.out.println(mediaCincoNumeros);

    }
}
