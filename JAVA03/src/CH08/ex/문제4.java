package CH08.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 문제4 {
	
	private static Scanner sc = new Scanner(System.in);
	private static List<String> wordList = new ArrayList<String>();
	public static void sort(boolean isAsend) {
		if(isAsend) {Collections.sort(wordList);}
		else {Collections.sort(wordList,Collections.reverseOrder());}
	}
	public static void add(String word) {
		wordList.add(word);
	}
	public static void show() {
		wordList.stream().forEach(System.out::println);
	}

	
	public static void main(String[] args) {
		
		//프로그램시작
		while(true) {
			System.out.println("------------M E N U-------------");
			System.out.println("1 추가");
			System.out.println("2 정렬");
			System.out.println("3 확인");
			System.out.println("4 종료");
			System.out.println("------------M E N U-------------");
			System.out.print("번호 : ");
			
			//번호입력
			int n = sc.nextInt();
			
			//스위치시작
			switch (n) {
			case 1:{
				System.out.print("단어입력 : ");
				String word = sc.next();
				add(word);
				break;
			}
			case 2:{
				System.out.print("오름차순 여부(1:오름차순,0:내림차순) : ");
				int no = sc.nextInt();
				if(no==1) sort(true); else sort(false);
				break;
			}
			case 3:{
				show();
				break;
			}
			case 4:{
				System.out.println("종료합니다");
				System.exit(-1);
				break;
			}
			default:{
				System.out.println("다시입력 하세요");
			}
			
			}//스위치끝
		}//프로그램끝
		
	}
}
