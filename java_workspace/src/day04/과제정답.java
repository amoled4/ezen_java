package day04;

public class 과제정답 {

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
		
		int random=0;   // 주사위 값
		int sum=0;      // 이동거리 합산
		int count=0;    // 주사위 던진 횟수(이동횟수)
		int last = 30;  // 최종 목표값
		
		while(sum < last) {  // sum이 last가 될 때까지 반복
			random = (int)(Math.random()*6) +1;   // 1~6까지 랜덤수 생성
			sum += random;  // 거리 합산
			count++;
			System.out.println("주사위 : "+random+", 전진 => "+(last-sum)+"칸 남았습니다.");
			
		}
		System.out.println("도착~~!!, 총 이동횟수 : "+count);

	}

}
