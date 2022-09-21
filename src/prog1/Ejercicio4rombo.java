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
public class Ejercicio4rombo {
    public static void main(String[] args) {
    //GASPAR PAUCAR WILBER ANDRIHU
    //VARIABLES
        float l,dm,dn,p,a;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Inserte el lado del rombo:");
        l=teclado.nextInt();
        System.out.println("Inserte diagonal mayor del rombo:");
        dm=teclado.nextInt();
        System.out.println("Inserte diagonal menor del rombo:");
        dn=teclado.nextInt();
        //PROCESO
        p=4*l; 
        a=dm*dn/2;
        //SALIDA
        System.out.println("El perímetro del rombo es:"+p);
        System.out.println("El área del rombo es:"+a);
    }
}
