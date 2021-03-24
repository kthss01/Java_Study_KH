package kh.oop2.poly.model.vo;

public class ReadingBook extends Hobby {
	private int bookNo; // 읽은 책의 수 (권)

	public ReadingBook() {
		super();
	}

	public ReadingBook(int bookNo) {
		super();
		this.bookNo = bookNo;
	}

	public ReadingBook(int spendTime, int spendMoney, int bookNo) {
		super(spendTime, spendMoney);
		this.bookNo = bookNo;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public void reMethod() {
		System.out.println(super.toString() + "내가 한달에 있는 책은 " + bookNo + "(권)이다.");
	}

	@Override
	public void print() {
		System.out.println(super.toString() + "내가 한달에 있는 책은 " + bookNo + "(권)이다.");
	}

}
