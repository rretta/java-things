package academy.atl.newsletters.repository;


import academy.atl.newsletters.models.Leads;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
public class EmailRepository {
    @PersistenceContext
    EntityManager baseDeDatos;


    @Transactional
    public void guardarEmail(String emailUsuario){

        /*

        String consultaPrimera = "INSERT INTO `newsletters`.`leads` (`email`) VALUES ('" + emailUsuario + "')";
        String consultaSql = "INSERT INTO leads (id, email) VALUES (NULL, :emailParametro)";

        baseDeDatos.createNativeQuery(consultaPrimera).executeUpdate();
*/

        String consultaSql = "INSERT INTO Leads (email) VALUES (:emailParametro)";

        baseDeDatos.createQuery(consultaSql).setParameter("emailParametro", emailUsuario).executeUpdate();
        //Insert via SQL

    };


    @Transactional
    public void eliminarEmail(String emailUsuario) {

        String consultaSql = "DELETE FROM Leads WHERE email = :emailParametro";


        //Insert via HQL ( es un objeto, no una query)
        baseDeDatos.createQuery(consultaSql).setParameter("emailParametro", emailUsuario).executeUpdate();

    }

    @Transactional
    public List<Leads> traerEmails() {

        String consultaSql = "SELECT l FROM Leads l";


        //Insert via HQL ( es un objeto, no una query)
        Query query = baseDeDatos.createQuery(consultaSql);

        List<Leads>  listaLeads = query.getResultList();

        return listaLeads;

    }
}
