package CH06;

import java.io.FileInputStream;
import java.io.InputStream;

public class C05FileInputStreamMain {

	public static void main(String[] args) throws Exception {
		
		InputStream fin = new FileInputStream("c:\\IOTEST\\test.pdf");
		
		long startTime = System.currentTimeMillis(); //시작시간
		StringBuffer strBuffer = new StringBuffer();
		byte[] buff = new byte[4096]; //바이트 배열을 만들고 read에 인자로 주면
									  //소요시간이 적어짐
		
		while(true) {
			int data = fin.read(buff);
			if(data==-1)
				break;
//			System.out.print((char)data);
			strBuffer.append((char)data);
		}
		System.out.println("총 길이 : " + strBuffer.length());
		fin.close();
		
		long endTime = System.currentTimeMillis(); //종료시간
		System.out.println("소요 시간 : " + (endTime-startTime)+"ms");
		
	}

}
