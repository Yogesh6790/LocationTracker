package com.example.restservice.dao;

import com.example.restservice.util.Configuration;
import com.example.restservice.entity.Coordinates;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class LocationDaoImpl implements LocationDao {


    @Autowired
    private Configuration configuration;

    @Override
    public List<Coordinates> getCoordinates() {
        Session session = configuration.getHibernateFactory().openSession();
        session.beginTransaction();
        CriteriaQuery<Coordinates> query = session.getCriteriaBuilder()
                .createQuery(Coordinates.class);
        Root<Coordinates> root = query.from(Coordinates.class);
        query.select(root);
        Query<Coordinates> q = session.createQuery(query);
        List<Coordinates> coordinatesList = q.getResultList();
        session.getTransaction().commit();
        session.close();
        return coordinatesList;
    }

}
