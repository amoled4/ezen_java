package day04;

public class While문 {

	public static void main(String[] args) {
		/* while(조건식) {
		 *  실행문;  // 조건식이 false가 될 수 있는 구문을 포함해야 함.
		 *  증감식;
		 * }
		 * 
		 * 초기화
		 * while(조건식) {
		 *  실행문;
		 *  증감식;
		 * }
		 * 
		 */
		/* 1~10까지 출력
		 * 
		 */
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println(" > while문 활용");
		int i=1;        // 초기값
		while(i<=10) {  // 조건식
			// 실행문
			System.out.print(i+" ");
			// 증감식
			i++;
		}
		
		System.out.println();
		System.out.println(">> while문을 활용하여 1~10까지 짝수만 출력");
		
		System.out.println("----내가 푼 것----");
		int j=2;
		while(j<=10) {
			System.out.print(j+" ");
			j= j+2;
		}
		System.out.println();
		System.out.println("----선생님 정답----");
		
		int j1=1;
		while(j1<=10) {  // 조건식 - 반복을 하기 위한 조건
			if(j1%2==0) {
				System.out.print(j1+" ");  // 짝수만 출력
			} 
			j1++;
		}
		
		System.out.println();
		System.out.println("----continue문 이용----");
		// continue문을 이용한 1~10까지 짝수 출력
		int j2=1;
		while(j2<=10) {
			j2++;
			if(j2%2==1) {
				continue;
			}
			System.out.print(j2+" ");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
