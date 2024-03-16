class B{
	void meth3(int a, int b){
		System.out.println(a*b);
		
	}
	void meth4(int c, int d){
		System.out.println(c+d);
	}
}

public class overloading {
public static void main(String[] args) {
	B b = new B();
	b.meth3(12, 12);
	b.meth4(212, 222);
}
}
