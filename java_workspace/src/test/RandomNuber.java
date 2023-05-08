package test;

import java.util.Scanner;

public class RandomNuber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("난수의 개수를 입력하세요. : ");
		int num = scan.nextInt();
		
		int[] random = new int[num];
		int sum=0;
		
		for(int i=0; i<random.length; i++) {
			random[i] = (int)(Math.random()*51);
			//System.out.println(random[i]);
			sum += random[i];
		}
		System.out.println("난수 "+num+"개의 합은 "+sum);
	}

}
