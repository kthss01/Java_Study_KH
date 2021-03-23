package kh.oop2.prac4.model.vo;

public class Member {
	private String name; // 이름
	private int age; // 나이
	char gender; // 성별
	char bloodT; // 혈액형

	public Member() {
		super();
	}

	public Member(String name, int age, char gender, char bloodT) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bloodT = bloodT;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public char getBloodT() {
		return bloodT;
	}

	public void setBloodT(char bloodT) {
		this.bloodT = bloodT;
	}

	@Override
	public boolean equals(Object obj) {
		Member m = (Member) obj;
		return gender == m.gender && bloodT == m.bloodT;
	}

}
