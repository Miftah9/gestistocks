package models;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Article;
import models.Fournisseur;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-04-14T21:59:15", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Achat.class)
public class Achat_ { 

    public static volatile SingularAttribute<Achat, Fournisseur> fournisseurId;
    public static volatile SingularAttribute<Achat, Double> prix;
    public static volatile SingularAttribute<Achat, Integer> quantiteAchetee;
    public static volatile SingularAttribute<Achat, Date> dateAchat;
    public static volatile SingularAttribute<Achat, Article> articleId;
    public static volatile SingularAttribute<Achat, Integer> id;

}