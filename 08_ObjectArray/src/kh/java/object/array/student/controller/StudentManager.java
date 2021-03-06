package kh.java.object.array.student.controller;

import java.util.Scanner;

import kh.java.object.array.student.model.vo.StudentVO;

public class StudentManager {
	
	private Scanner sc = new Scanner(System.in);
	public static final int MAX_LENGTH = 100;
	//연관관계 (has a 포함관계) StudentManager has a StudentVO
	private StudentVO[] arr = new StudentVO[MAX_LENGTH];
	private int idx = 0;	//사용자 입력값에 따라 처리될 인덱스변수
	
	
	public void inputStudent() {
		
		while(idx < MAX_LENGTH) {
			System.out.println("----- " + (idx + 1) + " -----");
			System.out.println("학번 : ");
			int no = sc.nextInt();
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("전화번호 : ");
			String phone = sc.next();
			//StudentVO객체 생성
			StudentVO stdt = new StudentVO(no, name, phone);
			//배열추가
			//1. 다음에 추가할 요소의 인덱스
			//2. 현재까지 입력한 요소의 개수
			arr[idx++] = stdt;
			
			System.out.println("계속 입력하시겠습니까? (y/n) : ");
			char yn = sc.next().charAt(0);
			
			if(yn == 'n') {
				System.out.println("===== 입력 완료 =====");
				break;
			}
		}
	}
	
	
	public void printStudent() {
		
		//2.idx변수를 이용해서 입력한 개수만큼 접근
		for(int i = 0; i < idx; i++) {
			StudentVO s = arr[i];
			System.out.printf("%15s%15s%15s%n" , s.getNo(), s.getName(), s.getPhone());
			
			
		}
	}
		
		//1.MAX_LENGTH 100개 공간을 모두 접근
//		for(StudentVO s : arr) {
//			
////			System.out.println(s);
//			
//			//null인 경우, 탈출
//			if(s == null)
//				break;
//			
//			//null이 아닌 경우, 출력
//			System.out.printf("%15s%15s%15s%n" , s.getNo(), s.getName(), s.getPhone());
//		}
//	}
		
}
