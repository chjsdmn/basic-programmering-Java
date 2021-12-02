package com.prog.dependencyInjection;

/**
 * 注入(Inject): 通过方法或构造函数把一个对象传递给另一个对象
 */
public class Developer {
    private String devNavn;
    private Task task;  //Developer类对Task类存在依赖

    public Developer(String devNavn, String taskNavn){
        this.devNavn = devNavn;
        this.task = new Task(taskNavn);  //属于紧耦合，因为Developer类和Task类紧紧绑在了一起
    }

    public void ongoing(){
        System.out.println(devNavn + " jobber på " + task.getTaskNavn());
    }


}
