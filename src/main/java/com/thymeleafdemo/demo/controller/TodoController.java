package com.thymeleafdemo.demo.controller;

import com.thymeleafdemo.demo.model.Task;
import com.thymeleafdemo.demo.service.TaskService;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/todo/tasks")
    public String getTasks(Model model) {
        model.addAttribute("tasks", taskService.getTaskList());
        return "todo/tasks";
    }

    @PostMapping("/todo/tasks")
    public String addTask(final Task task) {
        taskService.addTask(task);
        return "redirect:/todo/tasks";
    }

    @PostMapping("/todo/tasks/{id}/delete")
    public String deleteTask(@PathVariable final UUID id) {
        taskService.deleteTask(id);
        return "redirect:/todo/tasks";
    }
}
