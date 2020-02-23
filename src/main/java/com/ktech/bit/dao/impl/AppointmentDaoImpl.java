package com.ktech.bit.dao.impl;

import com.ktech.bit.dao.AppointmentDAO;
import com.ktech.bit.entity.Appointment;
import org.hibernate.HibernateException;


public class AppointmentDaoImpl extends CommonDaoImpl implements AppointmentDAO {
    
    private final String APPOINTMENT = "Appointment";

    public int createAppointment(Appointment appointment) throws HibernateException {
        return super.saveEntity(appointment);
    }

    public void updateAppointment(Appointment appointment) throws HibernateException {
        super.saveorUpdate(APPOINTMENT, appointment);
    }

    public void deleteAppointment(Appointment appointment) throws HibernateException {
        super.delete(APPOINTMENT, appointment);
    }

    public Appointment getAppointment(int id) throws HibernateException {
        return (Appointment) super.find(APPOINTMENT, id);
    }


}
