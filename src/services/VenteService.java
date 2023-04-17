package services;

import dao.IVente;
import java.util.List;
import javax.persistence.*;
import models.Vente;
import utils.EntityManagerUtil;

public class VenteService implements IVente {

    // Initialisation de l'EntityManager à null
    private EntityManager em = null;

    // Initialisation de l'EntityManager dans le constructeur en utilisant la classe EntityManagerUtil
    public VenteService() {
        em = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
    }

    // Ajout d'une nouvelle vente dans la base de données
    @Override
    public Vente addVente(Vente vente) {
        EntityTransaction et = null;
        Vente venteSaved;
        try {
            // Récupération de l'objet de transaction
            et = em.getTransaction();
            // Début de la transaction
            et.begin();
            // Persistance de la vente dans la base de données
            em.persist(vente);
            em.flush(); // Synchronisation de l'état de l'entité avec la base de données
            // Validation de la transaction
            et.commit();
            // Affectation de la vente persistée à la variable venteSaved
            venteSaved = vente;
        } catch (Exception ex) {
            // Gestion des erreurs : annulation de la transaction en cas d'échec
            if (et == null && et.isActive()) {
                et.rollback();
            }
            // Affichage d'un message d'erreur et relance de l'exception
            System.err.println("Erreur lors de l'insertion de la vente " + ex.getMessage());
            throw ex;
        }
        // Retour de la vente persistée
        return venteSaved;
    }

    // Retourner la liste de toutes les ventes
    @Override
    public List<Vente> allVentes() {
        List<Vente> venteList;

        try {
            // Exécution de la requête pour récupérer toutes les ventes
            venteList = em.createNamedQuery("Vente.findAll", Vente.class).getResultList();
        } catch (PersistenceException ex) {
            // Gestion des erreurs et affichage d'un message d'erreur approprié
            System.err.println("Erreur lors de la récupération des ventes " + ex.getMessage());
            throw ex;
        }
        // Retour de la liste de toutes les ventes
        return venteList;
    }

    @Override
    public List<Vente> allVente() {
       List<Vente> venteList;

        try {
            // Exécution de la requête pour récupérer toutes les ventes
            venteList = em.createNamedQuery("Vente.findAll", Vente.class).getResultList();
        } catch (PersistenceException ex) {
            // Gestion des erreurs et affichage d'un message d'erreur approprié
            System.err.println("Erreur lors de la récupération des ventes " + ex.getMessage());
            throw ex;
        }
        // Retour de la liste de toutes les ventes
        return venteList; 
    }


}
