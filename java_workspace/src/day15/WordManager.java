package day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class WordManager {
	
	private ArrayList<Word> word = new ArrayList<>();
	
	public void add() {
		word.add(new Word("apple","사과"));
		word.add(new Word("banana","바나나"));
		word.add(new Word("cat","고양이"));
		word.add(new Word("detele","삭제"));
		word.add(new Word("eagle","독수리"));
	}
	
	public void addWord(Scanner scan) {
		System.out.println("추가할 영단어를 입력해주세요.");
		String word = scan.next();
		System.out.println("영단어의 뜻을 입력해주세요.");
		String mean = scan.next();
		
		this.word.add(new Word(word,mean));
		System.out.println();
		System.out.println(">> 추가되었습니다.");
	}

	public void printWord() {
		System.out.println("-------단어장-------");
		// 오름차순 정렬
		word.sort(new Comparator<Word>() {
			public int compare(Word o1, Word o2) {
				return o1.getWord().compareTo(o2.getWord());
			}
		});
		
		// word 클래스에서 hashcode와 Comparable을 이용하면 Collections.sort 사용가능
		// Collections.sort(word);
		
		// 출력
		for(Word tmp : word) {
			System.out.println(tmp);
		}

	}
	
	public void searchWord(Scanner scan) {
		System.out.println("검색할 단어를 입력해주세요.");
		String sWord = scan.next();
		int index = -1;  // 찾은 단어의 배열주소 입력
		// 전체 탐색
		for(int i=0; i<word.size(); i++) {
			if(word.get(i).getWord().equals(sWord)) {
				System.out.println();
				System.out.println("---------검색결과----------");
				System.out.println(word.get(i).toString());
				System.out.println("-------------------------");
				index = i;
			} 
		} 
		if(index==-1) {
			System.out.println("검색결과가 없습니다.");
		}
	}
	
	public void updateWord(Scanner scan) {
		System.out.println("뜻을 수정할 단어를 입력해주세요.");
		String uWord = scan.next();
		for(int i=0; i<word.size(); i++) {
			if(word.get(i).getWord().equals(uWord)) {
				System.out.println("수정할 뜻을 입력해주세요.");
				String mean = scan.next();
				word.get(i).setMean(mean);
				System.out.println("수정되었습니다.");
				return;
			}
		} System.out.println("단어가 없습니다.");
	}
	
	public void deleteWord(Scanner scan) {
		System.out.println("삭제할 단어를 입력해주세요.");
		String sWord = scan.next();
		for(int i=0; i<word.size(); i++) {
			if(word.get(i).getWord().equals(sWord)) {
				word.remove(i);
				System.out.println("삭제되었습니다.");
				return;
			}
		} System.out.println("단어가 없습니다.");
	}
	
	
	public void printFile() throws IOException {
		FileWriter fs = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fs);
		
		// 단어장의 list의 값을 String화 하기 위해 StringBuffer
		// 객체 생성
		StringBuffer sb = new StringBuffer();
		String data = null;
		int cnt = 0;
		Collections.sort(word);
		while(cnt < word.size()) {
			sb.append(word.get(cnt));
			sb.append("\r\n");   // 줄바꿈
			cnt++;
		}
		data = sb.toString();
		System.out.println(data);
		bw.write(data);
		
		bw.close();
		fs.close();
	
	}
}
