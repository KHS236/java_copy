package CH03;

public class C03ArrayMain {

	public static void main(String[] args) {

		
		
		int arr[][] = {
				{10,20,30},
				{40,50,60,65,67},
				{70,80,90,96,11,56},
				{100,110,120,15,22,33,44},
		};
		
		System.out.println("행의 길이 : "  + arr.length);
		System.out.println("행의 길이 : "  + arr[0].length);
		System.out.println("행의 길이 : "  + arr[1].length);
		System.out.println("행의 길이 : "  + arr[2].length);
		System.out.println("행의 길이 : "  + arr[3].length);

		/*
		 int arr[] = new int[3]
		 1차원 배열의 배열 요소는 해당 배열을 이루는 자료형 단위
		 
		 int arr[][] = new int[2][3]
		 2차원 배열의 배열 요소는 1차원배열
		 
		 3차원 배열의 배열 요소는 2차원 배열
		 */
		
		
		

	}

}
