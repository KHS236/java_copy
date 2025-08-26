package CH05;

import javax.swing.JFrame;

class C02GUI extends JFrame{
	
	//생성자
	C02GUI(String title /*창 제목*/){
		super(title);
		//상속받아서 다 쓸 수 있음
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	};
	
	
}



public class C02SwingMain {

	public static void main(String[] args) {
		//객체 만들어서 실행
		new C02GUI("두번째 프레임 창입니다" /*타이틀*/);
		
	}

}
