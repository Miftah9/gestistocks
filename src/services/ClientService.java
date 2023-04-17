///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package services;
//
//import dao.IClient;
//import java.util.List;
//import javax.persistence.*;
//import models.Client;
//import utils.EntityManagerUtil;
//
///**
// * Classe ClientService implémentant l'interface IClient pour gérer les entités de type Client.
// * Cette classe utilise l'EntityManager pour interagir avec la base de données.
// */
//public class ClientService implements IClient {
//
//    // Initialisation de l'EntityManager à null
//    private EntityManager EM = null;
//
//    // Initialisation de l'EntityManager dans le constructeur en utilisant la classe EntityManagerUtil
//    public ClientService() {
//        EM = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
//    }
//
//    // Ajout d'un nouveau client dans la base de données
//    @Override
//    public Client addClient(Client c) {
//        EntityTransaction et = null;
//        Client clientSaved;
//        try {
//            // Récupération de l'objet de transaction
//            et = EM.getTransaction();
//            // Début de la transaction
//            et.begin();
//            // Persistance du client dans la base de données
//            EM.persist(c);
//            EM.flush(); // Synchronisation de l'état de l'entité avec la base de données
//            // Validation de la transaction
//            et.commit();
//            // Affectation du client persisté à la variable clientSaved
//            clientSaved = c;
//        } catch (Exception ex) {
//            // Gestion des erreurs : annulation de la transaction en cas d'échec
//            if (et == null && et.isActive()) {
//                et.rollback();
//            }
//            // Affichage d'un message d'erreur et relance de l'exception
//            System.err.println("Erreur lors de l'insertion du client " + ex.getMessage());
//            throw ex;
//        }
//        // Retour du client persisté
//        return clientSaved;
//    }
//
//    // Retourner la liste de tous les clients
//    @Override
//    public List<Client> allClients() {
//        List<Client> clientList;
//
//        try {
//            // Exécution de la requête pour récupérer tous les clients
//            clientList = EM.createNamedQuery("Client.findAll", Client.class).getResultList();
//        } catch (PersistenceException ex) {
//            // Gestion des erreurs et affichage d'un message d'erreur approprié
//            System.err.println("Erreur lors de la récupération des clients " + ex.getMessage());
//            throw ex;
//        }
//        // Retour de la liste de tous les clients
//        return clientList;
//    }
//}




// Mon code de recherch : 
//code pour la classe ClientService qui implémente l'interface 
//IClient pour gérer les entités de type Client en utilisant
//l'EntityManager pour interagir avec la base de données :

package services;

import dao.IClient;
import models.Client;
import utils.EntityManagerUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import java.util.List;

public class ClientService implements IClient {

    private EntityManager entityManager = null;

    public ClientService() {
        entityManager = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
    }

    @Override
    public Client addClient(Client client) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(client);
            entityManager.flush();
            transaction.commit();
            return client;
        } catch (PersistenceException e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.err.println("Erreur lors de l'ajout du client : " + e.getMessage());
            throw e;
        }
    }

    @Override
    public List<Client> allClient() {
        try {
            return entityManager.createNamedQuery("Client.findAll", Client.class).getResultList();
        } catch (PersistenceException e) {
            System.err.println("Erreur lors de la récupération de tous les clients : " + e.getMessage());
            throw e;
        }
    }

    @Override
    public Client updateClient(Client client) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.merge(client);
            entityManager.flush();
            transaction.commit();
            return client;
        } catch (PersistenceException e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.err.println("Erreur lors de la mise à jour du client : " + e.getMessage());
            throw e;
        }
    }

    @Override
    public void deleteClient(Client client) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            client = entityManager.merge(client);
            entityManager.remove(client);
            entityManager.flush();
            transaction.commit();
        } catch (PersistenceException e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.err.println("Erreur lors de la suppression du client : " + e.getMessage());
            throw e;
        }
    }

    @Override
    public Client findClientById(Long id) {
        try {
            return entityManager.find(Client.class, id);
        } catch (PersistenceException e) {
            System.err.println("Erreur lors de la recherche du client : " + e.getMessage());
            throw e;
        }
    }
}
