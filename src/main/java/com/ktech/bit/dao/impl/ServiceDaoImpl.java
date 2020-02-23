package com.ktech.bit.dao.impl;

import com.ktech.bit.dao.ServiceDAO;
import com.ktech.bit.entity.Service;
import org.hibernate.HibernateException;


public class ServiceDaoImpl extends CommonDaoImpl implements ServiceDAO {
    
    private final String SERVICE = "Service";

    public int createService(Service appointment) throws HibernateException {
        return super.saveEntity(appointment);
    }

    public void updateService(Service appointment) throws HibernateException {
        super.saveorUpdate(SERVICE, appointment);
    }

    public void deleteService(Service appointment) throws HibernateException {
        super.delete(SERVICE, appointment);
    }

    public Service getService(int id) throws HibernateException {
        return (Service) super.find(SERVICE, id);
    }


}
