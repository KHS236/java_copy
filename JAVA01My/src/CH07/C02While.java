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
//		
//		while (n1 <10) {
//			System.out.printf("====%d단====\n", n1);
//			int n2 = 9;
//			while(n2 >=1) {
//				System.out.printf("%d X %d = %d\n",n1,n2,n1*n2);
//				
//				n2--;
//			}
////			n2=9;
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
//		
		
		
		
//		=================================================================
//		문제4 2단 - n단 (n>2)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("단을 입력 : ");
//		int n2 = sc.nextInt();
//		int n1 = 2;
//		while(n2<2 || n2>9) {
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
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("n단과 m단 입력 : ");
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		while (n <2 || n >9) {
//			System.out.println("n은 2~에서9까지");
//			n = sc.nextInt();
//		}
//		while (m <= n || m > 9) {
//			System.out.println("m은 n보다 크고 9까지");
//			m = sc.nextInt();
//		}
//		
//		while(n <= m) {
//			System.out.printf("====%d단====\n",n);
//			int n3 = 2;
//			while(n3 <10) {
//				System.out.printf("%d X %d = %d\n",n,n3,n*n3);
//				n3++;
//			}
//			System.out.println();
//			n++;
//		}
		
//		다 했다 찌발 
		
		
		
		
//		========================================================================
//		별찍기(기본높이:4)
//		반복문 사용 , 반복시마다 하나의 *만  찍어낼 것
		
		
		
//		int i = 0;
//		
//		while (i<4) {
//			int j = 0;
//			while (j<5) {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
//		==============================================================
		
		
//		int i = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("높이 입력");
//		int h = sc.nextInt();
//		
//		while (i<h) {
//			int j = 0;
//			while (j<5) {
//				System.out.print("*");
//				j++;
//				}
//			System.out.println();
//			i++;
//		}
		
//		===================================================================
		
		
//		int i = 0;
//		
//		while(i<4) {
//			int j = 0;
//			while (j<=i) { 
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		==================================================================
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		int i = 0;
//		while(i<h) {
//			int j = 0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		=================================================
//		별 역순
		
//		int i = 10;
//		while (i>0) {
//			int j = 0;
//			while(j<i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i--;
//		}
		
		
//		=======================================================
//		별 역순 높이 입력
		
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		int i = h;
//		while(i>0) {
//			int j = 0;
//			while (j<i) {
//				System.out.print("*");
//				j++;
//				}
//			System.out.println();
//			i--;
//		}
		
//		========================================================
//		이건 어케해 이런씨불
		
		
//		int i = 0;
//		
//		while(i<4) { //높이4
//			int j = 0;
//			while(j<3-i) { //j(공백이) 3-i높이-1에서 현재i만큼 뺀 수보다 작은만큼
////				1층 i 0 공백 0 3-i = 3이니까 공백은 <3 까지 반복 0 , 1 , 2 공백3개
//				System.out.print(" ");
//				j++;
//			}
//			int k = 0;
//			while(k<=2*i) { //k(별이) 2에 높이를 곱한값과 같아질 때 까지
////				1층 i 0 공백 012 별 0 2*i는 0이니까 별 0 1개
////				2층가면 2*i는 2니까 012 별 3개
//				System.out.print("*");
//				k++;
////				얘 어케 두개씩 늘림????
////				2*i하면 된다고 하네요
//			}
//			System.out.println();
//			i++;
//		}
		
//		==============================================================
//		입력
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		int i = 0;
//		
//		while(i<h) { 
//			int j = 0;
//			while(j<(h-1)-i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k = 0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		==========================================================================================
		
		//-------------------------
		// 높이 : 4
		//-------------------------
		//*******
		// *****
		//  ***
		//   *
		
//		어케했노시발

//		int i = 0;
//		
//		while (i<4) {
//			int space = 0; 
//			while(space < i ) {
//				System.out.print(" ");
//				space ++;
//			}
//			int star = 6;
//			while (star>=2*i) {
//				System.out.print("*");
//				star--;
//			}
//			System.out.println();
//			i++;
//		}

		
//		===================================================================
		//-------------------------
		// 높이 : h
		//-------------------------
		//*******
		// *****
		//  ***
		//   *
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수입력");
		int h = sc.nextInt();
		
		
//		int i = 0;
//		
//		while (i<h) {
//			int space = 0; 
//			while(space < i ) {
//				System.out.print(" ");
//				space ++;
//			}
//			int star = h+1;
//			while (star>=2*i) {
//				System.out.print("*");
//				star--;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		int i = 0;
//		
//		while (i<h) {
//			int space = 0;
//			while(space < i ) {
//				System.out.print(" ");
//				space ++;
//			}
//			int star = 0;
//			while (star<(2*(h-i)-1)) {
//				System.out.print("*");
//				star++;
//			}
//			System.out.println();
//			i++;
//		}


		
		
		
//		=========================================================================
		
		//-------------------------
		// 높이 : 7
		//-------------------------
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *

		int i=0;
		while(i<7) {
			
			if(i<4) {
				int j=0;
				while(j<3-i) {
					System.out.println(" ");
					j++;
				}
				int k = 0;
				while(k<=2*i) {
					System.out.println("*");
					k++;
				}
				
			}
			else {
				
				
			}
			System.out.println();
			i++;
		}
		
		
		
		
//		========================================================
		
		
		
		//-------------------------
		// 높이 : h
		//-------------------------
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		
		//-------------------------
		// 높이 : 7
		//-------------------------
		//*******
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//*******


		//-------------------------
		// 높이 : h
		//-------------------------
		//*******
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//*******
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
