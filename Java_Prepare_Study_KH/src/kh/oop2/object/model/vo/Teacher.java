package kh.oop2.object.model.vo;

import java.io.Serializable;

public class Teacher implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 767193582528682190L;
	
	private String classR; // 담당 반
	private String name; // 강사명

	public Teacher() {
		super();
	}

	public Teacher(String classR, String name) {
		super();
		this.classR = classR;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [classR=" + classR + ", name=" + name + "]";
	}

}
