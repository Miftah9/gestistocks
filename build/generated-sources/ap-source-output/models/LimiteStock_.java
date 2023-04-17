package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Article;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-04-14T21:59:15", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(LimiteStock.class)
public class LimiteStock_ { 

    public static volatile SingularAttribute<LimiteStock, Integer> stockMin;
    public static volatile SingularAttribute<LimiteStock, Integer> stockMax;
    public static volatile SingularAttribute<LimiteStock, Article> articleId;
    public static volatile SingularAttribute<LimiteStock, Integer> id;

}