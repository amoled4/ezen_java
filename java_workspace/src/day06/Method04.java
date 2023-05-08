package day06;

public class Method04 {

	public static void main(String[] args) {
		/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴)
		 * 2. 배열을 전달받아서 평균을 연산하는 메서드 (평균:double 을 리턴)
		 * 3. 정수 5개와 평균을 출력하는 메서드
		 * 
		 * main에서는 연산식이 있으면 안 됨
		 * 메서드간의 데이터 전달 및 호출만 있어야 함
		 */
		

		result(arr(), avg(arr()));

	}
	
	/* 리턴타입 : int[] 배열
	 * 매개변수 : 없음
	 */	
	public static int[] arr() {
				
		int arr1[] = new int[5];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = (int)(Math.random()*100)+1;
		}
		return arr1;
	}
	
	public static double avg(int arr1[]) {
		int sum=0;
		for(int i=0; i<arr1.length; i++) {
			sum = sum + arr1[i];
		}
		return (double)sum / arr1.length;
	}
	
	public static void result(int arr1[], double avg) {
		for(int i =0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println(avg);
	}

}
