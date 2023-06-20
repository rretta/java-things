package atl.course.trivia;

import atl.course.trivia.entities.Categoria;
import atl.course.trivia.entities.Pregunta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/question/{categoria}")
    public Pregunta getQuestions(@PathVariable String categoria){

        Pregunta preg = new Pregunta();



        if(categoria.equalsIgnoreCase("Tecnología")){

            preg.setCategory("Tecnología");
            preg.setQuestion("¿Junto con quien Bill Gates fundó Microsoft?");
            preg.setAnswer(1);
            preg.setExplanation("La historia de Microsoft comienza el 4 de abril de 1975, cuando fue fundada por Bill Gates y Paul Allen en Albuquerque. Sus mejores productos actuales en venta son el sistema operativo para computadoras Microsoft Windows y la suite Microsoft Office.");

            String[] options = new String[3];
            options[0] = "Linus Torvalds";
            options[1] = "Paul Allen";
            options[2] = "Gabe Newell";


            preg.setOptions(options);


        }

        if(categoria.equalsIgnoreCase("Tenis")){

            preg.setCategory("Tenis");
            preg.setQuestion("¿Quién ganó el torneo de Wimbledon en 2022?");
            preg.setAnswer(2);
            preg.setExplanation("El torneo de Wimbledon en 2022 fue ganado por Novak Djokovic. Es uno de los mejores tenistas del mundo y ha obtenido numerosos títulos a lo largo de su carrera.");

            String[] options = new String[3];
            options[0] = "Roger Federer";
            options[1] = "Rafael Nadal";
            options[2] = "Novak Djokovic";

            preg.setOptions(options);


        }

        if(categoria.equalsIgnoreCase("Series de TV")) {

            preg.setCategory("Series de TV");
            preg.setQuestion("¿Quién interpreta a Walter White en la serie Breaking Bad?");
            preg.setAnswer(0);
            preg.setExplanation("En la serie Breaking Bad, el personaje de Walter White es interpretado por Bryan Cranston. Cranston recibió aclamación crítica por su actuación en el papel y ganó varios premios por su trabajo en la serie.");

            String[] options = new String[3];
            options[0] = "Bryan Cranston";
            options[1] = "Aaron Paul";
            options[2] = "Jonathan Banks";

            preg.setOptions(options);


        }

        if(categoria.equalsIgnoreCase("E-Sports")) {

            preg.setCategory("E-Sports");
            preg.setQuestion("¿Qué equipo ganó el Campeonato Mundial de League of Legends en 2021?");
            preg.setAnswer(2);
            preg.setExplanation("En el Campeonato Mundial de League of Legends en 2021, el equipo ganador fue DWG KIA. Demostraron un rendimiento excepcional durante todo el torneo y se coronaron campeones al vencer a Suning en la final.");

            String[] options = new String[3];
            options[0] = "Fnatic";
            options[1] = "T1";
            options[2] = "DWG KIA";

            preg.setOptions(options);

        }

        if(categoria.equalsIgnoreCase("Geografía")) {

            preg.setCategory("Geografía");
            preg.setQuestion("¿Cuál es el río más largo del mundo?");
            preg.setAnswer(1);
            preg.setExplanation("El río Amazonas es el río más largo del mundo. Se extiende a lo largo de varios países de América del Sur, incluyendo Brasil, Perú y Colombia. Su longitud total es de aproximadamente 6,400 kilómetros.");

            String[] options = new String[3];
            options[0] = "Nilo";
            options[1] = "Amazonas";
            options[2] = "Yangtsé";

            preg.setOptions(options);



        }
        if(categoria.equalsIgnoreCase("Matemáticas")) {

            preg.setCategory("Matemáticas");
            preg.setQuestion("¿Cuál es el valor de π (pi)?");
            preg.setAnswer(2);
            preg.setExplanation("El valor de π (pi) es una constante matemática aproximadamente igual a 3.14159. Es la relación entre la circunferencia de cualquier círculo y su diámetro.");

            String[] options = new String[3];
            options[0] = "2.71828";
            options[1] = "1.61803";
            options[2] = "3.14159";

            preg.setOptions(options);


        }


        return preg;
    }


    @GetMapping("/categories")
    public Categoria[] getCategories(){
        Categoria tecnologia = new Categoria();
        tecnologia.setCategory("Tecnología");
        tecnologia.setDescription("Preguntas relacionadas con tecnologia actual y su historia.");
        Categoria tenis = new Categoria();
        tenis.setCategory("Tenis");
        tenis.setDescription("Preguntas relacionadas a tenis");
        Categoria series = new Categoria();
        series.setCategory("Series de TV");
        series.setDescription("Preguntas relacionadas a series de televisión.");
        Categoria esports = new Categoria();
        esports.setCategory("E-Sports");
        esports.setDescription("Preguntas relacionadas con los deportes digitales.");
        Categoria geografia = new Categoria();
        geografia.setCategory("Geografía");
        geografia.setDescription("Preguntas relacionadas con geografía");
        Categoria matematicas = new Categoria();
        matematicas.setCategory("Matemáticas");
        matematicas.setDescription("Preguntas relacionadas con la ciencia de los números.");

        Categoria[] categorias = new Categoria[6];
        categorias[0] = tecnologia;
        categorias[1] = tenis;
        categorias[2] = series;
        categorias[3] = esports;
        categorias[4] = geografia;
        categorias[5] = matematicas;


        return categorias;


    }
}
