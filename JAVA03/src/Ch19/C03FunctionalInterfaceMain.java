package Ch19;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//제공되는 **함수형 인터페이스**들
//Function<T, R>:
//apply 메서드를 가지고 있어서 하나의 인자(T)를 받아서 결과(R)를 반환하는 함수형 인터페이스 입니다.

//Supplier<T>:
//get 메서드를 가지고 있어서 어떠한 인자도 받지 않고 결과만을 제공하는 함수형 인터페이스 입니다.
//
//Consumer<T>:
//accept 메서드를 가지고 있어서 어떠한 인자를 받아서 결과를 반환하지 않는 함수형 인터페이스 입니다.
//
//Predicate<T>:
//test 메서드를 가지고 있어서 어떠한 인자를 받아서 불리언 결과를 반환하는 함수형 인터페이스 입니다.
//
//UnaryOperator<T>:
//apply 메서드를 가지고 있어서 하나의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.
//
//BinaryOperator<T>:
//apply 메서드를 가지고 있어서 두 개의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.


public class C03FunctionalInterfaceMain {
	
	//01
	public static Function<Integer,Integer> func1=x->x*x;
	//02
	public static Function<Integer,Integer> func2=x->x+x;
	//03
	public static Function<List<Integer>,Integer> func3=x-> x.stream().reduce(0,(sum,el)->{return sum+el;});
//		x.stream().reduce(누적변수초기값,(누적변수,요소변수)->{return 누적연산});
	//04
	public static Function<List<Object>,Integer> func4=(x)->{
		//01 List의 각 요소중 Integer만 filter
		//02 필터링 된 Integer의 재구성(map)
		//03 누적합(reduce)
		return x.stream()
			.filter((el)->{return el instanceof Integer;})
			.map((el)->{return (Integer) el;})
			.reduce(0,(sum,el)->{return sum+el;});
		};
	//05
		public static Function<List<Object>,List<String>> func5= (x)->{
			return x.stream()
			.filter((el)->{return el instanceof String;})
			.map((el)->{return "- "+(String)el + " -";}) //Object로 들어왔으니까 String으로 다운캐스팅
			.collect(Collectors.toList()); //재구성된 문자열 다시 list로 콜렉팅작업
		};
	//06 func1을 실행하고 그 값을 func2로 넘겨서 실행하기
		public static Function<Integer,Integer> func6=func1.andThen(func2);
		
	//07 func3 실행하고 func2 실행하고 func1 실행하기 /*andThen은 계속 붙여 쓸 수 있음*/
		public static Function<List<Integer>,Integer> func7=func3.andThen(func2).andThen(func1);
								//↑↑↑func3은 list Integer로 받아야함
	//08 //반환자료형이 function<Integer,Integer> == 리턴도 람다식으로 만들어줘야함
		public static Function<Integer , Function<Integer,Integer> > func8 = (x)->{
			
			System.out.println("func8 x : " + x);
			return (n)->{
				System.out.println("func8 n : " + n);
				return n+x;
			};
		};
	//09 08을 줄인 것
		public static Function<Integer , Function<Integer,Integer> > func9 = x-> y-> x+y;
		
	public static void main(String[] args) {
	
		//01
		System.out.println(func1.apply(10));
		//02
		System.out.println(func2.apply(10));
		//03
		System.out.println(func3.apply(Arrays.asList(10,20,30,40)));
		//04
		System.out.println(func4.apply(Arrays.asList(11,10.5,"TEST",true,false,new StringBuffer(),20,40)));
		//05
		System.out.println(func5.apply(Arrays.asList(11,"10.5","TEST",true,false,"new StringBuffer()",20,40,"문자열")));
		//06 fun1이 실행되고 그 값을 func2로 넘겨서 실행
		System.out.println(func6.apply(10));
		//07 func3>func2>func1 결과값 넘겨 실행하기
		System.out.println(func7.apply(Arrays.asList(10,20,30,40)));
		//08
		System.out.println( func8.apply(10).apply(20));
		//09
		System.out.println( func9.apply(10).apply(20));
	
	
	}

}
