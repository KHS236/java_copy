package CH06;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class C06FileOutStreamMain {

	public static void main(String[] args) throws Exception{

		OutputStream fout = new FileOutputStream("C:\\IOTEST\\test6.txt");
//		fout.write('가');//<유니코드문자는 문자를 바이트 단위로 나눠버려서 이상한 문자가 들어감
		fout.write("가나다".getBytes(StandardCharsets.UTF_8));
		// └ 이렇게 하면 들어감!!! (바이트 변환함수로 유니코드 문자셋을 바이트로 변환)
		
//		fout.write("a"); << 문자열이라서 안 됨
//		fout.write('a'); // << 아스키코드상 97 로 들어감
//		fout.write('b'); 
//		fout.write('c'); 
		fout.flush();
		fout.close();
		
		
		
	}

}
