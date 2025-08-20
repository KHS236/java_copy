package CH06;


//	일반클래스 상속관계
class Parent {

	void func() {
	}

}

class Son extends Parent {
	void func() {
		System.out.println("Son's func() call!");
	}
}

//	추상클래스 상속관계
//	추상클래스 -> 하나 이상의 추상메서드(미완성된 함수,{}가 없는)를 포함하는 클래스
//	의도한 추상클래스와 추상메서드에 abstract를 붙여준다

//	추상클래스를 사용하는 이유
//	1) 메서드 구현의 강제성 부여
abstract class Parent2 {
	abstract void func();

}
class Son2 extends Parent2 {
	void func() {
		System.out.println("Son's func() call!");
	}
}

public class C01AbstractMain {

	public static void main(String[] args) {
		
//		일반 클래스 상속관계
		
		Parent ob1 = new Parent(); //상위클래스형으로 객체 생성 O
		Son ob2 = new Son(); 	   //하위클래스형으로 객체 생성 O
		Parent ob3 = new Son();    //UpCasting 연결 O
		ob3.func();				   //재정의된 func() 접근가능
		
		System.out.println("-----------------------------------------");
//		추상 클래스 상속관계
		
//		Parent2 obj1 = new Praent2(); //추상클래스로 객체 생성 X
		Son2 obj2 = new Son2(); 	  //하위클래스형으로 객체 생성 O
		Parent2 obj3 = new Son2();	  //UpCasting 연결 O
		obj3.func();				  //재정의된 함수 접근 O
		
		

	}

}
