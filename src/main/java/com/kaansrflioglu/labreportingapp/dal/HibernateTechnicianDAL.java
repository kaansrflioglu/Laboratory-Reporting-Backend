package com.kaansrflioglu.labreportingapp.dal;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kaansrflioglu.labreportingapp.entities.LaboratoryTechnician;

import jakarta.persistence.EntityManager;

@Repository
public class HibernateTechnicianDAL implements ITechnicianDAL {

    private EntityManager entityManager;

    @Autowired
    public HibernateTechnicianDAL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<LaboratoryTechnician> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<LaboratoryTechnician> LaboratoryTechnicians = session.createQuery("from LaboratoryTechnician", LaboratoryTechnician.class).getResultList();
        return LaboratoryTechnicians;
    }

    @Override
    @Transactional
    public void add(LaboratoryTechnician tehnician) {
        entityManager.persist(tehnician);
    }

    @Override
    @Transactional
    public void update(LaboratoryTechnician tehnician) {
        entityManager.merge(tehnician);
    }

    @Override
    @Transactional
    public void delete(LaboratoryTechnician tehnician) {
        entityManager.remove(entityManager.contains(tehnician) ? tehnician : entityManager.merge(tehnician));
    }

    @Override
    @Transactional
    public LaboratoryTechnician getById(Long id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(LaboratoryTechnician.class, id);
    }

}
