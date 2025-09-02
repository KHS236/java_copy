package CH09;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
//나 192.168.5.26
public class C02Client {
	public static void main(String[] args) throws Exception {
		
		//소켓 생성 (서버에 연결 요청)
		Socket client = new Socket("192.168.5.17",7000);
		System.out.println("SERVER 와 연결됨");
		
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();
		
		//기본 인아웃스트림은 바이트형태 문자로 주고받기 위해서 보조스트림 사용
		DataInputStream din = new DataInputStream(in);
		DataOutputStream dout = new DataOutputStream(out);
		
		
		Scanner sc = new Scanner(System.in);//(임시)키보드로 입력받기
		String recv = null; //수신용 참조변수
		String send = null; //송신용 참조변수		
		
		while(true) {
			
			//Server -> Client(서버로부터 수신 먼저)
			recv = din.readUTF(); //입력하는 문자열을 recv로 받기
			if(recv.equals("q"))
				break;
			System.out.println("[SERVER] : " + recv);			

			System.out.println("[CLIENT (Q:종료) : ");
			send = sc.nextLine();
			
			//Client -> Server (송신)
			dout.writeUTF(send); //입력값 송출
			dout.flush();//전달하고 나서 버퍼공간 비우기
			//q를 보내고 나서 flush 이후에 나가는 순서
			if(send.equals("q"))
				break;
			
		}
		
		sc.close();
		dout.close();
		din.close();
		out.close();
		in.close();
		client.close();
		System.out.println("[CLIENT] 연결 종료");
		
	}

}
