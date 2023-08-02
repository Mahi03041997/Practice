package com.practice.Collection_Methods;

public class ComparableEx {
    String name;
 int id;
 float salary;
 public ComparableEx(String name, int id, float salary){
this.name = name;
this.id = id;
this.salary = salary;
 }
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public float getSalary() {
    return salary;
}
public void setSalary(float salary) {
    this.salary = salary;
}
@Override
public String toString() {
    return "ComparableEx [name=" + name + ", id=" + id + ", salary=" + salary + "]";
}
 
}
