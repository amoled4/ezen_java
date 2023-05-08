package day14;

import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		/* 날짜시간 클래스
		 * Calendar 클래스 사용 => 추상클래스
		 * 직접 객체를 생성할 수 없음
		 * new 연산자를 통해 객체 구현 X
		 * getInstance()를 이용하여 구현한 클래스를 통해 인스턴스를 얻어 옴
		 * 
		 * month : (0월 ~ 11월) +1 필수
		 * week : 1 = 일요일, 2 = 월, ... 
		 * am_pm : am=0, pm=1
		 * 
		 */
//		Date d = new Date();
//		d.getDate();  // deprecated : 비권장
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONTH)+1;  // 0월부터 시작
		System.out.println(month);  
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		System.out.println(year+"-"+month+"-"+day);
		
		// hour, minute, second
		int hour = now.get(Calendar.HOUR);
		System.out.println(hour);
		int minute = now.get(Calendar.MINUTE);
		System.out.println(minute);
		int second = now.get(Calendar.SECOND);
		System.out.println(second);
		System.out.println(hour+"시 "+minute+"분 "+second+"초");
		int ampm = now.get(Calendar.AM_PM);

		System.out.println("================================");
		// 2023-02-17(금)
		// 오후 2:42
		
		
		String weekString = null;
		switch(week) {
		case 1: weekString = "일"; break;
		case 2: weekString = "월"; break;
		case 3: weekString = "화"; break;
		case 4: weekString = "수"; break;
		case 5: weekString = "목"; break;
		case 6: weekString = "금"; break;
		case 7: weekString = "토"; break;
		default:
			break;
			
		}
		System.out.println(year+"-"+month+"-"+day+"("+weekString+")");
		System.out.println((ampm==0?"오전":"오후")+" "+hour+":"+minute);
		
		
		System.out.println("-------------------내가한거----------------");
		
		switch(week) {
		case 1: System.out.println(year+"-"+month+"-"+day+"(일)"); break;
		case 2: System.out.println(year+"-"+month+"-"+day+"(월)"); break;
		case 3: System.out.println(year+"-"+month+"-"+day+"(화)"); break;
		case 4: System.out.println(year+"-"+month+"-"+day+"(수)"); break;
		case 5: System.out.println(year+"-"+month+"-"+day+"(목)"); break;
		case 6: System.out.println(year+"-"+month+"-"+day+"(금)"); break;
		case 7: System.out.println(year+"-"+month+"-"+day+"(토)"); break;
		}
		
		switch(ampm) {
		case 0: System.out.println("오전 "+hour+":"+minute); break;
		case 1: System.out.println("오후 "+hour+":"+minute); break;
		}
		
		
	}

}
