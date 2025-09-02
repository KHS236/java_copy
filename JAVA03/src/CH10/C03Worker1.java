package CH10;

public class C03Worker1 implements Runnable{

	C03GUI gui;
	//C03GUI를 받을 생성자
	public C03Worker1(C03GUI c03gui) {
		this.gui = c03gui;
	}

	@Override
	public void run() {
		while(true) {
			//중지버튼을 누르면 현재 동작중인 run환경에 중지 신호 주기
			try {
			gui.area1.append("TASK01...\n");
				Thread.sleep(500);
			} catch (InterruptedException e) {//중지객체를 받아주는 Interrupt
				e.printStackTrace();
				break;
			}
		}
		System.out.println("WORKER01 THREAD INTERRUPTED..");
	}
	
	
	

}
