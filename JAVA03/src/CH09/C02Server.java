package CH09;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class C02Server {

	public static void main(String[] args) throws Exception {
		
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
		
		Scanner sc = new Scanner(System.in);//(임시)키보드로 입력받기
		String recv = null; //수신용 참조변수
		String send = null; //송신용 참조변수
		
		//데이터를 지속적으로 주고받기 위해 무한루프
		while(true) {
			System.out.println("[SERVER (Q:종료) : ");
			send = sc.nextLine();

			//Server->Client (송신)
			dout.writeUTF(send); //입력값 송출
			dout.flush();//전달하고 나서 버퍼공간 비우기
			//q를 보내고 나서 flush 이후에 나가는 순서
			if(send.equals("q"))
				break;
			
			//Client -> Server(수신)
			recv = din.readUTF(); //입력하는 문자열을 recv로 받기
			if(recv.equals("q"))
				break;
			System.out.println("[CLIENT] : " + recv);
		}
		sc.close();
		dout.close();
		din.close();
		out.close();
		in.close();
		client.close();
		server.close();
		System.out.println("[SERVER] 연결 종료");
		
		
		
	}

}
