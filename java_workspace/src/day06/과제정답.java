package day06;

import java.util.Scanner;

public class 과제정답 {
	// 멤버변수의 자리
	static Scanner scan = new Scanner(System.in);
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
		
		int nums[] = getNums();
		int select = getSelect();
				
		switch(select) {
		case 1: getSumResult(nums); break;
		case 2: getsubResult(nums); break;
		case 3: getMulResult(nums); break;
		case 4: getDivResult(nums); break;
		case 5: getModResult(nums); break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println("프로그램 종료");

	}
	/* 숫자를 배열로 입력받는 메서드
	 * 매개변수 : X
	 * 리턴타입 : 배열 => int[]
	 * 메서드명 : getNums()
	 */	
	public static int[] getNums() {
		int nums[] = new int[2];
		for(int i=0; i<nums.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력해 주세요.");
			nums[i] = scan.nextInt();
		}
		return nums;
		
	}
	
	/* 메뉴를 나타내는 메서드
	 * 매개변수 : X
	 * 리턴타입 : 메뉴에서 선택한 값 => int
	 * 메서드명 : getSelect
	 */
	public static int getSelect() {
		System.out.println("원하는 계산을 선택해 주세요. >");
		System.out.println("1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지");
		int select = scan.nextInt();
		return select;
	}
	
	/* 각 기능에 ( + - *  / % )에 대한 출력 메서드
	 * 리턴타입 : void
	 * 매개변수 : 배열
	 */
	public static void getSumResult(int nums[]) {
		int result = 0;
		for(int i=0; i<nums.length; i++) {
			result = result + nums[i];
		}
		System.out.println(nums[0]+"+"+nums[1]+"="+result);
	}
	
	public static void getsubResult(int nums[]) {
		int result = nums[0] - nums[1];
		System.out.println(nums[0]+"-"+nums[1]+"="+result);
	}
	
	public static void getMulResult(int nums[]) {
		System.out.println(nums[0]+"*"+nums[1]+"="+nums[0]*nums[1]);
	}
	
	public static void getDivResult(int nums[]) {
		System.out.println(nums[0]+"/"+nums[1]+"="+((double)nums[0]/nums[1]));
	}
	
	public static void getModResult(int nums[]) {
		System.out.println(nums[0]+"%"+nums[1]+"="+(nums[0]%nums[1]));
	}

}
