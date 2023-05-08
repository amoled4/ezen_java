package day15;

import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		/*1. 단어추가
		* 2. 단어출력 (추가된 모든 단어를 정렬해서 출력(word를 기준으로)
		* 3. 단어검색
		* 4. 단어수정
		* 5. 단어삭제
		* 6. 종료
		* */

		Scanner scan = new Scanner(System.in);
		WordManager wm = new WordManager();
		wm.add();
		
		int menu = 0;
		
		do {
			
			// 메뉴 넣기
			System.out.println();
			System.out.println("================");
			System.out.println("1. 단어 추가");
			System.out.println("2. 단어 출력");
			System.out.println("3. 단어 검색");
			System.out.println("4. 단어 수정");
			System.out.println("5. 단어 삭제");
			System.out.println("6. 파일로 출력");
			System.out.println("7. 프로그램 종료");
			System.out.println("================");
			System.out.println(">> 입력 :");
			
			// 메뉴 값 입력받기
			menu = scan.nextInt();
			
			// 메뉴에 대한 분기 구현
			switch(menu) {
			case 1:
				wm.addWord(scan);
				break;
			case 2:
				wm.printWord();
				break;
			case 3:
				wm.searchWord(scan);
				break;
			case 4:
				wm.updateWord(scan);
				break;
			case 5:
				wm.deleteWord(scan);
				break;
			case 6:
				wm.printFile();
				break;
			case 7:
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
			
		}while(menu!=7);
		System.out.println("종료합니다.");
		
		
		
		scan.close();
		
		
		
		
	}

	
	
}



