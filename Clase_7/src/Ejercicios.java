import java.util.Scanner;

/*
PARTE 1:
Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.

PARTE 2:
Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.

PARTE 3:
Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5, ya que el usuario agregó 5 números.
      */
public class Ejercicios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número (faltan ingresar " + (numeros.length - i) + " numeros)");
            int numero = teclado.nextInt();
            numeros[i] = numero;
        }

        int mayor = 0;
        int menor = 0;
        int suma = 0;

        System.out.println("Los números ingresados son:");
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
            if(numeros[i] < menor || i == 0){
                menor = numeros[i];
            }
            System.out.println(numeros[i]);
        }
        float promedio = (float) suma / numeros.length;
        System.out.println("El número mayor es " + mayor + ", el número menor es " + menor +" y el promedio es " + promedio );


    }
}
