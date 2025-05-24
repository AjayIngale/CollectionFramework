package com.function;

public class Emlpoyee {
	
	private int empId;
	private String name;
	
	public Emlpoyee() {
		// TODO Auto-generated constructor stub
	}

	public Emlpoyee(int empId, String name) {
		
		this.empId = empId;
		this.name = name;
	}

	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emlpoyee [empId=" + empId + ", name=" + name + "]";
	}
	
	

}
