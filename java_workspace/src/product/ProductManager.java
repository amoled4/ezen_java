package product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager implements ProductIn {
	
	Scanner scan = new Scanner(System.in);
	private ArrayList<Product> menu = new ArrayList<>();
	private ArrayList<Order> order = new ArrayList<>();
	
	public void addMenu() {
		menu.add(new Product("햄버거",7000));
		menu.add(new Product("피자",15000));
		menu.add(new Product("음료",2000));
		menu.add(new Product("과자",2000));
		menu.add(new Product("사탕",500));
		
	}
	
	@Override
	public void add(Scanner scan) {
		System.out.println("추가할 메뉴를 입력해주세요.");
		String menu = scan.next();
		System.out.println("추가할 메뉴의 가격을 입력해주세요.");
		int price = scan.nextInt();
		this.menu.add(new Product(menu, price));
		
		
	}

	@Override
	public void printProduct() {
		System.out.println("----MENU----");
		for(Product tmp : menu ) {
			System.out.println(tmp);
		}
		
	}

	@Override
	public void orderPick(String name, int count) {
		// 매개변수로 입력받을 경우 scan으로 입력받으면 됨
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
				int price = menu.get(i).getPrice();
				Order order = new Order();
				order.setMenu(name);
				order.setPrice(price);
				order.setCount(count);
				order.setTotal(price*count);
				this.order.add(order);
				return;
			} 
		}
		System.out.println("제품이 없습니다.");

	}

	@Override
	public void printOrder() {
		int sum = 0;
		System.out.println("====주문확인====");
		for(int i=0; i<order.size(); i++) {
			order.get(i).print();
			sum += order.get(i).getTotal();
			
		}
		System.out.println("--------------");
		System.out.println("지불하실 총 금액 : "+sum);

	}

	@Override
	public void delete(Scanner scan) {
		System.out.println("삭제할 메뉴를 입력해주세요.");
		String name = scan.next();
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
				menu.remove(i);
				System.out.println("삭제되었습니다.");
				return;
			}
		} System.out.println("제품이 없습니다.");
	}
	
	@Override
	public void update(Scanner scan) {
		System.out.println("가격을 수정할 메뉴를 입력해주세요.");
		String name = scan.next();
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
				System.out.println("수정할 가격을 입력해주세요.");
				int price = scan.nextInt();
				menu.get(i).setPrice(price);
				System.out.println("수정되었습니다.");
				return;
			}
		} System.out.println("제품이 없습니다.");
		
	}
	
}
