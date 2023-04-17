/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import models.Article;

/**
 *
 * @author HP
 */


/**
 * Interface IArticle définissant les opérations de base pour gérer les
 entités de type Article.
 */
public interface IArticle {

    /**
     * Ajoute un nouveau article à la base de données.
     *
     * @param a L'objet Article à ajouter à la base de données.
     * @return L'objet Article ajouté et persisté dans la base de données.
     */
    Article addArticle(Article a);

    /**
     * Récupère la liste de tous les articles stockés dans la base de données.
     *
     * @return Une liste d'objets Article représentant tous les articles
     *         enregistrés dans la base de données.
     */
    List<Article> allArticles();
    Article deleteArticle(Article a);
    Article updateArticle(Article a);

}
