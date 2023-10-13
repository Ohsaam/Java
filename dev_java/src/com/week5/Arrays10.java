package com.week5;

public class Arrays10 {
    public static void main(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[4];
        array[1] = new int[3];

        array[0][0] = 0;
        array[0][1] = 1;
        array[0][2] = 2;


        array[1][0] = 3;
        array[1][1] = 4;
        array[1][2] = 5;


      
      for(int i =0; i<array.length; i++)
      {
    	  for(int j = 0; j < array[i].length; j++)
    	  {
    		  System.out.println(array[i].length);
    		 
    	  }
      }
      
      
      

    }

}