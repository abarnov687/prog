public class Coche {
    // Atributos de la clase
    String marca;
    String modelo;
    int kilometraje;
    double combustible;
    int dinero;

    // Constructor de la clase Coche
    public Coche(String marca, String modelo, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        // Atributos que deben reinicializarse en 0
        this.combustible = 0; 
        this.dinero = 0;
    }

    // Recorrer distancia
    public void recorrer(int distancia) {
        double consumo = distancia * 0.07; // Consumo de 0.07 litros por km
        if (consumo <= combustible) {
            kilometraje += distancia;
            combustible -= consumo;
        } else {
            System.out.println("No hay suficiente combustible para recorrer esa distancia.");
        }
    }

    // Método para repostar combustible
    public void repostar(double cantidad) {
        if (combustible + cantidad > 50) {
            cantidad = 50 - combustible; // Limitar a 50 litros
        }
        combustible += cantidad;
        dinero += (int)(cantidad * 1.48); // Aumento del dinero gastado (1.48 euros por litro)
    }

    // Método para mostrar el estado del coche
    public void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Kilometraje: " + kilometraje + " km");
        System.out.println("Combustible: " + combustible + " litros");
        System.out.println("Dinero gastado en combustible: " + dinero + " euros");
    }

    public static void main(String[] args) {
        // Crear un coche con 40L de combustible
        Coche coche = new Coche("Renault", "Fluence", 0);

        coche.repostar(40); // Repostar 40L

        // Mostrar el estado inicial del coche
        System.out.println("Estado inicial del coche:");
        coche.mostrarEstado();
        System.out.println();

        // Recorrer 100 kilómetros y mostrar el estado del coche
        coche.recorrer(100);
        System.out.println("Estado después de recorrer 100 km:");
        coche.mostrarEstado();
        System.out.println();

        // Repostar 30 litros de combustible, verificar si se limita a 50L
        coche.repostar(30);
        System.out.println("Estado después de repostar 30 litros (máximo 50L):");
        coche.mostrarEstado();
        System.out.println();

        // Recorrer 200 kilómetros y mostrar el estado del coche
        coche.recorrer(200);
        System.out.println("Estado después de recorrer 200 km:");
        coche.mostrarEstado();
    }
}
