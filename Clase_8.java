
package javacourse.bootcampuno;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class MainController {


    // Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del cuadrado.
    @GetMapping("/area-cuadrado/{lado}")
    public String calcularArea(@PathVariable int lado){

        int areaCuadrado = lado * lado;

        return "Area de cuadrado con lado " + lado + " es: " + areaCuadrado;
    }

    @GetMapping("/area-triangulo/{base}/{altura}")
    public String calcularAreaTriangulo(@PathVariable int base, @PathVariable int altura){

        int areaTriangulo = (base * altura) / 2;

        return "Area de triangulo con base de " + base + " y altura de " + altura + " es " + areaTriangulo;
    }


    @GetMapping("/generar-password/{cantidad}")
    public String generarPassword(@PathVariable int cantidad){

        String[] claveGenerada = new String[cantidad];

        char[] letras = new char[26];
        char letra = 'a';

        for (int i = 0; i < 10; i++) {
            letras[i] = letra;
            letra++;
        }
        for (int i = 0; i < cantidad; i++) {

            int numeroOLetra = (int) Math.round(Math.random() * 2);

            if(numeroOLetra == 2){
                //en este caso va a ser letra
                int letraFiltrada  = (int) Math.round(Math.random() * 26);
                claveGenerada[i] = String.valueOf(letras[letraFiltrada]);

            }else{
                int numeroFiltrado  = (int) Math.round(Math.random() * 10);
                claveGenerada[i] = String.valueOf(numeroFiltrado);
            }
        }
        return "CLAVE " + Arrays.toString(claveGenerada)
                .replace("[", "")
                .replace("]", "")
                .replace(", ", "");
    }

//    Hacer nuevamente el juego de Piedra, Papel o Tijeras pero utilizando funciones, arreglos y bucles.


    @GetMapping("/piedra-papel-tijera/{seleccion}")
    public String calcularAreaTriangulo(@PathVariable String seleccion){

        String seleccionUsuario = seleccion;
        int maquinaSeleccionNumero = (int) Math.floor(Math.random()*3);

        String seleccionMaquina;
        if(maquinaSeleccionNumero == 1){
            seleccionMaquina = "piedra";
        } else if(maquinaSeleccionNumero == 2){
            seleccionMaquina = "papel";
        } else{
            seleccionMaquina = "tijeras";
        }



        return resultadoPPJ(seleccionUsuario, seleccionMaquina);

    }

    private static String resultadoPPJ(String seleccion, String maquina){

        String resultado = "";

        if( seleccion.equals(maquina)) {
            resultado = "hay empate!";
        }else if(seleccion.equals("piedra") && maquina.equals("papel")) {
            resultado = "Gana la máquina";
        }else if(seleccion.equals("papel") && maquina.equals("tijeras")) {
            resultado = "gana la máquina";
        }else if(seleccion.equals("piedra") && maquina.equals("tijeras")) {
            resultado = "GANASTE!";
        }else if(seleccion.equals("papel") && maquina.equals("piedra")) {
            resultado = "GANASTE!";
        }else if(seleccion.equals("tijeras") && maquina.equals("papel")) {
            resultado = "GANASTE!";
        }

        return ("Seleccionaste " + seleccion + " y la maquina seleccionó " + maquina + " así que " + resultado ) ;
    }



}
