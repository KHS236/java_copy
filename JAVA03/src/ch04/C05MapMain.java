package CH04;

import java.util.HashMap;
import java.util.Map;

public class C05MapMain {

	public static void main(String[] args) {

		Map<String , Integer> map = new HashMap();
		
		//추가
		map.put("aaa",1111);
		map.put("bbb",2222);
		map.put("ccc",3333);
		map.put("ddd",4444);	//older 가 삭제
		map.put("ddd",5555);	//newer 가 적용
		
		//확인
		System.out.println("Size : " + map.size());
		for(String key : map.keySet()) { // ["aaa","bbb","ccc","ddd"]
			System.out.println("KEY : " + key + " VALUE : " + +map.get(key));
		}
		
		/*
		 map
		 key : value 형태로 들어간다
		 key는 유일한 값으로 줘야한다
		 중복된 값이 있을 땐 newer값 적용
		 */
		
		//삭제
		map.remove("aaa");
		
		//확인
		System.out.println("Size : " + map.size());
		System.out.println("단건 : " + map.get("bbb"));
			
	
		
		
		
		
	}

}
