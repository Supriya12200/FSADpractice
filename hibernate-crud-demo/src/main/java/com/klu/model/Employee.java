package com.klu.model;
import javax.persistence.*;

@Entity
@Table(name="emp")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int empid;
private String empname;
private double salary;
public void setEmpId(Object salary2)
{
	this.empid=(int) salary2;
}
public int getEmpId() {
	return empid;
}
public void setEmpName(String empname)
{
	this.empname=empname;
}
public String getEmpName()
{
	return empname;
}
public void setSalary(double salary)
{
	this.salary=salary;
}
public double getSalary()
{
	return salary;
}
public Department getDepartment() {
	// TODO Auto-generated method stub
	return null;
}
public void setDepartment(Department dept) {
	// TODO Auto-generated method stub
	
}
public void setEmpSalary(double salary2) {
	// TODO Auto-generated method stub
	
}
}