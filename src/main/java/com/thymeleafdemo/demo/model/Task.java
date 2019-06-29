package com.thymeleafdemo.demo.model;

import java.util.UUID;

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

    public UUID getId() {
        return id;
    }

    public Task setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Task setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Task setDescription(String description) {
        this.description = description;
        return this;
    }
}
