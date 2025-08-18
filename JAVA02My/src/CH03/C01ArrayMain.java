package CH03;

import java.util.Arrays;
import java.util.Scanner;

public class C01ArrayMain {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int [] arr1 = new int[5];
		System.out.println("배열길이 : " + arr1.length);
		System.out.println("5개의 값을 입력하세요 : ");
		arr1[0] = sc.nextInt();
		arr1[1] = sc.nextInt();
		arr1[2] = sc.nextInt();
		arr1[3] = sc.nextInt();
		arr1[4] = sc.nextInt();

		
//		for (int i = 0; i<arr1.length;i++) {
//			System.out.println(i+"."+arr1[i]);
//		}
//		System.out.println("-------------------");
//		
//		for(int el : arr1) {
//			System.out.println(el);
//		}
//		System.out.println("-------------------");
//		
//		
//		Arrays.stream(arr1).forEach((el)->{System.out.println(el);});
//		System.out.println("-------------------");
////		람다식 줄이기
//		Arrays.stream(arr1).forEach(el->System.out.println(el));
//		System.out.println("-------------------");
////		람다식 줄이기 2 뭐고 이게 어케 되노
//		Arrays.stream(arr1).forEach(System.out::println);
//		System.out.println("-------------------");
		
		
//		배열에 입력된 정수중에 최대값과 최소값을 출력
		int max = arr1[0];
		int min = arr1[0];
//		arr1을 하나씩 순회해서 i에 담는데 i가 이전 숫자보다 클 경우 max에 담고 i가 이전 숫자보다 작을 경우min
		
		
		
		for(int i = 0;i<arr1.length;i++) {
			if (max < arr1[i]) {
				max = arr1[i];
			}
			if (min > arr1[i]){
				min = arr1[i];
			}
		}
		System.out.printf("최대값 : %d , 최소값 : %d\n",max,min);
		
		
//		최대 최소값을 바로 구해주는 스트림 함수 max , min
		System.out.println("MAX : " +Arrays.stream(arr1).max().getAsInt());
		System.out.println("MIN : " +Arrays.stream(arr1).min().getAsInt());
		
		
		
		
	}

}
