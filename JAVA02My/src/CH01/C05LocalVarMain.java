package CH01;

// 변수 종류

// 멤버 변수		: 클래스 내부 - 메서드 영역 외부 사이에서 생성 (즉 아래 속성영역 num)
//				  객체 개별데이터를 저장하는 용도
// 지역 변수		: 메서드 영역 내부에서 생성되는 변수
//			(or 메서드 영역 내부에서 {}가 명시되어 있을 때 해당{} 내에서 생성된 변수도 포함)
//			ex) 파라미터 변수 , 일반 변수 ..

// static 변수	: 동일 클래스로부터 생성된 여러 객체간 공유하는 멤버변수


class C05Simple
{
//	속성 (해당클래스의 멤버 num : 멤버변수 해당클래스 내에서 모든 함수가 사용 가능한 일종의 전역변수와 유사)
	int num = 10;
	
	
//	기능 (함수 안의 변수 : 지역변수)
	void Func1() {
		System.out.println("num : " + num);		
		int num=20; //Func1의 지역 변수
		num++;
		this.num++; //멤버변수 num에 접근하는 예약어 this.
		System.out.println("num : " + num); //지역변수 num을 불러옴
	}
//	-----------------------------------------------------------------
//	함수 안에서 {}가 명시됐을 때 그 안에서만 사용되는 지역변수
	void Func2() {
		System.out.println("num : " + num);
		if(num>0) //멤버변수 num
		{
			int num = 100;	//if문 내의 지역변수 num
			System.out.println("num : " + num);
		}
		System.out.println("num : " + num); //if문 내부의 지역변수라서 if 밖에서는 다시 멤버num 호출
		
		
		while(num<15) {
			int num = 100; //while 안의 num을 새로 선언
			System.out.println("num : " + num);
			num++;
		}
	}
//	----------------------------------------------------------------
	void func3(int num) { //멤버 num에 파라미터를 넣는 것
		this.num = num;
		
	}
	
}

//--------------------------------------------------------------------

public class C05LocalVarMain {

	public static void main(String[] args) {
		//지역변수 / 전역변수
		
		C05Simple obj = new C05Simple();
		obj.Func1();
		System.out.println("-------------------------------");
		obj.Func2();
		
		

	}

}
