package day02;

public class For문2 {

	public static void main(String[] args) {
		/* 2단 출력
		 * 2*1=2, 2*2=4, 2*3=6, ... 2*9=18
		 */
		int i = 2;
		for(int j=1; j<=9; j++) {
			System.out.printf("%d * %d = %d\n", i, j, i*j);
		}
		
		/* 1~10까지의 홀수의 합, 짝수의 합을 출력
		 */
		int sum = 0;
		int sum1 = 0;
		for(int x=1; x<=10; x++) {
			if(x % 2!=0) {
				sum += x;
			} else if(x % 2 == 0) {
				sum1 +=x;
			}
			
		}		
		System.out.println("홀수의 합 = "+sum);
		System.out.println("짝수의 합 = "+sum1);
		
		
		// 이중 for문
		// 2단, 3단, 4단, 5단, ... , 9단
		// 2*1, 2*2, 2*3, ..., 2*9
		// 2단 1~9, 3단 1~9, ...
		for(int y=2; y<=9; y++) {
			for(int z=1; z<=9; z++) {
				System.out.println(y + " * " + z + " = " + (y*z));
			}
		}
		
		
		
		for(int o=1; o<=9; o++) {
			for(int p=2; p<=9; p++) {
				System.out.printf("%d * %d = %d\t", p, o, (p*o));
			}
			System.out.println();
		}
		

	}

}
