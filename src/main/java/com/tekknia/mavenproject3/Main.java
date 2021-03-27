/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tekknia.mavenproject3;

/**
 *
 * @author Alejandro Restrepo - Vladimir Ortega
 *Universidad de Antioquia - Técnicas de programación2021
 */
import java.util.Scanner;
public class Main {
    public static Scanner lector = new Scanner (System.in);
    ////////////////////
    public static void main (String[] args) {
        //matriz();
        sumaVector();
        //cubosNicomaco();
        //cajero();
        //factoriales();
    }
    ////////////////////-----------------------13tablaMultiplicar
    public static void matriz(){
        int numeroFilas, numeroColumnas, miMatriz[][];
        
        System.out.println("Ingrese el número de filas de la matríz: ");
        numeroFilas = Integer.parseInt(lector.nextLine());
        System.out.println("Ingrese el número de columnas de la matríz: ");
        numeroColumnas = Integer.parseInt(lector.nextLine());
        miMatriz = new int[numeroFilas][numeroColumnas];
        System.out.println("Ingrese los elementos de la matríz: ");
        for(int i=0;i<numeroFilas;i++){
            for(int j=0;j<numeroColumnas;j++){
                System.out.println("posición: [" + i + "][" + j + "]: " );
                miMatriz[i][j] = lector.nextInt();
            }
        }
        System.out.println("\nLos elementos de la matriz son: ");
        for(int i=0;i<numeroFilas;i++){
            for(int j=0;j<numeroColumnas;j++){
                System.out.println(miMatriz[i][j]);
                 
            }
            System.out.println("");
        }
    }
    ////////////////////-----------------------14sumaVector
    public static void sumaVector(){
        int suma = 0, longitud, miVector[], prome = 0;
        String vector = "";
        System.out.println("Ingrese la longitud del vector: ");
        longitud = Integer.parseInt(lector.nextLine());
        miVector = new int[longitud];
        for(int i=0;i<longitud;i++){
            System.out.println("posición: [" + i + "]: " );
            miVector[i] = lector.nextInt();
            suma = suma+miVector[i];
            prome= suma /longitud;
            //potencia = potencia + suma;//1+3+5
            //System.out.println(" Sumando: "+suma);
        }
        int mayor = miVector[0];
            
            for (int i = 1; i < longitud; i++) {
                    if (miVector[i] > mayor) {
                            mayor = miVector[i];
                    }
            }
        int menor = miVector[0];
            
            for (int i = 1; i < longitud; i++) {
                    if (miVector[i] < menor) {
                            menor = miVector[i];
                    }
            }
        //System.out.println("La potencia de " +numeroElevar+" es: "+potencia);
        
        for(int i=0;i<longitud;i++){
            vector = vector + miVector[i] + " , ";
            //System.out.println(miMatriz[i][j]);
            
        }
        System.out.println("Los elementos del vector son: "+ vector);
        System.out.println("La suma de los elementos del vector son: "+ suma);
        System.out.println("El promedio de los elementos del vector es: "+ prome);
        System.out.println("El número mayor de los elementos del vector es: "+ mayor);
        System.out.println("El número menor de los elementos del vector es: "+ menor);
    }
    ////////////////////-----------------------10CubosNicómaco
    public static void cubosNicomaco(){
        int numeroImpar = -1, numeroCubos=0;
        System.out.println("Digite cuantos primeros cubos desea calcular: ");
        numeroCubos = Integer.parseInt(lector.nextLine());
        for (int i = 1; i <= numeroCubos; i++) {
        numeroImpar = numeroImpar + 2;
        int suma = numeroImpar;
            for (int j = 2; j <= i; j++) {
            numeroImpar = numeroImpar + 2;
            suma = suma + numeroImpar;
            }
            System.out.println("El cubo de "+ i +" es: "+ suma);
        }
    }
    ////////////////////-----------------------11Cajero
    public static void cajero(){
        int monedas1Peso = 0, billetes100000 = 0, billetes50000 = 0, billetes20000 = 0,
            billetes10000 = 0, billetes5000 = 0, billetes2000 = 0, billetes1000,
            monedas500 = 0, monedas200 = 0, monedas100 = 0, monedas50 = 0;
        System.out.println("Digite la cantidad de dinero que desea retirar: ");
        monedas1Peso = Integer.parseInt(lector.nextLine());
        billetes100000 = (monedas1Peso-(monedas1Peso%100000))/100000;
        monedas1Peso = monedas1Peso%100000;
        billetes50000 = (monedas1Peso-(monedas1Peso%50000))/50000;
        monedas1Peso = monedas1Peso%50000;
        billetes20000 = (monedas1Peso-(monedas1Peso%20000))/20000;
        monedas1Peso = monedas1Peso%20000;
        billetes10000 = (monedas1Peso-(monedas1Peso%10000))/10000;
        monedas1Peso = monedas1Peso%10000;
        billetes5000 = (monedas1Peso-(monedas1Peso%5000))/5000;
        monedas1Peso = monedas1Peso%5000;
        billetes2000 = (monedas1Peso-(monedas1Peso%2000))/2000;
        monedas1Peso = monedas1Peso%2000;
        billetes1000 = (monedas1Peso-(monedas1Peso%1000))/1000;
        monedas1Peso = monedas1Peso%1000;
        monedas500 = (monedas1Peso-(monedas1Peso%500))/500;
        monedas1Peso = monedas1Peso%500;
        monedas200 = (monedas1Peso-(monedas1Peso%200))/200;
        monedas1Peso = monedas1Peso%200;
        monedas100 = (monedas1Peso-(monedas1Peso%100))/100;
        monedas1Peso = monedas1Peso%100;
        monedas50 = (monedas1Peso-(monedas1Peso%50))/50;
        monedas1Peso = monedas1Peso%50;
        //impresión de variables
        System.out.println("Cantidad de billetes de 100.000: "+ billetes100000);
        System.out.println("Cantidad de billetes de 50.000: "+ billetes50000);
        System.out.println("Cantidad de billetes de 20.000: "+ billetes20000);
        System.out.println("Cantidad de billetes de 10.000: "+ billetes10000);
        System.out.println("Cantidad de billetes de 5.000: "+ billetes5000);
        System.out.println("Cantidad de billetes de 2.000: "+ billetes2000);
        System.out.println("Cantidad de billetes de 1.000: "+ billetes1000);
        System.out.println("Cantidad de monedas de 500: "+ monedas500);
        System.out.println("Cantidad de monedas de 200: "+ monedas200);
        System.out.println("Cantidad de monedas de 100: "+ monedas100);
        System.out.println("Cantidad de monedas de 50: "+ monedas50);
        System.out.println("Cantidad de monedas de 1: "+ monedas1Peso);
    }
    ////////////////////-----------------------12Factoriales
    public static void factoriales(){
        int m = 0, n=0, p=0, combinacion=0;
        System.out.println("Digite el valor de m: ");
        m = Integer.parseInt(lector.nextLine());
        System.out.println("Digite el valor de n: ");
        n = Integer.parseInt(lector.nextLine());
        p = n-m;
        System.out.println("El valor de n-m es: "+p);
        int factorialn = 1;
        //Factorial de n
        while ( n !=0) {
        factorialn=factorialn*n;
         n--;
        }
        System.out.println("El valor de n! es: "+factorialn);
        
        //Factorial de m
        int factorialm = 1;
        while ( m !=0) {
        factorialm=factorialm*m;
         m--;
        }
        System.out.println("El valor de m! es: "+factorialm);
        
        //Factorial de n-m
        int factorialp = 1;
        while ( p !=0) {
        factorialp=factorialp*p;
         p--;
        }
        System.out.println("El valor de n-m! es: "+factorialp);
        
        //Valor de la combinación
        combinacion = factorialn/(factorialm*factorialp);
        System.out.println("El valor de la combinación n!/m!(n-m)! es: "+combinacion);
    }
    
}
