package CH02;

public class C01NullPointerExceptionMain {

	public static void main(String[] args) {

		
		try {
			String str = null;
			System.out.println(str.toString());			
		}
		catch(NullPointerException e){ //Null객체가 만들어 졌을 때 e로 받아서 처리하겠따 라는 뜻
//			System.out.println("예외발생 : " + e);//에러 발생시 런타임 오류를 출력하고 다음 코드 실행
//			System.out.println(e.getCause()); //어떤 예외발생인지 ? NullPointerException이라서 null출력
//			System.out.println(e.getStackTrace());
			e.printStackTrace(); //예외발생시 런타임오류 띄우고 일단 무시하고 다음 코드 실행
		} //밑에 내용이 정상적으로 실행된다.
		System.out.println("실행되어야 할 코드1");
		System.out.println("실행되어야 할 코드2");

	}

}








/*
 Error(오류) : 참 값(개발자가 의도한 값)과의 거리
 Validation : 유효함
 컴파일오류(Systex에러)문법오류 / Runtime(실행오류):치명적임 / 버그
 
 Exception(예외)
  실행오류를 방지하는 것
  
 Bug(버그)
 */









