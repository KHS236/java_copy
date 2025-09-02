package CH09;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
//나 192.168.5.26
import java.net.Socket;
import java.net.UnknownHostException;

public class C01Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//서버 연결 요청 (소켓 생성)
//		Socket client = new Socket("SERVERIP",PORT);
		Socket client = new Socket("192.168.5.50",7000);
		
		//클라이언트 위치에서 내용 수신
		InputStream in = client.getInputStream();
		DataInputStream din = new DataInputStream(in);
		String recv = din.readUTF();
		System.out.println("메시지 : " + recv);
	
		din.close();
		in.close();
		client.close();
		
		
	}
	
}
