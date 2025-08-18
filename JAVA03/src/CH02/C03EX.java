package CH02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03EX {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("나누기 위한 두 값을 입력하세요 : ");
		try {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();			
			System.out.println("나눗셈 결과 : " + n1/n2); //N/0 시 예외발생
		}catch(InputMismatchException e) {
			System.out.println("정수만 입력해 주세요");
		}catch(ArithmeticException e) {
			System.out.println("0은 나눌 수 없습니다.");
		}
		
		System.out.println("실행되어야 할 코드1");
		System.out.println("실행되어야 할 코드2");
		System.out.println("프로그램 종료");
		
	}

}
