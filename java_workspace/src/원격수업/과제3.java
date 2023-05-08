package 원격수업;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class 과제3 {

	public static void main(String[] args) {
//		Scanner를 이용하여 id와 password를 입력받아 아이디와 패스워드가 일치하면 "로그인 성공"
//		id가 일치하지 않으면 "잘못된 ID입니다." 
//		id는 일치하고, password가 일치하지 않으면 "비밀번호 불일치!!"
//
//		입력값 id = Kim, pw = 1235   => 잘못된 ID
//		입력값 id = Lee, pw = 1235   => 비밀번호 불일치
//		입력값 id = Lee, pw = 1234   => 로그인 성공
//
//		ex)
//		Map<String, String> map = new HashMap<>();
//
//		map.put("Lee", "1234");
//		map.put("Kim", "1236");
//		map.put("Cho", "1239");
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("Lee", "1234");
		map.put("Kim", "1236");
		map.put("Cho", "1239");
		map.put("Park", "1456");
		map.put("Choi", "2933");
		map.put("Yang", "5066");
		map.put("Kang", "4052");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ID를 입력해 주세요.");
		String id = scan.next();
		System.out.println("비밀번호를 입력해 주세요.");
		String pass = scan.next();
		
//		Iterator<String> it = map.keySet().iterator();
//		while(it.hasNext()) {
//			String key = it.next();
//			String value = map.get(key);
			
		for(String tmp : map.keySet()) {
			String value = map.get(tmp);
			if(tmp.equals(id) && value.equals(pass)) {
				System.out.println("로그인 성공!");
				break;
			} else if(tmp.equals(id) && !(value.equals(pass))) {
				System.out.println("비밀번호가 일치하지 않습니다.");
				break;
			} else if(!(tmp.equals(id)) && value.equals(pass)) {
				System.out.println("잘못된 ID입니다.");
				break;
			}
				
		}
			

		
	}

}
