import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
Crear un programa que funcione como una calculadora de cambio:
Este programa debe recibir como entrada una cantidad de dinero y el costo de un producto. Utilizando la resta,
el programa debe calcular el cambio que se debe entregar al cliente y mostrar la cantidad de billetes y
monedas necesarios para el cambio.

      */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("ingrese el precio del producto\n");
        double precioProducto = teclado.nextDouble();

        System.out.print("ingrese con cuanto va a pagar \n");
        double cuantoPaga = teclado.nextDouble();

        if(cuantoPaga < precioProducto){
            do {
                System.out.print("Usted va a pagar con\n" + String.format("%.2f",cuantoPaga) + " y el producto sale " + String.format("%.2f",precioProducto) + " , por favor agregue al menos " + String.format("%.2f",(precioProducto - cuantoPaga)) + "\n");
                cuantoPaga += teclado.nextDouble();

            }while (cuantoPaga<precioProducto);



            System.out.print("El cambio es de: " + String.format("%.2f",(cuantoPaga - precioProducto)));


        }




    }
}
