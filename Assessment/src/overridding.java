class C{
	void meth5(int a , int c){
		System.out.println(a+c);
		
	}
	void meth6(int b , int d){
		System.out.println(b*d);
	}
}
class D extends C{
	
	
}
public class overridding {
public static void main(String[] args) {
	D d = new D();
	d.meth5(12, 22);
	d.meth6(12, 22);
	
}
}
