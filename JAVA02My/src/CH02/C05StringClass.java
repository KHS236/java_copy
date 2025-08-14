package CH02;

public class C05StringClass {

	public static void main(String[] args) {

		
		String str1 = "Java Powerful";
		String str2 = new String("java Programming");
		String str3 = str1 + str2;
		String str4 = str1.concat(str2);
		
		System.out.println("문자열 길이 : " + str1.length());
//		문자열의 총 길이 반환
		System.out.println("한문자 찾기 : " + str1.charAt(2));
//		문자열에서 하나의 문자를 반환
		System.out.println("인덱스 찾기 : " + str1.indexOf('a'));
//		문자열에서 찾고싶은 문자의 인덱스 반환
		System.out.println("인덱스 찾기 : " + str1.lastIndexOf('a'));
//		문자열에서 찾고싶은 문자의 마지막 인덱스 반환
		System.out.println("문자열포함 여부 : " + str1.contains("va"));
//		문자열에 찾고싶은 문자가 포함돼 있는지 ? 반환
		System.out.println("문자열포함 여부 : " + str1.contains("abs"));
		
		System.out.println("문자열 자르기 : " + (str1.substring(2,6)));
//		문자열에서 원하는 범위길이로 자르기
		String str6 = "등산,탁구,축구,골프,독서,영화감상";
		String [] result = str6.split(",");		
//		문자열을 구분기호를 기준으로 잘라서 배열형태로 받아온다
		
//		
//		System.out.printf("%x\n",System.identityHashCode(str1));
//		System.out.printf("%x\n",System.identityHashCode(str2));
//		System.out.printf("%x\n",System.identityHashCode(str3));
//		System.out.printf("%x\n",System.identityHashCode(str4));
		
		
//		int i=0;
//		String str  = "";
//		while(i<10) {
//			str +=i;
//			System.out.print("str : " + str + " ");
//			System.out.printf("위치 : %x\n",System.identityHashCode(str));
//			i++;
//		}
		
		
		//문자열 덧붙이기(메모리 누수 방지 클래스 : StringBuffer , StringBuilder)
		
//		int i=0;
////		String str  = "";
//		StringBuilder str = new StringBuilder("");
//		while(i<10) {
////			str +=i;
//			str.append(i);
//			System.out.print("str : " + str + " ");
//			System.out.printf("위치 : %x\n",System.identityHashCode(str));
//			i++;
//		}
		
		
		
		
		

	}

}
