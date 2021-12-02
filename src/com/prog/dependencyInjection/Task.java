package com.prog.dependencyInjection;

public class Task {
    private String taskNavn;

    public Task(String taskNavn){
        this.taskNavn = taskNavn;
    }

    public String getTaskNavn(){
        return this.taskNavn;
    }
}
