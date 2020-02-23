package com.ktech.bit.dao;

import com.ktech.bit.entity.Client;
import org.hibernate.HibernateException;


public interface ClientDAO {

    public int createClient(Client client) throws HibernateException;
    
    public void updateClient(Client client) throws HibernateException;
    
    public void deleteClient(Client client) throws HibernateException;

    public Client getClient(int id) throws HibernateException;

}
