package CH01;

class C02Simple{
	int n;
	C02Simple (int n){
		this.n = n;
	}
	
	
	@Override
	public boolean equals(Object obj) { //파라미터 Object obj는 C02Simple이 아니라도 다 받아낼 수 있음(업캐스팅)
		if(obj instanceof C02Simple) { //해당 파라미터로 들어온게 C02Simple로 만든 객체인지 걸러냄
			C02Simple down = (C02Simple)obj; //C02Simple 객체가 맞다면 강제형변환 (다운캐스팅)
			return this.n == down.n;
	        // this는 "현재 equals를 호출한 객체" (즉 밑에서 호출한 ob1)
	        // obj를 down으로 캐스팅한 건 "비교 대상 객체" (즉 파라미터로 들어온 ob2,ob3)
	        // 따라서 "this.n과 down.n을 비교한 결과를 반환"이 더 정확
		}
		return false; //C02Simple로 만든 객체가 아니라면 바로 false
	}
}


public class C02ObjectMain {

	public static void main(String[] args) {
		/*
		 equals(Object obj)
		 -> 두 객체가 논리적으로 같은지 비교
		 	기본 구현은 == 과 동일(주소 비교) , 보통 오버라이딩해서 값 비교용으로 사용
		 	
		 	기본적으로 메모리 주소값을 비교하기 때문에 파라미터가 같아도 false가 나온다 > 재정의 해야함
		 */
		

		C02Simple ob1 = new C02Simple(10);
		C02Simple ob2 = new C02Simple(10);
		C02Simple ob3 = new C02Simple(20);
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		
		

	}

}
