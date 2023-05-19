import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
	int numInventario=9;
	
	// int inventario[]= new int [ numInventario];

	int opc;
	Scanner sc = new Scanner (System.in);
	 boolean terminado = false;

     while (!terminado) {
         System.out.println("1. Naves creadas");
         System.out.println("2. Buscar una nave");
         System.out.println("3. Salir");
         System.out.print("Seleccione una opción: ");
         opc = sc.nextInt();
         switch(opc) {
         case 1:  
         System.out.println("Seleccione el tipo de nave:");
         System.out.println("1. Lanzadera");
         System.out.println("2. tripulada");
         System.out.println("3. No tripulada");
         System.out.print("Seleccione una opción: ");
         int opc1 = sc.nextInt();
         switch(opc1) {
         
         case 1: 	
        	 Lanzadera[] inventarioLanzaderas= new Lanzadera [3];
        	 inventarioLanzaderas [0] = new 	Lanzadera("SaturnoV", 2900, 118, 32000, 3500);
         System.out.println( " las naves lanzadera creadas son " + inventarioLanzaderas [0].crearNave());
         inventarioLanzaderas [1] = new 	Lanzadera("Falcon IX", 3900, 128, 38000, 4000);
         System.out.println( " las naves lanzadera creadas son " + inventarioLanzaderas [1].crearNave());
         inventarioLanzaderas [2] = new 	Lanzadera("Delta IV", 4900, 218, 45000, 5000);
         System.out.println( " las naves lanzadera creadas son " + inventarioLanzaderas [2].crearNave());
        break;
        
         case 2:
        	 Tripuladas [] inventarioTripuladas= new Tripuladas [3];
        	 inventarioTripuladas [0] = new 	Tripuladas("Apolo", 400, 3 , 628, 5000);
             System.out.println( " las naves Tripuladas creadas son " +  inventarioTripuladas [0].crearNave());
             inventarioTripuladas [1] = new 	Tripuladas("Skylab", 77, 4, 318, 5000);
             System.out.println( " las naves tripuladas creadas son " + inventarioTripuladas [1].crearNave());
             inventarioTripuladas [2] = new 	Tripuladas("Salyut", 420, 7, 520, 6000);
             System.out.println( " las naves tripuladas creadas son " + inventarioTripuladas [2].crearNave());
        	  break;
        	  
         case 3: 
        	 NoTripuladas [] inventarioNoTripuladas= new NoTripuladas [3];
        	 inventarioNoTripuladas [0] = new 	NoTripuladas("Pionero XI", 258, 300, 26, 2500);
             System.out.println( " las naves NoTripuladas creadas son " + inventarioNoTripuladas [0].crearNave());
             inventarioNoTripuladas [1] = new 	NoTripuladas("Mariner IV", 400, 250, 22, 30000);
             System.out.println( " las naves Notripuladas creadas son " + inventarioNoTripuladas [1].crearNave());
             inventarioNoTripuladas [2] = new 	NoTripuladas("Venera IX", 500, 100, 35, 40000);
             System.out.println( " las naves Notripuladas creadas son " +   inventarioNoTripuladas [2].crearNave() );
        	  
         default: System.out.println("opcion invalida, escoga nuevamente ");
			
         }
         
         case 2: 
        	
         
         
         

         }
}
     
    // Nave [] inventario= new Nave [ numInventario];
     
    // inventario [0] = new 	Lanzadera("SaturnoV", 2900, 118, 32000, 3500);
    // inventario [1] = new 	Lanzadera("Falcon IX", 3900, 128, 38000, 4000);
     //inventario [2] = new 	Lanzadera("Delta IV", 4900, 218, 45000, 5000);
     //inventario [3] = new 	Tripuladas("Apolo", 400, 3 , 628, 5000);
     //inventario [4] = new 	Tripuladas("Skylab", 77, 4, 318, 5000);
     //inventario [5] = new 	Tripuladas("Salyut", 420, 7, 520, 6000);
     //inventario [6] = new 	NoTripuladas("Pionero XI", 258, 300, 26, 2500);
     //inventario [7] = new 	NoTripuladas("Mariner IV", 400, 250, 22, 30000);
     //inventario [8] = new 	NoTripuladas("Venera IX", 500, 100, 35, 40000);
     
     
}
}