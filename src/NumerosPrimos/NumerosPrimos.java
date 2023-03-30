package NumerosPrimos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {

		List LogDeOperaciones = new ArrayList();
        Scanner lecturaDeTeclado = new Scanner(System.in);
        boolean banderaDelMenu=true;
        while(banderaDelMenu==true) {
        	System.out.println("______________________________________________ ");
            System.out.println("1-Calcular numeros primos: ");
            System.out.println("2-Mostrar Log: ");
            System.out.println("3-Mostrar Log por nombre: ");
            int opcionIngresada=lecturaDeTeclado.nextInt();
            switch(opcionIngresada) {
            case 1:
                System.out.println("Escriba su nombre: ");
                lecturaDeTeclado.nextLine();
                String nombreIngresado = lecturaDeTeclado.nextLine();
                
                boolean resultadoDeBusqueda=false;
                for(int i = 0; i < LogDeOperaciones.size(); i++) {
                	if(nombreIngresado==LogDeOperaciones.get(i)){
                		resultadoDeBusqueda=true;
                	}
                    System.out.println(LogDeOperaciones.get(i));
                }                
                
                System.out.println("Ingresa un numero> ");
                //lecturaDeTeclado.nextLine();
                int numeroIngresado = lecturaDeTeclado.nextInt();
                int iteradorFacoresPrimos=2,ContadorDeFactore=0;
                
                if(resultadoDeBusqueda==false) {
                	LogDeOperaciones.add(nombreIngresado+", Numero ingresado: "+numeroIngresado);
                }
                if(resultadoDeBusqueda==true) {
                	LogDeOperaciones.add(nombreIngresado+", Numero ingresado: "+numeroIngresado);
                }
                
                System.out.println("------------------------------------------");
                System.out.println("El numero ingresado es divisible por los siguientes numeros: ");
            	//Inicia el algoritmo para calcular numeros primos
        	  	while(iteradorFacoresPrimos<=numeroIngresado)
        	  	{
        	    	if((numeroIngresado%iteradorFacoresPrimos)==0)  //a%b=0, si se cumple la anidacion significa que b es factor de a.
        	    	{
        	    		System.out.println(iteradorFacoresPrimos);
        	    		numeroIngresado=numeroIngresado/iteradorFacoresPrimos;
        	    		ContadorDeFactore++;
        	    	}     
        	  		iteradorFacoresPrimos++;
        	  	}
        	  	System.out.println("------------------------------------------");
        	  	if(ContadorDeFactore>2) {
        	  		System.out.println("No es un numero primo");
        	  	}
        	  	if(ContadorDeFactore<=2) {
        	  		System.out.println("Si es un numero primo");
        	  	}
        	  	//Fin del algoritmo para calcular numeros primos
            break;
            case 2:
            	System.out.println("------------------------------------------");
            	 for(int i = 0; i < LogDeOperaciones.size(); i++) {
                     System.out.println(LogDeOperaciones.get(i));
                 }
            break;
            case 3:
                System.out.println("Escriba su nombre: ");
                lecturaDeTeclado.nextLine();
                String nombreIngresadoParaVerLog = lecturaDeTeclado.nextLine();
            	System.out.println("------------------------------------------");
            	 for(int i = 0; i < LogDeOperaciones.size(); i++) {
            		 if((LogDeOperaciones.get(i)).toString().contains(nombreIngresadoParaVerLog)) {
            			 System.out.println(LogDeOperaciones.get(i));
            		 }
                 }
            break;
            }//Fin switch
        }//Fin while	
	}//Fin void main

}
