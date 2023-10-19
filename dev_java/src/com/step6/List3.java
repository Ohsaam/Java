package com.step6;

import java.util.ArrayList;
import java.util.List;


class Kiwi{
	String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Tomato{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class List3 {
	List<String> bread = new ArrayList<>();
	List<Kiwi> kiwis = new ArrayList<>();
	List<Tomato> tomatos = new ArrayList<>();
	
	void methodA()
	{
		bread.add("소보로");
		System.out.println(bread.get(0));
		
		Kiwi kiwi = new Kiwi();
		kiwi.name = "골드키위";
		kiwis.add(kiwi);
		kiwi = kiwis.get(0);
		System.out.println(kiwi.getName());
		
		//System.out.println();
		
		Tomato tomato = new Tomato();
		tomato.name = "안녕";
		tomatos.add(tomato);
		tomato = tomatos.get(0);
		System.out.println(tomato.getName());
	}
	
	void methodB()
	{
		int i = 0;
		Kiwi kiwi = null;
		while(true)
		{
			/*
			 * 왜 무한루프인가? -> i가 1로 계속 초기화 되기 때문이다. ---> 이 부분에 대한 학습이 필요함
			 * 
			 */
			
			kiwi = new Kiwi();
			System.out.println(kiwi); // 여기서 주소번지가 달라진다는걸 알아야된다.
			i++;
			if(i == 5)
			{
				
				break;
			}
		}
	}
	public static void main(String[] args) {
		List3 list3 =new List3();
		list3.methodA();
		list3.methodB();
		
		System.out.println(list3.bread.size());
		/**
		 * 전역변수에 담고 싶다면? 
		 * - 인스턴스화를 해서 List에 대한 접근을 얻고
		 * list3.bread[리스트].~~메소드
		 */
	}

}
