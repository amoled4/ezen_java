package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list 생성
		 * 
		 */
		
		ArrayList<String> todayList = new ArrayList<String>();
		todayList.add("기상");
		todayList.add("씻기");
		todayList.add("아침밥 먹기");
		todayList.add("옷 입기");
		todayList.add("학원 가기");
		todayList.add("공부하기");
		todayList.add("점심 먹기");
		todayList.add("귀가하기");
		todayList.add("운동하기");
		todayList.add("저녁 먹기");
		todayList.add("샤워하기");
		todayList.add("과제하기");
		todayList.add("취침");
		
		// 요소 출력
		for(String tmp : todayList) {
			System.out.println(tmp);
		}
		
		// Iterator
		System.out.println("--------------------");
		System.out.println("> Iterator 출력");
		Iterator<String> it = todayList.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
		}
		
		// 오름차순 정렬
		System.out.println("---------------------");
		Collections.sort(todayList);
		System.out.println(todayList);
		
		todayList.sort(new Test());
		System.out.println(todayList);
		

	}

}

class Test implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// compareTo 메서드 활용
		return o2.compareTo(o1);  // 내림차순
	}
	
}