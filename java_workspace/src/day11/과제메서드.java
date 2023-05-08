package day11;

import java.util.Scanner;

public class 과제메서드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] fileName = new String[5];
		String[] find = {"jpg", "png", "gif", "jpeg"};
		
		sc(fileName);
		imgFind(fileName, find);
		
		
	}
	
	// 파일명 입력받는 메서드
	public static void sc(String arr[]) {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == null) {
				System.out.println("파일명을 입력해 주세요.");
				arr[i] = scan.next();
			}
		}
	}
	

	
	// 이미지 확장자 찾는 메서드
	public static void imgFind(String name[], String find[]) {
		int cnt=0;
	
		for(int i=0; i<name.length; i++) {
			for(int j=0; j<find.length; j++) {
				if(name[i].contains(find[j])) {
					System.out.println(name[i]);
					cnt++;
				}
			}
		}
					
				if(cnt == 0) {
					System.out.println("검색값이 없습니다.");
	
				}

	}
}
