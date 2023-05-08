package day13;

import java.util.HashMap;
import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 출력, 합계, 평균 출력
		 * 종료 키워드가 나올 때까지 반복(0)
		 * 
		 * 과목과 점수를 입력해주세요
		 * 국어:89
		 * 수학:97
		 * 0 종료
		 * 입력받은 map 출력 후 합계: 평균:
		 */
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		String sub;
		int score;
		int sum=0;
		double avg=0.0;
		
		while(true) {
			System.out.println("과목과 점수를 입력해 주세요. (종료:0)");
			sub = scan.next();
			
			if(sub.equals("0")) {
				break;
			} 
			
			score = scan.nextInt();
			map.put(sub, score);
					
		}
		
		for(String tmp : map.keySet()) {
			sum += map.get(tmp);
			avg = (double)sum / map.size();
			System.out.println(tmp+" : "+map.get(tmp));
		}
		
		System.out.println("종료");
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);

	}

}
