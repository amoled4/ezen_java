package day10;

public class 클래스06 {

	public static void main(String[] args) {
		/* final은 클래스, 변수, 메서드에 붙일 수 있음
		 * final : 수정할 수 없음
		 * final 멤버변수 : 상수
		 * final 멤버메서드 : 오버라이딩을 할 수 없다
		 * final 클래스 : 상속할 수 없다 부모클래스가 될 수 없다
		 */
		
		// setter를 이용한 객체 생성
		EzenStudent es = new EzenStudent();
		es.setCenterName("인천점");
		es.setStudentName("김경아");
		es.setClassName("java");
		es.setCallNum("01066262922");
		es.print();
		
		// 생성자를 이용한 객체 생성
		System.out.println("-----------------------------------");
		EzenStudent es2 = new EzenStudent("인천", "홍길순", "자바", "010-1234-4567");
		es2.print();

	}

}

/* 초기화 방법 : 기본값, 명시적 초기값, 초기화 블럭, 생성자
 *  1. 명시적 초기화 : 멤버변수 선언과 동시에 초기값 지정
 *  2. 초기화 블럭 : { } 멤버변수 초기화
 *  3. 생성자 : 객체를 생성할 때 초기화해서 생성
 *  우선순위 : 기본값 -> 명시적 초기값 -> 초기화 블럭 -> 생성자 
 * 
 */

// 멤버변수 : 지점, 이름, 반, 전화번호
// 메서드 : 출력(print 메서드 or toString)
// getter/setter
class EzenStudent {
	private String centerName;
	private String studentName;
	private String className;
	private String callNum;  // 01012345678 => 8진수 // 연산에 사용될 값만 int
	{
		// 초기화 블럭 : 멤버변수들을 초기화;
		className = "미정";
	}
	
	// 생성자
	public EzenStudent() { }
	public EzenStudent(String centerName, String studentName, String className, String callNum) {
		this.centerName = centerName;
		this.studentName = studentName;
		this.className = className;
		this.callNum = callNum;
	}
	
	public void print() {
		System.out.println(centerName);
		System.out.println(studentName);
		System.out.println(className);
		System.out.println(callNum);
	}
	
	// getter/setter
	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getCallNum() {
		return callNum;
	}

	public void setCallNum(String callNum) {
		this.callNum = callNum;
	}
	
	
	
	
}