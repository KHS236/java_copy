package CH03;

import java.util.Arrays;
import java.util.Scanner;

public class C06EX {
	public static void main(String[] args) {

	//5개의 정수값을 입력받아 int형 배열에 저장하고
	//최대값,최소값,전체합을 출력합니다.

//		System.out.println("정수5개 입력 : ");
//		Scanner sc = new Scanner(System.in);
//		int [] num = new int[5];
//		num[0] = sc.nextInt();
//		num[1] = sc.nextInt();
//		num[2] = sc.nextInt();
//		num[3] = sc.nextInt();
//		num[4] = sc.nextInt();
//	
//		int max = num[0];
//		int min = num[0];
//		int total = 0;
//		for (int i=0;i<num.length;i++) {
//			if(max < num[i]) {
//				max = num[i];
//			};
//			if(min > num[i]) {
//				min = num[i];
//			}
//			total += num[i];
//		}
//		System.out.printf("최대값 : %d , 최소값 : %d , 전체합 : %d \n",max,min,total);
		
	
	
	//5 명의 학생에 국영수점수를 입력받아 2차원배열 저장
	//각 학생의 국영수 점수의 합/평균 구하고
	//각 과목당 합 /평균 구해보세요
	
		Scanner sc = new Scanner(System.in);
		int score[][] = new int[5][3];
		
		for (int i = 0; i<score.length;i++) {
			System.out.printf("%d번 학생의 점수 입력 : ",i+1);
			for (int j=0; j<score[i].length;j++) {
				score[i][j] = sc.nextInt();
			}
		}
			
		for(int n1 = 0;n1<score.length;n1++) {
				System.out.println(Arrays.toString(score[n1]));
		};
		
		
		int max[] = new int[5];
		int avg[] = new int[5];
		
		for(int a = 0; a<score.length;a++) {
			max[a] = Arrays.stream(score[a]).sum();
			avg[a] = Arrays.stream(score[a]).sum()/score[a].length;
		}
		for (int n3=0;n3<score.length;n3++) {
			System.out.printf("각 학생별 종합점수 : %d , 각 학생별 평균점수 : %d \n",max[n3],avg[n3]);			
		}
		
		
		
		int max2 = 0;
		int avg2 = 0;
		
		
		
	}
}