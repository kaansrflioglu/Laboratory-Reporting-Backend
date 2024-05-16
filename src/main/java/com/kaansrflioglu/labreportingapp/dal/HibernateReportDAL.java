package com.kaansrflioglu.labreportingapp.dal;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kaansrflioglu.labreportingapp.entities.Report;

import jakarta.persistence.EntityManager;

@Repository
public class HibernateReportDAL implements IReportDAL {

    private EntityManager entityManager;

    @Autowired
    public HibernateReportDAL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Report> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Report> report = session.createQuery("from Report", Report.class).getResultList();
        return report;
    }

    @Override
    @Transactional
    public void add(Report report) {
        entityManager.persist(report);
    }

    @Override
    @Transactional
    public void update(Report report) {
        entityManager.merge(report);
    }

    @Override
    @Transactional
    public void delete(Report report) {
        entityManager.remove(entityManager.contains(report) ? report : entityManager.merge(report));
    }

    @Override
    @Transactional
    public Report getById(Long id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Report.class, id);
    }

}
