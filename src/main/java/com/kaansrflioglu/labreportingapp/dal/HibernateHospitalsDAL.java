package com.kaansrflioglu.labreportingapp.dal;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kaansrflioglu.labreportingapp.entities.Hospitals;

import jakarta.persistence.EntityManager;

@Repository
public class HibernateHospitalsDAL implements IHospitalsDAL {

    private EntityManager entityManager;

    @Autowired
    public HibernateHospitalsDAL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Hospitals> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Hospitals> hospitals = session.createQuery("from Hospitals", Hospitals.class).getResultList();
        return hospitals;
    }

    @Override
    @Transactional
    public void add(Hospitals hospital) {
        entityManager.persist(hospital);
    }

    @Override
    @Transactional
    public void update(Hospitals hospital) {
        entityManager.merge(hospital);
    }

    @Override
    @Transactional
    public void delete(Hospitals hospital) {
        entityManager.remove(entityManager.contains(hospital) ? hospital : entityManager.merge(hospital));
    }

    @Override
    @Transactional
    public Hospitals getById(Long id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Hospitals.class, id);
    }

}
