/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
Universidad Mariano Gálvez - Boca del Monte
Tarea No. 3 - Sistemas
"Números Primos" - 

Integrantes:
Kevin Roberto Herrera Martinez 
7690-20-8093
Mireyda Johanna Siquibache Munguia
7690-20-7824
*/


package numerosprimos;

/**
 *
 * @author KevinHerrera
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NumerosPrimos {

    public static void main(String[] args) {

        List LogDeOperaciones = new ArrayList();
        ArrayList<Integer> primos = new ArrayList<>();
        Scanner lecturaDeTeclado = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm:ss z");
        boolean banderaDelMenu = true;
        while (banderaDelMenu == true) {
            System.out.println("______________________________________________ ");
            System.out.println("1-Calcular numeros primos: ");
            System.out.println("2-Mostrar Log: ");
            System.out.println("3-Mostrar Log por nombre: ");
            int opcionIngresada = lecturaDeTeclado.nextInt();
            switch (opcionIngresada) {
                case 1:
                    System.out.println("Escriba su nombre: ");
                    lecturaDeTeclado.nextLine();
                    String nombreIngresado = lecturaDeTeclado.nextLine();

                    boolean resultadoDeBusqueda = false;
                    for (int i = 0; i < LogDeOperaciones.size(); i++) {
                        if (nombreIngresado == LogDeOperaciones.get(i)) {
                            resultadoDeBusqueda = true;
                        }
                        System.out.println(LogDeOperaciones.get(i));
                    }

                    System.out.println("Ingresa un numero: ");
                    //lecturaDeTeclado.nextLine();
                    int numeroIngresado = lecturaDeTeclado.nextInt();
                    int contPrimos = 0;
                    int sumaPrimos = 0;

                    System.out.println("------------------------------------------");
                    //Inicia el algoritmo para calcular numeros primos
                    for (int i = 1; i < numeroIngresado; i++) {
                        contPrimos = 0;
                        for (int j = 1; j <= i; j++) {
                            if (i % j == 0) {
                                contPrimos++;
                            }
                        }
                        if (contPrimos == 2) {
                            //System.out.println("Primo = " + i);
                            primos.add(i);
                            sumaPrimos = sumaPrimos + i;
                        }
                    }

                    System.out.println("Los números primos son: " + primos + " y la suma es = " + sumaPrimos);
                    String date = dateFormat.format(new Date());
                    int iteradorFacoresPrimos = 2,
                     ContadorDeFactore = 0;

                    System.out.println("------------------------------------------");
                    //Fin del algoritmo para calcular numeros primos

                    if (resultadoDeBusqueda == false) {
                        LogDeOperaciones.add(nombreIngresado + ", Numero ingresado: " + numeroIngresado + ", Numeros Primos: " + primos + ", Sumatoria: " + sumaPrimos + ", fecha y hora: " + date);
                    }
                    if (resultadoDeBusqueda == true) {
                        LogDeOperaciones.add(nombreIngresado + ", Numero ingresado: " + numeroIngresado + ", Numeros Primos: " + primos + ", Sumatoria: " + sumaPrimos + ", fecha y hora: " + date);
                    }
                    
                    primos.clear();

                    break;
                case 2:
                    System.out.println("------------------------------------------");
                    for (int i = 0; i < LogDeOperaciones.size(); i++) {
                        System.out.println(LogDeOperaciones.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Escriba su nombre: ");
                    lecturaDeTeclado.nextLine();
                    String nombreIngresadoParaVerLog = lecturaDeTeclado.nextLine();
                    System.out.println("------------------------------------------");
                    for (int i = 0; i < LogDeOperaciones.size(); i++) {
                        if ((LogDeOperaciones.get(i)).toString().contains(nombreIngresadoParaVerLog)) {
                            System.out.println(LogDeOperaciones.get(i));
                        }
                    }
                    break;
            }//Fin switch
        }//Fin while	
    }//Fin void main

}
