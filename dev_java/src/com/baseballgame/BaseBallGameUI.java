package com.baseballgame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BaseBallGameUI {
	JFrame jf = new JFrame();
	String 		imgPath = "D:\\workspace_java\\dev_java\\src\\com\\week2\\";
	Image img = null;
	JMenuBar 	jmb 		= new JMenuBar();
	JMenu	 	jm_game 	= new JMenu("게임");
	JMenuItem   jmi_user 	= new JMenuItem("회원가입");
	JMenuItem   jmi_new 	= new JMenuItem("새게임");
	JMenuItem   jmi_dap 	= new JMenuItem("정답");
	JMenuItem   jmi_clear 	= new JMenuItem("지우기");
	JMenuItem   jmi_exit 	= new JMenuItem("나가기");
	JMenu	 	jm_info 	= new JMenu("도움말");
	JMenuItem   jmi_detail 	= new JMenuItem("야구숫자게임이란?");
	JMenuItem   jmi_create 	= new JMenuItem("만든사람들");
	JPanel jp_center = new JPanel();
	JTextArea jta_display = null;
	JScrollPane jsp_display = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	JTextField jtf_user   = new JTextField();
	Font f = new Font("Thoma",Font.BOLD,14);
	JPanel jp_east   = new JPanel();
	JButton jbtn_new 	= new JButton("새게임");
	JButton jbtn_dap 	= new JButton("정답");
	JButton jbtn_clear 	= new JButton("지우기");
	JButton jbtn_exit 	= new JButton("나가기");	
	
    BaseBallLogic gameLogic;
    BaseBallGameEvent gameEvent;

    public void setGameLogic(BaseBallLogic gameLogic) {
        this.gameLogic = gameLogic;
    }

    public void setGameEvent(BaseBallGameEvent gameEvent) {
        this.gameEvent = gameEvent;
    }
    
	BaseBallGameUI(){
		 gameLogic = new BaseBallLogic(this);
	     gameEvent = new BaseBallGameEvent(this, gameLogic);
	     gameLogic.ranCom();
	}
	public void initDisplay() {
		jta_display = new JTextArea();
		jsp_display = new JScrollPane(jta_display);
		jta_display.setOpaque(false);
		jf.setResizable(false);
		jm_game.add(jmi_user);
		jm_game.add(jmi_new);
		jm_game.add(jmi_dap);
		jm_game.add(jmi_clear);
		jm_game.add(jmi_exit);
		jm_info.add(jmi_detail);
		jm_info.add(jmi_create);
		jmb.add(jm_game);
		jmb.add(jm_info);
		System.out.println("initDisplay 호출 성공");
		jtf_user.addActionListener(gameEvent);
		jbtn_new.addActionListener(gameEvent);
		jbtn_dap.addActionListener(gameEvent);
		jbtn_clear.addActionListener(gameEvent);
		jbtn_exit.addActionListener(gameEvent);
		
		jmi_exit.addActionListener(gameEvent);
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
	

}
