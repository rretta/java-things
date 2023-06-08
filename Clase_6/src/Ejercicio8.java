import java.util.Scanner;

/*
Arma un programa que permita llamar a una persona por Whatsapp. Es similar al anterior.
Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
Después muestra en consola la concatenación de:
“https://api.whatsapp.com/send?phone=” + telefono

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
