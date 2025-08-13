package CH03;

public class C07TypeChange_String {

	public static void main(String[] args) {
		//=====================================
		// 문자열 + 문자열 연산시
		//=====================================
		
		System.out.println("문자열1" + "문자열2");        // 문자열 + 문자열
		System.out.println("문자열1" + ',' + "문자열2");  // 문자열 + 문자 + 문자열
		System.out.println("문자열1" + 2);		      // 문자열 + 숫자 ->숫자를
		System.out.println("문자열1" + ','+'!');
		System.out.println(','+'!'+"문자열");
//		얘는 뭔데 77문자열 이라고 출력함?
//		1. 단일문자는 숫자로 생각한다
//		2. 왼쪽부터 오른쪽으로 가니까 ,이랑!는 숫자로 본다(아스키코드표) ,(11(10진)) !(66(10진)
//		3. 앞에 "" 공백만 붙여줘도 문자열로 취급한다
		System.out.println("문자열1" + "문자열2");
		System.out.println();
//		------------------------------------------------------------------
		
//		문자열 -> 숫자형으로 변환 (정수)
//		int n1 = "10";
		
		System.out.println("10"+"20");	//문자열 연결
		int n1 = Integer.parseInt("10");//웹개발코드시 폼으로부터 전달받은 값은 다 문자열이다.
		int n2 = Integer.parseInt("20");
		System.out.println(n1+n2);
		
		//문자열 -> 숫자형으로 변환 (실수)
		
		double n3 = Double.parseDouble("10.5");
		double n4 = Double.parseDouble("20.4");
		System.out.println(n3 + n4);
		
		short n5 = Short.parseShort("5");
		short n6 = Short.parseShort("6");
		System.out.println(n5+n6);
		
		
		
//		Parse = 해석하다
//		Integer.parseInt("10") = 문자열 형태를 숫자로 해석한다 뭐 이런 의미
//		문자열에 갇혀있는 숫자를 정수형으로 바꿔줌
		
		

	}

}
