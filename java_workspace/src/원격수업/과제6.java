package 원격수업;

public class 과제6 {

	public static void main(String[] args) {
//		다형성 클래스 수정 예제
//		Animal 클래스 확장해보기 - human, eagle, tiger 클래스에 다른 기능 넣어보기.
//		ex) 각 동물 먹이, 다른 동물 추가 등등..

		
		Animal1 hAnimal = new Human();
		Animal1 tAnimal = new Tiger();
		Animal1 eAnimal = new Eagle();
		Animal1 dAnimal = new Dog();
		Animal1 cAnimal = new Cat();
		Animal1 rAnimal = new Rabbit();
		
		tAnimal.sound();
		
	}

}


class Animal1 {
	public void move() {
		System.out.println("동물들이 움직입니다.");
	}
	public void sound() {
		System.out.println("동물들이 소리를 냅니다");
	}
}

class Human extends Animal1 {

	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
		
	}
	
	public void read() {
		System.out.println("사람이 공부를 합니다.");
	}
	
}

class Tiger extends Animal1 {
	public void move() {
		System.out.println("호랑이가 어슬렁 거립니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다.");
	}

	@Override
	public void sound() {
		System.out.println("어흥");
		super.sound();
	}
	
}

class Eagle extends Animal1 {
	public void move() {
		System.out.println("독수리는 하늘을 날아다닙니다.");
	}
	public void flying() {
		System.out.println("독수리가 두 날개를 쫙 폅니다.");
	}
}

class Dog extends Animal1 {

	@Override
	public void move() {
		System.out.println("강아지는 산책을 좋아합니다.");
		super.move();
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
		super.sound();
	}
	
}

class Cat extends Animal1 {

	@Override
	public void move() {
		System.out.println("고양이가 요염하게 걷습니다.");
		super.move();
	}

	@Override
	public void sound() {
		System.out.println("야옹");
		super.sound();
	}
	
}

class Rabbit extends Animal1 {

	@Override
	public void move() {
		System.out.println("토끼가 깡총깡총 뛰어다닙니다.");
		super.move();
	}

	@Override
	public void sound() {
		System.out.println("깡총깡총");
		super.sound();
	}
	
}