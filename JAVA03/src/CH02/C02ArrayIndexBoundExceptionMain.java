package CH02;

public class C02ArrayIndexBoundExceptionMain {

	public static void main(String[] args) {

		
		int [] arr = {10,20,30};
		
		
		try {
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			//없는 인덱스 출력하니까 발생한 예외
			System.out.println("유효하지않은 인덱스");
		}finally { //예외가 발생하던말던 무관하게 무조건 실행돼야 할 코드 3번인덱스를 출력 안 해도 실행이 됨
			System.out.println("예외발생과 무관하게 무조건 실행되는 코드");
		} //자원(JDBC,SOCKET,STREAM,SCANNER...)을 제거하는데 사용
			//생성했던 여러 객체들을 제거할 때 라고하네요,,
		
		System.out.println("실행되어야할 코드1");
		System.out.println("실행되어야할 코드2");
		
		

	}

}
