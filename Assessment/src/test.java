class A{
	static void meth1(int a ,int b){
		System.out.println(a+b);
	}
	void meth2(String name , int c){
		System.out.println(name +c);
		
	}
}
public class test {
	public static void main(String[] args) {
		A a = new A();
		A.meth1(12, 14);
		a.meth2("Ajay", 28);
		
	}

}
