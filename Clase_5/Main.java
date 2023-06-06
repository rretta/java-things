package Clase_5;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        1) Calculadora de edad de perros:
        Pídele al usuario que ingrese la edad de su perro.
        Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
*/
/*
        System.out.println("Ingrese la edad:");
        Scanner cargaDeDatos = new Scanner(System.in);
        Integer edad = cargaDeDatos.nextInt();
        Integer edadPerro = edad * 7;
        System.out.println(edad + " años en edad de perro es: " + edadPerro);
*/
/*
        2) Conversor de millas a kilómetros:
        Pídele al usuario que ingrese una distancia en millas.
        Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
        Muestra la distancia en kilómetros al usuario.
*/
/*
        System.out.println("Ingrese la distancia en millas:");
        Scanner cargaDeDatos = new Scanner(System.in);
        double millas = cargaDeDatos.nextInt();
        double millasAKilometros = millas * 1.60934;
        System.out.println(millas + " millas a kilometros es: " + millasAKilometros + " KM" );
*/
        /*
        3) Calculadora de descuento:
        Pídele al usuario que ingrese el precio original de un producto.
        Pídele al usuario que ingrese el porcentaje de descuento.
        Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
        Muestra el precio final al usuario.
         */
/*
        System.out.println("Ingrese el precio del producto:");
        Scanner cargaDeProducto = new Scanner(System.in);
        double precioOriginal = cargaDeProducto.nextInt();
        System.out.println("Ingrese el precio del descuento:");
        Scanner cargaDeDescuento = new Scanner(System.in);
        Integer descuento = cargaDeDescuento.nextInt();
        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        System.out.println("El precio final con descuento es de: " + precioFinal);
*/
        /*
        4) Calculadora de propinas:
        Pídele al usuario que ingrese el total de la cuenta en un restaurante.
        Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
        Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
         */

  /*
        System.out.println("Ingrese el total de la cuenta: ");
        Scanner cargaCuenta = new Scanner(System.in);
        double totalCuenta = cargaCuenta.nextInt();
        System.out.println("Ingrese el porcentaje de la propina: ");
        Scanner cargarPropina = new Scanner(System.in);
        double porcentajePropina = cargarPropina.nextInt();
        double propina = totalCuenta * (porcentajePropina / 100);
        DecimalFormat df = new DecimalFormat("#.oo");
        System.out.println("La propina es de: " + df.format(propina));

*/
        /*
        5) Juego de adivinar el número:
        Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
         */

        /*
        int numeroAleatorio = (int) (Math.random() * 100);
        System.out.println("Que número entre 1 y 100 piensa que va a salir? ");
        Scanner cargaNumero = new Scanner(System.in);
        double numeroSeleccionado = cargaNumero.nextInt();

        if(numeroSeleccionado == numeroAleatorio ){
            System.out.println("BIEN! El número a adivinar era " + numeroAleatorio);

        }else{
            System.out.println("No, El numero random era " + numeroAleatorio);
        }
       */
    }
}