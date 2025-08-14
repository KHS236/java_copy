package CH01;

class C03Person {

//		속성
	public String name;
	public int age;
	public float height;
	public double weight;

//		기능	
//	void == 반환값x (return이 없음)
	void talk() {System.out.printf("%s 님이 말합니다.\n",this.name);}
	void walk() {System.out.printf("%s 님이 걷습니다.\n",this.name);}
	void showInfo() {
		System.out.printf("%s %d %f %f\n",this.name,this.age,this.height,this.weight);
	}
	
	//toString 객체의 속성값을 문자열로 반환하기
	@Override
	public String toString() {
		return "C03Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}

	
	
}

public class C03PersonMain {

	public static void main(String[] args) {
		
//		속성 저장
		C03Person hong = new C03Person();
		hong.name="홍길동";
		hong.age=15;
		hong.height=177.5f;
		hong.weight=70.5;
		
//		기능 사용
		hong.talk();
		hong.walk();
		hong.showInfo();
		
//		System.out.println(hong.toString());
		System.out.println(hong);
		
		
//		System.out.printf(
//				"%s %d %f %f\n",hong.name,hong.age,hong.height,hong.weight
//				);
		
		
		
		
	}

}

/*
 자바에서의 함수
 반환자료형 함수명(파라미터)  <- 함수의 헤더 (함수명 이름 잘 짓기)
 {
 함수의 본체 (처리 로직)
 }
 
 */







