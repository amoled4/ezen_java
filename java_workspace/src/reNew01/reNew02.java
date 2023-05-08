package reNew01;

public class reNew02 {

	public static void main(String[] args) {
		// for문을 이용하여 1부터 10까지 출력
		// 1~10까지 합계 출력
		// 1~10까지 짝수합, 홀수합 출력
		int sum = 0;
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			} else if(i % 2 == 1) {
				oddSum += i;
			}
			sum += i;
			System.out.print(i+" ");
			
		}
		System.out.println(sum);
		System.out.println(evenSum);
		System.out.println(oddSum);

	}

}
