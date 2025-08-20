package CH05;


class Parent{
	
	void func1() {System.out.println("Parent's func1() call");}
	void func2() {System.out.println("Parent's func2() call");}
	
}

class Son extends Parent{
	void func2() {System.out.println("Son's func2() call!");}
//	Parent에서 func2를 만들어주면 확장(추가함수)가 아닌 함수 재정의상태
}



public class C08UpDownCastingMain {

	public static void main(String[] args) {

		//NoCasting
		//당연히 지가 만든 func1은 접근 됨
		Parent ob1 = new Parent();
		ob1.func1();
		
		System.out.println("-----------------------------");
		//NoCasting
//		당연히 상속받은 func1이랑 지가 만든 func2 접근 됨
		Son ob2 = new Son();
		ob2.func1();
		ob2.func2();
		
		
		System.out.println("-----------------------------");
//		----------------------------------------------------------------
//		UpCasting
		Parent ob3 = new Son(); //자료형이 Parent니까 func1밖에 접근이 안 됨
		ob3.func1();
		ob3.func2(); // << 왜 되냐? Parent에서 func2를 만들어주고 Son에서 '재정의'한 상태라면 접근가능
		
		//Upcasting된 상태에서
		//확장된 (멤버추가) 멤버변수 접근 가능한가?? X (DownCasting 해줘야 '접근'가능 
		//확장된(멤버추가) 멤버함수 접근 가능한가?? X (DownCasting 해줘야 '접근'가능
		//재정의된 멤버변수 접근 가능한가?? O 
//		  -> (새로 확장(추가)함수가 아니고 상위클래스에서 만들었던 함수를 재정의한 경우 '접근 가능')
	}

}
