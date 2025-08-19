//package CH05;
//
//class Point2D {
//	int x;
//	int y;
////	디폴트생성자
//	Point2D(){
//		System.out.println("Point2D 디폴트 생성자 호출!");
//	}
//	
//	
//	
//}
//
//class Point3D extends Point2D {
//	int z;
//
////	디폴트생성자
//	Point3D(){
////		super(); // 상위클래스 Point2D() 생성자를 먼저 호출하는 기본 코드
//		System.out.println("Point3D 디폴트 생성자 호출!");
//	}
////	상속관계를 만들어주면 상위클래스의 생성자를 먼저 호출해 상위 클래스가 가지고 있는
////	속성/기능을 사용할 공간을 먼저 만들고 하위 클래스 생성자가 호출된다.
//	
//	
////	toString재정의
//	@Override
//	public String toString() {
//		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
//		
//		
//		
//		
//	}
//
//}
//
//
//
//
//
//public class C01IngeritanceMain {
//
//	public static void main(String[] args) {
//
//		Point3D ob = new Point3D();
//		ob.x = 10;
//		ob.y = 20;
//		ob.z = 30;
//		System.out.println(ob);
//		
//		
//		
//		
//		
//
//	}
//
//}
package CH05;


