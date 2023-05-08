package JDBC;

import java.util.List;
import java.util.Scanner;

public class ProductController {
	// 상품등록, 상품전체 리스트 보기, 상품 상세페이지 보기, 상품 수정, 상품 삭제
	// 데이터베이스 연동한 후 컨트롤러에서 모든 메뉴를 분기처리
	// 컨트롤러 -> 서비스를 호출 -> 요청, 서비스 -> DAO 호출(DB 구문 연결 호출)
	// controller -> service(interface) -> serviceimpl(구현체)
	private Scanner scan;
	private Service svc;
	private boolean flag; // 종료변수 (flag = false) == 종료

	// 생성자
	public ProductController() {
		scan = new Scanner(System.in);
		svc = new ProductService(); // service 구현 객체
		flag = true;
		printMenu(); // method 호출
	}

	private void printMenu() {
		while (flag) {
			System.out.println("-상품관리시스템-");
			System.out.println("1. 등록 | 2. 목록 | 3. 찾기 | 4. 수정 | 5. 삭제 | etc 종료 | 메뉴선택>");
			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.println("등록(regiser)메뉴");
				// 실행메서드 추가
				register();
				break;
			case 2:
				System.out.println("list메뉴");
				// 실행메서드 추가
				list();
				break;
			case 3:
				System.out.println("detail메뉴");
				// 실행메서드 추가
				detail();
				break;
			case 4:
				System.out.println("edit메뉴");
				edit();
				break;
			case 5:
				System.out.println("remove메뉴");
				// 실행메서드 추가
				remove();
				break;
			default:
				System.out.println("etc");
				flag = false;
				break;
			}
		}
	}
	
	// 삭제
	private void remove() {
		System.out.println("삭제할 상품번호 >>");
		int pno = scan.nextInt();
		
		int isOk = svc.remove(pno);
		System.out.println("상품삭제 " + (isOk > 0 ? "성공" : "실패"));
	}
	
	// 수정
	private void edit() {
		System.out.println("수정할 상품번호 >>");
		int pno = scan.nextInt();
		
		System.out.println("수정할 가격 >>");
		int price = scan.nextInt();
		
		
		int isOk = svc.edit(new Product(pno, price));
		System.out.println("상품수정 " + (isOk > 0 ? "성공" : "실패"));
		
	}

	// 세부 정보 보기
	private void detail() {
		// select 내가 선택한 번호의 전체 내용을 리턴
		System.out.println("상품번호 >>");
		int pno = scan.nextInt();
		
		// 번호를 줄테니 그에 맞는 product 객체를 리턴
		List<Product> detailList = svc.detailList();

		// 출력
		for (Product p : detailList) {
			if(pno == p.getPno()) {
				System.out.println(p);
			}
		}
	}

	// 전체 리스트 보기
	private void list() {
		// 전체 DB의 리스트
		// select pno, pname, regdate from product
		List<Product> list = svc.list();

		// 출력
		for (Product p : list) {
			System.out.println(p);
		}
	}

	// C 등록 메서드명(register, insert, add..)
	// R 조회 메서드명(list, select..)
	// U 수정 메서드명(edit, update)
	// D 삭제 메서드명(remove, delete)
	// DAO의 메서드명은 DB명 그대로 많이 쓰이는 편

	// 각종 메뉴들에 대한 분기 처리
	// 등록 메뉴
	private void register() {
		System.out.println("상품명 >>");
		String pname = scan.next();
		System.out.println("상품가격 >>");
		int price = scan.nextInt();
		scan.nextLine(); // 윗쪽 공백(Enter)를 하단 madeby가 등록하는 것을 막기 위한 공백 날림
		System.out.println("상품상세 >>");
		String madeby = scan.nextLine();
		// isOk DB에 등록요청을 하고, 요청이 올바르게 이루어진 후 리턴 받는 값
		// 0 => 실패, 1 => 성공
		// 원래 처리는 method 구문을 먼저 만들고, main에서 호출해오는 형태였다면
		// main에서 호출하면 역으로 method를 생성(메서드명, 매개변수 결정해서 생성)
		int isOk = svc.register(new Product(pname, price, madeby));
		System.out.println("상품등록 " + (isOk > 0 ? "성공" : "실패"));
	}

}
