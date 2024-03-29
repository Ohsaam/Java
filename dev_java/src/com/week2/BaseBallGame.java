package com.week2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.week2.BaseBallGameView;

public class BaseBallGame implements ActionListener {
	JFrame jf = new JFrame();
	//이미지를 담은 물리적인 위치 선언하기.
	String 		imgPath = "D:\\workspace_java\\dev_java\\src\\com\\week2\\";
//	ImageIcon 	titleIcon = new ImageIcon(imgPath+"yagu.png");
	//ImageIcon 	bg = new ImageIcon(imgPath+"dreamballpark.jpg");
	Image img = null;
	JMenuBar 	jmb 		= new JMenuBar();
	JMenu	 	jm_game 	= new JMenu("게임");
	JMenuItem   jmi_new 	= new JMenuItem("새게임");
	JMenuItem   jmi_dap 	= new JMenuItem("정답");
	JMenuItem   jmi_clear 	= new JMenuItem("지우기");
	JMenuItem   jmi_exit 	= new JMenuItem("나가기");
	JMenu	 	jm_info 	= new JMenu("도움말");
	JMenuItem   jmi_detail 	= new JMenuItem("야구숫자게임이란?");
	JMenuItem   jmi_create 	= new JMenuItem("만든사람들");
	//중앙에 들어갈 속지 선언
	JPanel jp_center = new JPanel();
	//세자리 숫자를 입력 후 엔터를 쳤을때 사용자가 입력한 숫자와 숫자를 맞추기 위한 힌트문
	//을 출력해줄 화면.
	JTextArea jta_display = null;
	JScrollPane jsp_display = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	JTextField jtf_user   = new JTextField();
	//글꼴과 글꼴에 대한 스타일과 글자 크기를 정해줌.-인스턴스화를 통해서, 그 값들은 생성자의 파라미터로 결정됨
	Font f = new Font("Thoma",Font.BOLD,14);
	//동쪽에 들어갈 속지 생성하기
	JPanel jp_east   = new JPanel();
	//새게임, 정답, 지우기, 나가기 버튼 추가하기
	JButton jbtn_new 	= new JButton("새게임");
	JButton jbtn_dap 	= new JButton("정답");
	JButton jbtn_clear 	= new JButton("지우기");
	JButton jbtn_exit 	= new JButton("나가기");
	int my[]  = new int[3];
	int com[] = new int[3]; 
	// 세자리 임의의 숫자를 담을 일차배열 선언 
	// BaseballGameLogic으로 보내야하는지 아님 BaseballGameEvent에 있어야 하는 기준
	
	int cnt = 0;//++cnt 힌트 문장에서 순번을 출력하는 변수 + 야구의 회차를 나타내는 전역변수다. + 새게임이 시작되면 0으로 시작해야한다.
	//세자리 임의의 숫자를 채번하는 메소드 구현하기

	public void initDisplay() {
		jta_display = new JTextArea();
		jsp_display = new JScrollPane(jta_display);
		jta_display.setOpaque(false);
		jf.setResizable(false);
		//jf.setContentPane(new BgPanel());
		//////////////// 툴바에 들어갈 이미지 버튼 추가하기 ///////////////
		//////////////// 메뉴 바 추가 시작 /////////////////
		jm_game.add(jmi_new);
		jm_game.add(jmi_dap);
		jm_game.add(jmi_clear);
		jm_game.add(jmi_exit);
		jm_info.add(jmi_detail);
		jm_info.add(jmi_create);
		jmb.add(jm_game);
		jmb.add(jm_info);
		//////////////// 메뉴 바 추가  끝   /////////////////
		System.out.println("initDisplay 호출 성공");
		//이벤트 소스와 이벤트 처리 클래스를 매핑하는 코드 추가
		//EventHandler ehandler = new EventHandler();
		//jtf_user.addActionListener(ehandler);//여기서 this는 자기자신 클래스를 가리킴.-BaseBallGame:내안에 actionPerformed
		jtf_user.addActionListener(this);//여기서 this는 자기자신 클래스를 가리킴.-BaseBallGame:내안에 actionPerformed
		jbtn_new.addActionListener(this);
		jbtn_dap.addActionListener(this);
		jbtn_clear.addActionListener(this);
		jbtn_exit.addActionListener(this);
		jmi_exit.addActionListener(this);
		jbtn_new.setBackground(new Color(158,9,9));
		jbtn_new.setForeground(new Color(212,212,212));
		jbtn_dap.setBackground(new Color(7,84,170));
		jbtn_dap.setForeground(new Color(212,212,212));
		jbtn_clear.setBackground(new Color(19,99,57));
		jbtn_clear.setForeground(new Color(212,212,212));
		jbtn_exit.setBackground(new Color(54,54,54));
		jbtn_exit.setForeground(new Color(212,212,212));
		jp_east.setLayout(new GridLayout(4,1));
		jp_east.add(jbtn_new);
		jp_east.add(jbtn_dap);
		jp_east.add(jbtn_clear);
		jp_east.add(jbtn_exit);
		jta_display.setFont(f);
		jta_display.setBackground(new Color(255,255,200));
		jta_display.setForeground(new Color(57,109,165));

		jf.setJMenuBar(jmb);
		jtf_user.setBackground(new Color(255,255,200));
		jp_center.setBackground(Color.green);
		jp_east.setBackground(Color.black);
		jp_center.setLayout(new BorderLayout(0,10));
		jp_center.add("Center",jsp_display);
		jp_center.add("South",jtf_user);
		jta_display.setLineWrap(true);
		jf.setLayout(new BorderLayout(10,20));
		jf.add("Center",jp_center);
		jf.add("East",jp_east);
		jf.setTitle("야구 숫자 게임 Ver1.0");
		jf.setSize(400, 300);
		jf.setVisible(true);
	}
	/*
	 * 콜백메소드(자바) - 버튼을 눌렀을 때 혹은 JTextField에서 엔터를 쳤을 때 JVM이 감지(H/W - 키보드 - 입력장치) 해 내고 
	 * 그 때 인터셉트 해서 필요한 처리를 개발자가 해낸다. - dependency injection(Spring f/w)
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) { // 파라미터자리에 ActionEvent 객체는 JVM에서 이벤트가 감지되었을 때 대신 주입해줌
		System.out.println("actionPerformed 호출 성공");
		String label = e.getActionCommand();
		System.out.println("너가 누른 버튼의 문자열은 "+label+ " 입니다.");
		Object obj = e.getSource();//이벤트소스의 주소번지를담아줌.
		//너 나가기 버튼이니?
		String input = jtf_user.getText();
		System.out.println(input);
		if("나가기".equals(label)) {

		}
		//새게임을 누른거야?
		else if(obj == jbtn_new) {
			jtf_user.requestFocus();
		}
		//이벤트가 발생한 이벤트 소스의 문자열을 비교하기
		else if(e.getSource()==jtf_user) {
			
			System.out.println("엔터쳤을 때 : " + jtf_user.getText());
			cnt = cnt + 1;
			jta_display.append(cnt+"회"+jtf_user.getText()+"\n");
			jtf_user.setText("");

		}///////////입력하고 엔터 쳤을 때
		else if(obj==jbtn_dap) {

		}

	}
	
	/*
	 * 부모가 정의한 메소드를 재정의 하는 것. - 실제 그 장치에 필요한 기능을 구현하시오.
	 * 부모(추상클래스- 추상은 결정되지 않았음)가 정의할 수 없으니( 서로 다른 장치라서)
	 * 나를 구현하는 클래스마다 기능의 차이가 있읉테니 그 클래스에서 오버라이딩하시오.
	 * 선언부 - 전역변수의 성격을 가진다. - 인스턴스변수.변수명으로 어떤 클래스에서든 사용이 가능하다.
	 * 
	 */
	
	
	public static void main(String[] args)
	{
		BaseBallGame bbGame = new BaseBallGame();
		bbGame.initDisplay();	
		
	}

}
