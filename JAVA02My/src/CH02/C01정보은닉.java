package CH02;

//	데이터를 전달하기위해 사용되는 정보를 저장하는 단위 DTO or VO

//	DTO의 속성들은 반드시 private로 감추는 작업을 기본으로 한다

//	접근 한정자
//	멤버/클래스의 접근범위를 제한하기 위한 예약어
//	public			: 모든 클래스에서 접근가능
//	private			: 해당 클래스에서만 접근가능
//	protected		: 클래스간 상속 관계를 가지는 경우에만 접근가능
//	default(기본)		: 동일 패키지에 속한 클래스에서 접근가능

class C01Person {
	String name;
	private int age;
	private String addr;
	
	


	
//	기능
	
//	setter 함수 (기존 데이터를 수정하는 함수)
	public void setAge(int age) {
		this.age = age;
	}
//	getter 함수(데이터를 외부로 반환시키는 함수)
	public int getAge() {
		return this.age;
	}
	
	
	
	
	
//	디폴트 생성자
	public C01Person() {}
	
public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	//	모든인자 생성자
	public C01Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

//	toString 재정의
	@Override
	public String toString() {
		return "C01Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

}


public class C01정보은닉 {

	public static void main(String[] args) {

		C01Person person1 = new C01Person("홍길동",25,"대구");
		person1.setAge(15);
		
		System.out.println(person1.getAge());
		
		
	}

}
