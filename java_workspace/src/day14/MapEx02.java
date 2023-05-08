package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02 {

	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	Scanner scan = new Scanner(System.in);
	int size = 3;
	
	public static void main(String[] args) {
		// map에 상품명과 가격을 입력받고 출력
		// 총 지불 가격 출력
		// 입력 -> 메서드로, 출력 -> 메서드로 구현
		
		MapEx02 ex = new MapEx02();
		ex.input();
		ex.output();
		
		

	}
	
	public void input() {
		while(map.size()<size) {
			System.out.println("상품명 : ");
			String product = scan.next();
			System.out.println("가격 : ");
			int price = scan.nextInt();
			
			map.put(product, price);
		}
	}
	
	public void output() {
		int sum=0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String product = it.next();
			int price = map.get(product);
			sum += price;
			System.out.println("상품명 : "+product+", 가격 : "+price);
		}
		System.out.println("총 지불 금액은 "+sum+"입니다.");
	}

}
