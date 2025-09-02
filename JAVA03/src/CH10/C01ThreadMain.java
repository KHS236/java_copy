package CH10;

public class C01ThreadMain {
	public static void main(String[] args) throws Exception {
		//쓰레드 - 작업 흐름 단위 (실행 흐름,순서)
		
		//동기방식(약속된 방식)
		//메인 스레드 하나로 코드 순서대로 실행
		for(int i = 0; i <5;i++)
		{
			System.out.println("TASK01...");
			Thread.sleep(500);
		}
		
		for(int i = 0; i <5;i++)
		{
			System.out.println("TASK02...");
			Thread.sleep(500);
		}
		
		
		
		
		
	}

}
