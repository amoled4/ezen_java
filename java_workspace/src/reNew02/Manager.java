package reNew02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Manager {
	// 상품 클래스를 생성
	// 상품 추가, 상품 리스트 출력, 상품 내용 수정, 상품 삭제
	// 상품 클래스
	// manager 사용하여 추가, 출력, 수정, 삭제 기능
	// main 이용하여 menu 출력 
	// 1. 상품추가 2. 상품출력 3. 상품수정 4. 상품삭제
	Scanner scan = new Scanner(System.in);
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	private String productName;
	private int price;
	
	
	// 상품 추가
	public void productAdd() {
	
			System.out.println("상품명을 입력해주세요. ");
			String name = scan.next();
			System.out.println("가격을 입력해주세요. ");
			int pri = scan.nextInt();
			
			map.put(name, pri);
			System.out.println("상품이 추가되었습니다.");
	}
	
	// 상품 출력
	public void printPro() {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.println(k+" : "+map.get(k)+"원");
		}
	}
	// 상품 수정
	public void editPro() {
		
		System.out.println("가격 수정할 상품 > ");
		String wor = scan.next();
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String kk = it.next();
			if(kk.equals(wor)) {
				System.out.println("수정할 가격 입력 > ");
				int p = scan.nextInt();
				map.replace(wor, p);
				
			}
		}
		System.out.println("수정 완료");
	}
	// 상품 삭제
	public void delPro() {
		System.out.println("삭제할 상품 > ");
		String wor2 = scan.next();
		Iterator<String> it2 = map.keySet().iterator();
		while(it2.hasNext()) {
			String kk2 = it2.next();
			if(kk2.equals(wor2)) {
				map.remove(wor2);
				
				
			}
		}
		System.out.println("삭제 완료");
	}
		

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
