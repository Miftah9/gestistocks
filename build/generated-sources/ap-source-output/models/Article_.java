package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Achat;
import models.Categorie;
import models.LimiteStock;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-04-14T21:59:15", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Article.class)
public class Article_ { 

    public static volatile ListAttribute<Article, Achat> achatList;
    public static volatile SingularAttribute<Article, Categorie> categorieId;
    public static volatile ListAttribute<Article, LimiteStock> limiteStockList;
    public static volatile ListAttribute<Article, ? extends Object> venteList;
    public static volatile SingularAttribute<Article, Integer> id;
    public static volatile SingularAttribute<Article, String> nom;
    public static volatile SingularAttribute<Article, Integer> quantite;

}