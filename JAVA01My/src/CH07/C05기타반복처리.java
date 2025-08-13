package CH07;

import java.util.ArrayList;
import java.util.List;


public class C05기타반복처리 {

	public static void main(String[] args) {


		
		// Collection (자료구조-LIst,Map) 객체를 이용 - 저장
		List<String> lists = new ArrayList<>();
		lists.add("JAVA");
		lists.add("JSP");
		lists.add("SERVLET");
		lists.add("SPRINGBOOT");
		lists.add("NODEJS");
		lists.add("REACT");
		lists.add("DOCKER_COMPOSE");
		
//		반복 : 기본 for
//		for(int i = 0;i<lists.size();i++) {
//			System.out.println(lists.get(i));
//		}
		
//		반복 : 개량 for
//		for(String subject : lists) {
//			System.out.println(subject);
//		}
			
//		반복 : 스트림함수 forEach
//		()=>{}
		lists.stream().forEach((item)->{System.out.println(item);});
		
//		람다식 너무 안 읽혀서 하나하나 풀어서 해석해봄
//		lists.stream().forEach((item) -> { System.out.println(item); });
		
//		1. lists.stream()
//		위에서 만든 리스트 lists를 stream형태로 변환시킴
//		stream형태가 되면 리스트 안에 있떤 요소들이 하나씩 흘러가는 데이터가 된다고 함
		
//		2. stream형태로 바꾸는 이유 / 흘러가는 데이터가 된다는 의미
//		lists를 stream으로 변환하지 않아도 forEach는 사용할 수 있음.
//		하지만 바꾸는 이유는 .filter , .map 등 연속된 데이터 처리 작업을 가능하게 해주기 때문
		
//		흘러가는 데이터가 된다는 건 파이프라인을 따라 하나씩 흘러가면서 처리가 된다는 것
		
//		3. forEach 람다식표현
//		for문처럼 하나씩 요소를 하나씩 순회하며 내부 코드를 실행시키는 함수
//		(item)은 일반적인 함수의 매개변수 이름을 item으로 지은 것
//		->는 들어오는 해당 요소를 오른쪽 중괄호{코드블럭}의 코드를 실행시킴
//		{System.out.println(item);}
//		함수안에 출력문을 넣은 거랑 같은 거고 각 들어오는 item요소를 출력하는 함수인 거임
		
//		실행흐름
//		lists라는 리스트를 stream형태로 변환후 
//		각 요소를 순회하며 forEach의 item이라는 매개변수로 받아오고
//		item은 우측 함수내부실행코드를 통해 각 순회되는 item마다 출력되는 단순한 함수임
		
		
		
		
		

	}

}
