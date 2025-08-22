package CH02;

public class C05ExceptionMain {

	public static void main(String[] args) {
		
		try {
			String str = null;
			str.toString();
			
			int[] arr = {10,20,30};
//			arr[5] = 100; // << 난 왜 예외발생 안 함 ?
			
			Animal tori = new Dog();
			Cat down = (Cat)tori; // << 나 왜 예외발생 안 함 ?
		}
		catch(Exception e) { //예외클래스를 업캐스팅해서 모든 예외를 한 번에 처리
			System.out.println(e.getCause() + " 예외처리 !"); //어떤 예외발생인지 확인
		}
//		catch(NullPointerException e1) {
//			System.out.println("NullPointer예외처리 완료!");
//		}catch(ArrayIndexOutOfBoundsException e2) {
//			System.out.println("배열 예외처리완료!");
//		}catch(ClassCastException e3) {
//			System.out.println("다운캐스팅 예외처리완료!");
//		}
		
		
		

	}

}
