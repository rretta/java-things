import java.util.List;

public class Playlist {
    String nombre;
    List<Cancion> lista;

    public Playlist(String nombre, List<Cancion> lista) {
        this.nombre = nombre;
        this.lista = lista;
    }

    public Playlist() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cancion> getLista() {
        return lista;
    }

    public void setLista(List<Cancion> lista) {
        this.lista = lista;
    }


    @Override
    public String toString() {
        return "Playlist{" +
                "playlist='" + nombre + '\'' +
                ", canciones='" + lista + '\'' +
                '}';
    }
}
