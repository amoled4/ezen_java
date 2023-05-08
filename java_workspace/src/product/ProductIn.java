package product;

import java.util.Scanner;

public interface ProductIn {
	void add(Scanner scan);          		   // 메뉴 추가
	void printProduct();                       // 제품리스트보기(메뉴판 출력) 
	void orderPick(String name, int count);    // 제품주문(제품명, 수량)
	void printOrder();                         // 주문내역(주문리스트 출력) 지불총금액 계산
	void delete(Scanner scan);                 // 제품 삭제
	void update(Scanner scan);                 // 제품 수정 - 가격 수정
}
