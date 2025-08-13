package CH03;

public class C04TypeChange {

	public static void main(String[] args) {

		//정수 연산식 자동형변환 (int보다 작은 변수 자료형간의 산술연산시)
//		ex ) byte , short , char
		byte x = 10 ;
		byte y = 20 ;
		byte result1 = (byte) (x+y); //?
//		or
		int result2 = x+y;
//		+연산시 int형이 돼버리니까 그냥 바로 int 자료형 변수에 담으면 된다. 
		
		
//		-------------------------------------------------------
		
//		정수 연산식 자동형변환(int보다 큰 변수 자료형간의 산술연산시
//		-> 큰 자료형(long)으로 자동형변환)
		
//		byte var1 = 10;
//		int var2 = 100;
//		long var3 = 1000l;
//		int result3 = (int) (var1 + var2 + var3);
//		컴파일 메세지 cannot convert 롱에서 인트로
//		or
//		long result4 = var1+var2+var3;
//		long에서 인트로 안 들어가지니까 long자료형 변수에 담으면 된다
		
//		==============================================================
		
		
//		실수 연산식
//		큰 타입으로 자동 형 변환
		int intvar = 10;
		float flvar = 3.3f;
		double dbvar = 5.5;
		int result3 = (int)(intvar + flvar + dbvar);
		//int var , flvar가 각각 double형으로 형변환 된 값이 더해져서
		double result4 = intvar + flvar + dbvar;
		System.out.println(result3);
		
		
		
		

	}

}
