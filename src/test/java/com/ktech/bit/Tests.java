package com.ktech.bit;

import com.ktech.bit.dao.ClientDAO;
import static org.junit.Assert.assertTrue;

import com.ktech.bit.dao.impl.EmployeeDaoImpl;
import com.ktech.bit.entity.Employee;
import org.junit.Test;

import java.util.logging.Logger;
import com.ktech.bit.dao.EmployeeDAO;
import com.ktech.bit.dao.impl.ClientDaoImpl;
import com.ktech.bit.entity.Client;

public class Tests {

    private static final Logger logger = Logger.getLogger(Tests.class.getName());

    private EmployeeDAO employeeDao;
    private ClientDAO clientDao;

    public Tests() {
        this.employeeDao = new EmployeeDaoImpl();
        this.clientDao = new ClientDaoImpl();
    }

    @Test
    public void testInsertEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Irfan");
        employee.setLastName("Manzoor");
        Integer id = (Integer) employeeDao.createEmployee(employee);
        assertTrue(id instanceof Integer);
    }

    @Test
    public void testInsertClient() {
        Client client = new Client();
        client.setFirstName("Jeff");
        client.setLastName("Thomsan");
        Integer id = (Integer) clientDao.createClient(client);
        assertTrue(id instanceof Integer);
    }
}
