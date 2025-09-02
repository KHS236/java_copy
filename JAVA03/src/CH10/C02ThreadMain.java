package CH10;

public class C02ThreadMain {

	public static void main(String[] args) {
		
		//Runnable interface를 이용하는 스레드 분할 방식
		//워커쓰레드를 각각 만들어주고
		//메인 쓰레드에서 가지고 와서 실행하기
		
		//01 (워커스레드 객체 만들기)
		C02Worker1 w1 = new C02Worker1();
		C02Worker2 w2 = new C02Worker2();
		
		//02 (메인스레드에서 w1,w2를 분리시키는 작업 (Thread클래스 사용))
		Thread th1 = new Thread(w1);
		Thread th2 = new Thread(w2);
		
		//03 start를 호출 (각 쓰레드가 동시에 실행)
		th1.start();
		th2.start();
		
		//--------------------------------------------------------
		//Thread class를 바로 이용한 스레드 분할 방식
		//익명 객체를 만든 작업
		new Thread() {

			//source -> override method -> run()
			@Override
			public void run() {
				for(int i = 0; i<5; i++) {
					System.out.println("TASK03...");
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start(); //익명객체 끝에 start 호출
		
		
		
	}

}
