package day10;

public class 클래스04 {

	public static void main(String[] args) {
		// 생성자를 이용하여 객체 생성
		Car c = new Car("black",2,false,false,0);
		c.print();
		System.out.println("-----------------------");
		c.setColor("red");
		c.setAirback(true);
		c.powerOn();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.print();
		c.powerOff();
		System.out.println(c);

	}

}


class Car {
	// 멤버변수 : color, door, airback, power, speed
	private String color;
	private int door;
	private boolean airback;
	private boolean power;
	private int speed;
	
	// 생성자 : 빈생성자, color, (color, door), (color, door, airback), 전체값 생성자
	public Car() {
		
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	public Car(String color, int door) {
		this.color = color;
		this.door = door;
	}
	
	public Car(String color, int door, boolean airback) {
		// 생성자 호출
		this(color, door);
		this.airback = airback;
	}
	
	// 생성자 자동생성 -마우스 우클릭-source-generate constructor using fields
	public Car(String color, int door, boolean airback, boolean power, int speed) {
	// super();  // 부모의 생성자를 호출
	this.color = color;
	this.door = door;
	this.airback = airback;
	this.power = power;
	this.speed = speed;
	}


	
	
	// method : print, powerOn, powerOff, speedUp, speedDown
	public void print() {
		// 멤버변수는 내 클래스에서 모든 메서드에서 공유되는 변수
		// 멤버변수를 매개변수로 받을 필요가 없음
		System.out.println("--------MyCar-------");
		System.out.println("색상은 "+color+"입니다.");
		System.out.println("문은 "+door+"개입니다.");
		if(airback == true) {
			System.out.println("에어백이 장착되었습니다.");
		} else {
			System.out.println("에어백이 장착되지 않았습니다.");
		}
		System.out.println("---------------------");
	}
	
	// toString : 멤버변수들을 출력해주는 메서드
	@Override
	public String toString() {
		return "MyCar [color=" + color + ", door=" + door + ", airback=" + airback + "]";
	}
	
	
	public void powerOn() {
		power = true;
		System.out.println("시동이 켜졌습니다.");
	}
	

	public void powerOff() {
		power = false;
		System.out.println("시동이 꺼졌습니다.");
	}
	
	public void speedUp() {
		if(power==false) {
			System.out.println("시동을 먼저 켜주십시오.");
		} else {
			speed+= 10;
			System.out.println("속도가 "+speed+"입니다.");
		}
	}
	
	public void speedDown() {
		if(speed>0) {
			speed -= 10;
			System.out.println("속도가 "+speed+"입니다.");
		} else {
			speed = 0;
			System.out.println("속도가 0입니다.");
		}
	}

	
	
	
	
	// getter/setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public boolean isAirback() {
		return airback;
	}

	public void setAirback(boolean airback) {
		this.airback = airback;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}