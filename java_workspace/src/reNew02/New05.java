package reNew02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class New05 {

	public static void main(String[] args) {
		// 단어장 map 단어 : 의미
		// hello : 안녕
		// 입력받을 단어의 개수를 입력받아서 그만큼 map에 단어와 의미를 추가
		// 콘솔에 찍기
		
		HashMap<String, String> wordList = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("개수 입력 >");
		int num = scan.nextInt();
		for(int i=0; i<num; i++) {
			System.out.println("단어를 입력해주세요. >");
			String word = scan.next();
			System.out.println("뜻을 입력해주세요. >");
			String mean = scan.next();
			
			wordList.put(word, mean);
		}
		
		Iterator<String> it = wordList.keySet().iterator();
		while(it.hasNext()) {
			String w = it.next();
			System.out.println("단어 : "+w+", 뜻 : "+wordList.get(w));
		}
		
		

	}

}
