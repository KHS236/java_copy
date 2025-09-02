package CH11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) throws Exception {
		//소켓 생성 (서버에 연결 요청)
		Socket client = new Socket("192.168.5.17",7000);
		System.out.println("SERVER 와 연결됨");

		
		//인아웃 스트림으로 데이터 주고받기
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();
		
		//기본 인아웃스트림은 바이트형태 문자로 주고받기 위해서 보조스트림 사용
		DataInputStream din = new DataInputStream(in);
		DataOutputStream dout = new DataOutputStream(out);
		
		//송수신 객체 Worker생성
		ClientRecvThread recv = new ClientRecvThread(din);
		//들어오는 데이터는 recv
		ClientSendThread send = new ClientSendThread(dout);
		//나가는 데이터는 send가 관리
		
		//스레드 분리
		Thread th1 = new Thread(recv);
		Thread th2 = new Thread(send);
		//실행
		th1.start();
		th2.start();
		//??
		th1.join();
		th2.join();
		//자원관리
		dout.close();
		din.close();
		out.close();
		in.close();
		client.close();
		System.out.println("[SERVER] 연결 종료");
	}

}
