package com.sorting;

public class Person implements Comparable<Person> {
	private int id;
	private String name;
	private  int age;
	private double weight;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, int age, double weight) {
	
		this.id = id;
		this.name = name;
		this.age = age;
		this.weight = weight;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	@Override
	public int compareTo(Person person) {
		
		return this.getName().compareTo(person.getName());
	}

//	@Override
//	public int compareTo(Person o) {
//		
//		return this.getId()-o.getId();  // 0 -1 and 1
//	}
	
	
	
	
	
	
	

}
