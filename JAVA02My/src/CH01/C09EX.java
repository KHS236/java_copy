package CH01;


class TV{
	//속성
	String brandName;
	int year;
	int inch;

	//생성자 메서드 (딸깍)
	public TV(String brandName, int year, int inch) {
		super();
		this.brandName = brandName;
		this.year = year;
		this.inch = inch;
	}
	
	//기능
	void show() {
		System.out.printf(
				"%s 에서 만든 %d년형 %d인치 TV\n",
				this.brandName,this.year,this.inch);
	}

}
public class C09EX {


	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년형 32인치 TV
		myTV.show();
	}
}




//
//	--------------------------------------------
//	문제 - 이것이자바다
//	--------------------------------------------
//	https://scksk.tistory.com/6
//
//	클래스 기본문제
//	1~7번 확인하기 
//	===========================================================
/*
 1. 객체와 클래스에 대한 설명으로 틀린 것은 무엇입니까? 3
1) 클래스는 객체를 생성하기 위한 설계도(청사진)와 같은 것이다.
마자요
2) new 연산자로 클래스의 생성자를 호출함으로써 객체가 생성된다.
맞겠죠
3) 하나의 클래스로 하나의 객체만 생성할 수 있다.
이거 아님
4) 객체는 클래스의 인스턴스이다.
맞죠
(3 해설)
하나의 클래스로부터 여러 개의 인스턴스를 만들 수 있다.

2. 클래스의 구성 멤버가 아닌 것은 무엇입니까? 4
1) 필드(field)
맞겠죠
2) 생성자(constructor)
맞죠
3) 메소드(method)
이것도 맞죠
4) 로컬 변수(local variable)
얘도 구성될 수 있잖아 그럼 필드가 아닌듯?
틀렸네요 로컬 변수는 구성멤버 아님
(4 해설)
클래스의 구성 멤버: 필드, 생성자, 메소드
로컬 변수: 생성자와 메소드 중괄호 블록 내부에 선언된 변수

3. 필드, 생성자, 메소드에 대한 설명으로 틀린 것은 무엇입니까? 4
1) 필드는 객체의 데이터를 저장한다.
필드는 객체의 데이터를 저장한다 맞았던 거 같애
2) 생성자는 객체의 초기화를 담당하낟.
초기값을 넣는 거니까 그렇겠죠?
3) 메소드는 객체의 동작 부분으로, 실행 코드를 가지고 있는 블록이다.
기능에 함수 넣는 거니까 이거 맞죠
4) 클래스는 반드시 필드와 메소드를 가져야 한다.
가 아니라 메서드 없어도 되잖아
(4 해설)
클래스의 구성 멤버들은 생략되거나 복수 개가 작성될 수 있다.


4. 필드에 대한 설명으로 틀린 것은 무엇입니까? 1아님3임
1) 필드는 메소드에서 사용할 수 있다.
필드는 어디서든 쓰는 거라고 하네요
2) 인스턴스 필드 초기화는 생성자에서 할 수 있다.
객체의 속성을 새로 초기화 하는 거니까 이거 맞죠
3) 필드는 반드시 생성자 선언 전에 선언되어야 한다.
반드시까지인가? 이건 모르겠네요
4) 필드는 초기값을 주지 않더라고 기본값으로 자동 초기화된다.
디폴트값이 있죠 예
(3 해설)
필드 선언은 클래스 중괄호 {} 블록 어디서든 존재할 수 있다.
생성자 선언과 메소드 선언의 앞과 뒤 어떤 곳에서도 필드 선언이 가능하다.


5. 생성자에 대한 설명으로 틀린 것은 무엇입니까? 1
1) 객체를 생성하려면 생성자 호출이 반드시 필요한 것은 아니다.
객체를 생성하려면 생성자 호출이 필요하죠
2) 생성자는 다른 생성자를 호출하기 위해 this()를 사용할 수 있다.
한 클래스 안에 생성자가 여러개 있다고 할 때
기본 초기값을 설정한 생성자를 다른 생성자에서 this로 호출해서
 그 받아온 생성자의 인수로 this에 값을 바꿔 반환함
 한마디로 이거 맞음
3) 생성자가 선언되지 않으면 컴파일러가 기본 생성자를 추가한다.
기본생성자 추가 하죠 디폴트값
4) 외부에서 객체를 생성할 수 없도록 생성자에 private 접근 제한자를 붙일 수 있다.
그렇죠 퍼블릭 / 프라이빗 앞에 붙이면 되죠
(1 해설)
생성자를 실행지키지 않고는 클래스로부터 객체를 만들 수 없다.
 만약 생성자가 성공적으로 실행되지 않고 예외(에러)가 발생했다면 객체는 생성되지 않는다.


6. 메소드에 대한 설명으로 틀린 것은 무엇입니까? 4번이 왜 틀림?
1) 리턴값이 없는 메소드는 리턴 타입을 void로 해야 한다.
이거 맞죠
2) 리턴 타입이 있는 메소드는 리턴값을 지정하기 위해 반드시 return문이 있어야 한다.
이것도 맞죠
3) 매개값의 수를 모를 경우 "..."를 이용해서 매개 변수를 선언할 수 있다.
이것도 맞죠
4) 메소드의 이름은 중복해서 선언할 수 없다.
엥 이것도 맞는데 시발
메서드 오버로딩하면 같은 이름으로 선언하는 거잖아
(4 해설)
메소드 오버로딩: 클래스 내에 같은 이름의 메소드를 여러 개 선언하는 것
 메소드의 매개 변수를 "..."를 사용해서 선언하게 되면,
 메소드 호출 시 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값으로 사용된다.


7. 메소드 오버로딩에 대한 설명으로 틀린 것은 무엇입니까? 2
1) 동일한 이름의 메소드를 여러 개 선언하는 것을 말한다.
이거 맞지
2) 반드시 리턴 타입이 달라야 한다.
안 달라도 되는데 자료형 달라지면 오버로딩이 아니라고 했음
3) 매개 변수의 타입, 수 순서를 다르게 선언해야 한다.
타입이 달라지면 인자 순서를 다르게 할 수는 있다고 봤는데
 이거 오버로딩 아니라고 했음 
>> 다시 보니까 반환형"만" 다른 건 오버로딩이 아님. 이라고 돼 있음
4) 매개값의 타입 및 수에 따라 호출될 메소드가 선택된다.
구조적으로 그렇겠죠?
(2 해설)
메소드 오버로딩의 조건: 매개 변수의 타입, 개수, 순서 중 하나가 달라야 한다.
	(리턴 타입은 무관) 
 */
//===========================================================
//

//	12번-16번 확인하기
//---------------------------------------

/*
 12. 다음 클래스에서 해당 멤버가 필드, 생성자, 메소드 중 어떤 것인지 빈칸을 채우세요.

public class Member {
    private String name; // ----------------------------(  (1)  )  
 
    public Member(String name) { } // ------------------(  (2)  )
    
    public void setName(String name) { } // ------------(  (3)  )
}
Colored by Color Scripter


답:

(1) 필드 (2) 생성자 (3) 메소드


13. 현실 세계의 회원을 Member 클래스로 모델링하려고 합니다.
회원의 데이터로는 이름, 아이디, 패스워드, 나이가 있습니다.
이 데이터들을 가지는 Member 클래스를 선언해보세요.

 데이터 이름  |  필드 이름  |  타입 

   이름		  name		 문자열 

   아이디 	   id  		 문자열  
 
  패스워드  	password 	 문자열
 
   나이  		   age 		 정수 



답:
public class Member {
    String name;
    String id;
    String password;
    int age;
}



14. 위에서 작성한 Member 클래스에 생성자를 추가하려고 합니다. 다음과 같이 Member 객체를 생성할 때 name 필드와 id 필드를 외부에서 받은 값으로 초기화하려면 생성자를 어떻게 선언해야 합니까?


Member user1 = new Member("홍길동", "hong");

Member user2 = new Member("강자바", "java");


답:

public class Member {
    String name;
    String id;
    String password;
    int age;
    
    Member(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
Colored by Color Scripter


15. MemberService 클래스에 login() 메소드와 logout() 메소드를 선언하려고 합니다. login() 메소드를 호출할 때에는 매개값으로 id와 password를 제공하고, logout() 메소드는 id만 매개값으로 제공합니다. MemberService 클래스와 login(), logout() 메소드를 선언해보세요.

1) login() 메소드는 매개값 id가 "hong", 매개값 password가 "12345"일 경우에만 true로 리턴하고 그 이외의 값일 경우에는 false를 리턴하도록 하세요.

2) logout() 메소드의 내용은 "로그아웃 되었습니다."가 출력되도록 하세요.

 리턴 타입 | 메소드 이름 | 매개 변수(타입)

 boolean   login      id(String), password(String)

 void      logout     id(String)


public class MemberServiceExample {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong", "12345");
        if(result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
// 실행 결과
// 로그인 되었습니다.
// 로그인 되었습니다.
Colored by Color Scripter


답:

public class MemberService {
    boolean login(String id, String password) {
        if("hong".equals(id) && "12345".equals(password)) 
            return true;
        else
            return false;
    }
 
    void logout(String id) {
        System.out.println("로그아웃 되었습니다.");
    }
}
Colored by Color Scripter



16. PrinterExample 클래스에서 Printer 객체를 생성하고 println() 메소드를 호출해서 매개값을 콘솔에 출력하려고 합니다. println() 메소드의 매개값으로는 int, boolean, double, String 값을 줄 수 있습니다. Printer 클래스에서 println() 메소드를 선언해보세요.

public class PrinterExample {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
}
Colored by Color Scripter


답:
public class Printer {
    void println(int x) {
        System.out.println(x);
    }
    void println(boolean x) {
        System.out.println(x);
    }
    void println(double x) {
        System.out.println(x);
    }
    void println(String x) {
        System.out.println(x);
    }
}
 */

// ==========================================================
//
//	--------------------------------------------
//	--추가(명품자바)
//	--------------------------------------------
//	https://security-nanglam.tistory.com/213
//
//
//	--------------------------------------------
//	--추가
//	--------------------------------------------
//	https://iu-corner.tistory.com/entry/JAVA-%EC%9E%90%EB%B0%94-%ED%81%B4%EB%9E%98%EC%8A%A4-%EC%97%B0%EC%8A%B5-%EB%AC%B8%EC%A0%9C-%EB%AA%A8%EC%9D%8C-1
//