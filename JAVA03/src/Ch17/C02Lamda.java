package Ch17;

import java.util.Scanner;

interface Printer{
	
//	void print(String name);	//추상메서드
//	String print(String message); //반환 자료형 주기
	String print();
	
	
}




public class C02Lamda {

	public static void main(String[] args) {
		
		//01 인터페이스에 추상메서드가 하나만 들어가 있다는 조건 하에 람다식 연결 가능
//		Printer printer = (message)->{System.out.println("01."+message);};
//		printer.print("안녕!");
		
		//02
//		Printer printer2 = (message)->{return "02."+message;};
//		인자1개일때 소괄호 생략 리턴 하나면 대괄호,리턴 생략
//		Printer printer2 = message->"02."+message;
//		String str = printer2.print("HELLO WORLD");
//		System.out.println(str);
		
		//03 반환자료형이 있는 함수는 return 필요
		Printer printer3 = ()->{
//			Scanner 생성
			Scanner sc = new Scanner(System.in);
//			키보드로 문자열 입력받기
			String message = sc.nextLine();
//			입력된값 리턴
			return "03."+message;
		};
		System.out.println(printer3.print());
		
		

	}

}
