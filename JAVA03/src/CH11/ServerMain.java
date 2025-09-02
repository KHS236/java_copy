package CH11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) throws Exception{

		//서버 소켓 생성
		//포트번호 7000
		ServerSocket server = new ServerSocket(7000);
		System.out.println("[INFO] SERVER SOCKET LISTENING..");
		
		//ACCEPT + 클라이언트 아이피 주소
		Socket client = server.accept();
		System.out.println("[INFO] SERVER ACCEPT..CLIENT IP : " + client.getInetAddress());

		
		//인아웃 스트림으로 데이터 주고받기
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();
		
		//기본 인아웃스트림은 바이트형태 문자로 주고받기 위해서 보조스트림 사용
		DataInputStream din = new DataInputStream(in);
		DataOutputStream dout = new DataOutputStream(out);
		
		//송수신 객체 Worker생성
		ServerRecvThread recv = new ServerRecvThread(din);
		//들어오는 데이터는 recv
		ServerSendThread send = new ServerSendThread(dout);
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
		server.close();
		System.out.println("[SERVER] 연결 종료");
		
		
		
		
		
		
		

	}

}
