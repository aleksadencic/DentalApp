/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dental.form.model;

import com.dental.entity.DentalService;
import com.dental.entity.Intervention;
import com.dental.entity.Tooth;
import com.dental.entity.Treatement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Valentina
 */
public class CreateTreatementFormModel {

    private Treatement treatement;
    private List<Intervention> interventions;

    public CreateTreatementFormModel() {
        treatement = new Treatement();
        interventions = new LinkedList<>();
    }

    public Treatement getTreatement() {
        return treatement;
    }

    public void setTreatement(Treatement treatement) {
        this.treatement = treatement;
    }

    public List<Intervention> getInterventions() {
        return interventions;
    }

    public void setInterventions(List<Intervention> interventions) {
        this.interventions = interventions;
    }

}
