package day04;

import java.util.Scanner;

public class 과제1 {

	public static void main(String[] args) {
		/* 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 : 1~6까지의 랜덤수
		 * 주사위 : 3
		 * 3칸 전진 => 27칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 전진 => 21칸 남았습니다.
		 * ...
		 * 도착~!! 총 이동횟수 : 00번
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		int num1 =30;
		int sum =0;
		int count=0;
		
		for(;;) {
			System.out.println("주사위를 굴릴까요? 굴리기:0 | 종료:1");
			int num = scan.nextInt();
			if(num==0) {
				count++;
				int dice = (int)(Math.random()*6) +1;
				sum = sum + dice;
				System.out.println(">>"+dice+"칸 전진합니다.");
				System.out.println(num1-sum+"칸 남았습니다.");
				if(num1-sum<=0) {
					System.out.println("도착~!!!!!!");
					System.out.println("총 이동횟수 : "+count+"번");
					break;
				}			
			
			}else if(num==1) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		
		}
				
		
		
		
		
		
		
		
		
		

	}

}