package CH11;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ServerSendThread implements Runnable {

	// 멤버로 들어가 있어야 run에서 작업 가능함
	DataOutputStream dout;
	Scanner sc = new Scanner(System.in);

	public ServerSendThread(DataOutputStream dout) {
		this.dout = dout;
	}

	String send;

	@Override
	public void run() {
		while (true) {
			try {

				System.out.println("[SERVER (Q:종료) : ");
				send = sc.nextLine();

				// Server->Client (송신)
				dout.writeUTF(send); // 입력값 송출
				dout.flush();// 전달하고 나서 버퍼공간 비우기
				// q를 보내고 나서 flush 이후에 나가는 순서
				if (send.equals("q"))
					break;
			} catch (Exception e) {
				System.out.println("[Exception]예외발생 스레드 종료");
				}
			}
		sc.close();

		}
	}
