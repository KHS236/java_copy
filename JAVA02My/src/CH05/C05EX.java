package CH05;

class Employee {
	public String name;
	protected int age;
	protected String addr;
//	기본 생성자
	public Employee () {};
	
//	모든인자 생성자
	public Employee(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
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

}

class Parttimer extends Employee {
	private int hour_pay;
	
//	기본생성자
	public Parttimer () {};

//	모든인자 생성자
	public Parttimer(String name, int age, String addr, int hour_pay) {
		super(name, age, addr); //상위클래스 생성자 호출
		this.hour_pay = hour_pay;
	}

//	set만
	public void setHourPay(int hour_pay) {
		this.hour_pay = hour_pay;
	}

	@Override
	public String toString() {
		return "Parttimer [hour_pay=" + hour_pay + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

	//toString 재정의



}

class Regular extends Employee {

	private int salary;
	
	//기본 생성자
	public Regular () {};

	//모든 인자 생성자
	public Regular(String name, int age, String addr, int salary) {

		super(name, age, addr);
		this.salary = salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

//	toString 재정의
	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", name=" + name + ", age=" + getAge() + ", addr=" + getAddr() + "]";
	}
}

public class C05EX {

	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동", 25, "대구", 20000);
		emp1.setAge(100);
		
		Regular emp2 = new Regular("서길동", 45, "울산", 50000000);
		System.out.println(emp1);
		System.out.println(emp2);
	}

}