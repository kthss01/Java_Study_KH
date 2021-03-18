package kh.oop1.day02.exam;

public class Coffee {
	// 커피판매점
	// 1. 메뉴 종류 Hot 아메리카노 / Iced 아메리카노
	// 2. 주문 수량
	// [ 속성값 ]
	// private String hotAmericano; // Hot 아메리카노
	// private String icedAmericano; // Iced 아메리카노

	private String american; // 아메리칸노
	// 카페라떼
	private char temperatureType; // Y : hot, N : Iced
	private String size; // 음료의 사이즈

	// [ 생성자 ]
	public Coffee() {
	}

	public String getAmerican() {
		return american;
	}

	public void setAmerican(String american) {
		this.american = american;
	}

	public char getTemperatureType() {
		return temperatureType;
	}

	public void setTemperatureType(char temperatureType) {
		this.temperatureType = temperatureType;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	// [ 기능 정의 ]
	public void orderCoffe() {
		System.out.println("커피 주문");
	}
	
	CoffeeMachine cm = new CoffeeMachine();
	
	// 초기화 블럭
	{
		System.out.println(cm.str1);
	}
}

class CoffeeMachine {
	public String str1;
	
	public void machine() {
		
	}
}
