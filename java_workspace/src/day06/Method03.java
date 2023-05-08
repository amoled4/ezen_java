package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/* 메서드를 활용하여 계산기를 작성
		 * 
		 * 메서드는 + - * / % 를 작성하여 출력
		 * 두 수를 입력받아서 연산 연산자를 입력받아 메서드를 활용하여 연산
		 * 
		 */
	
	
		
	Scanner scan = new Scanner(System.in);
	System.out.println("두 수를 입력해 주세요");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	
	int hap = sum(num1, num2);
	int bap = min(num1, num2);
	int gop = mul(num1, num2);
	double nap = div(num1, num2);
	int nup = na(num1, num2);
	
	
	System.out.println("연산자를 입력해 주세요.");
	String str = scan.next();
	
	switch(str) {
	case "+":
		System.out.println(hap);
		break;
	case "-":
		System.out.println(bap);
		break;
	case "*":
		System.out.println(gop);
		break;
	case "/":
		System.out.println(nap);
		break;
	case "%":
		System.out.println(nup);
		break;
	}
	
	
	
	
	

	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int min(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}	
	
	public static double div(int num1, int num2) {
		return (double)num1 / num2;
	}
	
	public static int na(int num1, int num2) {
		return num1 % num2;
	}
	
	
	
	
	

}
