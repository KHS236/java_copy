package CH02;

import java.nio.charset.StandardCharsets;

public class C04변수_자료형 {

	public static void main(String[] args) {
		//--------------------------
		//정수 int - 4byte 정수 부호 O
		//--------------------------
//		
//		int n1 = 0b10101101;
//		int n2 = 173;		//10진 정수값
//		int n3 = 0255;		//8진진수
//		int n4 = 0xad;		// 16진수
//		System.out.printf("%d %d %d %d\n",n1, n2, n3, n4);
		
//		=============================================================
		
		
		//--------------------------
		//정수 byte - 1byte 정수 부호 O
		//--------------------------
		
//		byte n5 = (byte)-129;
//		byte n6 = -30;
//		byte n7 = 30;
//		byte n8 = 127;
//		byte n9 = (byte)129;
//		
//		System.out.println("n5 : " + n5);
//=========================================================================		
		
		//--------------------------
		//정수 short - 2byte - char - char - 2byte정수 부호X (양수만)
		//--------------------------
//		char n1 = 65535;		//(0~2^16-1) (0~65535)
//		short n2 = 32767;		//(-2^15 ~ +2^15-1) (-32768 ~ + 32767)
//		
//		char n3 = 60000;
//		short n4 = (short)n3;		//에러발생
//		
//		System.out.printf("%d\n",n4);
//-----------------------------------------------------------------------------		
		
		
		//--------------------------
		//정수 long-8byte 정수 부호O
		//--------------------------
//		long n1 = 10000000000l;
//		long n2 = 20;				// L,l(리터럴접미사) : long 자료형 사용하여 값
//		
//		long n3 = 10000000000l;		//에러발생
//		long n4 = 10000000000l;
//		
		
//		===============================================================
		
		//---------------------------
		//실수
		//----------------------------
//		유리수와 무리수의 통칭
//		소숫점 이하값을 가지는 수 123.456
//		float : 4byte 실수 (6~9자리)
//		double : 8byte 실수 (15-18자리),기본 자료형
		
//		정밀도 확인
//		float n1 = 0.123456789123456789F; //f,F : float형 접미사
//		double n2 = 0.12346789123456789;
//		
//		System.out.println(n1);
//		System.out.println(n2);
//		
////		오차범위 확인
//		float num = 0.1F;
//		for(int i=0; i<=1E5; i++) {
//			num=num+0.1F;
//			System.out.println(i);
//		}
//		System.out.println("num : " + num);
//		=================================================================
		
		
		//------------------------------
		//단일문자 char 2byte 정수
		//-------------------------------
		
//		char ch1 = 'a';
//		System.out.println(ch1);
//		System.out.println((int)ch1);
//		System.out.println(Integer.toBinaryString(ch1));
//		System.out.println("==================================");
//		
//		char ch2 = 98;
//		System.out.println(ch2);
//		System.out.println((int)ch2);
//		System.out.println(Integer.toBinaryString(ch2));		
//		System.out.println("==================================");
//		
//		char ch3 = 'b' + 1;
//		System.out.println(ch3);
//		System.out.println((int)ch3);
//		System.out.println(Integer.toBinaryString(ch3));
//		System.out.println("==================================");
//		
//		char ch4= 0xac02;
//		System.out.println(ch4);
//		System.out.println((int)ch4);
//		System.out.println(Integer.toBinaryString(ch4));
//		System.out.println("==================================");
//		
////		 \\u 유니코드 : 이스케이프 문자
//		System.out.printf("%c\n" , 0xac03);
//		System.out.printf("%c\n" , '\uac03');
//		
		
//		------------------------------
//		boolean flag = 논리형(true/false 저장)		//참 (긍정)
//		-------------------------------
		boolean flag = (10>11);
		if(flag)
		{
			System.out.println("참인경우 실행");
		}
		else
		{
			System.out.println("거짓인경우 실행");
		}
		
		
//		==============================================
		
//		------------------------------------
		// 문자열 : String ( 클래스 자료형 )
//		--------------------------------------
//		기본 자료형 (원시타입)
//		byte n1;
		
//		클래스 자료형
//		클래스 자료형으로 만든 변수는 '참조변수' 라고 하고
//		참조변수는 데이터가 저장된 위치정보 (메모리주소값)이 저장된다.
		int n1 = 10;
		byte n2 = 20;
		char n3 = 40;
		
		String name = "홍길동";
		String job = "프로게이머";
		System.out.println(name);
		System.out.println(job);
		
		System.out.println("UTF-8 기준 지정 크기 : " + name.getBytes(StandardCharsets.UTF_8).length);
		System.out.println("UTF-8 기준 지정 크기 : " + job.getBytes(StandardCharsets.UTF_8).length);
		
		
		
		
		
		
		
		
		
	}

}
