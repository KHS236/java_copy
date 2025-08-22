package CH02;

import java.awt.AWTException;

class A{
	public void Ex1() throws NullPointerException{//Nullpo어쩌구 발생하면 호출한 곳으로 던지기(거기서 처리)
		System.out.println("A's Ex1 Func Call!");
		String a = null;
//		a.toString();  //예외발생시 다음 코드로 안 넘어감
		System.out.println("Ex1에서 실행되어야 할 코드");
	}
}


class B{
	public void Ex2() throws AWTException { //AWT어쩌구 발생하면 호출한 곳으로 던지기 (class A랑 예외 같이 처리)
		System.out.println("B's Ex2 Func Call!");
		throw new AWTException("AWT 예외발생");
	}
}



public class C06ThrowAndThrowsMain {

	public static void main(String[] args) {
		
		A ob1 = new A();
		B ob2 = new B();
		
		try {
			ob1.Ex1();  //여기서 코드 다 실행하면서 예외 없었으면 이 다음 ob2.Ex2()실행
			ob2.Ex2();			
		}
		catch(NullPointerException e) {
			System.out.println("NullPointer 예외처리완료");
		}
		catch(AWTException e1) {
			System.out.println("AWT 예외처리");
		}
	
		
		
		
		
		
		
		
		
		
	}

}
