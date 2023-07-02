import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
Armar un programa para organizar un "amigo invisible": Este programa debe permitir a los participantes ingresar sus nombres.
Luego, cada participante debe sentarse frente a la computadora, escribir su nombre y recibir una indicación sobre a quién debe darle un regalo.
El programa también debe limpiar la consola después de que cada participante haya visto su indicación.

      */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Integer participantesNumero = 0;

        do {
            System.out.print("Ingrese la cantidad de participantes al amigo secreto \n");
            participantesNumero = teclado.nextInt();

            if (participantesNumero % 2 != 0) {
                System.out.print("Debe ser un número par de participantes para que todos tengan regalo \n");
            }
        } while (participantesNumero % 2 != 0);


        System.out.print("Ingrese el nombre de los " + Integer.toString(participantesNumero) + " participantes \n");

        List<String> listaParticipantes = new ArrayList<>();
        List<String> listaAgasajados = new ArrayList<>();

        int participantesRecorridos = 0;

        do {

            System.out.print("nombre del participante " + (participantesRecorridos + 1) + ": \n");
            String siguienteParticipante = teclado.next();
            listaParticipantes.add(siguienteParticipante);
            listaAgasajados.add(siguienteParticipante);
            participantesRecorridos++;

        } while (participantesRecorridos < participantesNumero);

        Random ranNum = new Random();

        teclado.nextLine();

        for (int i = 0; i < participantesNumero; i++) {
            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.print("Por favor " + listaParticipantes.get(i) + " veni a la computadora y apretá ENTER\n");

            teclado.nextLine();

            // toda la parte de randomizar regalo

            int index = ranNum.nextInt(listaAgasajados.size());

            while (listaParticipantes.get(i).equals(listaAgasajados.get(index))) {
                index = ranNum.nextInt(listaAgasajados.size());
            }
            System.out.print(listaParticipantes.get(i) + " tenés que darle regalo a " + listaAgasajados.get(index) + "\n");

            listaAgasajados.remove(index);


            if (i == (participantesNumero - 1)) {
                break;
            }
            System.out.print("Llama a " + listaParticipantes.get(i + 1) + " y luego apreta enter \n");

            teclado.nextLine();


        }


    }
}
