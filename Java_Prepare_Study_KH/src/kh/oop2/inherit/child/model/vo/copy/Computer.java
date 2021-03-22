package kh.oop2.inherit.child.model.vo.copy;

public class Computer {
	private String cpu; // cpu 사양
	private String brand; // 제조사
	private int price; // 가격

	public Computer() {
	}

	public Computer(String cpu, String brand, int price) {
		super();
		this.cpu = cpu;
		this.brand = brand;
		this.price = price;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String information() {
		return "cpu : " + cpu + ", 브랜드 : " + brand + ", 가격 : " + price;
	}

}
