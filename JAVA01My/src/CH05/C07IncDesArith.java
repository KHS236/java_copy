package CH05;

public class C07IncDesArith {
	public static void main(String[] args) {
		int a=5, b=6, c=10, d;
		boolean e;
		d=++a*b--;
		 System.out.printf("a = %d, b = %d, d = %d\n", a, b, d);
		d=a++ + ++c - b--;
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d);
		a=1;
		b=0;
		e=(a++>0)||((b*d/c)>0);
		System.out.printf("a = %d, b = %d, c = %d, d = %d ,e = %b\n", a, b, c, d , e);
	
//	해석
//		int자료형 a=5 b=6 c=10 d=0
//		e=boolean
//		d 1증감한 a(6) * b(6) == 36 하고 b 1감소(5)
//		출력 a = 6 , b = 5 , d = 36
		
//		d 에 a(6) + 1증감한c(11) - b(5) == 12 하고 a1증감(7) b1감소(4)
//		출력 a = 7 , b = 4 , c = 11 , d = 12
		
//		a = 1 b = 0 e = 왼쪽 true || 오른쪽 연산 안 봄
//		a 1증감(2)
//		출력 a = 2 , b = 0 , c = 11 , d = 12 , e = true
	
	
	
	}
}	
