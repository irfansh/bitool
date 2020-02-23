package com.ktech.bit.dao.impl;

import com.ktech.bit.dao.ClientDAO;
import org.hibernate.HibernateException;

import com.ktech.bit.entity.Client;

public class ClientDaoImpl extends CommonDaoImpl implements ClientDAO {
    
    private final String CLIENT = "Client";

    public int createClient(Client client) throws HibernateException {
        return super.saveEntity(client);
    }

    public void updateClient(Client client) throws HibernateException {
        super.saveorUpdate(CLIENT, client);
    }

    public void deleteClient(Client client) throws HibernateException {
        super.delete(CLIENT, client);
    }

    public Client getClient(int id) throws HibernateException {
        return (Client) super.find(CLIENT, id);
    }


}
