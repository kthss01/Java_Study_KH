package kh.oop2.object.model.vo;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3324021068629656242L;
	
	private String name; // 이름
	private int age; // 나이
	private char gender; // 성별
	private Phone ph; // 소유 Phone

	public Student() {
		super();
	}

	public Student(String name, int age, char gender, Phone ph) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.ph = ph;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", ph=" + ph + "]";
	}

}
