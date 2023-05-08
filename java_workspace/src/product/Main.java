package product;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		ProductManager pm = new ProductManager();
		pm.addMenu();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		do {
			
			// 메뉴 넣기
			System.out.println();
			System.out.println("=======메뉴=======");
			System.out.println("1. 제품 추가");
			System.out.println("2. 제품리스트 보기");
			System.out.println("3. 제품 주문");
			System.out.println("4. 주문내역");
			System.out.println("5. 가격수정");
			System.out.println("6. 제품삭제");
			System.out.println("7. 프로그램 종료");
			System.out.println("==================");
			System.out.println(">> 입력 :");
			
			// 메뉴 값 입력받기
			menu = scan.nextInt();
			
			// 메뉴에 대한 분기 구현
			switch(menu) {
			case 1:
				pm.add(scan);
				break;
			case 2:
				pm.printProduct();
				break;
			case 3:
				System.out.println("주문할 제품을 입력해주세요.");
				String p = scan.next();
				System.out.println("수량을 입력해주세요.");
				int count = scan.nextInt();
				pm.orderPick(p, count);
				break;
			case 4:
				pm.printOrder();
				break;
			case 5:
				pm.update(scan);
				break;
			case 6:
				pm.delete(scan);
				break;
			case 7:
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
			
		}while(menu!=7);
		System.out.println("종료합니다.");
		
		
		
		scan.close();

	}

}
