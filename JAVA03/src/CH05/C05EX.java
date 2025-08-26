//package CH05;
//
//import java.awt.Font;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//class C05GUI extends JFrame {
//
//	// 생성자
//	C05GUI(String title) {
//		// 프레임세팅
//		super(title);
//		setBounds(10, 10, 470, 420);
//		//끄기 설정 잘넣기
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		// 패널 만들고 기본 레이아웃 제거
//		JPanel panel = new JPanel();
//		panel.setLayout(null);
//
//		// 텍스트 area
//		JTextArea area1 = new JTextArea();
////		area1.setBounds(10,10,250,350);
//		// 폰트 적용 Dialog는 자바 기본 내장 폰트
//		area1.setFont(new Font("Dialog", Font.PLAIN, 22));
///*
// * new Font("Dialog", Font.PLAIN, 20); // 보통체, 20pt 
// * new Font("Dialog",Font.BOLD, 20); // 굵게, 20pt 
// * new Font("Dialog", Font.ITALIC, 20); // 기울임, 20pt
// * new Font("Dialog", Font.BOLD | Font.ITALIC, 20); // 굵고 기울임 20pt
// */
//
////		스크롤영역 인자에 area1 넣기
//		JScrollPane scroll1 = new JScrollPane(area1);
//		scroll1.setBounds(15, 15, 250, 280);
//
//		// 텍스트 field
//		JTextField Txtf = new JTextField();
//		Txtf.setBounds(15, 315, 250, 45);
//		Txtf.setFont(new Font("Dialog", Font.PLAIN, 15));
//
//		// 버튼 만들기
//		JButton btn1 = new JButton("파일로저장");
//		btn1.setBounds(290, 15, 150, 45);
//
//		JButton btn2 = new JButton("1:1 요청");
//		btn2.setBounds(290, 85, 150, 45);
//
//		JButton btn3 = new JButton("대화기록보기");
//		btn3.setBounds(290, 155, 150, 45);
//
//		JButton btn4 = new JButton("입력");
//		btn4.setBounds(290, 315, 150, 45);
//
//		// 컴포넌트 추가
//		panel.add(scroll1);
//		panel.add(Txtf);
//		panel.add(btn1);
//		panel.add(btn2);
//		panel.add(btn3);
//		panel.add(btn4);
//
//		// 화면 온 오프
//		add(panel);
//		setVisible(true);
//
//	};
//
//}
//
//public class C05EX {
//
//	public static void main(String[] args) {
//		new C05GUI("Chatting Server");
//
//	}
//
//}
//
///*
// 프레임 만들기 흐름
// 기본 설정
// - GUI클래스 만들어서 JFrame 상속
// - 생성자 만들기
// - Frame 기본 설정
// - 상위클래스("제목");
// - 프레임 위치와 크기 지정
// - EXIT ON 어쩌구 써주기
// - 코드 가장 마지막에 setVisible(true);
// 
// Pannel 설정
// - 객체 만들기
// - 레이아웃(기본설정)지우기
// - 프레임에 패널 추가하기 add(panel)
// 
// Component 설정
// - textarea,btn,txtfield 만들어서 속성,위치,크기 조정
// - 패널에 컴포넌트 추가해주기
// 
// 
// 
// 
// 
// 
// 
// 
// */
