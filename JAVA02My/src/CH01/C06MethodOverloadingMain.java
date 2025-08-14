package CH01;

// 메서드 오버로딩
//	같은 이름의 메서드
//	매개변수(파라미터)의 개수 또는 타입만 다르게 하여 여러 메서드를 정의
//	메서드 이름을 재사용해서 코드의 가독성과 유지보수성 향상





class C06Simple {
	// 속성

	
	// 기능
//	함수의 헤더만 건드렸음 (오버로딩 : 자료형,함수명은 같게 파라미터만 다르게 
//							  반환 자료형이 다르면 오버로딩 X)
	public int sum(int n1, int n2) {
		System.out.println("sum1(int n1, int n2)");
		return n1 + n2;
	}
	public int sum(int n1, int n2, int n3) {
		System.out.println("sum2(int n1, int n2, int n3)");
		return n1 + n2 + n3;
	}
	public int sum(int n1, int n2, int n3, int n4) {
		System.out.println("sum3(int n1, int n2, int n3, int n4)");
		return n1 + n2 + n3 + n4;
	}

}
public class C06MethodOverloadingMain {

	public static void main(String[] args) {
		C06Simple obj = new C06Simple();
		obj.sum(10, 20);
		obj.sum(10, 20, 30);
		obj.sum(10, 20, 30, 40);

		
		
		
	}

}

