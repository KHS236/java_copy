package CH05;




class A{
	int a;

	//toString 재정의
	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
}
class B extends A{

	int b;

	//toString 재정의
	@Override
	public String toString() {
		return "B [b=" + b + ", a=" + a + "]";
	}

}
class C extends A{
	int c;

	//toString 재정의
	@Override
	public String toString() {
		return "C [c=" + c + ", a=" + a + "]";
	}

}
class D extends B{
	int d;

	//toString 재정의
	@Override
	public String toString() {
		return "D [d=" + d + ", b=" + b + "]";
	}

}
class E extends B{
	int e;
	
	//toString 재정의
	@Override
	public String toString() {
		return "E [e=" + e + ", b=" + b + "]";
	}

}
class F extends C{
	int f;
	
	//toString 재정의
	@Override
	public String toString() {
		return "F [f=" + f + ", c=" + c + "]";
	}

}
class G extends C{
	int g;
	
	//toString 재정의
	@Override
	public String toString() {
		return "G [g=" + g + ", c=" + c + "]";
	}

}







public class C07UpDownCastingMain {
	
	public static void UpDownCastTestFunc(A obj) { //UpCasting
		
		obj.a=100;
		//a는 자식들이 다 물려받음
//		obj.b=200; //<<안 됨 다운캐스팅 해줘야댐
		
		if(obj instanceof B) { //obj가 연결하는 객체가 B라는 클래스자료형으로 만든 객체인지 확인하기
			B down = (B)obj;
			down.b=200;			
		}
		if(obj instanceof C) { //그게 아니라 C라고하는 클래스 자료형으로 만들어졌는지?
			C down = (C)obj;
			down.c = 300;
		}
		if(obj instanceof D) {
			D down = (D)obj;
			down.d = 400;
		}
		if(obj instanceof E) {
			E down = (E)obj;
			down.e = 500;
		}
		
		System.out.println(obj);
		
		
	}
	
	public static void main(String[] args) {

		UpDownCastTestFunc(new A());// A [a=100]
		UpDownCastTestFunc(new B());// B [b=200, a=100]
		UpDownCastTestFunc(new C());// C [c=300, a=100]
		UpDownCastTestFunc(new D());// D [d=400, b=200]
		UpDownCastTestFunc(new E());// E [e=500, b=200]
		
		
		
		
		
		
		

	}

}
