package CH04;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("입력된 정수 값 : " + num1);

		System.out.print("실수 입력 : ");
		double num2 = sc.nextDouble();
		System.out.println("입력된 실수 값 : " + num2);
		
		System.out.print("문자열 입력 : ");
//		String str1 = sc.next();	//문자열 입력받기기능 함수 , 띄어쓰기는 포함X
		sc.nextLine();
		String str1 = sc.nextLine();
		System.out.println("입력된 문자열 : " + (int)str1.charAt(0));
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
