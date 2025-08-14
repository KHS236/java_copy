package CH01;
//	가변인자 (파라미터의 제한은 무제한 (메모리공간이 허용하는 한도 내에서 제한이 없음))
//	자바에서는 배열 형태로 파라미터에 접근됨


class C07Simple{
	
	int sum(int ...arg) { //배열 형태로 들어왔으므로 인덱스로 접근 가능
		System.out.println(arg);
		int s=0;
		for(int item : arg) { // 배열형태인 arg안의 요소를 item에 하나씩 넣어서 순회함
			System.out.println(item);
			s+=item;
		}
		return s;
	}
}

public class C07가변인자 {

	public static void main(String[] args) {

		C07Simple obj = new C07Simple();
		obj.sum(10,20);
		
		

	}

}
