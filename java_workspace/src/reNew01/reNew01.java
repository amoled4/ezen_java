package reNew01;

public class reNew01 {

	public static void main(String[] args) {
		// 홍길동의 주민등록번호 : 881002-1234567
		// 출력형태 : 생년월일 : 881002, 성별 : 남
		String pin = "881002-1234567";
		
		System.out.println("생년월일 : "+pin.substring(0, pin.indexOf("-")));
		
		String gender = pin.charAt(pin.indexOf("-") + 1) == '1' ? "남" : "여";
		System.out.println("성별 : "+gender);
		// char 자료형은 ==로 비교 가능

	}

}
