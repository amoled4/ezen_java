package day02;

import java.util.Scanner;

public class IF예제 {

	public static void main(String[] args) {
		/* 정수를 입력 받아서 정수가 짝수인지 홀수인지 판단하여 출력.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);  // ctrl + shift + o  import 자동 입력
		
		System.out.println("숫자를 입력해 주세요.");
		
		
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		
		scan.close();
	}

}
