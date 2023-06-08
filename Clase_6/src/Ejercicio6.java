import java.util.Scanner;

        /*
Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es el menor.
      */
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Ingrese un primer numero");
        Scanner number1Scan = new Scanner(System.in);
        int numero1 = number1Scan.nextInt();

        System.out.println("Ingrese un segundo numero");
        Scanner number2Scan = new Scanner(System.in);
        int numero2 = number2Scan.nextInt();

        System.out.println("Ingrese un tercer numero");
        Scanner number3Scan = new Scanner(System.in);
        int numero3 = number3Scan.nextInt();

        int mayor, menor;

        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        if (numero1 <= numero2 && numero1 <= numero3) {
            menor = numero1;
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
        } else {
            menor = numero3;
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

    }
}
