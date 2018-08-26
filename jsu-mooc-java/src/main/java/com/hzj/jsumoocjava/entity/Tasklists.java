package com.hzj.jsumoocjava.entity;

public class Tasklists {


    private String taskListName;      //任务列表名称 是主键
    private Integer userId;           //用户的id, 表示这个任务属于这个用户

    public Tasklists() {
    }

    public Tasklists(String taskListName, Integer userId) {
        this.taskListName = taskListName;
        this.userId = userId;
    }

    public String getTaskListName() {
        return taskListName;
    }

    public void setTaskListName(String taskListName) {
        this.taskListName = taskListName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Tasklists{" +
                "taskListName='" + taskListName + '\'' +
                ", userId=" + userId +
                '}';
    }
}
