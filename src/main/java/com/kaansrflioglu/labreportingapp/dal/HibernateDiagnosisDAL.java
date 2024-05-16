package com.kaansrflioglu.labreportingapp.dal;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kaansrflioglu.labreportingapp.entities.Diagnosis;

import jakarta.persistence.EntityManager;

@Repository
public class HibernateDiagnosisDAL implements IDiagnosisDAL {

    private EntityManager entityManager;

    @Autowired
    public HibernateDiagnosisDAL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Diagnosis> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Diagnosis> diagnosis = session.createQuery("from Diagnosis", Diagnosis.class).getResultList();
        return diagnosis;
    }

    @Override
    @Transactional
    public void add(Diagnosis diagnosis) {
        entityManager.persist(diagnosis);
    }

    @Override
    @Transactional
    public void update(Diagnosis diagnosis) {
        entityManager.merge(diagnosis);
    }

    @Override
    @Transactional
    public void delete(Diagnosis diagnosis) {
        entityManager.remove(entityManager.contains(diagnosis) ? diagnosis : entityManager.merge(diagnosis));
    }

    @Override
    @Transactional
    public Diagnosis getById(Long id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Diagnosis.class, id);
    }

}
