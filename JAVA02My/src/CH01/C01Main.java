package CH01;

public class C01Main {

	public static void main(String[] args) {

//		객체
		C01Person hong = new C01Person();
		hong.name="홍길동";
		hong.age=15;
		hong.height=177.5f;
		hong.weight=70.5;
		
		System.out.printf(
				"%s %d %f %f\n",hong.name,hong.age,hong.height,hong.weight
				);
//		Person클래스에서 hong이라는 객체를 찍을 거고
//		각 속성에는 hong만의 고유한 속성을 부여
//		hong.name을 하면 hong객체 안에있는 이름 속성을 가져옴,age는 나이.. 등등
		
		
		
		
		

	}

}
