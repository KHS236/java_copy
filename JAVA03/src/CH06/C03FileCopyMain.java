package CH06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class C03FileCopyMain {
	
	private static final String PATH="c:\\IOTEST\\";

	public static void main(String[] args) throws Exception
	{
		// args[0] : 원본파일경로 (원본파일명)
		// args[1] : 복사대상경로 (복사파일명)
		Reader fin = new FileReader(PATH+args[0]);
		Writer fout = new FileWriter(PATH+args[1]);
		
		
		while(true) {
			int data = fin.read(); //파일을 한 문자 한 문자 읽기
			if(data==-1) //읽을 값이 없으면 반복문 종료
				break;
			fout.write((char)data); //캐릭터형 형변환
			fout.flush(); //초기화 작업
		}
		fout.close();
		fin.close();
		
	}

}
