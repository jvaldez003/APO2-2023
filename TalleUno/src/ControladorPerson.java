
public class ControladorPerson {

	public static void main(String[] args) {
		
		Person p1= new Person("Arial", 37);
		Person p2= new Person("Josep", 15);
		
		if(p1.getAge()==p2.getAge()) {
			
			System.out.println(p1.getName()+ "tiene la misma edad que" +p2.getName());
			
		}
		
		else {
			
			System.out.println(p1.getName()+ "no tiene la misma edad que" +p2.getName());
		}
	}
}
