package CH05;


//	함수 재정의 (Method Overriding)
//	상속관계를 전제로 상위클래스의 메서드를 하위 클래스가 (고쳐사용)하는 것을 허용한 문법
//	메서드의 헤더부분은 동일하고 두고 본체({})의 로직을 수정하게끔 허용함으로 다양한 형태의 객체가
//	형성될 수 있도록 유도 (다형성)
//	상위클래스로부터 동일한 메서드를 물려받더라도 각 하위클래스마다 다른기능구현의 결과물을
//	만들어 낼 수 있다.

//	==================================================
//	오버로딩 / 오버라이딩 구분
//	나중에 객체지향 SOLID원칙 봐야돼
//	오버로딩 ?
//	함수이름 중복허용, 파라미터는 다양하게 허용하는 것
//	>> 함수 헤더만 수정하는 것
//	>> 상속을 전제하지 X
//	>> 개발자의 편의성에 중점(함수이름 단일화)

//	오버라이딩 ?
//	상속을 전제로 O
//	함수본문변경 (헤더는 고정 함수의 {내부코드}를 수정)
//	다형성을 목적으로 한 문법요소

//	=====================================================


class Animal {
	void Sound() {System.out.println("원시 울음소리...");};
}


class Dog extends Animal {
	void Sound() {System.out.println("왈왈!");};
//	오버로딩은 헤더를 건들임(매개변수 개수를 수정한다던가)
//	오버라이딩은 헤더를 건들이지 않고 함수 내부 코드블럭만 수정하는 차이점을 가짐
}


class Cat extends Animal {
//	영역우클릭 > 소스 > 오버라이드 임플리먼트 메서드
	@Override
	void Sound() {
		System.out.println("냥냥!");
	}
//		수퍼 지우고 출력문만 넣어줌
	
}

//	이론 
//	메서드 영역에 Animal의 Sound()가 저장됨
//	힙 영역에 Animal객체의 Sound가 메서드 영역의 sound()를 참조하는 형태로 사용됨
//	스택 영역의 Animal animal 객체가 Heap영역의 Animal객체의 Sound 주소값을 참조해서 기능을 실행

//	상속받은 Dog
//	재정의를 했다면 메서드 영역에 Dog sound()가 새로 저장됨
//	Heap영역의 Dog객체의 Sound는 메서드 영역의 Dog sound()를 참조
//	스택 영역의 Dog dog 객체는 Heap영역의 Dog객체의 sound 주소값을 참조해서 기능 실행



public class C03MethodOverriding {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.Sound();
//		소리낸다 출력
		
		Dog dog = new Dog();
		dog.Sound();
//		왈왈 출력
		
		Cat cat = new Cat();
		cat.Sound();
//		냥냥 출력
		
		System.out.println("-------------------------------------------");
//		업캐스팅 // 상위클래스형 참조변수 = 하위객체
		animal = dog;
//		animal은 Animal자료형 dog는 Dog자료형 둘이 다르지만 업캐스팅은 문제가 없다고 판단 자동형변환으로 일치시킴
		animal.Sound();
//		왈왈!
//		이유 : animal 객체가 heap영역의 dog의 sound 주소값을 참조 > 메서드 영역의 dog Sound();기능 사용
//		상위클래스 객체가 하위클래스 기능을 참조할 때 재정의한 함수에 접근
		animal = cat;
		animal.Sound();
//		냥냥!
//		이유 : animal 객체가 heap영역의 cat의 sound 주소값을 참조 > 메서드 영역의 cat Sound();기능 사용
		
//		중요한 점
//		Animal 클래스의 기능을 지우면 하위클래스에서 추가한 기능에는 접근이 불가
		
		
		
	}

}
