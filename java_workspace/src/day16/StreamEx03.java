package day16;

import java.util.ArrayList;

public class StreamEx03 {

	public static void main(String[] args) {
		/*
		 *  -ArrayList<Student> list 생성 후
			-list.add() 학생명, 점수 5명정도 추가

			list로 스트림 생성 후 
			이름 : 점수 출력
			점수 합계 출력
			ex)
			홍길동 : 90
			강감찬 : 87
			홍길순 : 76
			강길동 : 46
			강길순 : 67
			합계 : 00 인원 : 5
		 */
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동",90));
		list.add(new Student("강감찬",87));
		list.add(new Student("홍길순",76));
		list.add(new Student("강길동",46));
		list.add(new Student("강길순",67));
		
		// toString을 이용할 경우
		//list.stream().forEach(System.out::println);
		
		
		//list.stream().forEach(m->m.getName()+" : "+m.getScore());
		
		// {} : 처리구문이 많은 경우
		list.stream().forEach(m->{  // m=> new Student("홍길동",90) 하나의 객체가 변수에 하나씩 들어옴
			String name = m.getName();
			int score = m.getScore();
			System.out.println(name+" : "+score);
		});
		
		// 합계 => intStream
		// getScore() => Integer => int변환
		// 추출 => map, 추출 후 int변환 => mapToInt
		int sSum = list.stream().mapToInt(n->n.getScore()).sum();
		System.out.println("합계 : "+sSum);
		
		System.out.println("인원 : "+list.stream().count());
		
		// 점수가 70점 이상인 친구들의 합계
		int fSum = list.stream().mapToInt(a->a.getScore()).filter(a->a>=70).sum();
		System.out.println("점수가 70점 이상인 친구들의 합계 : "+fSum);

	}

}
