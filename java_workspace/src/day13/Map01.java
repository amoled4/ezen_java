package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 *  - 값을 2개 저장, key / value 값으로 저장
		 *  - key는 중복불가, value는 중복가능
		 *  - HashMap을 가장 많이 사용
		 *  
		 *  HashMap<String, Integer> map = new HashMap<String, Integer>(); 
		 *  Map은 값이 두 개여서 Iterator를 사용할 수 없음
		 *  Map => Set으로 변경 후 출력
		 *  
		 *  list, set => .add(); .get(index);  // 값 추가, 추출 방법
		 *  map => .put();
		 *         getKey();  getValue();  // 값 추출
		 */
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("햄버거", 15000);
		map.put("피자", 20000);
		map.put("음료", 2000);
		map.put("과자", 2000);  // value 중복가능
		map.put("사탕", 500);
		map.put("사탕", 700);  // key 중복 X
		
		System.out.println(map);
		System.out.println(map.keySet());  // key값
		System.out.println(map.values());  // value값
		
		// key가 햄버거인 값을 출력
		System.out.println(map.get("햄버거"));  // 리턴이 value값
		
		// 요소 출력
		System.out.println("-----iterator 출력");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+" : "+map.get(key));
		}
		
		System.out.println("-----향상된 for문 이용");
		for(String tmp : map.keySet()) {
			System.out.println(tmp+" : "+map.get(tmp));
		}
		
		System.out.println(map);
		System.out.println(map.entrySet());
		
		System.out.println("-----entrySet 이용");
		for(Map.Entry<String, Integer> tmp : map.entrySet()) {
			System.out.println(tmp.getKey()+" : "+tmp.getValue());
		}
		
		// value값 합계
		int sum=0;
		for(int tmp : map.values()) {
			sum += tmp;
		}
		System.out.println("-------------");
		System.out.println("합계 : "+sum);

	}

}
