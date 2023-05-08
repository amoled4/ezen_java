package day06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 계산기 ( + - *  / % ) 각각 메서드 만들기
		 * 메서드에서 바로 출력 (3+2=5)
		 * 1. 숫자를 입력받는 메서드
		 *   - 숫자는 배열로 입력받기
		 * 2. 메뉴 메서드
		 *   - 원하는 계산을 선택해 주세요. > 
		 *   - 1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지
		 * 3. 각 기능 메서드
		 * 
		 * main에서 처리되어야 되는 부분
		 *   1) 1번 메서드 호출 => 숫자를 배열로 저장
		 *   2) 2번 메서드 호출 => 내가 선택한 번호 가져오기
		 *   3) switch(2번 return)
		 *   4) case에 따라 계산기 메서드 호출
		 * 
		 */
		
		int arr[] = new int[2];
		arr= input();
		
		
		
		switch(menu()) {
		case 1:
			System.out.println(">> "+add(arr[0], arr[1]));
			break;
		case 2:
			System.out.println(">> "+min(arr[0], arr[1]));
			break;
		case 3:
			System.out.println(">> "+mul(arr[0], arr[1]));
			break;
		case 4:
			System.out.println(">> "+div(arr[0], arr[1]));
			break;
		case 5:
			System.out.println(">> "+nap(arr[0], arr[1]));
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}

	}
	
	public static int[] input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("두 숫자를 입력해 주세요.");
		int arr[] = new int[2];
		int a = scan.nextInt();
		int b = scan.nextInt();
		arr[0] = a;
		arr[1] = b;
		return arr;
	}
	
	public static int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 계산을 선택해 주세요. >");
		System.out.println("1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지");
		int c = scan.nextInt();
		return c;
	}
	
	public static int add(int a, int b) {
		return (a + b);
	}
	
	public static int min(int a, int b) {
		return a - b;
	}
	
	public static int mul(int a, int b) {
		return a * b;
	}
	
	public static double div(int a, int b) {
		return (double)(a / b);
	}
	
	public static int nap(int a, int b) {
		return a % b;
	}

}