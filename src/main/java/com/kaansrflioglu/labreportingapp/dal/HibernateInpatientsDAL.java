package com.kaansrflioglu.labreportingapp.dal;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kaansrflioglu.labreportingapp.entities.Inpatient;

import jakarta.persistence.EntityManager;

@Repository
public class HibernateInpatientsDAL implements IInpatientsDAL {

    private EntityManager entityManager;

    @Autowired
    public HibernateInpatientsDAL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Inpatient> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Inpatient> inpatients = session.createQuery("from Inpatient", Inpatient.class).getResultList();
        return inpatients;
    }

    @Override
    @Transactional
    public void add(Inpatient inpatient) {
        entityManager.persist(inpatient);
    }

    @Override
    @Transactional
    public void update(Inpatient inpatient) {
        entityManager.merge(inpatient);
    }

    @Override
    @Transactional
    public void delete(Inpatient inpatient) {
        entityManager.remove(entityManager.contains(inpatient) ? inpatient : entityManager.merge(inpatient));
    }

    @Override
    @Transactional
    public Inpatient getById(String id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Inpatient.class, id);
    }

}
