package Step_1;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 A를 입력하세요 : ");
		double A = sc.nextInt();
		
		System.out.print("정수 B를 입력하세요 : ");
		double B = sc.nextInt();
		
		System.out.println(A / B);
	}
}
