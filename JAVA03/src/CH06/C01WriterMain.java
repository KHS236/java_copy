package CH06;

import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;

public class C01WriterMain {

	public static void main(String[] args) throws IOException{
		//파일 쓰기
		//자바에서 파일로 내보냄 == out
		
		//덮어쓰기 작업 (true 덮어쓰기 / false 새로쓰기 기본값)
//		Writer fout = new FileWriter("c:\\IOTEST\\test1.txt",false);
		Writer fout = new FileWriter("c:\\IOTEST\\test1.txt",true);		
		fout.write("TEST1\n");
		fout.write("TEST2\n");
		fout.write("TEST3\n");
		
		//내용을 주고받는 과정에서 속도차이가 발생할 수 있기 때문에 초기화 작업
		fout.flush();
		fout.close();
		
		

	}

}
