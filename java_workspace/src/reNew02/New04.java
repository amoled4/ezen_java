package reNew02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class New04 {

	public static void main(String[] args) {
		/*
		 * 컬렉션 프레임워크
		 * - List : 순서보장, 중복가능
		 * - Set : 순서보장X, 중복 불가능
		 * - Map : 2가지 데이터를 쌍으로 저장, 순서보장X
		 * 	- key(중복불가능) : value(중복가능)
		 */
		// 리스트를 생성하고, 1~10까지 저장한 후 출력
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		System.out.println("----------향상된 for문--------");
		for(int tmp : list) {
			System.out.println(tmp);
		}
		System.out.println("-----------iterator---------");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int tmp = it.next();
			System.out.println(tmp);
		}
		
		
		
		// 정수를 입력받아 1부터 정수까지 리스트에 추가하고
		// 리스트와 합을 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = scan.nextInt();
		int sum = 0;
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i=1; i<=num; i++) {
			list2.add(i);
			sum += i;
		}
		System.out.println(list2);
		System.out.println("합계 : "+sum);
		
		// map을 이용하여 이름:점수 형태로 3명의 이름과 점수를 입력
		// map을 출력하고, 합계, 평균 출력
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김경아", 100);
		map.put("조민규", 50);
		map.put("양휘원", 40);
		
		System.out.println(map);
		int sum2 = 0;
		int avg = 0;
		
		for(String key : map.keySet()) {
			System.out.println(key);
			sum2 += map.get(key);
		}
		avg = sum2 / map.size();
		System.out.println("합계 : "+sum2);
		System.out.println("평균 : "+avg);
		
		Iterator<String> it2 = map.keySet().iterator();
		while(it2.hasNext()) {
			String key = it2.next();
			System.out.println(key+":"+map.get(key));
		}
		
		
		// 새로운 맵 하나 생성
		// 스캐너로 이름과 점수를 5명 입력받아 map, 합계, 평균 출력
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		int sum3 = 0;
		int avg2 = 0;
		for(int i=0; i<5; i++) {
			System.out.println("이름을 입력해주세요. >");
			String name = scan.next();
			System.out.println("점수를 입력해주세요. >");
			int score = scan.nextInt();
			
			map2.put(name, score);
			
		}
		Iterator<String> it3 = map2.keySet().iterator();
		while(it3.hasNext()) {
			String key2 = it3.next();
			sum3 += map2.get(key2);
			System.out.println(key2+ " : " +map2.get(key2));
		}
		
		avg2 = sum3 / map2.size();
		System.out.println("합계 : "+sum3);
		System.out.println("평균 : "+avg2);
		
		
	}
	
}
