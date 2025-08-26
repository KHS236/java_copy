package CH05;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//ActionListener 클릭 이벤트
//KeyListener 키보드 이벤트
//MouseListener 마우스 이벤트
class GUI extends JFrame implements ActionListener,KeyListener,MouseListener{
	/*이벤트 처리를 위해서 멤버 변수로 올려주기
	 	지역변수로 있으면 이벤트 처리를 위한 접근이 불가능하다*/
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	
	//텍스트 영역 멤버처리
	JTextArea area1;
	JTextField Txtf;
	
	// 생성자
	GUI(String title) {
		// 프레임세팅  ----------------------
		super(title);
		setBounds(10, 10, 470, 420);
		//끄기 설정 잘넣기  ----------------------
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 패널 만들고 기본 레이아웃 제거  ----------------------
		JPanel panel = new JPanel();
		panel.setLayout(null);

		// 텍스트 area  ----------------------
		area1 = new JTextArea();
//		area1.setBounds(10,10,250,350);
		// 폰트 적용 Dialog는 자바 기본 내장 폰트
		area1.setFont(new Font("Dialog", Font.PLAIN, 22));

//		스크롤영역 인자에 area1 넣기 -----------------------
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(15, 15, 250, 280);

		// 텍스트 field -------------------------------
		Txtf = new JTextField();
		Txtf.setBounds(15, 315, 250, 45);
		Txtf.setFont(new Font("Dialog", Font.PLAIN, 15));

		// 버튼 만들기 ---------------------------------
		//멤버로 올리고 자료형 빼주기 (지역변수로 선언하면 개별 이벤트 처리 불가능)
		btn1 = new JButton("파일로저장");
		btn1.setBounds(290, 15, 150, 45);

		btn2 = new JButton("1:1 요청");
		btn2.setBounds(290, 85, 150, 45);

		btn3 = new JButton("대화기록보기");
		btn3.setBounds(290, 155, 150, 45);

		btn4 = new JButton("입력");
		btn4.setBounds(290, 315, 150, 45);
		
		//Event 처리 -----------------------------
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		Txtf.addKeyListener(this);
		area1.addMouseListener(this);
		

		// 컴포넌트 추가 ------------------------------
		panel.add(scroll1);
		panel.add(Txtf);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);

		// 화면 온 오프 -----------------------------------
		add(panel);
		setVisible(true);

	}

	//클릭이벤트 ===========================================================
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("BTN 클릭 !" + e.getSource());
		if(e.getSource() == btn1) {
			System.out.println("파일로 저장 버튼 클릭 !");
		}
		else if (e.getSource() == btn2) {
			System.out.println("1:1 요청 버튼 클릭 !");
		}
		else if (e.getSource() == btn3) {
			System.out.println("대화기록보기 버튼 클릭 !");
		}
		else {
			System.out.println("입력 버튼 클릭 !");
		}
		
	}

	
	//키보드이벤트 --------------------------------------------------------
	@Override
	public void keyTyped(KeyEvent e) {
		//눌렀다가 뗏을 때
//		System.out.println("keyTyped..."+e.getKeyChar());
//		System.out.println("keyTyped..."+e.getKeyCode()); //enter == 10
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		//사용자가 키를 누르는 순간
		if(e.getKeyCode()==10) { //엔터키 키코드는 10
			String message = Txtf.getText();//엔터키 입력시 입력된 문자열을 message에 대입
			System.out.println("message : " + message);//입력된 메세지 확인용
			area1.append(message+"\n"); //필드에서 입력한 내용을 area1에 추가,\n 개행
			Txtf.setText(""); //입력되고 나면 필드 초기화
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		//사용자가 키를 떼는 순간
	}

	
	//마우스이벤트-----------------------------------------------------
	@Override
	public void mouseClicked(MouseEvent e) {
		// 클릭했을때
		try {
		System.out.println("클릭됨 !");
		int offset = area1.viewToModel(e.getPoint());
		System.out.println("offset : " + offset);
		//offset 커서가 찍힐 수 있는 위치 인덱스 순서값
		//맨 처음 0 한 글자 뒤는 1 ...
		
		int row = area1.getLineOfOffset(offset);
		System.out.println("row : " + row);
		//row = 커서가 찍히는 행 순서 확인
		// try - catch로 묶어줘야 함
		
		int startOffset = area1.getLineStartOffset(row);
		int endOffset = area1.getLineEndOffset(row);
		System.out.printf("start %d - end %d \n: ",startOffset,endOffset);
		//행의 시작되는 offset 위치 - 행의 끝나는 offset 위치

		String str = area1.getText(startOffset , endOffset-startOffset);
		System.out.println("str : " + str);
		//행에 입력된 문자열 가져오기
		
		}catch(Exception e2){
			e2.printStackTrace();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// 클릭 중
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// 뗏을때
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// 마우스를 영역에 호버했을때
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// 마우스가 영역밖으로 나갔을 때
		
	};

}

public class C07SwingEventMain {

	public static void main(String[] args) {
		new GUI("Chatting Server");

	}

}

