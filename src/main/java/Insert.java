import dao.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Insert {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Example");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Direccion d = new Direccion("Olavarria", "Giovanelli 3181");
        em.persist(d);
        Persona j = new Persona(1, "Juan", 25, d);
        Persona a = new Persona(2, "Ana", 22, d);

        em.persist(j);
        em.persist(a);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
