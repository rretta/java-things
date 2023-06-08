import java.util.Scanner;

/*
Escribe un programa que permita al usuario jugar el juego clásico de "piedra, papel, tijeras" contra la computadora.
El programa debe solicitar al usuario que ingrese su elección (piedra, papel o tijeras) y luego generar una elección aleatoria
para la computadora. Después de eso, el programa debe determinar el ganador según las reglas del juego y mostrar el resultado.

      */
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("piedra, papel o tijeras?");
        Scanner scanSeleccion = new Scanner(System.in);
        String seleccion = scanSeleccion.nextLine();

        int maquinaSeleccionNumero = (int) Math.floor(Math.random()*3);

            String maquina;

                if(maquinaSeleccionNumero == 1){
                    maquina = "piedra";
                } else if(maquinaSeleccionNumero == 2){
                    maquina = "papel";
                } else{
                    maquina = "tijeras";
                }

                String resultado = "";

                if( seleccion.equals(maquina)) {
                    resultado = "hay empate!";
                }else if(seleccion.equals("piedra") && maquina.equals("papel")) {
                    resultado = "Gana la máquina";
                }else if(seleccion.equals("papel") && maquina.equals("tijeras")) {
                     resultado = "gana la máquina";
                 }else if(seleccion.equals("piedra") && maquina.equals("tijeras")) {
                        resultado = "GANASTE!";
                    }else if(seleccion.equals("papel") && maquina.equals("piedra")) {
                        resultado = "GANASTE!";
                    }else if(seleccion.equals("tijeras") && maquina.equals("papel")) {
                        resultado = "GANASTE!";
                    }

        System.out.println("Seleccionaste " + seleccion + " y la maquina seleccionó " + maquina + " así que " + resultado );
    }
}
