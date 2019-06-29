package com.thymeleafdemo.demo.service;

import com.thymeleafdemo.demo.model.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private Map<UUID, Task> taskMap = new HashMap<>();

    @PostConstruct
    public void init() {
        addTask(new Task("Visit the bank", "Need to get some statements"));
        addTask(new Task("Pick up bread", ""));
        addTask(new Task("Book flight tickets", "Book flights and make hotel reservations"));
        addTask(new Task("Shop around for insurance quote"));
    }

    public List<Task> getTaskList() {
        return new ArrayList<>(taskMap.values());
    }

    public void addTask(Task task) {
        task.setId(UUID.randomUUID());
        taskMap.put(task.getId(), task);
    }

    public void deleteTask(UUID id) {
        taskMap.remove(id);
    }
}
