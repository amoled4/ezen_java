package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set01 {

	public static void main(String[] args) {
		/* Set : 순서보장X 중복X
		 * Hashset
		 * index가 없음
		 */
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("apple");
		set.add("peach");
		set.add("홍길동");
		set.add("이순신");
		
		
		System.out.println(set);
		
		// get사용 불가능 향상된 for문만 가능
		for(String tmp : set) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		// Iterator
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		// set 정렬 : set은 순서가 없어서 정렬이 안 됨 => set => list로 변환한 후 정렬
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		System.out.println("---------Set -> list 변경");
		System.out.println(list);
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1); // 내림차순
			} 
			
		});
		System.out.println(list);

	}

}
