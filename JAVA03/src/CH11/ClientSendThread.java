package CH11;

import java.io.DataOutputStream;
import java.util.Scanner;

public class ClientSendThread implements Runnable{
	
	DataOutputStream dout;
	Scanner sc = new Scanner(System.in);

	public ClientSendThread(DataOutputStream dout) {
			this.dout = dout;
		
	}

	@Override
	public void run() {
		String send;
		while (true) {
			try {

				System.out.println("[CLIENT (Q:종료) : ");
				send = sc.nextLine();

				// Server->Client (송신)
				dout.writeUTF(send); // 입력값 송출
				dout.flush();// 전달하고 나서 버퍼공간 비우기
				// q를 보내고 나서 flush 이후에 나가는 순서
				if (send.equals("q"))
					break;
			} catch (Exception e) {
				System.out.println("[Exception]예외발생 스레드 종료");
				break;
				}
			}
		sc.close();
		
	}

}
