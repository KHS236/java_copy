package CH05;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

class C03GUI extends JFrame{
	
	//생성자
	C03GUI(String title){
		//Frame Setting
		super(title);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//Paner Setting
		JPanel panel = new JPanel();
		//컬러 객체 사용
//		Color col = new Color(r,g,b);
		Color col = new Color(255,255,0);
		//백그라운드에 col 넣어주기
		panel.setBackground(col);
		
		
		
		
		
		//프레임에서 추가할 구성요소
		add(panel); //Frame에 Panel 추가
		
	};
	
	
}



public class C03SwingMain {

	public static void main(String[] args) {
		new C03GUI("세번째 프레임 창입니다");
		
	}

}
