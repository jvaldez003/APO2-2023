import java.util.Scanner;


public class Solucion {
Scanner sc = new Scanner(System.in);
	
	public void puntoSiete() {
		int promedio;
		int[] prueba;
		prueba = new int[5];
		
		for(int i=0 ; i<5 ; i++) {
			
			System.out.println("digite el resultado de la prueba #" + (i+1));
			prueba[i]=sc.nextInt();
			
		}
		promedio = prueba[0]+prueba[1]+prueba[2]+prueba[3]+prueba[4]/5;
		System.out.println("el promedio es"+ promedio);
	}
	
	public void puntoOcho() {
		
		int[][] arregloA;
		arregloA = new int[3][3];
		
		int[][] arregloB;
		arregloB = new int[3][3];
		
		int[][] arregloResultanteSuma;
		arregloResultanteSuma = new int[3][3];
		
		int[][] arregloResultanteResta;
		arregloResultanteResta = new int[3][3];
		
		int[][] arregloResultanteMultiplicacion;
		arregloResultanteMultiplicacion = new int[3][3];
		
		int opc;
		
		do {
			System.out.println("1. ingrese el arreglo A");
			System.out.println("2. ingrese el arreglo B");
			System.out.println("3. mostrar A+B");
			System.out.println("4. Mostrar A-B");
			System.out.println("5. Mostrar A*B");
			System.out.println("6. Salir");
			opc=sc.nextInt();
			
			switch(opc) {
			case 1: for(int j=0; j<3 ; j++) {
				for(int i=0; i<3 ; i++) {
					
					System.out.println("digite el valor #" + "["+(j+1)+"] ["+(i+1)+"]" + 
					"para el arreglo A");
					arregloA[j][i]=sc.nextInt();
				}
			}
			
			for(int j=0; j< arregloA.length; j++) {
				for(int i=0; i< arregloA.length; i++) {
				System.out.println("["+ arregloA[j][i] +"]");
			}
			
			}
				break;            
			case 2:    
				for(int j=0; j<3 ; j++) {
					for(int i=0; i<3 ; i++) {
						
						System.out.println("digite el valor #" + "["+(j+1)+"]["+(i+1)+"]" 
						+ "para el arreglo B");
						arregloB[j][i]=sc.nextInt();
					}
				}
				
				for(int j=0; j< arregloB.length; j++) {
					for(int i=0; i< arregloB.length; i++) {
					System.out.println("["+ arregloB[j][i] + "]");
					}
					System.out.println();
					
					}
				
				break;
				
			case 3: for(int j=0;j< arregloA.length; j++ ) {
				for(int i=0 ; i < arregloB.length; i++) {
					
					arregloResultanteSuma[j][i]= arregloA[j][i] + arregloB[j][i];
				}
			}
				
				for (int j=0; j < arregloResultanteSuma.length; j++) {
					for (int i=0; i < arregloResultanteSuma.length; i++) {
						System.out.println("["+ arregloResultanteSuma[j][i] +"]");
					}
					System.out.println();
					}
			
			break;
			
			case 4: for(int j=0;j< arregloA.length; j++ ) {
				for(int i=0 ; i < arregloB.length; i++) {
					
					arregloResultanteResta[j][i]= arregloA[j][i] - arregloB[j][i];
				}
			}
			
			for(int j=0; j< arregloResultanteResta.length; j++) {
				for(int i=0; i< arregloResultanteResta.length; i++) {
				System.out.println("["+ arregloResultanteResta[j][i] + "]");
				
			}
				System.out.println();	
			}	
				break;
				
			case 5:for(int j=0;j< arregloA.length; j++ ) {
				for(int i=0 ; i < arregloB.length; i++) {
					
					
					arregloResultanteMultiplicacion[j][i]=  arregloA[j][i]* arregloB[j][i];					
					
					
				}
			}
			
			for(int j=0; j< arregloResultanteMultiplicacion.length; j++) {
				for(int i=0; i< arregloResultanteMultiplicacion.length; i++) {
				System.out.println("["+arregloResultanteMultiplicacion[j][i] + "]");
			}
			
				System.out.println();
			}	
				break;
				
			case 6:
				System.exit(0);
				
			default: System.out.println("opcion invalida, escoga nuevamente ");
			}
			
		}while(opc <= 6);
}


	
	
}

