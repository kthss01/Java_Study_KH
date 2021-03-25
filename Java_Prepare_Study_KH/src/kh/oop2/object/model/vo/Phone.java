package kh.oop2.object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -4957148736047339981L;
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
	
	private String maker; // 제조사
	private int price; // 가격

	public Phone() {
		super();
	}

	public Phone(String maker, int price) {
		super();
		this.maker = maker;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [maker=" + maker + ", price=" + price + "]";
	}

}
