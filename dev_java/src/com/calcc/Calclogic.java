package com.calcc;

public class Calclogic {
	SungJukView sv = null; // NullPointException 방지
	public Calclogic(SungJukView sv)
	{
		this.sv = sv;
	}

	 public void calcTable() {
		    // 총점 구하기
		    int total[] = new int[sv.dtm.getRowCount()];
		    for (int i = 0; i < total.length; i++) {
		      for (int j = 1; j <= 3; j++) {
		        System.out.println(total[i]);
		        total[i] += Integer.parseInt(sv.table.getValueAt(i, j).toString());
		      }
		      sv.table.setValueAt(total[i], i, 4);
		    }
		 
		    // 평균 구하기
		    double avg[] = new double[sv.dtm.getRowCount()];
		    for (int i = 0; i < avg.length; i++) {
		      avg[i] = (total[i] / 3.0);
		      sv.table.setValueAt(String.format("%.4f", avg[i]), i, 5);
		      
		      if (90<avg[i])
		      {
		    	  String hint ="A+";
		    	  sv.table.setValueAt(String.format("%s", hint), i, 6);
		    			  
		      }
		      else if(85<avg[i] && avg[i] <= 90)
		      {
		    	  String hint ="A";
		    	  sv.table.setValueAt(String.format("%s", hint), i, 6);
		      }
		      
		      else if (75<avg[i] && avg[i]<=85)
		      {
		    	  String hint ="B+";
		    	  sv.table.setValueAt(String.format("%s", hint), i, 6);
		      }
		      else if (65<avg[i] && avg[i]<=75)
		      {
		    	  String hint ="C+";
		    	  sv.table.setValueAt(String.format("%s", hint), i, 6);
		      }
		      
		      else if (55<avg[i] && avg[i]<=65)
		      {
		    	  String hint ="C";
		    	  sv.table.setValueAt(String.format("%s", hint), i, 6);
		      }
		      
		      else
		      {
		    	  String hint ="F";
		    	  sv.table.setValueAt(String.format("%s", hint), i, 6);
		      }
		    }
		 // 학점 구하기
		    /*
		     * 평균을 구해서 -> 90< x --> A+
		     * 85<x<=90 --> A
		     * 75<x<= 85 --> B+
		     * 65 < x <=75 ---> C+
		     * 55 < x <=65 ----> C
		     * else -->F
		     */
		    
		    
		    
		    // 석차 구하기
		    int rank[] = new int[sv.dtm.getRowCount()];
		    for (int i = 0; i < rank.length; i++) {
		      rank[i] = 1;
		      for (int j = 0; j < rank.length; j++) {
		        if (avg[i] < avg[j]) {
		          rank[i] += 1;
		        }
		      }
		      sv.table.setValueAt(rank[i], i, 7);
		    }
		    
		    
		    
		  }
		 

	
}
