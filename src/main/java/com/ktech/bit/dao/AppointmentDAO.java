package com.ktech.bit.dao;

import com.ktech.bit.entity.Appointment;
import org.hibernate.HibernateException;


public interface AppointmentDAO {

    public int createAppointment(Appointment appointment) throws HibernateException;
    
    public void updateAppointment(Appointment appointment) throws HibernateException;
    
    public void deleteAppointment(Appointment appointment) throws HibernateException;

    public Appointment getAppointment(int id) throws HibernateException;

}
