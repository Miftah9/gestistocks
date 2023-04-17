package services;

import dao.IAchat;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import models.Achat;
import utils.EntityManagerUtil;

public class AchatService implements IAchat {

    // Initialisation de l'EntityManager à null
    private EntityManager EM = null;

    // Initialisation de l'EntityManager dans le constructeur en utilisant la classe EntityManagerUtil
    public AchatService() {
        EM =  EntityManagerUtil.getEntityManagerFactory().createEntityManager();
    }

    // Ajout d'un nouvel achat dans la base de données
    @Override
    public Achat addAchat(Achat a) {
        EntityTransaction et = null;
        Achat achatSaved;
        try {
            // Récupération de l'objet de transaction
            et = EM.getTransaction();
            // Début de la transaction
            et.begin();
            // Persistance de l'achat dans la base de données
            EM.persist(a);
            EM.flush(); // Synchronisation de l'état de l'entité avec la base de données
            // Validation de la transaction
            et.commit();
            // Affectation de l'achat persisté à la variable achatSaved
            achatSaved = a;
        } catch (Exception ex) {
            // Gestion des erreurs : annulation de la transaction en cas d'échec
            if (et == null && et.isActive()) {
                et.rollback();
            }
            // Affichage d'un message d'erreur et relance de l'exception
            System.err.println("Erreur lors de l'insertion de l'achat " + ex.getMessage());
            throw ex;
        }
        // Retour de l'achat persisté
        return achatSaved;
    }

    // Retourner la liste de tous les achats
    @Override
    public List<Achat> allAchats() {
        List<Achat> achatList;

        try {
            // Exécution de la requête pour récupérer tous les achats
            achatList = EM.createNamedQuery("Achat.findAll", Achat.class).getResultList();
        } catch (PersistenceException ex) {
            // Gestion des erreurs et affichage d'un message d'erreur approprié
            System.err.println("Erreur lors de la récupération des achats " + ex.getMessage());
            throw ex;
        }
        // Retour de la liste de tous les achats
        return achatList;
    }

}
