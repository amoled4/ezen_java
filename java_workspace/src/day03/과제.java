package day03;

public class 과제 {

	public static void main(String[] args) {
		// char : 유니코드표에 따라 글자의 코드별로 글자를 표시
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		
		for(char ch1='a'; ch1<='z'; ch1++) {
			System.out.print(ch1+" ");
		}
		System.out.println();
		System.out.println("--------------------------------");
		
		for(char ch1='a'; ch1<='z'; ch1++) {
			for(char ch2='a'; ch2<='z'; ch2++) {
			System.out.print(ch1+" ");
			}
		System.out.println();
		}
		System.out.println("--------------------------------");
		
		/* a
		 * ab
		 * abc
		 * abcd
		 * abcde
		 * ...
		 * abcde.....z
		 */
		for(char ch3='a'; ch3<='z'; ch3++) {
			for(char ch4='a'; ch4<=ch3; ch4++) {
				System.out.print(ch4);
			}
			System.out.println();
		}
		
		
		
	}
}
