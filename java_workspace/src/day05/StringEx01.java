package day05;

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
		/* 5개의 파일명이 주어졌을 때, 원하는 단어를 입력하면 입력한 단어가 있는 파일들을 출력하도록 코드를 작성
		 * 
		 * 클럽에 제출
		 */
		
		String[] fileName = {"java의 정석.txt", "이것이 java다.jpg", "String 메서드.txt", "String 함수.jpg", "java의 정석 표시.jpg"};
		
		// ex) java => java의 정석.txt, 이것이 java다.jpg, java의 정석 표시.jpg
		// ex) jpg => 이것이 java다.jpg, String 함수.jpg, java의 정석 표시.jpg
		// ex) String => String 메서드.txt, String 함수.jpg
		
		int cnt = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("글자를 입력해 주세요.");
		String str = scan.nextLine();
		
		for(int i=0; i<fileName.length; i++) {
			if(fileName[i].contains(str) == true) {
				System.out.println(fileName[i]);
				cnt++;
			}
			
		}
		// 검색값이 없을 때
		if(cnt == 0) {
			System.out.println("검색값이 없습니다.");
		}
		
		scan.close();

	}

}
