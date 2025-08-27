package CH06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C07FileCopyMain {
	
	private static final String PATH="c:\\IOTEST\\";
	
	public static void main(String[] args) throws Exception {
		
		// args[0] : 원본파일경로 (원본파일명)
		// args[1] : 복사대상경로 (복사파일명)
		InputStream fin = new FileInputStream(PATH+args[0]);
		OutputStream fout = new FileOutputStream(PATH+args[1]);
		
		long startTime = System.currentTimeMillis(); //시작시간
		
		byte [] buff = new byte[4096]; //사이즈가 커질수록 한 번에 읽는 단위가 커져서 속도가 빨라짐
		while(true) {
			int data = fin.read(buff);
			      //└ .read() 바이트값 읽음 | .read(buff) 들어오는 데이터의 바이트의 수를 읽음
			if(data==-1) //읽을 값이 없으면 반복문 종료
				break;
			fout.write(buff,0,data);
			fout.flush(); //초기화 작업
		}
		fout.close();
		fin.close();
		
		long endTime = System.currentTimeMillis(); //종료시간
		System.out.println("소요 시간 : " + (endTime-startTime)+"ms");
		
		
	}

}
