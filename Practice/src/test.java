
class A {
	int a;
	int b;
	A(int a, int b){
		this.a = a;
		this.b = b;
	}
}

class B extends A{
	int c;
	B(int a, int b,int c){
		super(a,b);
		this.c = c;
	}
}

public class test{
	
	String a[] = {"Hai","Welcome", "India"};
	
	int b[] = {10,7,8,9,22};
	
	//Arrays.sort(b);

	public static void main(String[] args) {
		
		A b1 = new B(10,11,12);
		int d = b1.a+b1.b;
		System.out.println(d);
	}

}
