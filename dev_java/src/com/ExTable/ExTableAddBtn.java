package com.ExTable;

import java.awt.Component;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
 
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;


import java.awt.Component;
import java.util.Vector;
 
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
 
@SuppressWarnings("serial")
public class ExTableAddBtn extends JFrame {
    
    private Object[] objColNms = new Object[] { "이름", "출근","퇴근", "출근버튼","퇴근버튼" };
    private Object[][] datas = null;
    public static void main(String[] args) {
        new ExTableAddBtn();
    }
 
    private JFrame jf;
    private DefaultTableModel dtm;
    private JTable jtable;
    
    private JScrollPane jsp;
 
    public ExTableAddBtn() {
        jf = new JFrame("JTable Add Delete Button");
        jf.setLocationRelativeTo(null);
        jf.setSize(300, 300);
        datas = new Object[][]{ 
	        				{ "나신입", "08:59:00", "17:00:00",null,null }
	        			  , { "나일등", "08:57:00", "17:00:00",null,null }
	        			  , { "나초보", "08:55:00", "17:00:00",null,null} 
        			  };
        dtm = new DefaultTableModel(datas,objColNms);
        jtable = new JTable(dtm);
        jsp = new JScrollPane(jtable);
        
        
        jtable.getColumnModel().getColumn(3).setCellRenderer(new TableCell());
        TableCell editor = new TableCell();
        editor.setTableModel(dtm);
        jtable.getColumnModel().getColumn(3).setCellEditor(editor);
        
        
        jtable.getColumnModel().getColumn(4).setCellRenderer(new TableCell());
        editor = new TableCell();
        editor.setTableModel(dtm); // 객체를 재정의하여 새로운 객체를 넘겨준다.
        jtable.getColumnModel().getColumn(4).setCellEditor(editor);

        jf.add(jsp);

        jf.setVisible(true);
    }
 
 
    class TableCell extends AbstractCellEditor implements TableCellEditor, TableCellRenderer {
        JButton jb;
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String currentTime;
        private DefaultTableModel dtm;
        JButton jb2;
        
        public TableCell() {
            jb = new JButton("출근버튼");
            jb2 = new JButton("퇴근버튼"); 
/* 버튼을 2개로 설정되어 있고  if 문으로 --> 조건 분기를 진행한다.
 * 현재의 시간  Date객체를 기준으로 해서 currentTime 변수에 값을 넣는다.
 */
            jb.addActionListener(e -> { // 람다식
                int row = jtable.getSelectedRow();
  // jtable.getSelectedRow()를 사용하여 현재 선택된 행의 인덱스를 가져온다.
                if (row != -1) {
                    currentTime = dateFormat.format(new Date(System.currentTimeMillis()));
                    dtm.setValueAt(currentTime, row, 1);
                    /*
                     * dateFormat을 사용하여 HH:mm:ss 형식으로 포맷하고 
                     * dtm.setValueAt(currentTime, row, 1)을 통해
                     *  해당 행의 두 번째 열(인덱스 1)에 출근 시간을 설정한다.
                     */
                    
                } // 중괄호 누락 수정
            });
            
            jb2.addActionListener(e -> { // 퇴근버튼의 액션 리스너
                int row = jtable.getSelectedRow();
                if (row != -1) {
                    currentTime = dateFormat.format(new Date(System.currentTimeMillis()));
                    dtm.setValueAt(currentTime, row, 2); // 퇴근시간 열(인덱스 2)에 시간 설정
                }
            });

        	
        }
 
        @Override
        public Object getCellEditorValue() {
            return null;
        }
 
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
                int row, int column) {
        	
        	if(column == 3)
        	{
        		return jb;
        	}
        	else if(column == 4)
        	{
        		return jb2;
        	}
            return null;
        }
 
        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row,
                int column) {
            if (column == 3) {
                return jb;
            } else if (column == 4) {
                return jb2;
            }
            return null;
        }
        public void setTableModel(DefaultTableModel dtm) {
            this.dtm = dtm;
    } // end class TableCell extends AbstractCellEditor implements TableCellEditor,
        // TableCellRenderer
    
    }
}