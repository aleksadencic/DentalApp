package com.dental.entity;

import com.dental.entity.Treatement;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-01-26T18:39:07")
@StaticMetamodel(Dentist.class)
public class Dentist_ { 

    public static volatile SingularAttribute<Dentist, Long> dentistID;
    public static volatile SingularAttribute<Dentist, String> firstname;
    public static volatile SingularAttribute<Dentist, String> password;
    public static volatile SingularAttribute<Dentist, String> role;
    public static volatile SingularAttribute<Dentist, String> sex;
    public static volatile SingularAttribute<Dentist, String> phonenumber;
    public static volatile ListAttribute<Dentist, Treatement> treatementList;
    public static volatile SingularAttribute<Dentist, String> cardnumber;
    public static volatile SingularAttribute<Dentist, String> lastname;
    public static volatile SingularAttribute<Dentist, String> username;

}