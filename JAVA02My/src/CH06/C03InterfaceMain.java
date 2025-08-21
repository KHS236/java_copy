package CH06;



interface Remocon{ //인터페이스 리모컨 (메인과 Tv,Radio를 연결하기 위한 친구)
	
	int MAX_VOL = 100; //public static final << 기본으로 들어가있음
	int MIN_VOL = 0;	//public static final << 기본으로 들어가있음
	
	
	void PowerOn(); //추상메서드
	
	void PowerOff(); //추상메서드
	
	void setVolume(int vol); // 볼륨설정 만들어줘 하고 만든 추상메서드
	
}


class Tv implements Remocon{//함수를 만들어주면 Radio에 컴파일에러가 사라짐

	private int nowVol; //볼륨 설정하기위한 멤버변수 현재볼륨값
	
	@Override
	public void PowerOn() {
		System.out.println("Tv를 켭니다.");
	}
	@Override
	public void PowerOff() {
		System.out.println("Tv를 끕니다.");
	}
	@Override
	public void setVolume(int vol) {
		if(vol >= MAX_VOL)
			this.nowVol = MAX_VOL;
		else if(vol <= MIN_VOL)
			this.nowVol = MIN_VOL;
		else
			this.nowVol = vol;
		System.out.println("TV현재 볼륨 : " + nowVol);
		
	}
	
}	//implements Remocon : Remocon의 함수를 구현하겠다는 선언

interface Browser{ //인터페이스 만들었음
	void searchURL(String url); //추상메서드
}

class SmartTV extends Tv implements Browser{ //<<extends 뒤에 implements

	@Override
	public void searchURL(String url) {
		System.out.println(url + "로 이동합니다");
		
	}
	
}



class Radio implements Remocon{ //함수를 만들어주면 Radio에 컴파일에러가 사라짐
	private int nowVol;
	
	@Override
	public void PowerOn() {
		System.out.println("라디오를 켭니다.");
	}
	@Override
	public void PowerOff() {
		System.out.println("라디오를 끕니다.");
	}
	@Override
	public void setVolume(int vol) {
		if(vol >= MAX_VOL)
			this.nowVol = MAX_VOL;
		else if(vol <= MIN_VOL)
			this.nowVol = MIN_VOL;
		else
			this.nowVol = vol;
		System.out.println("RADIO현재 볼륨 : " + nowVol);
		
	}

} //implements Remocon : Remocon의 함수를 구현하겠다는 선언





public class C03InterfaceMain {
	
	
	public static void TurnOn(Remocon controller) { // TV/Radio객체
								// Remocon controller = new Tv();
		controller.PowerOn();
	}
	public static void TurnOff(Remocon controller) {
		
		controller.PowerOff();
	}
	
	public static void ChangeVolumn(Remocon controller,int vol) {
		
		controller.setVolume(vol);
	}
	
	public static void Internet(Browser browser , String url) {
		
		browser.searchURL(url);
	}
	
	
	public static void main(String[] args) {
		
		Tv tv = new Tv(); //tv객체
		Radio radio = new Radio(); //radio객체
		SmartTV smartTV = new SmartTV();
		
		TurnOn(smartTV);
		ChangeVolumn(smartTV,10);
		Internet(smartTV,"www.naver.com");
		
		TurnOff(smartTV);
		
//		TurnOn(tv);
//		TurnOn(radio);
//		
//		ChangeVolumn(tv,50);
//		ChangeVolumn(tv,100);
//		ChangeVolumn(tv,-10);
//		ChangeVolumn(radio,70);
//		
//		
//		
//		TurnOff(tv);
//		TurnOff(radio);
		
		
	}

}












/*
 추상클래스는 멤버변수,멤버함수와 추상메서드를 포함할 수 있다
 추상클래스
 abstract class animal{
 	int max; //멤버변수
 	abstract void sound(); //추상 메서드
 	void move(){} //멤버 함수
 
 
 인터페이스는 완성되지 않은 함수(추상메서드)가 기본이다 
 interface aimal{
 	int max; //final static 가 디폴트
 	void sound() //추상 메서드
 	
 	하위클래스에서 implements(구현하다)를 반드시 붙여준다
 	
 	WHY
 	- 1)구현하기위한 설계도 느낌 (설계>구현) 중심
 	- 2)결합도를 낮추는데 사용
 
 
 */













