package com.dental.entity;

import com.dental.entity.Dentist;
import com.dental.entity.Intervention;
import com.dental.entity.Patient;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-01-26T18:39:07")
@StaticMetamodel(Treatement.class)
public class Treatement_ { 

    public static volatile SingularAttribute<Treatement, Date> date;
    public static volatile SingularAttribute<Treatement, String> note;
    public static volatile SingularAttribute<Treatement, Double> cost;
    public static volatile ListAttribute<Treatement, Intervention> interventionList;
    public static volatile SingularAttribute<Treatement, Patient> patient;
    public static volatile SingularAttribute<Treatement, Long> treatementID;
    public static volatile SingularAttribute<Treatement, Dentist> dentist;

}