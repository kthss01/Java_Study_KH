package kh.oop2.inherit.child.model.vo.copy;

import kh.oop2.inherit.parent.model.vo.Person;

public class Employee extends Person {
	private int salary; // 월급 (만원 단위)
	private String dept; // 부서

	public Employee() {
	}

	public Employee(int salary, String dept) {
		super();
		this.salary = salary;
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String information() {
		return "봉급 : " + salary + ", 부서 : " + dept;
	}
}
