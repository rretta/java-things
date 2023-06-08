import java.util.Scanner;

/*
Arma un buscador de tweets para Twitter.com. Es bastante similar al anterior.
Pídele al usuario que ingrese el nombre de una celebridad (de una sola palabra), por ejemplo: “Messi”.
Después muestra en consola la concatenación de:
“https://twitter.com/search?q=” + palabra

      */
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ingrese que desea buscar en twitter");
        Scanner tweetScan = new Scanner(System.in);
        String twitterSearch = tweetScan.nextLine();
        System.out.println("https://twitter.com/search?q=" + twitterSearch );
    }
}
