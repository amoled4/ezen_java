package reNew02;

import java.util.Scanner;

public class New07 {

	public static void main(String[] args) {
		// 상품 클래스를 생성
		// 상품 추가, 상품 리스트 출력, 상품 내용 수정, 상품 삭제
		// 상품 클래스
		// manager 사용하여 추가, 출력, 수정, 삭제 기능
		// main 이용하여 menu 출력 
		// 1. 상품추가 2. 상품출력 3. 상품수정 4. 상품삭제
		Manager m = new Manager();
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
			
		
		while(num!=5) {
			try {
			System.out.println("------MENU-------");
			System.out.println("1. 상품 추가");
			System.out.println("2. 상품 출력");
			System.out.println("3. 상품 수정");
			System.out.println("4. 상품 삭제");
			System.out.println("5. 종료");
			System.out.println("-----------------");
			System.out.println("선택 >");
			num = scan.nextInt();
			
			switch(num) {
			case 1:
				m.productAdd();
				break;
			case 2:
				m.printPro();
				break;
			case 3:
				m.editPro();
				break;
			case 4:
				m.delPro();
				break;
			case 5:
				System.out.println("종료되었습니다.");
				return;
			}
			} catch(Exception e) {
				System.out.println("잘못 입력하셨습니다.");
				scan.nextLine();
				continue;
			}
		}
		
		
		
		
	}

}

