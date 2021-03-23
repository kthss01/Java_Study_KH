package kh.oop2.over.run;

import kh.oop2.over.child.model.vo.CoffeeShop;
import kh.oop2.over.parent.model.vo.Shop;

public class Run {

	public static void main(String[] args) {
//		Shop sp = new Shop("이씨네", "서울 관악구");
//		System.out.println(sp);
//		sp.order("부모 메소드 >> ");
//		
//		CoffeeShop cs = new CoffeeShop("김씨네", "서울 강남구", "핫초코", 4000, "7그램");
//		cs.order("오버라이딩에 의한 자식 메소드 >> ");
		
		CoffeeShop cs1 = new CoffeeShop("아메리카노", 3000, "7그램");
		CoffeeShop cs2 = new CoffeeShop("아메리카노", 3000, "7그램");
		
		System.out.println(cs1);
		System.out.println(cs2);
		
		System.out.println(cs1.hashCode());
		System.out.println(cs2.hashCode());
		
		// 참조형 변수는 주소값이 같은가를 봄
		System.out.println("equals 비교 결과 : " + cs1.equals(cs2));
		
		CoffeeShop cs3 = null;
		
		// protected Object clone()
		cs3 = cs1.clone();
		
		System.out.println(cs3);
	}

}
