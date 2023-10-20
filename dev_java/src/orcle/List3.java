package orcle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List3 {
	void methodA(List<BookVO> bookList) {
		// 사용권 -  나신입 - 로그인 - 권한
		//bookList.size()=0
		System.out.println(bookList);
		BookVO rbVO = bookList.get(0);
		System.out.println((Integer)rbVO.getB_price() instanceof Integer);
		System.out.println("10"+10);//1010 -> 20
		//CastingException, NumberFormatException,....
		System.out.println(rbVO.getB_price()*5);
	}
	void methodB(List<Map<String,Object>> bookList) {
		//bookList.size()=0
		System.out.println(bookList);
		Map<String,Object> rmap = bookList.get(0);
		System.out.println(rmap.get("b_price") instanceof Integer);
		System.out.println(rmap.get("b_price") instanceof String);
		System.out.println(rmap.get("b_price") instanceof Object);
		System.out.println(rmap.get("b_price")*5);
	}
	public static void main(String[] args) {
		List3 list2 = new List3();
		List<BookVO> bookList = new ArrayList<>();
		BookVO bVO = new BookVO();//b_no, b_title, b_author, b_price - private - thread가 관리함 List<ChatServerThread>
		//bVO.getB_no()0 bVO.getB_title()"" bVO.getB_author()null bVO.getB_price()0
		bVO.setB_no(1);
		bVO.setB_title("자바의정석");
		bVO.setB_author("남궁성");
		bVO.setB_price(30000);
		//뭐가 담겼지? BookVO주소번지가 하나 담겼다. BookVO 안에는 변수가 4개 선언되어 있다.
		//4개중에서 2개는 int 2개 는  String  - 관찰하기
		bookList.add(bVO);//bookList.size()=1 - 뭐가 하나지?
		List<Map<String,Object>> bookMap = new ArrayList<>();
		//bookMap.add(bVO);//제네릭 타입이 달라서 컴파일 에러 발생함
		Map<String,Object> map = new HashMap<>();
		map.put("b_no", 1);
		map.put("b_title","자바의정석");
		map.put("b_author", "남궁성");
		map.put("b_price",30000);
		bookMap.add(map);//빈깡통이다.
		list2.methodA(bookList);
		list2.methodB(bookMap);
	}

}
