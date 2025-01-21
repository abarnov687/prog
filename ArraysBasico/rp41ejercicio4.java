public class rp41ejercicio4 {
    public static void main(String[] args) {
        // Array de decimales
        float arrayOchoDecimales[] = { 1.1f, 1.2f, 1.3f, 1.4f, 1.5f, 1.6f, 1.7f, 1.8f};
        // Variable para almacenar método de búsqueda del máximo
        float buscaValorMaximo = MetodoBuscaValorMaximo(arrayOchoDecimales);
        // Variable para almacenar método de búsqueda del mínimo
        float buscaValorMinimo = MetodoBuscaValorMinimo(arrayOchoDecimales);
        // Impresión de los resultados de ambos métodos
        System.out.println(" Valor máximo: " + buscaValorMaximo);
        System.out.println(" Valor mínimo: " + buscaValorMinimo);

    }

    // Método que busca el valor máximo entre los elementos del array
    public static float MetodoBuscaValorMaximo(float[] array) {
        // iniciamos la variable valorMaximo en la posición 0 del array para actualizarla después
        float valorMaximo = array[0];
        // Bucle para itinerar cada elemento del array hasta localizar el máximo
        for (int i = 1; i < array.length; i++) {
            // Cuando el elemento posicionado que está evaluándose sea mayor al elemento array[0], se actualizará el valor máximo
            if (array[i] > valorMaximo) {
                valorMaximo = array[i];
            }
        }
        // Devuelve el valor máximo localizado
        return valorMaximo;
    }

    // Método que busca el valor mínimo entre los elementos del array
    public static float MetodoBuscaValorMinimo(float[] array) {
        // iniciamos la variable valorMinimo en la posición 0 del array para actualizarla después
        float valorMinimo = array[0];
        // Bucle para itinerar cada elemento del array hasta localizar el mínimo
        for (int i = 1; i < array.length; i++) {
            // Cuando el elemento posicionado que está evaluándose sea menor al elemento array[0], se actualizará el valor mínimo
            if (array[i] < valorMinimo) {
                valorMinimo = array[i];
            }
        }
        // Devuelve el valor mínimo localizado
        return valorMinimo;
    }
}
