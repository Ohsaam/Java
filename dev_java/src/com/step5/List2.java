package com.step5;

import java.util.List;
import java.util.Vector;

class Customer extends Thread
{
	
	}


public class List2 {
	
	List<Customer> list = new Vector<>();
	void methodA()
	{
		Customer cu = new Customer();
		list.add(cu); // list.size() = 1
		System.out.println(list.size()); // 0 -> 1로 증가된 상태
		Customer cu2 = new Customer();
		list.add(cu2); // list.size() = 2
		System.out.println(list.size());
		Customer cu3 = new Customer();
		list.add(cu3);
		System.out.println(list.size());
		/*
		 * 이 코드가 왜 틀린것인가?
		 * 여기서 this는 List2를 의미햔다. 
		 * 
		 */
	}
	
	
	public static void main(String[] args) {
		
		List2 list2 = new List2();
		list2.methodA();
		
	}
}
