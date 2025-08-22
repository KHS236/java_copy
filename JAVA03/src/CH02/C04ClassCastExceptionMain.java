package CH02;

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}



public class C04ClassCastExceptionMain {

	public static void main(String[] args) {
		
		
		Animal poppi = new Dog();	//업캐스팅
		Animal tori = new Cat();	//업캐스팅
		
		//Dog로 다운캐스팅
		try {
		Dog down1 = (Dog)poppi;		// 다운캐스팅 O
		Dog down2 = (Dog)tori;		// 토리는 고양이야 안 돼
		}catch(ClassCastException e){		//ClassCastException 캐치
			e.printStackTrace();
		}
		

	}

}
