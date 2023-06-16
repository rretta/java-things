package javacourse.bootcampuno;


import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/*
Crea un programa que tenga un arreglo con nombres completos de personas.
Además, debe permitir realizar una búsqueda por el nombre de la persona
 */
@RestController
public class BusquedaNombres {

@GetMapping("/buscar-nombre/{nombre}")
    public String buscarNombres(@PathVariable String nombre){

    String[] nombres = {
            "Alejandro Pérez",
            "Sofía Gutiérrez",
            "Luis Rodríguez",
            "Valentina Martínez",
            "Eduardo Sánchez",
            "Camila López",
            "Sebastián Ramírez",
            "Isabella Flores",
            "Andrés Herrera",
            "Natalia Castro"
    };

    Boolean find = false;
    String nombreEnArray = "";
    int numeroArray = 0;

    for (int i = 0; i < nombres.length ; i++) {
        if(nombres[i].toLowerCase().contains(nombre.toLowerCase())){
            find = true;
            nombreEnArray =nombres[i];
            numeroArray = i;
        }
    }

    if(find == false){
        return "No se encontró el nombre en la busqueda";
    }else{
        return ("Se encontró el nombre " + nombre + " (" + nombreEnArray + ") dentro de la búsqueda en la posición " + numeroArray + " del array.");
    }
}
}
