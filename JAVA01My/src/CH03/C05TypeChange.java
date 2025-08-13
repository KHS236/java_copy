package CH03;

public class C05TypeChange {

	public static void main(String[] args) {

		
		int num1 = 10, num2 = 4;
	
		double dnum1 = num1 / num2;
		double dnum2 = num1 / num2;
		double dnum3 = num1 / num2;
//		10 / 4 일 때 나눠지는 수가 int형이면 나눠지는 값이 int형으로 반환
//		나머지 연산자 몫 연산자 따로 있던거 기억 하재 ?

//		해결방법
//		더블로 형변환 해서 나누기
//		double dnum4 = (double)num1 / num2;
//		# 신기한 건 뒤에 double 붙여줘도 컴퓨터가 알아서 num1을 double형으로 맞춰놓고 작업함
//		num1에 곱셈 연산자 사용하기 <- 연산자를 2번 쓰는 거라 뭐 딱히 좋을 건 없음
//		double dnum4 = (num1*1.0) / num2;
		
		
		

		System.out.println("dnum1 : " + dnum1);
		System.out.println("dnum2 : " + dnum3);
		System.out.println("dnum3 : " + dnum2);
		
		
		
		
		
		

	}

}
