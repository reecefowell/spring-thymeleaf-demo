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
    private Map<UUID, Task> taskMap = new HashMap<UUID, Task>();

    @PostConstruct
    public void init() {
        addTask(new Task().setName("Visit the bank").setDescription("Need to get some statements"));
        addTask(new Task().setName("Pick up bread").setDescription(""));
        addTask(new Task().setName("Book flight tickets").setDescription("Book flights and make hotel reservations"));
        addTask(new Task().setName("Shop around for insurance quote"));
    }

    public List<Task> getTaskList() {
        return new ArrayList<Task>(taskMap.values());
    }
}
