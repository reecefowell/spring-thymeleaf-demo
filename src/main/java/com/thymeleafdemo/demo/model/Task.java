package com.thymeleafdemo.demo.model;

import java.util.UUID;
import lombok.Data;

@Data
public class Task {
    private UUID id;
    private String name;
    private String description;

    public Task() {}

    public Task(String name) {
        this.name = name;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
