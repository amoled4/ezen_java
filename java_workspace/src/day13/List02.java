package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) {
		/* --메뉴판--
		 * 1. 햄버거 : 7000
		 * 2. 피자 : 15000
		 * 3. 음료 : 2000
		 * 4. 과자 : 2000
		 * 5. 사탕 : 500
		 * 6. 프로그램 종료
		 * 
		 * 메뉴를 선택해주세요. 1, 수량을 선택해주세요. 2
		 * => 1번메뉴 햄버거 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요.
		 * 메뉴를 선택해주세요. 3, 수량을 선택해주세요. 2
		 * => 3번메뉴 음료 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요. 0
		 * 
		 * -- 선택한 메뉴
		 * 햄버거 2개, 음료 2개 선택 총 지불금액 : ?
		 */
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> order = new ArrayList<>();
		FoodManager FM = new FoodManager();
		FM.add();
		int menuSelect=1, countSelect=0;
		
		
		while(true) {
			FM.printMenu();
			System.out.println(">메뉴를 선택해 주세요<");
			menuSelect = scan.nextInt();
			if(menuSelect==6) {
				System.out.println("주문 종료");
				break;
			}
			
			if(1<=menuSelect&&menuSelect<=5) {
				System.out.println(">수량을 선택해 주세요<");
				countSelect = scan.nextInt();
				FM.sale(menuSelect, countSelect);
				order.add(menuSelect);
				order.add(countSelect);
				} else if(menuSelect>6) {
					System.out.println("잘못 입력하셨습니다.");
				} 
		}
		
		
		while(menuSelect==6) {
			System.out.println("==주문확인==");
			for(int i=0; i<order.size(); i=i+2) {
				System.out.println(">"+FM.getMenuList().get(order.get(i)-1));
				System.out.println(">"+order.get(i+1)+"개");
			}
			break;
		}
		System.out.println("계산하실 금액은 ");
	
		
		
	}

}

class FoodManager {
	// 멤버변수 ArrayList 메뉴, ArrayList 가격
	private ArrayList<String> menuList = new ArrayList<>();
	private ArrayList<Integer> priceList = new ArrayList<>();
	private int sum;
	private int totSum;  // 총 금액
	
	
	// 메서드 정의
	// void printMenu(), 추가 메서드 void add(), sale(int menu, int count) 
	public void printMenu() {
		System.out.println("=======메뉴판=======");
		System.out.println("1. 햄버거 : 7,000원");
		System.out.println("2. 피 자 : 15,000원");
		System.out.println("3. 음 료 : 2,000원");
		System.out.println("4. 과 자 : 2,000원");
		System.out.println("5. 사 탕 :   500원");
		System.out.println("6. 주문 종료");
		System.out.println("==================");
	}
	
	public void add() {
		menuList.add("햄버거");
		menuList.add("피자");
		menuList.add("음료");
		menuList.add("과자");
		menuList.add("사탕");
		
		priceList.add(7000);
		priceList.add(15000);
		priceList.add(2000);
		priceList.add(2000);
		priceList.add(500);
	}
	
	
	public void sale(int menu, int count) {
		sum= priceList.get(menu-1) * count;
		totSum += sum;
		
		System.out.println("====주문확인====");
		System.out.println(menuList.get(menu-1)+" "+count+"개입니다.");
		System.out.println("총 금액은 "+sum);
	}

	public ArrayList<String> getMenuList() {
		return menuList;
	}

	public void setMenuList(ArrayList<String> menuList) {
		this.menuList = menuList;
	}

	public ArrayList<Integer> getPriceList() {
		return priceList;
	}

	public void setPriceList(ArrayList<Integer> priceList) {
		this.priceList = priceList;
	}
		
				
	
}