package CH02;

public class C04StringClass {

	public static void main(String[] args) {

		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
//		일반 지역변수는 상수Pool에 데이터 저장
//		객체로 만들어지면(new 예약어가 사용되면) heap영역에 데이터 저장
//		저장된 데이터들의 주소값을 stack에 저장해서
//		출력할 때 해당 주소값의 데이터를 찾아서 보여줌
		System.out.println("---------------------");
		System.out.println("str1==str2 ? " + (str1==str2));
		System.out.println("str3==str4 ? " + (str3==str4));
		System.out.println("str1==str3 ? " + (str1==str3));
		System.out.println("str2==str4 ? " + (str2==str4));
		System.out.println("---------------------");
		
		//equals
		System.out.println("str1==str2 ? " + (str1.equals(str2)));
		System.out.println("str3==str4 ? " + (str3.equals(str4)));
		System.out.println("str1==str3 ? " + (str1.equals(str3)));
		System.out.println("str2==str4 ? " + (str2.equals(str4)));
		
	}

}
/*
 str1==str2 ? + str1==str2 java true지
 str3==str4 > + str3==str4 얘내 메모리 저장 주소값이 달라서 false인 건 알 거 같은데
 
 
 */

