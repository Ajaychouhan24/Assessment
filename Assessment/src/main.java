class EMP{

	String Name = "Ajay";
	int id = 1;
	int sal = 200000;
	String Address = "Mumbai Maharashtra";
	
	@Override
	public String toString() {
		return "EMP [Name=" + Name + ", id=" + id + ", sal=" + sal + ", Address=" + Address + "]";
	}
	
	
	} 
	
	

public class main {
	public static void main(String[] args) {
		EMP e = new EMP();
		System.out.println(e.Address);
		System.out.println(e.id);
		System.out.println(e.Name);
		System.out.println(e.sal);
	}
	

}
