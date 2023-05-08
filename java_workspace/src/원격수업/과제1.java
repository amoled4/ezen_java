package 원격수업;

import java.util.Scanner;

public class 과제1 {

	public static void main(String[] args) {
		
//		  1. String ans = "a:b:c:d";? => a#b#c#d?
//				? ?:? => # 변경하여 출력??
		
		String ans = "a:b:c:d";
		for(int i=0; i<ans.length(); i++) {
			if(ans.charAt(i)==':') {
				System.out.print("#");
			} else {
				System.out.print(ans.charAt(i));
			}
		}
		System.out.println();
		
		
//				
//			2. 홍길동의 주민등록번호 881120-1068234이다.? 생년월일과 성별을 출력
//				출력형태 생년월일 : 881120?
//				성별 : 남
		String hong = "881120-1068234";
		System.out.println("생년월일 : "+hong.substring(0, hong.indexOf("-")));
		if(hong.substring(hong.indexOf("-")+1, hong.indexOf("-")+2).equals("1")) {
			System.out.println("성별 : 남");
		} else if(hong.substring(hong.indexOf("-")+1, hong.indexOf("-")+2).equals("2")) {
			System.out.println("성별 : 여");
		}
			
		
		
		
//			3. scanner를 이용하여 1부터 내가 입력한 수까지 3의배수를 출력
//			? 내가 입력한 수 : 100
//			? 1~100까지 3의배수 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		int num = scan.nextInt();
		for(int i=1; i<num; i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
		
		
//			
//			4. switch문을 이용하여 입력받은 월이 봄(3-5), 여름(6-8), 가을(9-11), 겨울(12-2)인지 판별하여 출력
		System.out.println("계절이 궁금한 월을 입력해 주세요.");
		int month = scan.nextInt();
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("입력하신 "+month+"월은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("입력하신 "+month+"월은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("입력하신 "+month+"월은 가을입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println("입력하신 "+month+"월은 겨울입니다.");
			break;
		default:
			System.out.println(month+"월은 없는 달입니다.");
		}
		
		
		
//			5. while문 또는 for 문을 사용하여 다음과 같이 별(*)을 표시하는 프로그램을 작성해 보자.
//
//		 	*
//		 	**
//		 	***
//		 	****
//		 	*****
		 
		for(int i=1; i<=5; i++) {
			for(int j=1; i>=j; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		


	}

}
