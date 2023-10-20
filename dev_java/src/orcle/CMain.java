package orcle;

class C{
	int i;
	C(C1 c1){
		System.out.println("C : "+c1);
	}
}
class C1{
	//여기서 쓰고 싶다
	C c = new C(this);
	C1(){
		System.out.println("C1 : "+this);
	}
}
public class CMain {

	public static void main(String[] args) {
		 C1 c = new C1();
		 CMain cmain = new CMain();
		 System.out.println("CMain : " + c);
		 System.out.println(cmain);

	}

}