package 원격수업;

public class 과제2 {

	public static void main(String[] args) {
//		자동차 클래스 구현.  
//
//		Car interface와 SamSung 클래스를 구현 / 상속하여 SamSungCar 클래스를 완성하시오. 
//
//		SamSungCarMain 클래스에서 객체생성 후 출력해보기.
//
		SamSungCar ssc = new SamSungCar();
		//System.out.println(ssc.logo);
		ssc.speedUp();
		ssc.speedDown();
		ssc.wipersOn();
		ssc.PowerOn();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedDown();
		ssc.speedDown();
		ssc.speedDown();
		ssc.speedDown();
		ssc.speedDown();
		ssc.speedDown();
		ssc.speedDown();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.speedUp();
		ssc.wipersOn();
	}

}

interface Car{
    void PowerOn();  //시동켜기
    void PowerOff(); //시동끄기
    void speedUp(); 
    void speedDown();
    void wipersOn();  //와이퍼켜기
    void wipersOff();  //와이퍼끄기
}

class SamSung{
    protected String logo = "SamSung";
    
}

class SamSungCar extends SamSung implements Car{
	
	private boolean power = false;
    private int speed = 0;
    private boolean wiper = false;

	@Override
	public void PowerOn() {
		System.out.println(logo);
		System.out.println("시동이 켜졌습니다.");
		power = true;
		
	}

	@Override
	public void PowerOff() {
		System.out.println("시동이 꺼졌습니다.");
		power = false;
		speed = 0;
		
	}

	@Override
	public void speedUp() {
		if(power) {
			if(speed>=150) {
				System.out.println("속도가 너무 높습니다. 속도를 줄여주세요.");
				System.out.println("속도 : "+speed);
			} else {
				speed+=10;
				System.out.println("속도 : "+speed);
			}
		} else {
			System.out.println("시동을 켜주세요.");
		}
		
	}

	@Override
	public void speedDown() {
		if(power) {
			if(speed<=0) {
				speed=0;
				System.out.println("속도 : "+speed);
			} else {
				speed-=10;
				System.out.println("속도 : "+speed);
			}
		} else {
			System.out.println("시동을 켜주세요.");
		}
		
		
		
	}

	@Override
	public void wipersOn() {
		if(power) {
			System.out.println("와이퍼가 작동됩니다.");
			wiper = true;
		} else {
			System.out.println("시동을 켜주세요.");
		}
		
	}

	@Override
	public void wipersOff() {
		if(power) {
			System.out.println("와이퍼가 꺼졌습니다.");
			wiper = false;
		} else {
			System.out.println("시동을 켜주세요.");
		}
		
	}
	
}
