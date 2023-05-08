package reNew03;

public class Singleton {

	private static Singleton instance;
	
	// 생성자를 private로 선언
	// 객체 생성을 막기 위해 private 설정
	private Singleton() {}
	
	// getInstance 메서드
	public static Singleton getInstance() {
		// null일 때만 생성, 이미 생성되어있다면 기존 객체 반환
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
}
