package day03;

public class 최대공약수 {

	public static void main(String[] args) {
		/* 최대공약수 구하기
		 * 공약수 : 두 수의 공통된 약수
		 * 최대공약수 : 두 수의 공통된 약수 중 가장 큰 값
		 * 
		 * 8 : 1 2 4 8
		 * 12 : 1 2 3 4 6 12
		 * 공약수 : 1 2 4
		 * 최대공약수 : 4
		 */
		
		int num1 = 8;
		int num2 = 12;
		int gcd = 0;   // 최대공약수를 담을 변수
		// 두 수의 공약수만 출력
		for(int i=1; i<=num2; i++) {
			if(num1 % i == 0 && num2 % i==0) {
				// System.out.print(i+" ");
				gcd = i;
			} 
		}
		System.out.println("두 수의 최대공약수 : "+gcd);
		
		
		
		/* 반복횟수 : num1부터 1씩 감소
		 * 조건이 맞다면 break
		 */				
		for(int i=num2; ; i--) {
			if(num1 %i ==0 && num2 % i ==0) {
				System.out.println("최대공약수 : "+i);
				break;  // 처음 만나는 공약수가 최대공약수 바로 break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
