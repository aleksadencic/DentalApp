package com.dental.entity;

import com.dental.entity.Intervention;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-01-26T18:39:07")
@StaticMetamodel(Tooth.class)
public class Tooth_ { 

    public static volatile ListAttribute<Tooth, Intervention> interventionList;
    public static volatile SingularAttribute<Tooth, String> label;
    public static volatile SingularAttribute<Tooth, Long> toothID;

}