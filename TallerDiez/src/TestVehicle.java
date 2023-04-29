
public class TestVehicle {
public static void main(String[] args) {
	Vehicle uno = new Vehicle("Vision");
	System.out.println("Manufacturer: " + uno.make);
	System.out.println("el modelo del carro es:" + uno.getModel() );
	System.out.println("Number of vehicles manufactured:" + uno.numVehicles);
	System.out.println("The chassis number is :" + uno.getChassisNo());
	
	Vehicle dos = new Vehicle ("Edict") ;
	System.out.println("Number of vehicles manufactured:" + dos.numVehicles);
	System.out.println(dos.toString());
	System.out.println("");
	dos.SetMake("seer");
	System.out.println(uno.toString() +  dos.toString());
  Vehicle.Engine  tres = new Vehicle.Engine("fortune") ;
	System.out.println("Vehiculo de numero " + tres.getChassisNo() + " es un modelo " + tres.getModel() + 
			" y tiene una capacidad de motor " + tres.getCapacity() + "cc");
	System.out.println(Vehicle.CochesFabricados());
	
	
	
	
	
	
			
	
	

}
}

