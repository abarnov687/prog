import java.util.Random;

public class rp42ejercicio1 {

    public static void main(String[] args) {
        
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        MetodoAsignarAleatorios(numero);

        MetodoCuadrado(numero, cuadrado);

        MetodoCubo(numero, cuadrado);

        MetodoMostrarResultado(numero, cuadrado, cubo);


    }

    // Rellenar el array numeros con valores random
    public static void MetodoAsignarAleatorios(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

    }

    // ingresa el cuadrado de los números del primer array en el segundo array
    public static void MetodoCuadrado(int[] numero, int[] cuadrado) {
        for (int i = 0; i < numero.length; i++) {
            cuadrado[i] = numero[i] * numero[i];
        }
    }

    // ingresa el cubo de los números del primer array en el tercer array
    public static void MetodoCubo(int[] numero, int[] cubo) {
        for (int i = 0; i < numero.length; i++) {
            cubo[i] = numero[i] * numero[i] * numero[i];
        }
    }

    // %6d  | %8d  | %4d\n - número indica los caracteres de ancho, d indica que el valor a mostrar es un entero
    public static void MetodoMostrarResultado(int[] numero, int[] cuadrado, int[] cubo) {
        System.out.println("Numero  | Cuadrado  | Cubo ");
        for (int i = 0; i < numero.length; i++) {
            System.out.printf("%6d  | %8d  | %4d\n", numero[i], cuadrado[i], cubo[i]);
        }
    }


}