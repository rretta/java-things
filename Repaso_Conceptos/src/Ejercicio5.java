
import java.util.List;
import java.util.Scanner;

/*
Crear un juego de adivinar la palabra:
 Este juego consiste en mostrar una pista o descripción y permitir al jugador adivinar la palabra correcta.
  Por ejemplo, el programa podría mostrar el mensaje: "Es un animal muy grande, con trompa.
  ¿Qué es?" El jugador debe ingresar su respuesta y el programa debe verificar si es correcta o no.



      */
public class Ejercicio5 {
    public static void main(String[] args) {

        System.out.print("¿Cuál es el nombre de una popular plataforma de transmisión de música y podcasts?\n");
        Scanner teclado = new Scanner(System.in);
        String respuesta = teclado.nextLine();

        if(respuesta.equalsIgnoreCase("spotify")){
            System.out.print("Correcto!");
        }else {
            do {
                System.out.print("Incorrecto, vuelve a intentar\n");
               respuesta = teclado.nextLine();
            }while(!respuesta.equalsIgnoreCase("spotify"));
        }

        System.out.print("Correcto!");


    }
}
