package com.MyProject.ExampleCase;



class Sonata{
	static int ji;
	String hwan;
	
//	void methodA()
//	{
//		Refernce_Important a = new Refernce_Important();
//		Sonata Sa = new Sonata();
//		
//
//		
//	}
	

}


public class Refernce_Important {

	
	Sonata Import()
	{
		
		return new Sonata();
	}
	
	Sonata Import1(Sonata ji1)
	{
		ji1 = new Sonata();
		ji1.ji  = 100;
		System.out.println(ji1.ji);
		
		return ji1; 
	}
	
//	Refernce_Important methodA()
//	{
//		return Refernce_Important();
//		
//	}
	
	public static void main(String[] args) {
		

		Refernce_Important home  = new Refernce_Important();
		Sonata sonata = new Sonata();
		
		System.out.println(Sonata.ji);
		sonata = home.Import(); // 객체가 하나 더 생성됐다.
		sonata.ji = 100;
		
		
		System.out.println(sonata.ji);
		System.out.println(sonata.hwan);
		sonata = home.Import();
		sonata.ji = 200;
		
		
		sonata.hwan = "안녕하세여";
		System.out.println(sonata.ji);
		System.out.println(sonata.hwan);
		
		

	
	}


	
}
