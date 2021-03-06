package com.iteco.temp.controller;


import com.iteco.temp.domain.Task;
import com.iteco.temp.repos.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @Autowired
    private TaskRepo taskRepo;
    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addTask(Task task, Model model) {
        Task taskFromDb = taskRepo.findByName(task.getName());
        if(taskFromDb != null){
            model.addAttribute("message", "Task exist!"); // проверка на дубляж названий задач, это не нужно, если задачи будут с одним названием
            return "registration";
        }
        taskRepo.save(task);
        //при успешной регистрации пока переходим на страницу main, а дальше по контексту на страницу task
        return "redirect:/task";
    }
}
