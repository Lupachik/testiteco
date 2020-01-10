package com.iteco.temp.controller;

import com.iteco.temp.domain.Task;
import com.iteco.temp.repos.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/task") //подписали на уровне класса, чтобы у каждого метода не подписывать
public class TaskController {
    @Autowired
    private TaskRepo taskRepo;

    @GetMapping
    public String taskList(Model model){
        model.addAttribute("tasks", taskRepo.findAll());
        return "tasklist";
    }

    @GetMapping("/edit/{task}") // это показывает идентификатор задачи
    public String taskEditForm(@PathVariable Task task, Model model){
        model.addAttribute("task", task);

        return "taskEdit";
    }
    @PostMapping
    public String taskSave(
            @RequestParam String project,
            @RequestParam String name,
            @RequestParam String description,
            @RequestParam String status,
            @RequestParam("taskId") Task task
    ){
        task.setProject(project);
        task.setName(name);
        task.setDescription(description);
        task.setStatus(status);

        taskRepo.save(task);
        return "redirect:/task";
    }

    @GetMapping("/delete/{task}")
    public String deleteTask(@PathVariable Task task, Model model){
        taskRepo.delete(task);
        model.addAttribute("task", task);
        return "redirect:/task";
    }

    @GetMapping("/view/{task}")
    public String viewTask(@PathVariable Task task, Model model){
        model.addAttribute("task", task);
        return "taskView";
    }


}
