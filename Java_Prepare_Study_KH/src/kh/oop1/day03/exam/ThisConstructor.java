package kh.oop1.day03.exam;

public class ThisConstructor {
	// 책 이름
	private String bookName;
	// 책 가격
	private int bookPrice;
	// 출판사
	private String bookPublisher;
	// 책 아이디
	private int bookId;
	
	public ThisConstructor() {
		System.out.println("기본 생성자");
	}
	
	public ThisConstructor(String bookPublisher) {
		this.bookPublisher = bookPublisher;
		System.out.println("매개변수 하나");
	}
	
	public ThisConstructor(String bookName, int bookPrice, int bookId) {
		this("KH정보교육원");
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	
}
