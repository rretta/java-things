package academy.atl.newsletters.controllers;



import academy.atl.newsletters.models.Leads;
import academy.atl.newsletters.repository.EmailRepository;
import academy.atl.newsletters.validators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewslettersController {
    EmailValidator emailValidator = new EmailValidator();
    @Autowired
    EmailRepository repositorioDeEmails;



    @PostMapping("/api/newsletter")
    public String registrarse(@RequestBody Leads lead){

        String email = lead.getEmail();


        if(emailValidator.esValido(email) == false){
            return "No es un mail válido";
        }


        repositorioDeEmails.guardarEmail(email);



    return "Email guardado.";


    }
    @PostMapping("/api/newsletter/unsuscribe")
    public String eliminar(@RequestBody Leads lead){

        String email = lead.getEmail();


        repositorioDeEmails.eliminarEmail(email);



        return "Email eliminado correctamente.";

    }

    @GetMapping("/api/newsletter")
    public List<Leads> registrarse(){



        List<Leads> lista = repositorioDeEmails.traerEmails();



        return lista;


    }


}
