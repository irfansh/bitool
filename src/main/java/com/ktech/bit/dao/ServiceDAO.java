package com.ktech.bit.dao;

import com.ktech.bit.entity.Service;
import org.hibernate.HibernateException;


public interface ServiceDAO {

    public int createService(Service service) throws HibernateException;
    
    public void updateService(Service service) throws HibernateException;
    
    public void deleteService(Service service) throws HibernateException;

    public Service getService(int id) throws HibernateException;

}
