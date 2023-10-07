package com.GraphicEditor.step3;

public class GraphicEditor {
	private static final int ARRAY_LENGTH = 5;
	public static void main(String[] args) {
		Shape[] shapes = new Shape[ARRAY_LENGTH];
		/*
		 * 다른 객체들을 담는 배열 선언 + 상속 관계시 Up-Casting이 된다
		 * 
		 */
		
		for(int i = 0; i<ARRAY_LENGTH; i++)
		{
			int randomNumber = (int)(Math.random() * 3);
			if( randomNumber == 0)
			{
				shapes[i] = new Rectangle();
			}
			else if(randomNumber == 1)
			{
				shapes[i] = new Ellipse();
			}
			
			else
			{
				shapes[i] = new Line();
			}
		}
		
		
//		for(int j = 0; j <ARRAY_LENGTH; j++)
//		{
//			
//			if(shapes[i] instanceof Rectangle)
//		}
//		

		/*
		 * shapes에는 Rectangle + Line + Ellipse 도 들어있다.
		 */
		for(Shape shape : shapes)
		{
			shape.draw();
			/*
			 * 다형성이 구현된 부분 
			 */
			
		}
		
	}

}
