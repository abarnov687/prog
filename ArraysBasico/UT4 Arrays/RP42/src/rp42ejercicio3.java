import java.util.Scanner;

public class rp42ejercicio3 {
    
    public static void main(String[] args) {
        
        // Arrays temperatura y meses
        double[] arrayTemperatura = new double[12];
        String[] arrayMeses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"  };

        // Funciones para pedir la temperatura e imprimirla en barras
        MetodoPedirTemperatura(arrayTemperatura, arrayMeses);
        MetodoMostrarAsteriscos(arrayTemperatura, arrayMeses);
    }

    // Función pedir temperatura
    public static void MetodoPedirTemperatura(double[] arrayTemperatura, String[] arrayMeses) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la temperatura registrada cada mes este año: ");

        for (int i = 0; i < arrayTemperatura.length; i++) {
            System.out.print(arrayMeses[i] + ": ");
            arrayTemperatura[i] = scanner.nextDouble();
        }

        scanner.close();
    }

    // Función para convertir cada temperatura en asteriscos
    public static String MetodoAsteriscos(double temperatura) {
        String pintarAsterisco = "";
        int numeroAsterisco = (int) temperatura;
        for (int j = 0; j < numeroAsterisco; j++) {
            pintarAsterisco += "*";
        }
        return pintarAsterisco;
    }

    public static void MetodoMostrarAsteriscos(double[] arrayTemperatura, String[] arrayMeses) {
        for (int i = 0; i < arrayMeses.length; i++) {
            String asteriscos = MetodoAsteriscos(arrayTemperatura[i]);
            System.out.println(arrayMeses[i] + ": " + asteriscos + " (" + arrayTemperatura[i] + ") ");
        }
    }

}
