package day11;

public class Customer {
	/* 일반고객 / Gold고객 / VIP고객
	 * 
	 * 고객ID : int customerID
	 * 고객이름 : String customerName
	 * 고객등급 : String customerGrade
	 * 보너스포인트 : int bonusPoint
	 * 보너스포인트 적립률 : double bonusRatio
	 * 
	 * - Customer 객체생성시
	 * 기본 고객등급 = Silver
	 * 기본 적립률 = 0.01
	 * 
	 *  - Gold등급 : 제품금액의 10%를 할인 / 보너스포인트 2% 적립
	 *  - VIP등급 : 제품금액의 10% 할인 / 보너스포인트 5% 적립 / 전담상담사를 갖음
	 *  
	 * 
	 * - 메서드
	 * - 보너스적립 계산 (메서드명 : calcPrice(int price))
	 * => 보너스를 적립하고, 할인여부를 체크하여 구매 price를 리턴
	 * - 구매금액을 주고 적립 보너스를 계산 bonusPoint에 누적
	 * - 출력 메서드 (메서드명 : customerInfo())
	 * - 홍길동 님의 등급은 VIP이며, 보너스포인트는 1000입니다. 
	 */
	
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	double dc;
	
	public Customer() { } // 기본생성자는 무조건 있는 것이 좋음
	
	public Customer(int id, String name) {
	customerId = id;
	customerName = name;
	customerGrade = "Silver";
	bonusRatio = 0.01;		
	}
	
	public int calcPrice(int price) {
		// 가격을 매개변수로 받아 포인트를 적립
		bonusPoint += (int)price * bonusRatio;
		return price;
	}
	
	public void customerInfo() {
		System.out.println(customerName+" 님의 등급은 "+customerGrade+"이며, "
				+ "보너스포인트는 "+bonusPoint+"입니다.");
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}



	
	
}
