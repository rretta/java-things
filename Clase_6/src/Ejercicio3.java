import java.util.Scanner;

/*
Arma un programa que permita llamar a una persona por Whatsapp. Es similar al anterior.
Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
Después muestra en consola la concatenación de:
“https://api.whatsapp.com/send?phone=” + telefono

      */
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero de telefono sin espacios");
        Scanner numberScan = new Scanner(System.in);
        String number = numberScan.nextLine();
        System.out.println("https://api.whatsapp.com/send?phone=" + number );
    }
}
