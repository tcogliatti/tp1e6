import dao.Persona;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Select {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Example");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Persona j = em.find(Persona.class, 1);
        System.out.println(j);

        @SuppressWarnings("unchecked")
        List<Persona> pers = em.createQuery("SELECT p FROM Persona p").getResultList();
        for (Persona per : pers) {
            System.out.println(per);
        }
        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
