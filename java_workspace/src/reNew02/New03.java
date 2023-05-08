package reNew02;

public class New03 {

	public static void main(String[] args) {
		// car 객체 생성 후 객체의 정보 출력, 전원 켜기, 스피드 올리기
		// car 객체는 2개 생성
		Car blackCar = new Car(2,"black");
		blackCar.powerOn();
		blackCar.speedDown();
		blackCar.speedDown();
		blackCar.speedUp();
		blackCar.speedUp();
		blackCar.speedUp();
		blackCar.speedUp();
		blackCar.speedUp();
		blackCar.speedUp();
		blackCar.speedUp();
		blackCar.speedUp();
		blackCar.speedUp();
		blackCar.speedUp();
		blackCar.speedUp();
		blackCar.speedUp();
		blackCar.speedUp();
		blackCar.speedUp();
		blackCar.speedUp();
		blackCar.speedUp();
		blackCar.speedUp();
		blackCar.speedUp();
		blackCar.powerOff();
		blackCar.powerOn();
		blackCar.speedUp();
		blackCar.color();
		
		Car redCar = new Car(4, "red");
		redCar.door();
		redCar.color();
		
		
	}

}

// car 클래스 생성
// power, speed, door, color
class Car {
	boolean power;
	int speed;
	int door;
	String color;
	
	
	
	
	
	
	public Car(int door, String color) {
		super();
		this.door = door;
		this.color = color;
	}
	
	public void powerOn() {
		power = true;
		System.out.println("시동이 걸렸습니다.");
	}
	public void powerOff() {
		power = false;
		speed = 0;
		System.out.println("시동이 꺼졌습니다.");
	}
	public void door() {
		System.out.println("문의 개수는 "+door+"개입니다.");
	}
	public void color() {
		System.out.println("색상은 "+color+"입니다.");
	}
	
	public void speedUp() {
		if(power == true) {
			speed += 10;
			System.out.println("속도 : " +speed);
		} else {
			System.out.println("시동이 꺼져있습니다.");
		}
	}
	public void speedDown() {
		if(power == true) {
			if(speed > 0) {
				speed -= 10;
				System.out.println("속도 : " +speed);
			} else {
				speed = 0;
				System.out.println("속도 : " +speed);
			}
		} else {
			System.out.println("시동이 꺼져있습니다.");
		}
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
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
