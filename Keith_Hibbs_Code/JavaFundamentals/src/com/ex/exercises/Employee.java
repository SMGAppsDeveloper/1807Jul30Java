package com.ex.exercises;

class Employee extends Person{

private String company;
private int empId;

public String getCompany(){
return company;
}

public int getEmpId() {
return empId;
}
public void setCompany(String newValue) {
	company = newValue;}

public void setEmpId(int newValue) {
	empId = newValue;}


public static void main(String[] args) {
	Person p1 = new Employee();
	p1.setName("John Smith");
	p1.setAge(28);
}
}