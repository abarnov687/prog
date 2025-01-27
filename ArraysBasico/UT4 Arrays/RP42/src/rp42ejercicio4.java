import java.util.Random;

public class rp42ejercicio4 {
    public static void main(String[] args) {

        int[] arrayEj4 = new int[20]; // Array original

        // Llama a función que rellena las posiciones del array con valores random
        ConvertirArrayRandom(arrayEj4);
        // Muestra el array random llamando a la función
        System.out.println("Array random: ");
        MostrarArrayRandom(arrayEj4);
        // Reordena según pares e impares
        ReordenarArray(arrayEj4);
        System.out.println();
        // Muestra el array ordenado llamando a la función
        System.out.println("Array ordenado: ");
        MostrarArrayReordenado(arrayEj4);

    }

    // Función que rellena las posiciones del array con valores random
    public static void ConvertirArrayRandom(int[] arrayEj4) {
        Random random = new Random();
        for (int i = 0; i < arrayEj4.length; i++) {
            arrayEj4[i] = random.nextInt(101);
        }
    }

    // Función que imprime el array relleno de valores random
    public static void MostrarArrayRandom(int[] arrayEj4) {
        for (int i = 0; i < arrayEj4.length; i++) {
            System.out.print(arrayEj4[i] + " ") ;
        }
    }

    public static void ReordenarArray(int[] arrayEj4) {
        int[] arrayPares = new int[arrayEj4.length];
        int[] arrayImpares = new int[arrayEj4.length];
        int indicePares = 0;
        int indiceImpares = 0;

        for (int i = 0; i < arrayEj4.length; i++) {
            if ((arrayEj4[i] % 2) == 0) {
                arrayPares[indicePares++] = arrayEj4[i];
            } else {
                arrayImpares[indiceImpares++] = arrayEj4[i];
            }
        }

        for (int i = 0; i < indicePares; i++) {
            arrayEj4[i] = arrayPares[i];
        }

        for (int i = 0; i < indiceImpares; i++) {
            arrayEj4[indicePares + i] = arrayImpares[i];
        }
    }

    public static void MostrarArrayReordenado(int[] arrayEj4) {
        for (int i = 0; i < arrayEj4.length; i++) {
            System.out.print(arrayEj4[i] + " ");
        }
    }

}
