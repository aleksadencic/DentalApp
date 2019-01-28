/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dental.service;

import com.dental.dao.PatientDAO;
import com.dental.entity.Patient;
import com.dental.entity.Treatement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Valentina
 */
@Component
public class PatientServiceImpl implements IPatientService {

    @Autowired
    private PatientDAO patientDAO;
    @Autowired
    private ITreatementService treatementService;

    @Override
    public Patient findOne(Long id) throws Exception {
        System.out.println("Pozvana metoda findOne!!!!");
        Patient patient = patientDAO.findOne(id);

        if (patient == null) {
            System.out.println("Patient je null");
            throw new Exception("Patient was not found with ID " + id);
        }
        patient.setTreatementList(treatementService.findAllTreatementsForPatient(id));
        return patient;
    }

    @Override
    public Long save(Patient patient) throws Exception {
//        java.sql.Date datumSQL = new java.sql.Date(patient.getDateofbirth().getTime());
//        patient.setDateofbirth(datumSQL);
        Patient createdPatient = patientDAO.create(patient);
        if (createdPatient == null) {
            throw new Exception("Patient can't be created");
        }
        return createdPatient.getPatientID();
    }

    @Override
    public void delete(Long id) throws Exception {
        if (id < 1 || findOne(id) == null) {
            throw new Exception("Patient with ID " + id + " does not exist.");
        }
        patientDAO.delete(id);
    }

    @Override
    public Patient update(Long id, Patient patient) throws Exception {
        if (id < 1 || findOne(id) == null) {
            throw new Exception("Patient with ID " + id + " does not exist.");
        }
        patient.setPatientID(id);
        /*
        System.out.println(patient.getDateofbirth().toString());
        int day = patient.getDateofbirth().getDay();
        int month = patient.getDateofbirth().getMonth();
        int year = patient.getDateofbirth().getYear();
        String dateString = year + "/" + month + "/" + day;
        System.out.println(dateString);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse(dateString); 
        System.out.println(date.toString())
         */
        java.sql.Date datumSQL = new java.sql.Date(patient.getDateofbirth().getTime());
        patient.setDateofbirth(datumSQL);

        return patientDAO.update(patient);
    }

    @Override
    public List<Patient> findAll() {
        List<Patient> patients = patientDAO.findAll();
        return patients;
    }

    @Override
    public List<Treatement> findAllTreatements(Long id) throws Exception {
        Patient patient = patientDAO.findOne(id);
        List<Treatement> treatements = patient.getTreatementList();
        return treatements;
    }

    @Override
    public Treatement findTreatement(Long id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
