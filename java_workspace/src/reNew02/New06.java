package reNew02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class New06 {

	public static void main(String[] args) {
		// 단어장 map 단어 : 의미
		// hello : 안녕
		// 입력받을 단어의 개수를 입력받아서 그만큼 map에 단어와 의미를 추가
		// 콘솔에 찍기
		
		// method에서 리턴해 온 map을 출력
		
		New06 w = new New06();
		w.make();
		
		Iterator<String> it = wordList.keySet().iterator();
		while(it.hasNext()) {
			String wd = it.next();
			System.out.println(wd+ ":"+wordList.get(wd));
		}

	}
	
	// 단어:의미를 입력받아서 map으로 구성한 후 리턴
	
	static HashMap<String, String> wordList = new HashMap<String, String>();
	public static void make() {
		Scanner scan = new Scanner(System.in);
		System.out.println("개수 입력 :");
		int num = scan.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.println("영단어 입력 : ");
			String word = scan.next();
			System.out.println("뜻 입력 : ");
			String mean = scan.next();
			
			wordList.put(word, mean);
		}
	}
}
