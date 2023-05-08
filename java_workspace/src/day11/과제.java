package day11;

import java.util.Scanner;

public class 과제 {
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/* 5개의 문자열 배열을 생성한 후 5개의 파일명을 입력받는 코드를 작성
		 * 입력받은 파일 중 이미지 파일을 검색하여 출력하는 코드 작성
		 * 이미지파일 형식은 (jpg, png, gif, jpeg)
		 * String[] fileName = { "java.txt", "String.jpg", "method.png", "String.pdf",
		 * 							"java.pdf" }
		 * 
		 * --이미지 파일--
		 * String.jpg
		 * method.png
		 */
		
		int cnt = 0;
		
		// 파일명 입력받기
		String[] find = {"jpg", "png", "gif", "jpeg"};
		String[] fileName = new String[5];
		for(int i=0; i<fileName.length; i++) {
			if(fileName[i] == null) {
				System.out.println("파일명을 입력해 주세요.");
				fileName[i] = scan.next();
			}
		}
		
		// 이미지 확장자 파일명 찾고 출력
		for(int i=0; i<fileName.length; i++) {
			for(int j=0; j<find.length; j++) {
				if(fileName[i].contains(find[j])) {
					System.out.println(fileName[i]);
					cnt++;
				
				}	
			}
			
		}
		// 검색값이 없을 때
		if(cnt == 0) {
			System.out.println("검색값이 없습니다.");
		}

	}




	
}
