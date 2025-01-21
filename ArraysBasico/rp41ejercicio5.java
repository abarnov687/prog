public class rp41ejercicio5 {
    public static void main(String[] args) {
     
        // Array de 8 elementos
        int[] arrayDiezAleatorios = {0, 1, 2, 3, 4, 5, 6, 7, 8};

        // Llamada al método que imprime los elementos del array
        MetodoImprimirDiezAleatorios(arrayDiezAleatorios);

        System.out.println();
        System.out.println(" Valores pares: ");
        MetodoValoresPares(arrayDiezAleatorios);

        System.out.println();
        System.out.println(" Valores impares: ");
        MetodoValoresImpares(arrayDiezAleatorios);

    }

    // Método para imprimir cada elemento del array
    public static void MetodoImprimirDiezAleatorios(int[] array) {
        // Variable para mover entre las posiciones del array
        int imprimirDiezAleatorios = array[0];
        // Bucle para imprimir cada posición e imprimirla
        while (imprimirDiezAleatorios < array.length) {
            imprimirDiezAleatorios++;
            System.out.print(imprimirDiezAleatorios + " ");
        }
    }
    // Método para evaluar cada elemento e imprimir los valores pares
    public static void MetodoValoresPares(int[] array) {
        // Variable para mover entre las posiciones del array
        int imprimirValoresPares = array[0];
        // Bucle que evalua cada posicion e imprime los valores pares
        for (int i = 0; i < array.length; i++) {
            if ((imprimirValoresPares % 2) == 0) {
                System.out.print(imprimirValoresPares + " ");
            }
            imprimirValoresPares++;
        }
    }

    public static void MetodoValoresImpares(int[] array) {
        // Variable para mover entre las posiciones del array
        int imprimirValoresImpares = array[0];
        // Bucle que evalúa cada posición e imprime valores impares
        for (int i = 0; i < array.length; i++) {
            if ((imprimirValoresImpares % 2) != 0) {
                System.out.print(imprimirValoresImpares + " ");
            }
            imprimirValoresImpares++;
        }
    }
}

