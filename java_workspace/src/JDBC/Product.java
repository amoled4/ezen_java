package JDBC;

public class Product {
	// VO (Value Object)
	// pno, pname, price, regdate, madeby
	
	private int pno;         // 자동 증가
	private String pname;
	private int price;
	private String regdate;  // default 오늘날짜
	private String madeby;
	
	// 생성자
	public Product() {}

	// 상품 등록
	public Product(String pname, int price, String madeby) {
		this.pname = pname;
		this.price = price;
		this.madeby = madeby;
	}
		
	// 상품리스트(전체)
	public Product(int pno, String pname, String regdate) {
		this.pno = pno;
		this.pname = pname;
		this.regdate = regdate;
	}
	
	// 상품 상세(세부정보 전부)
	public Product(int pno, String pname, int price, String regdate, String madeby) {
		this.pno = pno;
		this.pname = pname;
		this.price = price;
		this.regdate = regdate;
		this.madeby = madeby;
	}
	
	// 상품 수정(pno, pname, price, madeby)
//	public Product(int pno, String pname, int price, String madeby) {
//		// 생성자 호출
//		this(pname, price, madeby);
//		this.pno = pno;
//	}
	public Product(int pno, int price) {
		super();
		this.pno = pno;
		this.price = price;
	}
	
	
	
	// getter/setter
	public int getPno() {
		return pno;
	}


	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getMadeby() {
		return madeby;
	}

	public void setMadeby(String madeby) {
		this.madeby = madeby;
	}

	// toString (확인용)
	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pname=" + pname + ", price=" + price + ", regdate=" + regdate + ", madeby="
				+ madeby + "]";
	}
	
	
	
}
