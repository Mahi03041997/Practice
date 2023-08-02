package com.comparable.and.comparator.operators;

public class Pojo_Class implements Comparable<Pojo_Class> {
	private int id;
	private String name;
	private float salary;
	private long number;
	
	
	
	public Pojo_Class(int id, String name, float salary, long number) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.number = number;
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
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Pojo_Class [id=" + id + ", name=" + name + ", salary=" + salary + ", number=" + number + "]";
	}
	@Override
	public int compareTo(Pojo_Class o) {
		// TODO Auto-generated method stub
		return (int) (this.salary - o.salary);
	}
	
	
	}
	
	


