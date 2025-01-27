import java.util.Random;
import java.util.Scanner;

public class rp41ejercicio9 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] diezEnterosRandom = new int[10]; // Array de 10 elementos

        // Bucle para recorrer todas las posiciones del array y convertirlas en números random
        for (int i = 0; i < diezEnterosRandom.length; i++) {
            diezEnterosRandom[i] = random.nextInt(21);
        }

        MetodoPedirNumeroYVerificarExistencia(diezEnterosRandom);

        MetodoImprimirDiezRandom(diezEnterosRandom);

    }

    // Método para verificar si el número ingresado está en el array
    public static void MetodoPedirNumeroYVerificarExistencia(int[] array) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int usuarioIngresaNumero = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < array.length; i++) {
            if (usuarioIngresaNumero == array[i]) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número " + usuarioIngresaNumero + " SÍ está dentro del array. ");
        } else {
            System.out.println("El número " + usuarioIngresaNumero + " NO está en el array. ");
        }

        scanner.close();
    }

    // Método para imprimir el array original
    public static void MetodoImprimirDiezRandom(int[] array) {
        System.out.println("Array original: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
}
