package com.springbootApp.myFirstSpringBootApp;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String username;

    private String description;
    private LocalDate targetdate;
    private Boolean done;

    public Todo(int id, String username , String description, LocalDate targetdate, Boolean done) {
        this.id = id;
        this.description = description;
        this.username = username;
        this.targetdate = targetdate;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public LocalDate getTargetdate() {
        return targetdate;
    }

    public void setTargetdate(LocalDate targetdate) {
        this.targetdate = targetdate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", targetdate=" + targetdate +
                ", done=" + done +
                '}';
    }
}
