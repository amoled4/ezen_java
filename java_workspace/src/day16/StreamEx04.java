package day16;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamEx04 {

	public static void main(String[] args) {
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		/*
		 * 여행상품
			여행 비용은 15세 이상은 100만원, 15세 미만은 50만원
			고객 3명이 패키지 여행을 떠나려고 할 때 
			1. 비용 계산
			2. 고객명단

			고객은 class로 생성, ArrayList로 추가
			고객정보
			이름:이순신, 나이:40, 비용:100
			이름:심사임당, 나이:35, 비용:100
			이름:이아들, 나이:10, 비용:50
			총 여행비용 : 250

		 */
		
		
		
		
//		list.add(new Customer("이순신",40,100));
//		list.add(new Customer("심사임당",35,100));
//		list.add(new Customer("이아들",10,50));
//		
//		list.stream().forEach(System.out::println);
//		int sum = list.stream().mapToInt(a-> a.getCost()).sum();
//		System.out.println("총 여행비용 : "+sum);
		
		
		
		list.add(new Customer("이순신",40));
		list.add(new Customer("심사임당",35));
		list.add(new Customer("이아들",10));
		
		list.stream().forEach(n-> {
			String name = n.getName();
			int age = n.getAge();
			int cost=0;
			
			if(age>=15) {
				cost = 100;
			} else if(age<15) {
				cost = 50;
			}
			System.out.println("이름 : "+name+", 나이 : "+age+", 비용 : "+cost);
		});
		
		int sum = list.stream().map(n-> {
			if(n.getAge()>=15) {
				return 100;
			} else {
				return 50;
			}
		}).mapToInt(n-> n.intValue()).sum();
		System.out.println("총 여행비용 : "+sum);
		
		System.out.println("---------------------");
		// 20세 이상 성인만 이름을 정렬하여 출력
		//list.stream().filter(n->n.getAge()>=20).map(n->n.getName()).sorted().forEach(System.out::println);

		list.stream().filter(n->n.getAge()>=20).sorted(new Comparator<Customer>() {
			public int compare(Customer o1, Customer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		}).forEach(System.out::println);;
	}

}
