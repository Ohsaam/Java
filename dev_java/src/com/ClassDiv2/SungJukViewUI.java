package com.ClassDiv2;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SungJukViewUI {

	
	String col[] = { "이름", "오라클", "자바", "HTML", "총점", "평균", "학점", "석차" }; 
	int p_num = 0; 
	DefaultTableModel dtm;
	JTable table; 
	JScrollPane jsp;
	JFrame jf_sungjuk = new JFrame();
	JPanel jp_center = new JPanel();
	JPanel jp_north = new JPanel();
	JPanel jp_south = new JPanel();
	JButton jbt_clear = new JButton("전체 삭제");
	JButton jbt_selectDelRow = new JButton("선택 삭제");
	JButton jbt_add = new JButton("추가");
	JTextField jt_name = new JTextField(6);
	JTextField jt_oracle = new JTextField(6);
	JTextField jt_java = new JTextField(6);
	JTextField jt_html = new JTextField(6);
	JTextField total = new JTextField(6);
	JTextField avg = new JTextField(6);
	JTextField grade = new JTextField(6);
	JTextField rank = new JTextField(6);
	JButton jbt_process = new JButton("점수계산");
	JButton jbt_exit = new JButton("종료");
	SungJuckLogic sjl = new SungJuckLogic(this);
	SungJuckViewEvent sjve = new SungJuckViewEvent(this);
	
public void initDisplay() {
		
		
		
		System.out.println("initDisplay 호출성공");

		jp_center.setLayout(new BorderLayout(0, 20));

		
		jbt_clear.addActionListener(sjve);
		jbt_selectDelRow.addActionListener(sjve); 
		jbt_process.addActionListener(sjve); 
		jbt_add.addActionListener(sjve);
		jbt_exit.addActionListener(sjve); 


		jp_north.add(jbt_selectDelRow);
		jp_north.add(jbt_clear);
		
		//텍스트 창 붙이기
		jp_south.add(jt_name);
		jp_south.add(jt_oracle);
		jp_south.add(jt_java);
		jp_south.add(jt_html);
		
		//텍스트 입력창 초기화 부분		
		jt_name.setText("");                 
		jt_oracle.setText("");           
		jt_java.setText("");
		jt_html.setText("");
		
		//동작 버튼 붙이기
		jp_south.add(jbt_add);
		jp_south.add(jbt_process);
		jp_south.add(jbt_exit);
		
		dtm = new DefaultTableModel(col,0);            
		table= new JTable(dtm);	                                    
		jsp=new JScrollPane(table);									
	    jp_center.add("Center",jsp);
	    jp_center.validate();
				
		jf_sungjuk.setBackground(new Color(214, 211, 206));

		// 속지 두 장을 JFrame에 붙이기
		jf_sungjuk.add("Center", jp_center);
		jf_sungjuk.add("South", jp_south);
		jf_sungjuk.add("North", jp_north);
		jf_sungjuk.setSize(600, 400);

		jf_sungjuk.setTitle("성적처리");// 메소드 구현할 때에는 타입이 오고 호출할 때에는 타입을 쓰지 않는다.
		jf_sungjuk.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		SungJukViewUI sju = new SungJukViewUI();
		sju.initDisplay();
	}
	
}
