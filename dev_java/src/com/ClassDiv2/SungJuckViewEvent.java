package com.ClassDiv2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SungJuckViewEvent implements ActionListener{
	
	SungJukViewUI svu = null;
	
	
	
	public SungJuckViewEvent(SungJukViewUI sungJukViewUI) {
		
		this.svu = sungJukViewUI;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		//이벤트가 발생한 컴포넌트의 주소번지 가져오기 - 어떤 버튼을 눌렀나?
		Object obj = ae.getSource();
		

	if(obj==svu.jbt_process)
	{
		//p_num=dtm.getRowCount();     //계산할때 인원수는 현재 테이블의 행 숫자이므로
		svu.sjl.calcTable();
	}
	
	
	else if(obj==svu.jbt_add)
	{
		String input[] = new String[svu.col.length];    //사용자값 저장할 배열 선언, col배열길이만큼
		input[0]=svu.jt_name.getText();       //이름 input[0]에 저장
		input[1]=svu.jt_oracle.getText();      //오라클점수
		input[2]=svu.jt_java.getText();        //자바점수
		input[3]=svu.jt_html.getText();      //html점수
		
		svu.dtm.addRow(input);
		
		 //입력값 저장 하고 나서 텍스트입력 칸 다시 초기화 해두기
		svu.jt_name.setText("");                 
		svu.jt_oracle.setText("");
		svu.jt_java.setText("");
		svu.jt_html.setText("");
		
		
	}
	
	else if(obj==svu.jbt_selectDelRow)
	{	//테이블 선택했을때 .getSelectedRow() 메소드 값은 그 행의 값이 나오고
		//아무것도 선택 안되어잇을때는 -1을 전달함.
		if(svu.table.getSelectedRow()==-1) //-1일때(아무것도 선택되지 않았을때
		{										 //if문 탈출할때 return;을 사용함	
			return;                            //따라서 삭제 버튼 눌렀을때 아무일도 일어나지 않는다.
			                                    
		}
		else                                    //행이 선택되어있을때
		{
			svu.dtm.removeRow(svu.table.getSelectedRow());   //선택된 행값을 가져와서 삭제메소드실행
		}
			
	}
	else if(obj==svu.jbt_clear)               //전체 삭제
	{

		for(int i = svu.dtm.getRowCount(); i>0; i--)          //행갯수만큼 삭제메소드 반복실행
		{
			svu.dtm.removeRow(0);
		}
		
	}
		
	else if(obj==svu.jbt_exit)
	{
			System.exit(0); //자바 가상머신과 연결이 끊김
    }
}

}
