import java.util.Random;

public class rp41ejercicio8 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arraySeisEnteros = new int[6];

        for (int i = 0; i < arraySeisEnteros.length; i++) {
            arraySeisEnteros[i] = random.nextInt(100);
        }

        System.out.println("Del Array: ");
        MetodoImprimirSeisEnteros(arraySeisEnteros);

        System.out.println();

        System.out.println("Su orden inverso es:");
        MetodoImprimirInversaSeisEnteros(arraySeisEnteros);

    }

    public static void MetodoImprimirSeisEnteros(int[] array) {
        // Bucle que recorre todas las posiciones del array para imprimirlas
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
    }

    public static void MetodoImprimirInversaSeisEnteros(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

}
