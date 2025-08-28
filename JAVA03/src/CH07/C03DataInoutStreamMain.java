package CH07;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class C03DataInoutStreamMain {

	public static void main(String[] args) throws Exception{
		
		//파일로 내용을 저장할 때 특정한 자료형 단위로 데이터를 구분해 입력
//		FileOutputStream out = new FileOutputStream("c:\\IOTEST\\test3.txt");
//		DataOutputStream dout = new DataOutputStream(out);
//		dout.writeUTF("홍길동");
//		dout.writeDouble(95.5);
//		dout.writeInt(100);
//		dout.flush();
//		dout.close();
		
		//데이터인풋스트림을 이용해 데이터를 가져오는 보조스티림
		FileInputStream in = new FileInputStream("c:\\IOTEST\\test3.txt");
		DataInputStream din = new DataInputStream(in);
		String name= din.readUTF();
		System.out.println(name);
		double weight = din.readDouble();
		System.out.println(weight);
		int data = din.readInt();
		System.out.println(data);
		
	}
}
