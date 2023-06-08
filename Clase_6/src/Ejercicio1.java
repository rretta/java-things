import java.util.Scanner;

/*
Arma un buscador de países con Google Maps.
Primero, pidele al usuario que ingrese un país (Ej: Colombia).
Después muestra en consola la concatenación de:
“https://www.google.com/maps/search/” + pais
Entonces, cuando hagas click en el link que aparece en consola, te abrirá esa ubicación.

      */
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ingrese el pais que desea buscar");
        Scanner cargaPais = new Scanner(System.in);
        String pais = cargaPais.nextLine();
        System.out.println("https://www.google.com/maps/search/" + pais );
    }
}
