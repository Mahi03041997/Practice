package com.practice.Collection_Methods;

import java.io.Serializable;

public class com_practice_seralization implements Serializable {
    
    private static final long serialversionUID = 1L;
    private int id;
    private String name;
    private float salary;
    private String branch;

    
    public com_practice_seralization(int id, String name, float salary, String branch) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.branch = branch;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    @Override
    public String toString() {
        return "com_practice_seralization [id=" + id + ", name=" + name + ", salary=" + salary + ", branch=" + branch
                + "]";
    }

    
}
