package com.ktech.bit.dao.impl;

import com.ktech.bit.dao.ServiceProcessedDAO;
import com.ktech.bit.entity.ServiceProcessed;
import org.hibernate.HibernateException;


public class ServiceProcessedDaoImpl extends CommonDaoImpl implements ServiceProcessedDAO {
    
    private final String SERVICEPROCESSED = "ServiceProcessed";

    public int createServiceProcessed(ServiceProcessed appointment) throws HibernateException {
        return super.saveEntity(appointment);
    }

    public void updateServiceProcessed(ServiceProcessed appointment) throws HibernateException {
        super.saveorUpdate(SERVICEPROCESSED, appointment);
    }

    public void deleteServiceProcessed(ServiceProcessed appointment) throws HibernateException {
        super.delete(SERVICEPROCESSED, appointment);
    }

    public ServiceProcessed getServiceProcessed(int id) throws HibernateException {
        return (ServiceProcessed) super.find(SERVICEPROCESSED, id);
    }


}
