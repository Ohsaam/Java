package com.CollectionFrameWork;

import java.util.ArrayList;

public class TestList {
	public static void main(String[] args) {
		String str1 = null;
		String str2 = null;
		String str3 = null;
		ArrayList fruits = new ArrayList();
		
		fruits.add(0,"d");
		fruits.add(1,"w"); 
		
		str1 = (String)fruits.get(0);
		str2 = (String)fruits.get(1);
		
		str3 = (String)fruits.remove(1);
		System.out.println(str3);
	
	}}