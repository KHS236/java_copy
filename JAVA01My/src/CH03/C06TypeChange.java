package CH03;

public class C06TypeChange {

	public static void main(String[] args) {

		
		char n1 = 60000;
		short n2 = (short) n1;
//		short n2 = n1;
//		컴파일 메세지 : char에서 short로 못 변환 안 된다
//		n1을 쇼트로 하거나 n2를 char로 받아라
		System.out.println(n2);
		
		int n3 = n2;
		System.out.println(n3);
		
		
		
		
		
		
//		원시타입 > C언어에서 내려온 자료형

	}

}
