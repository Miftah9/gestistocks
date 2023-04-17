package services;

import dao.IFournisseur;
import models.Fournisseur;
import utils.EntityManagerUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import java.util.List;

public class FournisseurService implements IFournisseur {

    private EntityManager entityManager = null;

    public FournisseurService() {
        entityManager = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur fournisseur) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(fournisseur);
            entityManager.flush();
            transaction.commit();
            return fournisseur;
        } catch (PersistenceException e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.err.println("Erreur lors de l'ajout du fournisseur : " + e.getMessage());
            throw e;
        }
    }

    @Override
    public List<Fournisseur> allFournisseur() {
        try {
            return entityManager.createNamedQuery("Fournisseur.findAll", Fournisseur.class).getResultList();
        } catch (PersistenceException e) {
            System.err.println("Erreur lors de la récupération de tous les fournisseurs : " + e.getMessage());
            throw e;
        }
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur fournisseur) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.merge(fournisseur);
            entityManager.flush();
            transaction.commit();
            return fournisseur;
        } catch (PersistenceException e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.err.println("Erreur lors de la mise à jour du fournisseur : " + e.getMessage());
            throw e;
        }
    }

    @Override
    public void deleteFournisseur(Fournisseur fournisseur) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            fournisseur = entityManager.merge(fournisseur);
            entityManager.remove(fournisseur);
            entityManager.flush();
            transaction.commit();
        } catch (PersistenceException e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.err.println("Erreur lors de la suppression du fournisseur : " + e.getMessage());
            throw e;
        }
    }

    @Override
    public Fournisseur findFournisseurById(Long id) {
        try {
            return entityManager.find(Fournisseur.class, id);
        } catch (PersistenceException e) {
            System.err.println("Erreur lors de la recherche du fournisseur : " + e.getMessage());
            throw e;
        }
    }
}
