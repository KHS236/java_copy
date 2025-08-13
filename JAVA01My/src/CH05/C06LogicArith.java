package CH05;

public class C06LogicArith {
	public static void main(String[] args) {
		int a=0,b=0;
		boolean c;
		a = 1;
		b = 1;
		c =(++a>0)||(++b>0) ;
		System.out.printf("a = %d , b = %d , c = %s\n", a, b, c);
		//인트자료형 a b 각 0 불리언 자료형 c
		//a1 b1 c a2로만들고 true || or연산자라 왼쪽 true면 오른쪽 연산 x
		//출력 "a = 2 , b = 1 , c = true

		a = 1;
		b = 1;
		c = (++a>0)||(--b>0) ;
		System.out.printf("a = %d , b = %d c = %s\n", a, b, c);
//		a는 1 b도 1 c는 a를 2로만들고 true || 오른쪽 연산 x
//		a= 2 b= 1 c = true

		a = 1;
		b = 1;
		c = (--a>0)||(++b>0) ;
		System.out.printf("a = %d , b = %d c = %s\n", a, b, c);
//		a = 1 b = 1 c = a에서 1빼면 0 false 순서대로 가니까 연산은 하고
//		오른쪽 연산 b를2로 만들고 true
//		a=0 b=2 true 반환
		
		
		
		a = 1;
		b = 1;
		c = (--a>0)||(b-->0) ;
		System.out.printf("a = %d , b = %d c = %s\n", a, b, c);
//		a = 1 b = 1 c = a를 0으로 만들고 false 순서대로 왼쪽 연산 하고
//		오른쪽 연산 b=1인상태에서 true 반환하고 0으로 만듦
//		a = 0 b = 0 이지만 c = true
		
		
		
	}
}	
