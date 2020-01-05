package com.iteco.temp.controller;

import com.iteco.temp.domain.Task;
import com.iteco.temp.repos.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    @GetMapping("{task}") // это показывает идентификатор задачи
    public String taskEditForm(@PathVariable Task task, Model model){
        model.addAttribute("task", task);

        return "taskEdit";
    }

    @PostMapping
    public String taskSave(
            @RequestParam String name,
            @RequestParam Map<String, String> form,
            @RequestParam("taskId") Task task
    ){
        task.setName(name);
        taskRepo.save(task);
        return "redirect:/task";
    }


}
