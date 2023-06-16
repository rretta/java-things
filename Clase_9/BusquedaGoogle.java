package javacourse.bootcampuno;


import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


/*
Estamos armando el servicio de autocompletar de Google.
Tienes que desarrollar una aplicación en springboot que recibe lo que está escribiendo el usuario, y devuelve un listado de posibles resultados.
Para hacer esto en un array de String carga resultados de ejemplo

 */
@RestController
public class BusquedaGoogle {

    @GetMapping("/buscar-curso/{nombre}")
    public String buscarNombres(@PathVariable String nombre){

        String[] nombresCursos = {
                "Introducción a la Programación",
                "Programación Orientada a Objetos",
                "Estructuras de Datos",
                "Algoritmos y Complejidad",
                "Desarrollo Web",
                "Bases de Datos",
                "Inteligencia Artificial",
                "Seguridad Informática",
                "Aplicaciones Móviles",
                "Programación Avanzada"
        };

        Boolean find = false;
        String[] cursos = new String[10];
        int cursosPosition = 0;

        for (int i = 0; i < nombresCursos.length ; i++) {
            if(nombresCursos[i].toLowerCase().contains(nombre.toLowerCase())){
                find = true;
                cursos[cursosPosition] =nombresCursos[i];
                cursosPosition++;
            }
        }

        if(find == false){
            return "No se encontró ningún curso";
        }else{
            return ("Se encontraron los siguientes cursos dentro del array para la busqueda "+ nombre + ": \n" + Arrays.toString(cursos) );
        }
    }
}
