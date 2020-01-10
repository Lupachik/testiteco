package com.home.testiteco.controller;

import com.home.testiteco.model.Task;
import com.home.testiteco.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
    @GetMapping("/main")
    public String main(Model model) {
        return "main";
    }

    @GetMapping("/tasks")
    public String findAll(Model model){
        List<Task> tasks = taskService.findAll();
        model.addAttribute("tasks", tasks);
        return "task-list";
    }

    @GetMapping("/task-create")
    public String createTaskForm(Task task){
        return "task-create";
    }

    @PostMapping("/task-create")
    public String createTask(Task task){
        taskService.saveTask(task);
        return "redirect:/tasks";
    }

    @GetMapping("task-delete/{id}")
    public String deleteTask(@PathVariable("id") Long id){
        taskService.deleteById(id);
        return "redirect:/tasks";
    }

    @GetMapping("/task-update/{id}")
    public String updateTaskForm(@PathVariable("id") Long id, Model model){
        Task task = taskService.findById(id);
        model.addAttribute("task", task);
        return "/task-update";
    }

    @PostMapping("/task-update")
    public String updateTask(Task task){
        taskService.saveTask(task);
        return "redirect:/tasks";
    }
}
