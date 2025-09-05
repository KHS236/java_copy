package Ch17;

import java.util.ArrayList;
import java.util.List;

/*
function () {} 	|		ECMA6이전
()=>{}			|		ECMA6이후

()->{}			|		람다(익명함수)

스트림
stream().forEach(()->{})
*/
class Person {
	private String name;
	private int age;
	private String addr;
	// 기본생성자
	public Person () {}
	// 모든인자생성자
	public Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	// 게터세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	// 투스트링
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
}




public class C01Lamda {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("기몽섭",25,"대구"));
		list.add(new Person("티모",100,"안드로메다"));
		list.add(new Person("김범수",45,"예?"));

		list.stream().forEach((item)->{System.out.println(item);});
		System.out.println("=========================================");
		list.sort((a,b)->{return b.getAge()-a.getAge();}); //a-b 오름차순 b-a 내림차순
		list.stream().forEach((item)->{System.out.println(item);});
		
		
		
		
	}
}
