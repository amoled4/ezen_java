package day10;

import java.util.Scanner;

public class EzenComputer {
	Scanner scan = new Scanner(System.in);
	
	/* - 학생 기본정보 : 이름, 생년월일. 나이, 전화번호
	 * - 학원 정보 : 학원이름 = "EZEN", 지점
	 * - 수강 정보 : 수강과목, 수강기간
	 * - 한 명의 학생은 여러 과목을 수강할 수 있음
	 * 과목, 기간 => 배열로 처리, 길이 = 5
	 * ex)
	 * 홍길동, 990101, 20, 010-1111-1111
	 * EZEN, 인천
	 * 자바(6개월), DB(1개월), html(2개월)
	 * 
	 * 기능 : 
	 *  학생의 기본정보 출력
	 *  학생의 학원정보 출력
	 *  학생의 수강정보 출력
	 *  학생의 수강정보를 추가하는 기능
	 * 
	 */
	
	// 멤버변수 선언
	private String studentName;
	private String birth;
	private int age;
	private String callNum;
	public final static String center = "EZEN";
	private String centerName;
	private String[] className = new String[5];  // 수강과목
	private String[] classPeri = new String[5];  // 수강기간
	private int cnt;  // 수강과목, 수강기간의 index를 처리
	
	
	// 생성자
	public EzenComputer() { }
	
	public EzenComputer(String studentName, String birth, int age, String callNum, String centerName) {
		// super();
		this.studentName = studentName;
		this.birth = birth;
		this.age = age;
		this.callNum = callNum;
		this.centerName = centerName;
	}
	
	public EzenComputer(String studentName, String callNum, String centerName) {
		this.studentName = studentName;
		this.callNum = callNum;
		this.centerName = centerName;
	}

	//method
	public void studentPrint() {
		System.out.println("학생 정보>");
		System.out.println(studentName+", "+birth+", "+age+"세, "+callNum);
	}
	
	public void centerPrint() {
		System.out.println("학원 정보>");
		System.out.println(center+", "+centerName);
	}
	
	// 수강정보 출력
	public void classPrint() {  // 배열 => for문 반복하여 출력
		if(className.length == 0 || cnt == 0) {
			System.out.println("수강이력이 없습니다.");
			return;  // 메서드의 종료
		}
		for(int i = 0; i<cnt; i++) {  // 추가되지 않은 값은 출력X
			System.out.println(className[i]+"("+classPeri[i]+")");
		}
	}
	
	// 수강정보 등록
	public void insert(String className, String classPeri) {
		this.className[cnt] = className;
		this.classPeri[cnt] = classPeri;
		cnt++;  // index 증가
	}
	
	
	
	
	// getter/setter
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCallNum() {
		return callNum;
	}

	public void setCallNum(String callNum) {
		this.callNum = callNum;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String[] getClassName() {
		return className;
	}

	public void setClassName(String[] className) {
		this.className = className;
	}

	
	
	
	
	
	
	
	

}
