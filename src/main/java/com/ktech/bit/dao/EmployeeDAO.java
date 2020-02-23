package com.ktech.bit.dao;

import com.ktech.bit.entity.Employee;
import org.hibernate.HibernateException;


public interface EmployeeDAO {

    public int createEmployee(Employee employee) throws HibernateException;
    
    public void updateEmployee(Employee employee) throws HibernateException;
    
    public void deleteEmployee(Employee employee) throws HibernateException;

    public Employee getEmployee(int id) throws HibernateException;

}
