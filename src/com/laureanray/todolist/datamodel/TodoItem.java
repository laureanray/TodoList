package com.laureanray.todolist.datamodel;

import java.time.LocalDate;

public class TodoItem {
    private String description;
    private String details;
    private LocalDate deadline;

    public TodoItem(String description, String details, LocalDate deadline) {
        this.description = description;
        this.details = details;
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public String getDetails() {
        return details;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return description;
    }
}
