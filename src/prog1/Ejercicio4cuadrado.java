/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4cuadrado {
    public static void main(String[] args) {
    //GASPAR PAUCAR WILBER ANDRIHU
    //VARIABLES
        float l,p,a;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Inserte el lado del cuadrado:");
        l=teclado.nextInt();
        
        //PROCESO
        p=l*4; 
        a=l*l;
        //SALIDA
        System.out.println("El perímetro del cuadrado es:"+p);
        System.out.println("El área del cuadrado es:"+a);
    }
}

