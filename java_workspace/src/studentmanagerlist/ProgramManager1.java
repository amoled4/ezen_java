package studentmanagerlist;

import java.util.ArrayList;
import java.util.Scanner;

import studentmanager.Student;
import studentmanager.Subject;

public class ProgramManager1 implements Program1{
	
	private ArrayList<Student1> std = new ArrayList<Student1>();
	private ArrayList<Subject1> sj = new ArrayList<Subject1>();

	
	// 학생-수강과목으로 출력 안 됨
	// 학생 두명일 때 수강과목 추가 안 됨
	@Override
	public void printStudent() {
		
		for(Student1 tmp : std) {
			System.out.println(tmp);
		}
		
		for(Subject1 tmp : sj) {
			System.out.println(tmp);
			return;
		} System.out.println("수강중인 과목이 없습니다.");
	}

	@Override
	public void insertStudent(Scanner scan) {
		System.out.println("--------학생추가--------");
		System.out.println("학번을 입력해주세요.");
		String stdNum = scan.next();
		System.out.println("이름을 입력해주세요.");
		String stdName = scan.next();
		System.out.println("학부를 입력해주세요.");
		String faculty = scan.next();
		System.out.println("학과를 입력해주세요.");
		String major = scan.next();
		
		std.add(new Student1(stdNum, stdName, faculty, major));
		System.out.println("학생이 등록되었습니다.");
	}

	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("검색할 학생을 입력해주세요.");
		String sStd = scan.next();
		int index = -1;  // 찾은 단어의 배열주소 입력
		// 전체 탐색
		for(int i=0; i<std.size(); i++) {
			if(std.get(i).getStdName().equals(sStd)) {
				System.out.println();
				System.out.println("---------검색결과----------");
				System.out.println(std.get(i).toString());
				System.out.println("-------------------------");
				index = i;
			} 
		} 
		if(index==-1) {
			System.out.println("검색결과가 없습니다.");
		}
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		System.out.println("수강신청할 학생 이름을 입력해주세요.");
		String stdName = scan.next();
		for(int i=0; i<std.size(); i++) {
			if(std.get(i).getStdName().equals(stdName)) {
				System.out.println("수강할 과목을 입력해주세요.");
				String subName = scan.next();
				sj.add(new Subject1(subName));
				System.out.println("수강신청 되었습니다.");
				return;
			}
		} System.out.println("해당 학생이 없습니다.");
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		System.out.println("수강철회할 학생 이름을 입력해주세요.");
		String dName = scan.next();
		for(int i=0; i<std.size(); i++) {
			if(std.get(i).getStdName().equals(dName)) {
				System.out.println("삭제할 과목을 입력해주세요.");
				String dSub = scan.next();
				for(int j=0; j<sj.size(); j++) {
					if(sj.get(j).getSubName().equals(dSub)) {
						sj.remove(j);
						System.out.println("삭제되었습니다.");
						return;
				
					}
				} System.out.println("해당 과목이 없습니다.");
				return;
		
			}
		} System.out.println("해당 학생이 없습니다.");
		
	}
	
	

}
