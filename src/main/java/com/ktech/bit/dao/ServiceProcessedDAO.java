package com.ktech.bit.dao;

import com.ktech.bit.entity.ServiceProcessed;
import org.hibernate.HibernateException;


public interface ServiceProcessedDAO {

    public int createServiceProcessed(ServiceProcessed service) throws HibernateException;
    
    public void updateServiceProcessed(ServiceProcessed service) throws HibernateException;
    
    public void deleteServiceProcessed(ServiceProcessed service) throws HibernateException;

    public ServiceProcessed getServiceProcessed(int id) throws HibernateException;

}
