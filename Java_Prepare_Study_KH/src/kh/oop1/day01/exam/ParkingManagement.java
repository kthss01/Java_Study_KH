package kh.oop1.day01.exam;

// 주차관리 시스템
public class ParkingManagement {
	// 차량 번호
	String carNum;
	// 입차 일시
	String inTime;
	// 출차 일시
	String outTime;
	// 주차 시간
	String parkingTime;
	// 주차 요금
	int parkingFee;
	// 할인 내역
	int discounts;
	// 차량 구분 (일반 / 등록)
	String carType;
	// 차량 사진
	String carPicture;
	// 지불 방법 (현급 / 카드)
	String paymentType;
	
	// 주차 요금 정산
	public void parkingPay(String parkingTime, int discounts) {
		System.out.println("주차 요금 정산 메소드");
	}
}
