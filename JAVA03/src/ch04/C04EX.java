package CH04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
//--------------------------------
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class C04EX {

	public static void main(String[] args) {
		//1) 1~45까지 숫자를 6개를 랜덤으로 받아 (Random클래스 이용) set에 저장 / 출력
		
		Random random = new Random();
		Set<Integer> Set = new HashSet();
		
		while(Set.size()<6) {
			Set.add(random.nextInt(45)+1);
		}
		System.out.println("Set 길이 확인 : " + Set.size());
		System.out.println("6개 숫자 확인 : " + Set);
		System.out.println("-----------------------");
		
		//2) [추가]저장된 Set의 오름차순정렬 (스트림함수 사용 검색활용)

		List<Integer> List = Set.stream()
				.sorted()
				.collect(Collectors.toList());

//		List<Integer> List = new ArrayList();
		
//		for(Integer el : Set) {
//			List.add(el);
//		}
//		Collections.sort(List);
		

		System.out.println("Set 오름차순 정렬 : " + List);

		
	}

}
