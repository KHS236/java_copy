package Ch17;

import java.util.Scanner;

//덧셈 , 뺄셈 , 곱셈 , 나눗셈을 수행하는 함수형 인터페이스 정의
interface Calculator{
	int calculate(int num1,int num2);
}



public class C03Lamda {

	public static void main(String[] args) {
		Calculator add = (num1,num2)->{
			return num1+num2;
		};
		Calculator sub = (num1,num2)->{
			return num1-num2;
		};
		Calculator mul = (num1,num2)->{
			return num1*num2;
		};
		Calculator div = (num1,num2)->{
			int num3;
			if (num1 < num2) {
				num3 = num1;
				num1 = num2;
				num2 = num3;
			}
			return num1/num2;
		};

		//결과
		System.out.println(add.calculate(10, 20));
		System.out.println(sub.calculate(10, 20));
		System.out.println(mul.calculate(10, 20));
		System.out.println(div.calculate(10, 20));
		
		//
//		System.out.println(add.calculate(10,20,10,50,60,70,80,90,100));
		

	}

}
