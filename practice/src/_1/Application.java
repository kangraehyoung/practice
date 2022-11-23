package _1;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	/*
	 * 문제 소개
	 * 학새 정보를 저장하고, 학생 이름으로 검색했을때 학번을 출력하는 프로그램 작성
	 * 학생들을 ArrayList에 저장하고 계속 검색 y => 반복
	 * 종료 n => 프로그램 종료
	 */

	public static void main(String[] args) {
		Student student1 = new Student("학생1", "1111");
		Student student2 = new Student("학생2", "2222");
		Student student3 = new Student("학생3", "3333");
		Student student4 = new Student("학생4", "4444");
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		
		for (Student student : list) {
			System.out.println(student.getName());
			System.out.println(student.getNo());
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("검색을 하시려면 y, 아니라면 n");
		
		
		
		while(true) {
			String input = scanner.next();
			if (input.equals("y")) {
				System.out.println("이름을 입력해주세요");
				
				String name = scanner.next();
				boolean flag = false;
				
				for (Student student : list) {
					if (student.getName().equals(name)) {
						System.out.println("해당 학생의 학번은");
						System.out.println(student.getNo());
						flag = true;
					} 
				}
				
				if (!flag) {
					System.out.println("해당하는 학생 이름이 없다.");
				}

				
				
			}else if(input.equals("n")) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		scanner.close();
		
		
		
	}

}













