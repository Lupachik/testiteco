package com.itecotest.dao;

import com.itecotest.model.Task;

import java.util.List;

public interface TaskDao {
    public void createTask(Task task); // create task
    public void editTask(int id);      // update task
    public void removeTask(Task task);    // delete task
    public Task viewTask(int id);      // view task
}
