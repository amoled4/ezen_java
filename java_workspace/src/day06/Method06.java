package day06;

import java.util.Scanner;

public class Method06 {

	public static void main(String[] args) {
		/* 구구단 출력
		 * 구구단 1단을 출력하는 메서드
		 * 7 => 7단
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		int i = scan.nextInt();
		gugudan(i);

	}
	/* 구구단 출력
	 * 매개변수 : 몇 단 => int num
	 * 리턴타입 : void
	 * 메서드명 : gugudan
	 */
	public static void gugudan(int num) {			
		for(int i=1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+(i*num));
				
			}
			
		
		
	}
}
