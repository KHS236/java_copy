package Ch18;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Person {
    protected String name;
    protected Integer age;

    public Person() {}

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

class Employee extends Person{
	private String department;
	private String role;
	//default
	public Employee() {}
	public Employee(Person person) {
		this.name = person.getName();
		this.age = person.getAge();
		//super(이름,나이)
		
	}
	
	// all parameter Constructor
	public Employee(String department, String role) {
		super();
		this.department = department;
		this.role = role;


	//getter and setter
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	//toString
	@Override
	public String toString() {
		return "Employee [department=" + department + ", role=" + role + ", name=" + name + ", age=" + age + "]";
	}



	
}


public class C01Map {

    public static void main(String[] args) {

        // Arrays.asList 호출 시 new 없이 바로 호출해야 함
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);

        // filter, collect 사용 시 스트림에서 바로 호출
        List<Integer> list2 = list.stream()
                                  .filter(n -> n % 2 == 0)
                                  .collect(Collectors.toList());
        System.out.println(list2);

        // map 결과를 저장할 변수 필요
        List<Integer> list3 = list.stream()
                                  .filter(n -> n % 2 == 1)
                                  .map(n -> n * n)
                                  .collect(Collectors.toList());
        System.out.println(list3);

        // Person 리스트 생성 시, 괄호와 구문 수정
        List<Person> list4 = Arrays.asList(
            new Person("이름", 11),
            new Person("이름222222222", 22),
            new Person("이름3", 33),
            new Person("이름444444444", 44),
            new Person("5", 55)
        );

        System.out.println(list4);

        // 나이 내림차순 정렬 후 출력
        List<Person> sortedList = list4.stream()
                              .sorted((a, b) -> b.getAge() - a.getAge())
                              .collect(Collectors.toList());
        System.out.println(sortedList);
        
        //나이순으로 내림차순 정렬해서 출력 sorted((a,b)->{return b-a;})//내림차순
        
        List<Person> list5=
        list4.stream()
        	.sorted((a,b)->{return b.getAge()-a.getAge();})
        	.collect(Collectors.toList());
        
        list5.forEach(System.out::println);
        
        List<Integer> list6 =
        list4.stream()
//    		.map((el)->{return el.getAge();})
//			.map(el-> el.getAge())
			.map(Person::getAge)
    		.collect(Collectors.toList());
        System.out.println(list6);
        
        //이름 길이
        List<Integer> list7=
        list4.stream()
//        	.map(el->el.getName())
//        	.map(el->el.length())
        	//메서드 참조(::) 사용
        	.map(Person::getName) //Person
        	.map(String::length)  //String
        	.collect(Collectors.toList());
        System.out.println(list7);
        
        
        //
		List<Employee> list8 = 
		list4.stream()
//				.map((el)->{return new Employee(el);})
				.map(Employee::new)
				.collect(Collectors.toList());
		
		list8.forEach(System.out::println);
	}
        
        
        
        
        
        
    
}

		
		
		
		



