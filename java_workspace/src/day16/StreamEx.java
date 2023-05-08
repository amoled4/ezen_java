package day16;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		/* 문자열을 담는 리스트 생성 후, 스트림으로 생성
		 * 정렬하여 출력
		 */
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("홍길순땡땡");
		list.add("강감찬");
		list.add("이길여땡땡");
		list.add("크림이");
		list.add("박땡땡");
		list.add("나땡땡");
		
		Stream<String> st = list.stream();
		st.sorted().forEach(s->System.out.println(s));
		System.out.println("----------------------");
		//list.stream().sorted().forEach(System.out::println);
		
		// 글자수가 5글자 이상인 이름만 출력
		list.stream().filter(n->n.length()>=5).forEach(System.out::println);
		System.out.println("-----------------------");
		
		// 각자 이름의 글자수를 출력
		list.stream().map(n->n.length()).forEach(System.out::println);

	}

}
