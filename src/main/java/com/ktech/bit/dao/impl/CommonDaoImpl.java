package com.ktech.bit.dao.impl;

import com.ktech.bit.config.HibernateConfig;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CommonDaoImpl {

    private final SessionFactory sessionFactory;
    private final Session session;

    public CommonDaoImpl() {
        this.sessionFactory = HibernateConfig.getSessionFactory();
        this.session = sessionFactory.getCurrentSession();
    }

    protected int saveEntity(Object obj) throws HibernateException {
        Transaction transaction = session.beginTransaction();
        int id = (Integer) session.save(obj);
        transaction.commit();
        return id;
    }

    protected void saveorUpdate(String entityName, Object obj) throws HibernateException {
        session.saveOrUpdate(obj);
        session.flush();
    }

    protected void delete(String entityName, Object obj) throws HibernateException {
        session.delete(entityName, obj);
        session.flush();
    }
    
    protected Object find(String entityName, int id){
        return session.get(entityName, id);
    }
    

}
