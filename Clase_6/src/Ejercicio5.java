import java.util.Scanner;

/*
Armar un programa que permita cargar 3 números y mostrar cual es el número promedio

      */
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese un primer numero");
        Scanner number1Scan = new Scanner(System.in);
        int number1 = number1Scan.nextInt();

        System.out.println("Ingrese un segundo numero");
        Scanner number2Scan = new Scanner(System.in);
        int number2 = number2Scan.nextInt();

        System.out.println("Ingrese un tercer numero");
        Scanner number3Scan = new Scanner(System.in);
        int number3 = number3Scan.nextInt();

        int promedio = (number1 + number2 + number3) / 3;

        System.out.println("el promedio entre " + number1 + ", "+ number2 + " y " + number3 + " es: " + promedio );
    }
}
