package day07;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 배열로 생성 (1~9까지만)
		 * 유저가 3자리의 숫자를 맞추는 게임
		 * 숫자와 자리가 일치하면 strike
		 * 숫자만 일치하면 ball, 아무것도 안 맞으면 out
		 * count 세기
		 * 맞힐 때까지 반복
		 * 
		 * ex)
		 * 컴 - 3 5 7 
		 * 나 - 3 4 6
		 * 1s
		 * 
		 * 3 5 7
		 * 3 7 8
		 * 1s 1b
		 * 
		 * 3 5 7
		 * 6 8 1
		 * out
		 * --야구게임 시작
		 * 컴퓨터가 숫자를 정했습니다.
		 * 숫자를 입력해주세요. (1~9, 3자리) >
		 * 3 5 6 
		 * 2s
		 * 3s 다 맞으면 종료(게임횟수출력)
		 */
		
		Scanner scan = new Scanner(System.in);
		int strike=0;
		int ball=0;
		int cnt=0;
		int comNums[] = new int[3];
		int userNums[] = new int[3];
		
		// 컴퓨터 숫자
		System.out.println("야구게임을 시작합니다.");
		for(int i=0; i<comNums.length; i++) {
			comNums[i] = (int)(Math.random()*9)+1;		
		}		
		
		// 중복
		while(comNums[0]==comNums[1]) {
			comNums[1] = (int)(Math.random()*9)+1;
		}
		
		while(comNums[0]==comNums[2] || comNums[1]==comNums[2]) {
			comNums[2] = (int)(Math.random()*9)+1;
		}
		for (int tmp : comNums) {
			System.out.println(tmp);
		}
		
		// 게임 시작
		while(true) {	
			strike=0;
			ball=0;
			// 유저 숫자
			System.out.println("숫자를 입력해주세요. (1~9, 3자리)");
			for(int i=0; i<userNums.length; i++) {
				userNums[i] = scan.nextInt();
			}
		
		
			for(int i=0; i<comNums.length; i++) {
				for(int j=0; j<userNums.length; j++) {
					if(comNums[i] == userNums[j] && i==j) {
						strike++;
					} else if(comNums[i] == userNums[j] && i!=j){
						ball++;
					}
				}
			}
			cnt++;
			System.out.println(strike+"s "+ball+"b");
		
			if(strike==3) {
				System.out.println("정답입니다.");
				System.out.println("총 "+cnt+"번만에 맞혔습니다.");
				break;
		
			}
		}
		
	}

}
