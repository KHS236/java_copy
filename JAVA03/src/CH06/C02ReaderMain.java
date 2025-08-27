package CH06;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C02ReaderMain {

	public static void main(String[] args) throws IOException {
		// 파일 읽기
		// 파일에서 자바 방향 == in

		Reader fin = new FileReader("c:\\IOTEST\\TEST1.txt");

//		while (true) {
// /*fin.read Returns: The character read, as an integer in the range 0 to 65535
//(0x00-0xffff), or -1 if the end of the stream has been reached
//==> 더이상 읽을 문자가 없으면 -1을 준다*/
//			int data = fin.read();
//			if(data == -1) {
//				break;
//			System.out.print((char)data);
//			}
		
		int data;
	while((data = fin.read())!=-1) {
		System.out.print((char) data);
	}
	fin.close();
		

	}

}
