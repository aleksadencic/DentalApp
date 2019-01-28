/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dental.service;

import com.dental.dao.DentistDao;
import com.dental.entity.Dentist;
import com.dental.entity.Treatement;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Valentina
 */
@Component
public class DentistServiceImpl implements IDentistService {

    @Autowired
    private DentistDao dentistDAO;
//    private IDentistDAO dentistDAO;

    @Override
    public Dentist findOne(Long id) throws Exception {
        System.out.println("Pozvana metoda findOne");
        Dentist dentist = dentistDAO.findOne(id);

        if (dentist == null) {
            System.out.println("Dentist je null");
            throw new Exception("Dentist was not found with ID " + id);
        }
        return dentist;
    }

    @Override
    public Long save(Dentist dentist) throws Exception {
        Dentist createdDentist = dentistDAO.create(dentist);
        if (createdDentist == null) {
            throw new Exception("Dentist can't be created");
        }
        return createdDentist.getDentistID();
    }

    @Override
    public void delete(Long id) throws Exception {
        if (id < 1 || findOne(id) == null) {
            throw new Exception("Dentist with ID " + id + " does not exist.");
        }
        dentistDAO.delete(id);
    }

    @Override
    public Dentist update(Long id, Dentist dentist) throws Exception {
        if (id < 1 || findOne(id) == null) {
            throw new Exception("Dentist with ID " + id + " does not exist.");
        }
        dentist.setDentistID(id);
        return dentistDAO.update(dentist);
    }

    @Override
    public List<Dentist> findAll() {
        List<Dentist> dentists = dentistDAO.findAll();
        return dentists;
    }

    @Override
    public List<Treatement> findTreatemenetstForDoctor(Long id) throws Exception {
        Dentist dentist = dentistDAO.findOne(id);
        List<Treatement> treatements = new LinkedList<Treatement>();
        return treatements;
    }

    @Override
    public Dentist findDentist(String username, String password) throws Exception {
        Dentist dentist = dentistDAO.logIn(username, password);
        if (dentist == null) {
            throw new Exception("Dentist was not found!");
        }
        return dentist;
    }

}
