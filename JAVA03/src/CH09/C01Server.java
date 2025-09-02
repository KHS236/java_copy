package CH09;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class C01Server {

	private void maim() throws Exception {
		

		//서버 소켓 생성
		ServerSocket server = new ServerSocket(7000);// IP : 192.168.5.50 Port : 7000
		System.out.println("[INFO] SERVER SOCKET LISTENING");

//		//1회 접속
//		
//		Socket client = server.accept();  // 1회 접속 허용 ( 1:1 )
//		OutputStream out = client.getOutputStream(); //접속이 들어오면 클라이언트에 대한 정보를 전달Output
//		DataOutputStream dout = new DataOutputStream(out);
//		dout.writeUTF("[SERVER] WELCOM TO SERVER + " + new Date());
//		dout.flush();
		
		//루프 접속
		while(true) {
			Socket client = server.accept();
			OutputStream out = client.getOutputStream();
			DataOutputStream dout = new DataOutputStream(out);
			System.out.println("접속자 IP : " + client.getInetAddress());
			dout.writeUTF("[SERVER] WELCOM TO SERVER + " + new Date());
			dout.flush();
			dout.close();
			out.close();
			client.close();
			
		}
		
//		dout.close();
//		out.close();
//		client.close();
//		server.close();
//		System.out.println("[INFO] SERVER EXIT");
		
		
	}

}
