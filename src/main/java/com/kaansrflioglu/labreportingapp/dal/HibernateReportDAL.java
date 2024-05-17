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

	@Override
	@Transactional
	public List<Report> getAllByDateDesc() {
        Session session = entityManager.unwrap(Session.class);
        List<Report> report = session.createQuery("from Report order by date desc", Report.class).getResultList();
        return report;
	}

	@Override
	@Transactional
	public List<Report> getAllByDateAsc() {
		Session session = entityManager.unwrap(Session.class);
        List<Report> report = session.createQuery("from Report order by date asc", Report.class).getResultList();
        return report;
	}

	@Override
	@Transactional
	public List<Report> getIdByDateDesc(String id) {
		Session session = entityManager.unwrap(Session.class);
	    
	    String hql = "select r from Report r "
	               + "join r.diagnosis d "
	               + "join d.inpatient i "
	               + "where i.tc = :tc "
	               + "order by r.date desc";
	    
	    List<Report> reports = session.createQuery(hql, Report.class)
	                                  .setParameter("tc", id)
	                                  .getResultList();
	    
	    return reports;
	}

	@Override
	@Transactional
	public List<Report> getIdByDateAsc(String id) {
		Session session = entityManager.unwrap(Session.class);
	    
	    String hql = "select r from Report r "
	               + "join r.diagnosis d "
	               + "join d.inpatient i "
	               + "where i.tc = :tc "
	               + "order by r.date asc";
	    
	    List<Report> reports = session.createQuery(hql, Report.class)
	                                  .setParameter("tc", id)
	                                  .getResultList();
	    
	    return reports;
	}

}
