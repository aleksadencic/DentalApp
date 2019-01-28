/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dental.dao;

import com.dental.entity.Dentist;
import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Component;

/**
 *
 * @author Valentina
 */
@Component
public class DentistDaoImpl extends GenericDaoImpl<Dentist> implements DentistDao {

    @Override
    public Dentist logIn(String username, String password) {

        Query query = entityManager.
                createQuery("SELECT d FROM Dentist d where d.username='" + username + "' AND d.password='" + password + "'");
//        query.setParameter("username", username);
//        query.setParameter("password", password);

        List<Dentist> dentists = query.getResultList();
        if (dentists != null && dentists.size() == 1) {
            return dentists.get(0);
        }
        return null;
    }

}
