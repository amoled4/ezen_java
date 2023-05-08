package day08;

public class 클래스02 {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수 : color, power, speed
		 * 메서드 : powerOn, powerOff, speedUp +10, speedDown -10
		 * 멤버변수 : private
		 * 멤버변수를 확인/수정 => getter/setter 필요
		 */
		
		Car c = new Car("red",2);
		System.out.println(c.getDoor());
		System.out.println(c.getColor());
		System.out.println(c.getSpeed());
		System.out.println(c.isPower());
		c.color();
		c.setColor("yellow");
		c.color();
		c.powerOn();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.powerOff();
		System.out.println(c.isPower());
		c.speedUp();
		c.powerOn();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		
		
		Car c2 = new Car("black");
		System.out.println("-----다른 자동차-----");
		c2.color();
		c2.setColor("blue");
		c2.color();
		System.out.println(c2.isPower());
		c2.powerOn();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.powerOff();
		c2.speedUp();
		c2.speedDown();
		c2.powerOn();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.powerOff();
		c2.speedUp();
		c2.powerOn();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		

	}

}

class Car {
	// 멤버변수 선언
	private String color; // null
	private boolean power; // false
	private int speed; // 0
	private int door;
	
	// 생성자 : 없으면 기본생성자가 자동 추가
	// 생성자 위치
	public Car(String color) {
		this.color = color;
	}
	public Car(String color, int door) {
		// this(color); // 생성자 호출
		this.color = color;
		this.door = door;
	}
	public Car() { 	}  // 기본생성자
	
	// 색상
	public void color() {
		System.out.println("색상은 "+color+"입니다.");
	}
	// 색상 가져오기
	public String getColor() {
		return color;
	}
	// 색상 변경
	public void setColor(String color) {
		this.color = color;
	}
	
	
	// 스피드 업
	public void speedUp() {
		if(power==false) {
			System.out.println("시동을 먼저 켜주십시오.");
		} else {
			speed += 10;
			System.out.println("속도가 "+speed+"입니다.");
		}
	}	
	// 스피드 다운
	public void speedDown() {
		if(speed>0) {
			speed -= 10;
			System.out.println("속도가 "+speed+"입니다.");
		} else {
			System.out.println("속도가 0입니다.");
		}
	}
	
	
	// 파워 온
	public void powerOn() {
		power = true;
		System.out.println("시동이 켜졌습니다.");
	}
	// 파워 오프 (시동이 꺼지면 속도 0)
	public void powerOff() {
		power = false;
		speed=0;
		System.out.println("시동이 꺼졌습니다.");
	}
	
	
	
	// getter/setter
	public boolean isPower() {  //boolean형은 get => is
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
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	
	
	
	
}