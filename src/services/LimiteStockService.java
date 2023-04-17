package services;

import dao.ILimiteStock;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import models.LimiteStock;
import utils.EntityManagerUtil;

public class LimiteStockService implements ILimiteStock {

    private EntityManager em = null;

    public LimiteStockService() {
        em = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
    }

    @Override
    public LimiteStock addLimiteStock(LimiteStock ls) {
        EntityTransaction et = null;
        LimiteStock limiteStockSaved = null;
        try {
            et = em.getTransaction();
            et.begin();
            em.persist(ls);
            em.flush();
            et.commit();
            limiteStockSaved = ls;
        } catch (Exception ex) {
            if (et != null && et.isActive()) {
                et.rollback();
            }
            System.err.println("Erreur lors de l'insertion de la limite de stock : " + ex.getMessage());
            throw ex;
        }
        return limiteStockSaved;
    }

    @Override
    public List<LimiteStock> allLimiteStocks() {
        List<LimiteStock> limiteStockList;

        try {
            limiteStockList = em.createNamedQuery("LimiteStock.findAll", LimiteStock.class).getResultList();
        } catch (PersistenceException ex) {
            System.err.println("Erreur lors de la récupération des limites de stock : " + ex.getMessage());
            throw ex;
        }
        return limiteStockList;
    }
}
