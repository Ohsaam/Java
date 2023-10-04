package com.step2;

import java.util.Scanner;

public class total_list {

	public static void main(String[] args) {
		
		total_list a = new total_list();
		
		String[] name = new String[5]; // 선언 -> 참조 x 
		int[] age = new int[5];
		int[] Math = new int[10]; // 이 부분은 배열을 통해 총점을 입력 할 것.
		 double[] mathAverages = new double[5];

		a.User_input_age(age); // 이 부분을 통해서--> 사용자로 입력을 받으려고 했음 
		a.User_input_name(name); // 
		
	
		for(int i = 0; i<5; i++)
		{
            a.User_total(Math); // 수학 점수 입력 및 평균 계산
            mathAverages[i] = total_list.calculateAverage(Math);
			System.out.println("당신의 이름은 : "+ name[i]+ "당신의 나이는"+age[i] + "입니다. " +  "당신의 수학 평균은 : " + mathAverages[i]+ "입니다.");
			
		}
		

	}
	
	

	
	public String[] User_input_name(String[] name) //
	{
		Scanner sc = new Scanner(System.in);
		int size = name.length;
		
		for(int i = 0; i<size; i++)
		{
			System.out.print("당신의 이름을 입력하세요 : ");
			name[i] = sc.next();
		}
		return name;
	}
	
	
	
	
	public int[] User_input_age(int[] age)
	{
		
		int[] age1 = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<5; i++)
		{
		
			System.out.print("당신의 나이를 입력하세요 : " );
			age[i] = sc.nextInt();
		}
		
		return age1;

	}
	
	public void User_total(int[] Math)
	{
        int[] MathScore = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("당신의 수학 점수를 입력하세요 : ");
            MathScore[i] = sc.nextInt();
        
      }
        double mathAverage = total_list.calculateAverage(MathScore);
        
        for (int i = 0; i < 5; i++) {
            Math[i] = (int) mathAverage; // 소수점 이하는 버림
        }
        
	}
        
	
	
	public static double calculateAverage(int[] scores)
	{	

		int total = 0;
		
		for (int score : scores)
		{
			total += score;
		}
		
		return (double)total/scores.length;
	}
	

}
