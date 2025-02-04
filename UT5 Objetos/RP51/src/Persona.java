import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private double altura;

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Cumplir años
    public void cumplirAnios() {
        this.edad++;
    }

    // Verificar si es mayor de edad
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    // Mostrar la información
    public String mostrarInformacion() {
        return "Nombre: " + this.nombre + ", Edad: " + this.edad + " años, Altura: " + this.altura + "m";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Creación de tres objetos (tres personas)
        Persona persona1 = new Persona("Ana", 25, 1.65);
        Persona persona2 = new Persona("María", 30, 1.80);
        Persona persona3 = new Persona("Sara", 17, 1.60);

        // Mostrar información inicial
        System.out.println(persona1.mostrarInformacion());
        System.out.println(persona2.mostrarInformacion());
        System.out.println(persona3.mostrarInformacion());

        System.out.println("Sara es mayor de edad?: " + persona3.esMayorDeEdad());

        // Hacer que la persona de 17 años cumpla años
        persona3.cumplirAnios();
        System.out.println("Presiona ENTER para que Sara cumpla años.");
        scanner.nextLine();
        System.out.println(persona3.mostrarInformacion());

        // Verificar si es mayor de edad
        System.out.println("Sara es mayor de edad?: " + persona3.esMayorDeEdad());

        scanner.close();
    }
}
