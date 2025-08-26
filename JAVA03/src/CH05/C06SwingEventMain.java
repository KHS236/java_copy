//package CH05;
//
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;

//ActionListener 클릭 이벤트
//
//class GUI extends JFrame implements ActionListener{
//	/*이벤트 처리를 위해서 멤버 변수로 올려주기
//	 	지역변수로 있으면 이벤트 처리를 위한 접근이 불가능하다*/
//	JButton btn1;
//	JButton btn2;
//	JButton btn3;
//	JButton btn4;
//	
//	// 생성자
//	GUI(String title) {
//		// 프레임세팅  ----------------------
//		super(title);
//		setBounds(10, 10, 470, 420);
//		//끄기 설정 잘넣기  ----------------------
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		// 패널 만들고 기본 레이아웃 제거  ----------------------
//		JPanel panel = new JPanel();
//		panel.setLayout(null);
//
//		// 텍스트 area  ----------------------
//		JTextArea area1 = new JTextArea();
////		area1.setBounds(10,10,250,350);
//		// 폰트 적용 Dialog는 자바 기본 내장 폰트
//		area1.setFont(new Font("Dialog", Font.PLAIN, 22));
//
////		스크롤영역 인자에 area1 넣기 -----------------------
//		JScrollPane scroll1 = new JScrollPane(area1);
//		scroll1.setBounds(15, 15, 250, 280);
//
//		// 텍스트 field -------------------------------
//		JTextField Txtf = new JTextField();
//		Txtf.setBounds(15, 315, 250, 45);
//		Txtf.setFont(new Font("Dialog", Font.PLAIN, 15));
//
//		// 버튼 만들기 ---------------------------------
//		//멤버로 올리고 자료형 빼주기 (지역변수로 선언하면 개별 이벤트 처리 불가능)
//		btn1 = new JButton("파일로저장");
//		btn1.setBounds(290, 15, 150, 45);
//
//		btn2 = new JButton("1:1 요청");
//		btn2.setBounds(290, 85, 150, 45);
//
//		btn3 = new JButton("대화기록보기");
//		btn3.setBounds(290, 155, 150, 45);
//
//		btn4 = new JButton("입력");
//		btn4.setBounds(290, 315, 150, 45);
//		
//		//Event 처리 -----------------------------
//		btn1.addActionListener(this);
//		btn2.addActionListener(this);
//		btn3.addActionListener(this);
//		btn4.addActionListener(this);
//		
//
//		// 컴포넌트 추가 ------------------------------
//		panel.add(scroll1);
//		panel.add(Txtf);
//		panel.add(btn1);
//		panel.add(btn2);
//		panel.add(btn3);
//		panel.add(btn4);
//
//		// 화면 온 오프 -----------------------------------
//		add(panel);
//		setVisible(true);
//
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
////		System.out.println("BTN 클릭 !" + e.getSource());
//		if(e.getSource() == btn1) {
//			System.out.println("파일로 저장 버튼 클릭 !");
//		}
//		else if (e.getSource() == btn2) {
//			System.out.println("1:1 요청 버튼 클릭 !");
//		}
//		else if (e.getSource() == btn3) {
//			System.out.println("대화기록보기 버튼 클릭 !");
//		}
//		else {
//			System.out.println("입력 버튼 클릭 !");
//		}
//		
//	};
//
//}
//
//public class C06SwingEventMain {
//
//	public static void main(String[] args) {
//		new GUI("Chatting Server");
//
//	}
//
//}
//
