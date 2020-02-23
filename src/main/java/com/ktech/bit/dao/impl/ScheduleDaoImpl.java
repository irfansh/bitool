package com.ktech.bit.dao.impl;

import com.ktech.bit.dao.ScheduleDAO;
import com.ktech.bit.entity.Schedule;
import org.hibernate.HibernateException;


public class ScheduleDaoImpl extends CommonDaoImpl implements ScheduleDAO {
    
    private final String SCHEDULE = "Schedule";

    public int createSchedule(Schedule appointment) throws HibernateException {
        return super.saveEntity(appointment);
    }

    public void updateSchedule(Schedule appointment) throws HibernateException {
        super.saveorUpdate(SCHEDULE, appointment);
    }

    public void deleteSchedule(Schedule appointment) throws HibernateException {
        super.delete(SCHEDULE, appointment);
    }

    public Schedule getSchedule(int id) throws HibernateException {
        return (Schedule) super.find(SCHEDULE, id);
    }


}
