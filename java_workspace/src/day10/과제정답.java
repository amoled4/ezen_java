package day10;

import java.util.Scanner;

public class 과제정답 {

	public static void main(String[] args) {
		/* Product 클래스 : 상품을 등록하는 클래스
		 * 멤버변수 : 상품명, 가격
		 * 상품 등록 메서드 = insertProduct
		 * 출력 메서드 toString
		 * getter/setter
		 */
		
		/* ProductMain
		 * product 배열 생성 [10]
		 * 
		 * 상품 등록 후 리스트 출력
		 * 
		 * 스캐너를 통해서 상품 등록
		 * 상품을 등록하시겟습니까? (y/n)
		 * y => 상품등록 반복 / n => 그만
		 * 상품 이름과 가격을 등록받아 상품 배열에 등록
		 * n => 등록된 제품 리스트 출력
		 */
		
		Product[] pro = new Product[10];
		Scanner scan = new Scanner(System.in);
		
		char menu = 'y';
		int cnt=0;    // p객체의 index 핸들링하기 위한 변수
		int sum=0;
		
		while(menu != 'n') {
			System.out.println("상품을 등록하시겠습니까? (y/n)");
			menu = scan.next().charAt(0);
			
			if(menu == 'y') {
				System.out.println("상품명 > ");
				String name = scan.next();
				
				System.out.println("가격 > ");
				int price = scan.nextInt();
				// 입력받은 값을 바로 합계
//				sum += price;
				// 생성자를 이용하여 객체 생성 후 배열에 객체 담기
//				Product tmp = new Product(name, price);
//				pro[cnt] = tmp;
				
				// insertProduct 메서드를 활용하여 객체 생성 후 등록
				pro[cnt] = new Product();
				pro[cnt].insertProduct(name, price);
				
				cnt++;  // index 증가
			} else {
				if(menu == 'n') {
					System.out.println("상품등록 종료");
					
				} else {
					System.out.println("y/n만 입력 가능합니다.");
				}
			}
		}
		
		System.out.println("--등록된 제품 리스트--");
		for(int i=0; i<cnt; i++) {
			// toString 사용한 경우
			System.out.println((i+1)+"번째 상품 : "+pro[i]);
			
			// 메서드 사용한 경우
			// pro[i].출력 메서드명
			sum = sum + pro[i].getPrice();
		}
		
		System.out.println(">상품 "+cnt+"개의 총 금액은 "+sum+"원 입니다.<");
		
		scan.close();

	}

}
