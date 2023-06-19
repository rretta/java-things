public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private String fechaNacimiento;
    private int dni;

    public Persona(){

    }
    public Persona(int id, String nombre, int edad, String fechaNacimiento, int dni) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void mostrar() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("DNI: " + dni);
        System.out.println("ES MAYOR DE EDAD: " + (esMayorDeEdad() ?"SI":"NO"));
    }

    public Boolean esMayorDeEdad(){
        return edad >= 18;
    }


}
