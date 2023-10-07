package com.GraphicEditor.step2;

public class GraphicEditor {
	private static final int ARRAY_LENGTH = 5;
	public static void main(String[] args) {
		Rectangle[] rc = new Rectangle[ARRAY_LENGTH];
		Ellipse[] ep = new Ellipse[ARRAY_LENGTH];
		Line[] li = new Line[ARRAY_LENGTH];
		
		for(int i = 0; i<ARRAY_LENGTH; i++)
		{
			int randomNumber = (int)(Math.random() * 3);
			if( randomNumber == 0)
			{
				rc[i] = new Rectangle();
			}
			else if(randomNumber == 1)
			{
				ep[i] = new Ellipse();
			}
			
			else
			{
				li[i] = new Line();
			}
		}
		
		for(int j = 0; j<ARRAY_LENGTH; j++)
		{
			if(rc[j] != null)
			{
				rc[j].drawRectangle();
			}
			
			else if(ep[j] != null )
			{
				ep[j].drawEllipse();
			}
			else
			{
				li[j].drawLine();
				
			}
		}
		
	}

}
