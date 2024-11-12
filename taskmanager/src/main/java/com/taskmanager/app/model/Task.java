package com.taskmanager.app.model;

import jakarta.persistence.*;

@Entity
public class Task {
    private priority Taskpriority;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    public Long getTaskId() {
        return this.taskId;
    }
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }


    private String taskName;
    public String getTaskName() {
        return this.taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }


    private String taskDescription;
    public String getTaskDescription() {
        return this.taskDescription;
    }
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }


}
