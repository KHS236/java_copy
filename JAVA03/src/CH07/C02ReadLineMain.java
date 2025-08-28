package CH07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class C02ReadLineMain {
	
	public static void main(String[] args) throws Exception{
		
		//개행처리하며 데이터 입력
//		Writer out = new FileWriter("c:\\IOTEST\\test2.txt");
//		BufferedWriter bout = new BufferedWriter(out);	
//		PrintWriter pout = new PrintWriter(bout);
//		pout.println("HELLO");
//		pout.println("HELLO");
//		pout.println("HELLO");
//		pout.flush();
//		pout.close();
		
		
		//개행문자를 기준으로 데이터를 가지고 오는 보조스트림
		Reader in = new FileReader("c:\\IOTEST\\test2.txt");
		BufferedReader bin = new BufferedReader(in);
		
		while(true) {
			String data = bin.readLine();
			if(data==null)
				break;
			System.out.println(data);
		}
		
		
		
	}
}
