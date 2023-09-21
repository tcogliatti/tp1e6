import dao.Direccion;
import dao.Persona;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Update {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Example");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Persona p = em.find(Persona.class, 1);

        p.setNombre("Silvio");
        p.setEdad(55);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
