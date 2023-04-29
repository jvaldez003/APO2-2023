
public class Vehicle {
public static String make= " Augur";
public static int  numVehicles=0;
private String chassisNo;
private String model;
private String capacity;


public Vehicle(String model) {
	numVehicles++;
	chassisNo= "ch" + numVehicles;
	this.model=model;
	System.out.println("vehiculo fabricado");
	
}

public static class  Engine extends Vehicle{

	private static String make="Predicter";
	private static int capacity=1600;
	
	public Engine(String model) {
		super(model);
		// TODO Auto-generated constructor stub
	}
	
	public static String getMake() {
		return make;
	}
	public static int getCapacity() {
		return capacity;
	}
	
}

public void setChassisNo(String chassisNo ) {
	this.chassisNo=chassisNo;
}
public void setModel(String model) {
	this.model=model;
}

public String getChassisNo() {
	return chassisNo;
}

public String getModel() {
	return model;
}

@Override
public String toString() {
	return " Vehiculo Chevrolet " +  model + " numero de chasis: " +  chassisNo ;
			
}

public void SetcochesFabricados(int cochesFabricados) {
	cochesFabricados=numVehicles;
}

public static String CochesFabricados() {
	
	return "la cantidad de coches fabricados es:" + numVehicles;
}

public void SetMake(String make) {
	
	this.make=make;
	// TODO Auto-generated method stub
	
}








}
