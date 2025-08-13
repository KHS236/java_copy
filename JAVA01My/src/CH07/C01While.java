package CH07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {

//		while(조건식) {
//			조건식이 true인 동안 실행되는 종속문장
//		}

//		01 HELLO WORLD 10회 출력
//		탈출용 변수 : i
//		탈출용 조건식 : i < 10
//		탈출 연산식 : i++

//		int i = 0;
//		while(i<10) {
//			System.out.println(i + " HELLO WORLD");
//			i++;
//		}

//		02 HELLO WORLD N회 출력(N은 사용자 입력 정수값)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		if(n<=0) {
//			System.out.printf("n은 0보다 커야 합니다\n");
//			System.exit(-1);
//		}
//		
//		int i = 0;
//		while(i<n) {
//			System.out.println(i+1 + " HELLO WORLD");
//			i++;
//		}

//		03 1부터 10까지 누적합 구하기
//		int i = 1;
//		int sum = 0;
//		while(i<=10) {
//			System.out.println(i);
//			sum += i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지의 합 : %d\n",1,10,sum);

//		=====================================
//		04 1부터 n까지 누적합

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		
//		while ( i <= n) {
//			System.out.println("i = " + i);
//			sum += i;
//			i++;
//		}
//		System.out.println("1부터 n까지의 누적합 : "+sum);

//		==============================================================
		
		
//		05 n부터 m까지 누적합

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int sum = 0;
//		
////		스왑작업
////		n<m을 만족하는 처리 (n>=m -> swap(temp임시공간))
////		이렇게 간단한 방법이 있었다니 씨불
//		if(n>m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		
//		
//		while(n <= m) {
//			System.out.println("n1 : "+n);
//			sum += n;
//			n++;
//		}
//		System.out.println("n1부터 n2까지의 누적합 : "+sum);

//		====================================================================
		
		
//		06 n부터 m까지 수중 (n<m)의 짝수의 합 , 홀수의 합을 각각 구해서 출력
//		둘중에 더 큰 수 작은 수 담을 min max 만들고
//		min에서 max까지 1씩 증감하면서
//		min이 짝수일 경우 even에 합산
//		min이 홀수일 경우 odd에 합산 이거네 시발

//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 2개 입력 : ");
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int even = 0;
//		int odd = 0;
//		int max = 0;
//		int min = 0;
//		
//		if (n >= m) {
//			max = n;
//			min = m;
//		}
//		else {
//			max = m;
//			min = n;
//		}
//		
//		while (min <= max) {
//			if (min%2==0) {
//				even += min;
//				System.out.println("짝수합산중 : "+even);
//			}
//			else {
//				odd += min;
//				System.out.println("홀수합산중 : "+odd);
//			}
//			min ++;
//		}
//
//		System.out.printf("짝수의 누적합 : %d 홀수의 누적합 : %d", even, odd);

//		=================================================================
		
		
		
//		07 n단 구구단 출력(2<= n <=9)
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 구구단 입력 : ");
		int num = sc.nextInt();
		
		while(num<2 || num>9) {
			System.out.println("2~9까지 재입력");
			num = sc.nextInt();
		}
		
		int i = 2; 
		if (num <=9) {
			System.out.println("2~9까지 입력");
			num = sc.nextInt();
		}
		else {
			while(i<=9) {
				System.out.printf("%d x %d = %d\n",num,i,num*i);
				i++;
			}
		}
		

		
		
		
//		다했당 찌발
		
		
		

	}

}
