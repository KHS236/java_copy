package CH07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {

//		2~9단 출력


//		int n1 = 2;
//		
//		while(n1 < 10) {
////			System.out.printf("%d\n",n1);
//			
//			int n2 = 1;
//			while(n2 < 10) {
//				System.out.printf("%d X %d = %d\n",n1,n2,n1*n2);
//				n2++;
//			}
//			System.out.println();
//			n1++;
//		}
		
		
		
		
		
		
		
//		===============================================================
//		문제2 2 > 9단 (거꾸로 2x9 , 2x8 ... 9x9 9x1까지)
		
//		int n1 = 2;
//		int n2 = 9;
//		
//		while (n1 <10) {
//			System.out.printf("====%d단====\n", n1);
//			while(n2 >=1) {
//				System.out.printf("%d X %d = %d\n",n1,n2,n1*n2);
//				
//				n2--;
//			}
//			n2=9;
//			System.out.println();
//			n1++;
//		}

		
//		=================================================================
//		문제3 9단 > 2단 출력 (9x9 ,9x8 .... 2x1까지)
		
		
//		int n1 = 9;
//		
//		while (n1 >=2) {
//			System.out.printf("====%d단====\n",n1);
//			int n2 = 9;
//			while(n2 >=1) {
//				System.out.printf("%d x %d = %d\n",n1,n2,n1*n2);
//				n2--;
//			}
//			System.out.println();
//			n1--;
//		}		
		
		
		
		
//		=================================================================
//		문제4 2단 - n단 (n>2)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("단을 입력 : ");
//		int n2 = sc.nextInt();
//		int n1 = 2;
//		while(n2<2 || 2>9) {
//			System.out.println("2~9까지 재입력");
//			n2 = sc.nextInt();
//		}
//		
//		
//		while(n1 <= n2) {
//			System.out.printf("====%d단====\n",n1);
//			int n3 = 2;
//			while(n3 <10) {
//				System.out.printf("%d x %d = %d\n",n1,n3,n1*n3);
//				n3++;
//			}
//			System.out.println();
//			n1++;
//		}
		

		
		
//		===============================================================
//		문제5 n단 - m단 ( n < m )
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("n단과 m단 입력 : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		while (n <2 || n >9) {
			System.out.println("n은 2~에서9까지");
			n = sc.nextInt();
		}
		while (m < n || m > 9) {
			System.out.println("m은 n보다 크고 9까지");
			m = sc.nextInt();
		}
		
		while(n <= m) {
			System.out.printf("====%d단====\n",n);
			int n3 = 2;
			while(n3 <10) {
				System.out.printf("%d X %d = %d\n",n,n3,n*n3);
				n3++;
			}
			System.out.println();
			n++;
		}
		
//		다 했다 찌발 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
