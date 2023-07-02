import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*

    Crear un programa para calcular el interés compuesto: Este programa debe permitir al usuario ingresar el capital inicial,
    la tasa de interés y el tiempo en años. Utilizando la fórmula del interés compuesto,
    el programa debe calcular el monto total acumulado y mostrarlo al usuario.


      */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el capital inicial: \n");
        double capitalInicial = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés (por ejemplo, 0.05 para 5%): \n");
        double tasaInteres = scanner.nextDouble();

        System.out.print("Ingrese el tiempo en años: \n");
        int tiempoAnios = scanner.nextInt();

        double montoTotal = calcularInteresCompuesto(capitalInicial, tasaInteres, tiempoAnios);

        System.out.println("El monto total acumulado es: " + String.format("%.2f",montoTotal));
    }

    public static double calcularInteresCompuesto(double capitalInicial, double tasaInteres, int tiempoAnios) {
        double montoTotal = capitalInicial * Math.pow((1 + tasaInteres), tiempoAnios);
        return montoTotal;
    }





}

