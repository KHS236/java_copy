package CH06;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C04BufferAddMain {
//시간 재기
	public static void main(String[] args) throws IOException {

		Reader fin = new FileReader("c:\\IOTEST\\origin.txt");
		
		long startTime = System.currentTimeMillis(); //시작시간
		StringBuffer strBuffer = new StringBuffer();
		
//		fin.read(null, 0, 0);
//		한 번에 읽을 캐릭터 단위 , 읽을 범위 , 읽은 캐릭터의 숫자를 반환
		char [] buff = new char[4096]; //캐릭터가 4096보다 커야 받아냄
		
		while (true) {
			int data = fin.read(buff,0,buff.length);
			if(data == -1) 
				break;
			strBuffer.append((char)data);
		}
		
		System.out.println("총 길이 : " + strBuffer.length());
		fin.close();
		long endTime = System.currentTimeMillis(); //종료시간
		System.out.println("소요 시간 : " + (endTime-startTime)+"ms");
		//소요시간 종료시간에서 시작시간을 뺀 시간
		
	}
}
