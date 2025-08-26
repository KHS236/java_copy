package CH05;

import javax.swing.JFrame;

public class C01SwingMain {

	public static void main(String[] args) {
		//JFrame 프레임창 만드는 클래스
		JFrame frame = new JFrame ("첫번째 프레임입니다.");
		//setBounds 위치 잡기 (x축y축 시작 > 너비 500 높이 500)
		frame.setBounds(100,100,500,500);
		//X 누르면 프로그램 종료 (백그라운드까지 끔)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면 활성화 / 비활성화 (true / false)
		frame.setVisible(true);
		
		

	}

}
