package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 단어장  단어 : 의미 => hello : 안녕
		 * 
		 * 5개의 단어를 입력하고, 단어장을 출력
		 */
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		
		int size = 5;
		
		//while을 이용하여 단어와 뜻 입력받고 map에 저장
		while(map.size() < size) {
			// 입력
			System.out.println("단어 : ");
			String word = scan.next();
			System.out.println("뜻 : ");
			String mean = scan.next();
			
			map.put(word, mean);  // map.size() 증가
		}
		
		// 출력
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next();      // key값 반환
			String mean = map.get(word);  // value값 반환
			System.out.println("단어 : "+word+" 의미 : "+mean);
		}
		
		
		
		//for문
//		for(int i=0; i<5; i++) {
//			
//			System.out.println("영단어와 뜻을 입력해 주세요");
//			String eng = scan.next();
//			String kor = scan.next();
//			
//			map.put(eng, kor);
//		}
//		
//		for(String tmp : map.keySet()) {
//			System.out.println(tmp+" : "+map.get(tmp));
//		}

	}

}
