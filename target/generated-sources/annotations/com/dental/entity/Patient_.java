package com.dental.entity;

import com.dental.entity.Treatement;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-01-26T18:39:07")
@StaticMetamodel(Patient.class)
public class Patient_ { 

    public static volatile SingularAttribute<Patient, String> number;
    public static volatile SingularAttribute<Patient, Date> dateofbirth;
    public static volatile SingularAttribute<Patient, String> firstname;
    public static volatile SingularAttribute<Patient, String> address;
    public static volatile SingularAttribute<Patient, Long> patientID;
    public static volatile SingularAttribute<Patient, String> jmbg;
    public static volatile ListAttribute<Patient, Treatement> treatementList;
    public static volatile SingularAttribute<Patient, String> lastname;

}