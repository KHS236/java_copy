package CH06;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URL;

public class C08URLStreamMain {

	public static void main(String[] args) throws Exception {

		URL url = (new URI("https://www.kbmaeil.com/article/20250826500652")).toURL();
		InputStream in = url.openStream();//브라우저에 있는 내용을 자바로 가지고 오는 기능
		
		//보조스트림 추가 | 보조스트림(버퍼공간)추가
		BufferedInputStream buffIn = new BufferedInputStream(in);
		//바이트 단위를 캐릭터 단위로 변환시키는 버퍼스트림 추가
		Reader rin = new InputStreamReader(buffIn);
		
		Writer fout = new FileWriter("C:\\IOTEST\\index.html");
		
		while(true) {
			int data = rin.read();
			if(data==-1)
				break;
			System.out.print((char)data);
			fout.write((char)data);
			fout.flush(); //write 하면 flush 해주기
		}
		fout.close();
		rin.close();
		buffIn.close();
		in.close();
		
		
	}

}
