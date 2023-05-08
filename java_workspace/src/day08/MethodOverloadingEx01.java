package day08;

import java.util.Scanner;

public class MethodOverloadingEx01 {
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/* calc(1,2,"+")
		 * calc(1,"+",2)
		 * calc("+",1,2)
		 * 
		 * 메서드 오버로딩을 이용하여 두 정수와 연산자를 입력받아 연산자의 위치에 상관없이
		 * 연산의 결과가 출력되는 calc 메서드를 완성
		 * 잘못된 연산자가 들어오면 잘못된 연산자입니다. 표시
		 */
		
		System.out.println("----계산기----");
//		System.out.println("두 숫자와 연산자를 입력해 주세요.");
//		int num1 = scan.nextInt();
//		String op = scan.next();
//		
//		int num2 = scan.nextInt();
		calc(1, 2, "-");
		calc(1, "*", 2);
		calc("/", 10, 2);
		calc("&", 5, 6);
		
		


	}
	
	public static void calc(int num1, int num2, String op) {
		switch(op) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		case "%":
			System.out.println(num1%num2);
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
		}
	}
	public static void calc(int num1, String op, int num2) {
		switch(op) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		case "%":
			System.out.println(num1%num2);
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
		}
	}
	public static void calc(String op, int num1, int num2) {
		switch(op) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		case "%":
			System.out.println(num1%num2);
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
		}
	}
	
	

}
