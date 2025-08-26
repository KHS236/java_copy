package CH04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C03SetMain {

	public static void main(String[] args) {
		
		Set<String> Set = new HashSet();
		
		//추가
		Set.add("HTML/CSS/JS");
		Set.add("NODEJS");
		Set.add("SCSS");
		Set.add("REACT");
		Set.add("JAVA");	//older
		Set.add("JAVA");	//newer(적용)
		Set.add("JSP/SERVLET");
		Set.add("STS");
		Set.add("SPRING BOOT");	//older
		Set.add("SPRING BOOT");	//newer(적용)
		//삭제
		Set.remove("REACT");
		
		//확인
		System.out.println("개수 확인 : " + Set.size());
		//중복된 데이터중 나중에 들어온(새로운)데이터가 적용
		
		//탐색(고전방식)
//		Iterator<String> iter = Set.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		//탐색(최근방식)
		for(String el : Set) {
			System.out.println(el);
		}
		
		Set.clear();
		
		
		
	}

}
