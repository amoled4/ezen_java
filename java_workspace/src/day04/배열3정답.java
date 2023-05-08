package day04;

import java.util.Scanner;

public class 배열3정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = 5;
		int arr[] = new int[size];
		int sum = 0;
		double avg = 0;
		int max=0;
		int min=101;
		
		System.out.println("점수를 입력해주세요. (5명)");
		for(int i=0; i<arr.length; i++) {
			arr[i]=scan.nextInt();
			sum = sum+arr[i];
			// max=Math.max(max, arr[i]);
			// min=Math.min(min, arr[i]);
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		avg = (double)sum/arr.length;
		
		
		
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println("최고점수 : "+max);
		System.out.println("최저점수 : "+min);
		
	}

}
