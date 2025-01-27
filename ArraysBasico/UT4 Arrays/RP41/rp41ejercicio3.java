public class rp41ejercicio3 {
    public static void main(String[] args) {
        // Declaración del array y sus elementos
        int[] arrayDiezEnteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Llamar al método que imprime los elementos del array
        MetodoListaDiezEnteros(arrayDiezEnteros); 

        // Declaración de variable suma que llama al método que la realiza
        int sumaDiezEnteros = MetodoSumaDiezEnteros(arrayDiezEnteros);

        // Imprimir la suma
        System.out.println("La suma de los elementos es: " + sumaDiezEnteros);
    }

    // Método para imprimir los elementos del array
    public static void MetodoListaDiezEnteros(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    // Método para sumar los elementos del array
    public static int MetodoSumaDiezEnteros(int[] array) {
        int sumaDiezEnteros = 0;

        for (int i = 0; i < array.length; i++) {
            sumaDiezEnteros += array[i];
        }

        return sumaDiezEnteros;
    }
}
