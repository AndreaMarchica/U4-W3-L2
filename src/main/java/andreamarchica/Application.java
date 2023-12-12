package andreamarchica;

import andreamarchica.DAO.EventDAO;
import andreamarchica.entities.Evento;
import andreamarchica.entities.tipoEvento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventDAO ed = new EventDAO(em);
        Evento nuovoEvento = new Evento("Evento1", "2023-12-12", "Fare il presepe", tipoEvento.PUBBLICO, 1);
        ed.save(nuovoEvento);
        em.close();
        emf.close();
    }
}
