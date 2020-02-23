package com.ktech.bit.dao;

import com.ktech.bit.entity.Schedule;
import org.hibernate.HibernateException;


public interface ScheduleDAO {

    public int createSchedule(Schedule schedule) throws HibernateException;
    
    public void updateSchedule(Schedule schedule) throws HibernateException;
    
    public void deleteSchedule(Schedule schedule) throws HibernateException;

    public Schedule getSchedule(int id) throws HibernateException;

}
