package services;

import dao.IUtilisateur;
import models.Utilisateur;
import utils.EntityManagerUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import java.util.List;

/**
 * Classe UtilisateurService implémentant l'interface IUtilisateur pour gérer les
 * entités de type Utilisateur. Cette classe utilise l'EntityManager pour
 * interagir avec la base de données.
 */
public class UtilisateurService implements IUtilisateur {

    // Initialisation de l'EntityManager à null
    private EntityManager entityManager = null;

    // Initialisation de l'EntityManager dans le constructeur en utilisant la classe EntityManagerUtil
    public UtilisateurService() {
        entityManager =  EntityManagerUtil.getEntityManagerFactory().createEntityManager();
    }

    // Ajout d'un nouvel utilisateur dans la base de données
    @Override
    public Utilisateur addUtilisateur(Utilisateur utilisateur) {
        EntityTransaction entityTransaction = null;
        Utilisateur utilisateurSaved;
        try {
            // Récupération de l'objet de transaction
            entityTransaction = entityManager.getTransaction();
            // Début de la transaction
            entityTransaction.begin();
            // Persistance de l'utilisateur dans la base de données
            entityManager.persist(utilisateur);
            entityManager.flush(); // Synchronisation de l'état de l'entité avec la base de données
            // Validation de la transaction
            entityTransaction.commit();
            // Affectation de l'utilisateur persisté à la variable utilisateurSaved
            utilisateurSaved = utilisateur;
        } catch (Exception ex) {
            // Gestion des erreurs : annulation de la transaction en cas d'échec
            if (entityTransaction == null && entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
            // Affichage d'un message d'erreur et relance de l'exception
            System.err.println("Erreur lors de l'insertion de l'utilisateur " + ex.getMessage());
            throw ex;
        }
        // Retour de l'utilisateur persisté
        return utilisateurSaved;
    }

    // Retourner la liste de tous les utilisateurs
    @Override
    public List<Utilisateur> allUtilisateurs() {
        List<Utilisateur> utilisateurList;

        try {
            // Exécution de la requête pour récupérer tous les utilisateurs
            utilisateurList = entityManager.createNamedQuery("Utilisateur.findAll", Utilisateur.class).getResultList();
        } catch (PersistenceException ex) {
            // Gestion des erreurs et affichage d'un message d'erreur approprié
            System.err.println("Erreur lors de la récupération des utilisateurs " + ex.getMessage());
            throw ex;
        }
        // Retour de la liste de tous les utilisateurs
        return utilisateurList;
    }


    @Override
       // Mise à jour d'un utilisateur dans la base de données
    public void updateUtilisateur(Utilisateur utilisateur) {
        EntityTransaction entityTransaction = null;
        try {
            // Récupération de l'objet de transaction
            entityTransaction = entityManager.getTransaction();
            // Début de la transaction
            entityTransaction.begin();
            // Modification de l'utilisateur dans la base de données
            entityManager.merge(utilisateur);
            entityManager.flush(); // Synchronisation de l'état de l'entité avec la base de données
            // Validation de la transaction
            entityTransaction.commit();
        } catch (Exception ex) {
            // Gestion des erreurs : annulation de la transaction en cas d'échec
            if (entityTransaction == null && entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
            // Affichage d'un message d'erreur et relance de l'exception
            System.err.println("Erreur lors de la mise à jour de l'utilisateur " + ex.getMessage());
            throw ex;
        }
    }


}
