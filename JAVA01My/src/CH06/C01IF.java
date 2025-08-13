package CH06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {

		
		
//		=================================
//       단순 IF		
//		라인이 하나면 중괄호 생략 가능
//		=================================
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이 : ");
//		int age = sc.nextInt();
//		if(age >= 8)
//			System.out.println("학교에 다닙니다.");
//		else
//			System.out.println("학교에 다니지 않습니다.");
//		System.out.println("프로그램을 종료합니다");

		
		
//		================================
//		문제 1
//		================================
		/*
		 정수 한 개 값을 입력받아 3의 배수이면 해당 수를 출력
		 3의 배수이면서 5의 배수라면 출력
		 순서도 그리기
		 -----------------------------------
		 
		 문제2
		 두 개의 정수를 입력받아 큰 수 출력
		 
		 ======================================
		 
		 문제3
		 세 개의 정수 입력받아 큰 수 출력
		 * */
		
//		======================================================================
//		문제 1 
		
		
//		System.out.println("정수 입력 : ");
//		int num1 = sc.nextInt();
//		if(num1 %3 == 0 && num1%5 == 0)
//			System.out.println("3의 배수이면서 5의배수");
//		if(num1 %3 == 0)
//			System.out.println("3의 배수");
//		else
//			System.out.println("해당없음");
		

		
//		===================================================
//		문제2
		
//		System.out.println("정수 두개 입력(공백으로 구분) : ");
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		if(num2>num3)
//			System.out.println(num2);
//		if(num2<num3)
//			System.out.println(num3);
//		else
//			System.out.println("해당없음");

		
		
//		==========================================================
//		문제3
		
//		System.out.println("정수 3개 입력(공백으로 구분) : ");
//		int num4 = sc.nextInt();
//		int num5 = sc.nextInt();
//		int num6 = sc.nextInt();
//		
//		if(num4>num5 && num4 > num6)
//			System.out.println(num4);
//		
//		else if(num5>num4 && num5 > num6)
//			System.out.println(num5);
//		
//		else
//			System.out.println(num6);


		//		else if 쓰면 안 되나요 ?
		
		
//		============================================================
//		문제4
		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
		
//		System.out.println("정수 3개 입력 (공백 구분) : ");
//		int num7 = sc.nextInt();
//		int num8 = sc.nextInt();
//		int num9 = sc.nextInt();
//		
//		int total = num7 + num8 + num9;
//		int avg = num7 + num8 + num9 / 3;
//		
//		System.out.printf("합 : %d , 평 : %d",total,avg);

		
//		이건 if문 아닌데 왜 있찌

		
		//		=============================================================
//		문제5
//		입력한 수가 짝수이고, 3의 배수라면 출력 (n%2==0 && n%3==0)
//		입력한 수가 홀수이고, 5의 배수라면 출력 (n%2==1 && n%5==0)
		
//		System.out.println("정수 입력 : ");
//		int num10 = sc.nextInt();
//		
//		if (num10%2==0 && num10%3==0)
//			System.out.println("짝수이면서 3의배수");
//		
//		if (num10%2==1 && num10%5==0)
//			System.out.println("홀수이면서 5의배수");
//		sc.close();
		
//		else if를 안 쓰고 풀려니까 문제들이 다 애매하네요
		
		
		
		//-----------------------
		//IF - ELSE IF - ELSE
		//-----------------------
		//과목1,2,3,4 중 하나라도 40점 미만이면 불합격
		//과목평균이 100점만점 기준으로 60점 미만이면 불합격
		//아니면 합격
		
//		Scanner sc = new Scanner(System.in);
//		int 과목1 = sc.nextInt();
//		int 과목2 = sc.nextInt();
//		int 과목3 = sc.nextInt();
//		int 과목4 = sc.nextInt();
//		double 평균 = (double)(과목1 + 과목2 + 과목3 + 과목4)/4;
//		
//		if(과목1<40) {
//			System.out.println("불합격");
//		}
//		else if (과목2<40)
//			System.out.println("불합격");
//		else if (과목3<40)
//			System.out.println("불합격");
//		else if (과목4<40)
//			System.out.println("불합격");
//		else if (평균<60)
//			System.out.println("불합격");
//		else
//			System.out.println("합격");
		
//		=================================================================
		//문제
		
		//시험 점수를 입력받아 
		//90 ~ 100점은 A, 
		//80 ~ 89점은 B, 
		//70 ~ 79점은 C, 
		//60 ~ 69점은 D, 
		//나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("시험 점수 입력 : ");
//		int score = sc.nextInt();
//		
//		if (score >100 || score < 0)
//			System.out.println("잘못된 점수입니다");
//		else if (score >=90)
//			System.out.println("A");
//		else if (score >=80)
//			System.out.println("B");
//		else if (score >=70)
//			System.out.println("C");
//		else if (score >=60)
//			System.out.println("D");
//		else
//			System.out.println("F");
//		
//		sc.close();
		
//		===========================================
		
		//문제
			
		//나이별로 요금을 부과하는 else if문을 만드세요
		//8세 미만  : 요금은 1000원
		//14세미만 : 요금은 2000원
		//20세미만 : 요금은 2500원
		//20세이상 : 요금은 3000원
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력 : ");
		int age = sc.nextInt();
		
		if (age < 0)
			System.out.println("잘못된 입력");
		else if(age>=20)
			System.out.println("20세이상 3000원");
		else if(age>=14)
			System.out.println("20세미만 2500원");
		else if(age>=8)
			System.out.println("14세미만 2000원");
		else
			System.out.println("8세미만 1000원");
		
		
		
		
		
		

	}

}
