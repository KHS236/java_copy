package CH05;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C04GUI extends JFrame{
	
	//생성자
	C04GUI(String title){
		//Frame Setting
		super(title);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Paner Setting
		JPanel panel = new JPanel();
		
		//기본 레이아웃 설정 제거
		panel.setLayout(null);
		
		//컬러 객체 사용
//		Color col = new Color(r,g,b);
		Color col = new Color(255,255,0);
		//백그라운드에 col 넣어주기 (보기싫어서 뺌)
//		panel.setBackground(col);
		
		//Component Setting 
		//버튼 만들기
		JButton btn1 = new JButton("BTN01");
		//버튼의 크기와 위치
		btn1.setBounds(10,10,100,30);
		
		//버튼2번
		JButton btn2 = new JButton("BTN01");
		// 1번의 위스 오른쪽 10px 떨어진 위치
		btn2.setBounds(120,10,100,30);
		
		//텍스트 추가
		JTextField txt1 = new JTextField();
		txt1.setBounds(10,50,210,30);
		//여러 줄 텍스트 입력 가능
		JTextArea area1 = new JTextArea();
//		area1.setBounds(10,90,210,250); 얘 빼고 스크롤에 setBounds하면 된다
		// area의 영역을 텍스트가 벗어나면 스크롤 추가
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10,90,210,250);
		
		//Panel에 component(구성요소) 추가
		panel.add(btn1);
		panel.add(btn2);
		panel.add(txt1);
//		panel.add(area1); 얘 빼고 스크롤 add
		panel.add(scroll1);
		
		//프레임에서 추가할 구성요소
		add(panel); //Frame에 Panel 추가

		// 화면 활성화 / 비활성화 Setting이 끝나고 마지막 순서로 넣기
		setVisible(true);
	};
	
	
}



public class C04SwingMain {

	public static void main(String[] args) {
		new C04GUI("네번째 프레임 창입니다");
		
	}

}
