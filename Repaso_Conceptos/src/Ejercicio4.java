import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Crear un programa para ingresar las notas de alumnos utilizando programación orientada a objetos:
El programa debe permitir al usuario cargar las notas de varios alumnos.
 Cada alumno debe tener atributos como nombre, apellido y una lista de notas.

      */
public class Ejercicio4 {
    public static void main(String[] args) {


        List<Double> notasAlumno1 = new ArrayList<>();

        Alumno alumno1 = new Alumno();

        alumno1.setNombre("Pepe");

        alumno1.setApellido("Argento");

        notasAlumno1.add(9.4);
        notasAlumno1.add(7.0);

        alumno1.setNotas(notasAlumno1);

        System.out.print(alumno1.toString() + " \n " + "promedio: " + alumno1.promedioNotas());




    }
}
