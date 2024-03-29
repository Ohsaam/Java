package com.GraphicEditor.step2;

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
			if(shape instanceof Rectangle)
				// 현재 shape이 참조하는 이 대상이 Rectangle 객체로 다운캐스팅 되는지 물어보는거
				// Rectangle를 참조하면 instanceof를 통해서 True를 발생시키고 그렇게 되면 downcasting이 가능하다라는얘기
			{
				/*
				 * Rectangle rc	= (Rectangle) shape;
				 * rc.draw(); --> 한줄로 바꿈 
				 */
				((Rectangle)shape).drawRectangle();
			}
			else if(shape instanceof Ellipse)
			{
				((Ellipse)shape).drawEllipse();
			}
			else if(shape instanceof Line)
			{
//				Line li = (Line)shape;
//				li.draw();
				((Line)shape).drawLine();
			}
			
		}
		
	}

}
