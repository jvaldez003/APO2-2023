
public class Person {

	String nombre;
	int edad;
	
	public Person(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
		
	}
	
	public String getName() {
		return nombre;
	}
	
	public int getAge() {
		return edad;
		
	}
	public void setAge(int newAge) {
		
		edad=newAge;
	}
	
}
