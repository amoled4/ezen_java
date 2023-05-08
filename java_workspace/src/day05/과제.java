package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 가위바위보게임 만들기
		 * 컴퓨터가 가위, 바위, 보 중 랜덤으로 선택 (0=가위, 1=바위, 2=보)
		 * 내가 가위, 바위, 보 중 선택해서 입력
		 * 승/패/무승부의 결과를 출력
		 * 삼항연산자 (조건식) ? true : false;
		 */
		//int num = 3;
		//System.out.println((num % 2 == 0) ? "짝수" : "홀수");
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("게임을 시작하려면 번호를 입력하세요. (0=가위, 1=바위, 2=보)");
		int game = (int)(Math.random()*3);
		// System.out.println(game);
		
		int num = scan.nextInt();
		
		System.out.println("컴퓨터가 "+ ((game==0) ? "가위" : (game==1) ? "바위" : "보")+"를 냈습니다.");
		System.out.println("사용자가 "+ ((num==0) ? "가위" : (num==1) ? "바위" : "보")+"를 냈습니다.");
		
		
		if(num==0) {
			if(game==0) {
				System.out.println(">>무승부");
			} else if(game==1) {
				System.out.println(">>패배");
			} else {
				System.out.println(">>승리");
			}
		}
		
		if(num==1) {
			if(game==1) {
				System.out.println(">>무승부");
			} else if(game==0) {
				System.out.println(">>승리");
			} else {
				System.out.println(">>패배");
			}
		}
		
		if(num==2) {
			if(game==2) {
				System.out.println(">>무승부");
			} else if(game==1) {
				System.out.println(">>승리");
			} else {
				System.out.println(">>패배");
			}
		}
	
		

	}

}
