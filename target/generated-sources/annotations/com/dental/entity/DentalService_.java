package com.dental.entity;

import com.dental.entity.Intervention;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-01-26T18:39:07")
@StaticMetamodel(DentalService.class)
public class DentalService_ { 

    public static volatile SingularAttribute<DentalService, Double> cost;
    public static volatile ListAttribute<DentalService, Intervention> interventionList;
    public static volatile SingularAttribute<DentalService, String> name;
    public static volatile SingularAttribute<DentalService, Double> vat;
    public static volatile SingularAttribute<DentalService, Long> dentalserviceID;

}