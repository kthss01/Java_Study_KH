package kh.oop2.over.child.model.vo;

import kh.oop2.over.parent.model.vo.Shop;

public class CoffeeShop extends Shop {
	private String coffeeName; // 커피명
	private int price; // 가격
	private String shopName; // 가게명

	public CoffeeShop() {
		super();
	}

	public CoffeeShop(String coffeeName, int price, String shopName) {
		super();
		this.coffeeName = coffeeName;
		this.price = price;
		this.shopName = shopName;
	}

	public CoffeeShop(String owner, String address, String coffeeName, int price, String shopName) {
		super(owner, address);
		this.coffeeName = coffeeName;
		this.price = price;
		this.shopName = shopName;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	@Override
	public String toString() {
		return "커피명 : " + coffeeName + ", 가격 : " + price + ", 가게명 : " + shopName;
	}

	@Override
	public void order(String str) {
		System.out.println(
				str + " " + super.getOwner() + "의 " + shopName + " 가게에서 " + coffeeName + "를 " + price + "원을 주고 주문한다.");
	}

	@Override
	public boolean equals(Object obj) {
		CoffeeShop cs = (CoffeeShop) obj;
//		if (coffeeName == cs.coffeeName && price == cs.price 
//				&& shopName == cs.shopName)
//			return true;
//		return false;
		
		return coffeeName == cs.coffeeName && price == cs.price 
				&& shopName == cs.shopName;
	}

	@Override
	public CoffeeShop clone() {
//		return this;
		return new CoffeeShop(coffeeName, price, shopName);
	}
}
