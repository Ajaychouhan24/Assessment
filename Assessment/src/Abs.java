abstract class F{
	 abstract void meth8(int a, int b);
	
}
class E extends F{

	
	void meth8(int a, int b) {
		System.out.println(a+b);
		
		
	}


}
public class Abs {
	public static void main(String[] args) {
		E e = new E();
		e.meth8(22, 22);
		
	}

}
