package day04;

public class 과제 {

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
		
		int num = 30;
		int sum = 0;
		int count= 0;
		
		for(; ;) {
			int dice = (int)(Math.random()*6)+1;
			sum = sum+dice;
			count++;
//			System.out.println(sum);
			System.out.println("주사위 : "+dice);
			System.out.println(">>"+dice+"칸 전진합니다.");
			System.out.println(num-sum+"칸 남았습니다.");	
		
			if(sum>=30) {
				System.out.println("도착~~!!");
				System.out.println("총 이동횟수 : "+count);
				break;
			}
				
		}

			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}