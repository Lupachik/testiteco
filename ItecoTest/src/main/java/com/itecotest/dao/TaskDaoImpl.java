package com.itecotest.dao;

import com.itecotest.model.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
@Repository("taskDao")
public class TaskDaoImpl implements TaskDao{

    private SessionFactory sessionFactory;


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void createTask(Task task) {
        sessionFactory.getCurrentSession().save(task);
    }

    public void editTask(int id) {
        sessionFactory.getCurrentSession().update(id);

    }

    public void removeTask(Task task) {
        if(task!=null) sessionFactory.getCurrentSession().remove(task);


    }

    public Task viewTask(int id) {
        Task task = (Task) sessionFactory.getCurrentSession().load(Task.class, id);
        return task;
    }
}
