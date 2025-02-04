import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void mostrarTitular() {
        System.out.println("Titular: " + this.titular);
    }

    // Ingresar dinero
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        } else {
            System.out.println("No se pueden ingresar cantidades negativas.");
        }
    }

    // Retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }

    // Mostrar saldo
    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + this.saldo + " euros.");
    }

    public static void main(String[] args) {
        // Creación de una cuenta bancaria
        CuentaBancaria cuenta0 = new CuentaBancaria("Juan Pérez", 1000.0);
        cuenta0.mostrarTitular();

        // Ingreso 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la cantidad que deseas ingresar: ");
        double cantidadIngreso = scanner.nextDouble();

        cuenta0.ingresar(cantidadIngreso);
        cuenta0.mostrarSaldo();

        // Retirada
        System.out.println("Indica la cantidad que deseas retirar: ");
        double cantidadRetiro = scanner.nextDouble();

        cuenta0.retirar(cantidadRetiro);
        cuenta0.mostrarSaldo();

        scanner.close();

    }
}