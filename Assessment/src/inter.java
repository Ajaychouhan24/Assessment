interface G{
	void meth9(int a, int b);
}
class H implements G{

	
	public void meth9(int a, int b) {
		System.out.println(a/b);
		
	}
	
}

public class inter {
	public static void main(String[] args) {
		H h = new H();
		h.meth9(20, 2);
		
	}

}
