
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Armar un programa que funcione como una lista de reproducción de Spotify simple:
El programa debe permitir al usuario agregar canciones a una lista de reproducción.
 Cada canción debe tener atributos como título, artista y duración.
El programa debe permitir reproducir las canciones en orden
 y mostrar la información de la canción que se está reproduciendo en ese momento.



      */
public class Ejercicio6 {
    public static void main(String[] args) {

      List<Cancion> playlist = new ArrayList<>();

      Cancion karmapolice = new Cancion("Karma Police", "Radiohead", "4:22");
      Cancion exitmusic = new Cancion("Exit Music(For A Film)", "Radiohead", "4:27");

        playlist.add(karmapolice);
        playlist.add(exitmusic);

        Playlist radiohead = new Playlist("Mucho Radiohead", playlist );

        System.out.print(radiohead.toString());




    }
}
