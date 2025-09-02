package CH10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C03GUI extends JFrame implements ActionListener, KeyListener {
	//
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JTextField txt1;
	JTextArea area1;
	JTextArea area2;

	Thread th1;
	Thread th2;

	C03GUI() {
		super(); // 상위클래스 생성자 호출

		setTitle("THREAD 확인하기");

		// 패널 추가
		JPanel pan1 = new JPanel();

		// 컴포넌트 객체 생성
		btn1 = new JButton("시작");
		btn2 = new JButton("중지");

		btn3 = new JButton("시작");
		btn4 = new JButton("중지");
		txt1 = new JTextField();
		area1 = new JTextArea();
		area2 = new JTextArea();
		JScrollPane scroll1 = new JScrollPane(area1);
		JScrollPane scroll2 = new JScrollPane(area2);

		// 컴포넌트 위치 지정
		scroll1.setBounds(50, 50, 190, 280);
		scroll2.setBounds(300, 50, 190, 280);
		// area1.setBounds(50,50,190,280); // Scroll추가시 제거
		txt1.setBounds(50, 350, 190, 30);
		btn1.setBounds(50, 400, 80, 30);
		btn2.setBounds(160, 400, 80, 30);
		btn3.setBounds(300, 400, 80, 30);
		btn4.setBounds(410, 400, 80, 30);

		// 컴포넌트를 리스너에 등록
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		txt1.addKeyListener(this);

		// 기타설정
		area1.setEditable(false);

		// 패널에 컴포넌트 추가
		pan1.add(btn1);
		pan1.add(btn2);
		pan1.add(btn3);
		pan1.add(btn4);
		pan1.add(txt1);
		// pan1.add(area1); // Scroll추가시 제거
		pan1.add(scroll1);
		pan1.add(scroll2);

		// 레이아웃 null
		pan1.setLayout(null);

		// 패널을 프레임에 추가
		add(pan1);
		setBounds(100, 100, 600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			System.out.println("btn1..clicked");	//시작 
			//버튼1을 누르면 쓰레드1이 동작하도록 객체 생성
			C03Worker1 w1 = new C03Worker1(this); //GUI객체에 접근(this)
			//위에서 만들어놓은 th1에 쓰레드 분리
			th1 = new Thread(w1);
			th1.start();//start호출

		}
		if (e.getSource() == btn2) {
			System.out.println("btn2..clicked");	//종료
			//버튼2 이벤트 종료신호 넘겨주기
			if(th1!=null)
				th1.interrupt();//interrupt함수를 사용하면 현재 쓰레드에 
								//interrupt객체를 생성 ,예외발생(중지신호넘기기)
				th1=null;
		}
		if (e.getSource() == btn3) {
			System.out.println("btn3..clicked");
			C03Worker2 w2 = new C03Worker2(this); //쓰레드2번 객체 생성
			th2 = new Thread(w2);//쓰레드 2번으로 분할
			th2.start();//start호출로 실행
 
		}
		if (e.getSource() == btn4) {
			System.out.println("btn4..clicked");	
			if(th2!=null) {
				th2.interrupt();
				th2=null;
	/*
	 th1,th2를 null로 만드는 이유
	 1.interrupt()를 호출해도 자바가 자동으로 thread객체를 삭제하지 않는다
	  변수가 해당 쓰레드를 여전히 참조하고 있으면 나중에 같은 조건문에서 아직 살아있는 스레드로
	 보일 수 있음.
	  2. 참조가 남아 있으면 객체가 메모리에서 해제되지 않음
	   null로 만들어 가비지 컬렉터로 스레드 객체를 정리, 메모리 누수 방지
	  3. 다시 시작할 때 새 스레드를 만들기
	 thread객체는 한 번 start하면 재사용 불가능(IllegarThreadStateeException발생
	  null로 초기화 해야 다시 시작버튼을 눌렀을 때 새로운 스레드 객체 생성
	  
	 */
				
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// System.out.println(e.getKeyChar());
		// System.out.println(e.getKeyCode());
		if (e.getKeyCode() == 10) // 엔터키 입력
		{
			String tmp = txt1.getText();
			area1.append(tmp + "\n");
			txt1.setText("");
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
public class C03SwingMain {

	public static void main(String[] args) {
		new C03GUI();
		

	}

}