package com.thymeleafdemo.demo.controller;

import com.thymeleafdemo.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/todo/tasks")
    public String getTasks(Model model) {
        model.addAttribute("tasks", taskService.getTaskList());
        return "todo/tasks";
    }
}
