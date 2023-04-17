package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Achat;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-04-14T21:59:15", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Fournisseur.class)
public class Fournisseur_ { 

    public static volatile ListAttribute<Fournisseur, Achat> achatList;
    public static volatile SingularAttribute<Fournisseur, String> adresse;
    public static volatile SingularAttribute<Fournisseur, String> telephone;
    public static volatile SingularAttribute<Fournisseur, Integer> id;
    public static volatile SingularAttribute<Fournisseur, String> nom;
    public static volatile SingularAttribute<Fournisseur, String> email;

}