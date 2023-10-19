package orcle;

import java.util.HashMap;
import java.util.Map;
class book // Map은 Row를 담는거다? Col를 담는건가?
/**
 * 맵은 한 개의 로우만 담을 수 있다. + 여러개의 로우를 담지 못한다.
 * 
 */
{
	}

public class Map1 {
	Map<String,Object> map = null;
	// 전변 map에 대해서 초기화 해 보시오 - insert here
	void methodA()
	{
		map = new HashMap<String,Object>(); 
		//insert here
		map.put("b_title", "자바의 정석");
		map.put("b_author", "남궁성");
		map.put("b_price", 30000);
	}
	
	void methodB(Map<String, Object> pmap)
	{
		System.out.println(map.get("b_title"));
		System.out.println(map.get("b_author"));
		System.out.println(map.get("b_price"));
	}
	
	Map<String,Object> methodC(Map<String,Object>pmap)
	{
		Map<String,Object>rmap = null;
		return rmap;
	}
	public static void main(String[] args) {
		Map1 m1 = new Map1();
		m1.methodA(); // 여기서 전변에 값이 들어감 
		m1.methodB(m1.map); 
		/**
		 *  만약에 저기서 m1.methodA()을 // 주석처리 하면 NullPointException 발생
		 */

	}

}
