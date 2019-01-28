package com.dental.entity;

import com.dental.entity.DentalService;
import com.dental.entity.Tooth;
import com.dental.entity.Treatement;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-01-26T18:39:07")
@StaticMetamodel(Intervention.class)
public class Intervention_ { 

    public static volatile SingularAttribute<Intervention, Treatement> treatementFK;
    public static volatile SingularAttribute<Intervention, String> description;
    public static volatile SingularAttribute<Intervention, DentalService> dentalService;
    public static volatile SingularAttribute<Intervention, Long> interventionID;
    public static volatile SingularAttribute<Intervention, Tooth> tooth;

}