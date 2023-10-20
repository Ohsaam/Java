package orcle;

import java.util.List;
import java.util.Map;

public class List2 {
/**
 * 이렇게 활용 되는지는 몰랐다. ->
 */
	void methodA(List<BookVO> bookList)
	{
		BookVO bVO = new BookVO(); // b_no, b_author , b_price , -- private 
		bVO.setB_title("수학의 정석");
		bVO.setB_author(null);
		System.out.println(bVO.getB_title().length());
		System.out.println(bVO.getB_author());
		System.out.println(bVO.getB_author().length());
		bVO = new BookVO();
		//System.out.println(bVO.getB_title()); // ""으로 나옴 
	}
	
	void methodB(List<Map<String,Object>> bookList)
	{
		
	}
	public static void main(String[] args) {
		List2 list2 = new List2();
		list2.methodA(null);
		/*
		 * 이 부분은 null을 넣게되면 null이 출력 될까? -> No -> 12번에서 새로 인스턴스화 해서 
		 */
		

	}

}
