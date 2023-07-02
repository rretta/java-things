public class Cancion {
    String titulo;
    String artista;
    String duracion;

    public Cancion() {
    }

    public Cancion(String titulo, String artista, String duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Artista: " + artista + ", Duración: " + duracion;
    }
}
