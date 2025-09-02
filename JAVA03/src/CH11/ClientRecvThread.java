package CH11;

import java.io.DataInputStream;

public class ClientRecvThread implements Runnable{

	DataInputStream din;
	public ClientRecvThread(DataInputStream din) {
		this.din = din;
	}

	@Override
	public void run() {
		String recv;
		while(true) {
			try {
				//Client -> Server(수신)
				recv = din.readUTF(); //입력하는 문자열을 recv로 받기
				if(recv.equals("q"))
					break;
				System.out.println("[CLIENT] : " + recv);
			}catch(Exception e) {
				System.out.println("[Exception]예외발생 스레드 종료");
				break;
			}
		}
		
	}

}
