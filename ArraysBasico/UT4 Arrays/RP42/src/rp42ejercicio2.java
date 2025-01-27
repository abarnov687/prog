import java.util.Scanner;

public class rp42ejercicio2 {
    public static void main(String[] args) {
        
        int[] arrayEj2 = new int[6];
        int[] rotarArrayEj2 = new int[6];

        MetodoPedirValores(arrayEj2); 

        MetodoRotarValores(arrayEj2, rotarArrayEj2);

        MetodoMostrarRotacion(rotarArrayEj2);
    }

    public static void MetodoPedirValores(int[] array) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Ingresa 6 valores numéricos enteros: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();
    }

    public static void MetodoRotarValores(int[] arrayEj2, int[] rotarArrayEj2) {
        for (int i = 0; i < arrayEj2.length - 1; i++) {
            rotarArrayEj2[i + 1] = arrayEj2[i];
        }

        rotarArrayEj2[0] = arrayEj2[arrayEj2.length - 1];
    }

    public static void MetodoMostrarRotacion(int[] rotarArrayEj2) {
        for (int i = 0; i < rotarArrayEj2.length; i++) {
            System.out.printf("%1d", rotarArrayEj2[i]);
        }
        System.out.println();
    }
    
}
