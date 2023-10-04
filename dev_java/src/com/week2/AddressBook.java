package com.week2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//클래스 선언하기
//ActionListener는 인터페이스 이라서 추상메소드를 가지고 있다.
//추상메소드란 선언만 되어있고 좌중괄호와 우중괄호가 없는 메소드 말함
public class AddressBook implements ActionListener{
	//선언부
	JFrame jf = new JFrame();
	AddressDialog aDialog = new AddressDialog();//생성부가 생성자를 호출한다.
	JPanel jp_north = new JPanel();//버튼 4개 배치하는데 사용함-단독으로 모양이 없다
	JButton btnSelect = new JButton("조회");
	JButton btnInsert = new JButton("입력");
	JButton btnUpdate = new JButton("수정");
	JButton btnDelete = new JButton("삭제");
	//생성자
	public AddressBook() {}
	//화면처리 구현
	public void initDisplay() {
		//이벤트 처리 3단계 -  버튼의 이벤트를 지원하는 인터페이스를 implements한다. - ActionListener
		//해당 인터페이스가 선언하고 있는 메소드를 오버라이딩 해야한다. - actionPerformed(ActionEvent e)
		//이벤트소스와 이벤트 처리를 담당하는 클래스를 매칭해줌
		btnSelect.addActionListener(this);
		btnInsert.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnDelete.addActionListener(this);
		jp_north.add(btnSelect);
		jp_north.add(btnInsert);
		jp_north.add(btnUpdate);
		jp_north.add(btnDelete);
		jf.add("North", jp_north);
		jf.setTitle("주소록 Ver1.0");
		jf.setSize(800,500);
		jf.setVisible(true);
		aDialog.initDisplay();
		aDialog.jdg_address.setVisible(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//메인메소드
	public static void main(String[] args) {
		AddressBook abook = new AddressBook();//기본
		abook.initDisplay();
	}
	//아래 메소드는 ActionListener인터페이스에 이름이 정해져 있다.
	//구현체 클래스인 너가 재정의하여 구현해라
	//현재 코드에서 actionPerformed메소드를 호출하는 코드는 어디에도 없다.
	//그런데 54번 라인은 어떻게 실행되는 걸까요?
	//actionPerformed메소드는 마치 main메소드 처럼 버튼이 눌려지고 눌려졌다는 사실을 JVM이 감지하면
	//그때 자동으로 호출되는 메소드 입니다. - 콜백메소드(callback)
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌려진 버튼의 문자열을 읽어온다. - 언제 버튼이 눌렸을 때 - 버튼을 누르는건 사용자 이지만 
		//눌렸다는 느끼는건 JVM만이 알수 있다.- 파라미터 자리에 e가지고 getActionCommand()호출하면 String타입의 라벨 출력함
		String command = e.getActionCommand();
		System.out.println(command);//조회,수정,입력,삭제
		//너  조회를 원해?
		if("조회".equals(command)) {
			System.out.println("조회버튼을 클릭하였습니다.");
			aDialog.set(command, true);
		}
		//너  입력하려고?
		else if("입력".equals(command)) {
			aDialog.set(command, true);
		}
		//너 수정할거니?
		else if("수정".equals(command)) {
			aDialog.set(command, true);
		}
		//너 삭제할래?
	}
}









