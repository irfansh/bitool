package com.ktech.bit.dao.impl;

import com.ktech.bit.entity.Employee;
import org.hibernate.HibernateException;

import com.ktech.bit.dao.EmployeeDAO;

public class EmployeeDaoImpl extends CommonDaoImpl implements EmployeeDAO {
    
    private final String EMPLOYEE = "Employee";

    public int createEmployee(Employee employee) throws HibernateException {
        return super.saveEntity(employee);
    }

    public void updateEmployee(Employee employee) throws HibernateException {
        super.saveorUpdate(EMPLOYEE, employee);
    }

    public void deleteEmployee(Employee employee) throws HibernateException {
        super.delete(EMPLOYEE, employee);
    }

    public Employee getEmployee(int id) throws HibernateException {
        return (Employee) super.find(EMPLOYEE, id);
    }


}
