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
			case 1: System.out.println("digite el valor 1 del arreglo");
			              arregloA[0][0]=sc.nextInt();
			              System.out.println("digite el valor 2 del arreglo");
			              arregloA[0][1]=sc.nextInt();
			              System.out.println("digite el valor 3 del arreglo");
			              arregloA[0][2]=sc.nextInt();
			              System.out.println("digite el valor 4 del arreglo");
			              arregloA[1][1]=sc.nextInt();
			              System.out.println("digite el valor 5 del arreglo");
			              arregloA[1][2]=sc.nextInt();
			              System.out.println("digite el valor 6 del arreglo");
			              arregloA[1][3]=sc.nextInt();
			              System.out.println("digite el valor 7 del arreglo");
			              arregloA[2][1]=sc.nextInt();
			              System.out.println("digite el valor 8 del arreglo");
			              arregloA[2][2]=sc.nextInt();
			              System.out.println("digite el valor 9 del arreglo");
			              arregloA[3][2]=sc.nextInt();
			              break;
			              
			case 2:    System.out.println("digite el valor 1 del arreglo");
            arregloB[0][0]=sc.nextInt();
            System.out.println("digite el valor 2 del arreglo");
            arregloB[0][1]=sc.nextInt();
            System.out.println("digite el valor 3 del arreglo");
            arregloB[0][2]=sc.nextInt();
            System.out.println("digite el valor 4 del arreglo");
            arregloB[1][1]=sc.nextInt();
            System.out.println("digite el valor 5 del arreglo");
            arregloB[1][2]=sc.nextInt();
            System.out.println("digite el valor 6 del arreglo");
            arregloB[1][3]=sc.nextInt();
            System.out.println("digite el valor 7 del arreglo");
            arregloB[2][1]=sc.nextInt();
            System.out.println("digite el valor 8 del arreglo");
            arregloB[2][2]=sc.nextInt();
            System.out.println("digite el valor 9 del arreglo");
            arregloB[3][2]=sc.nextInt();
            break;
            
            
			}
			
			
			
		}while(opc != 5);
		
		
	}
	
	
	
	

}
