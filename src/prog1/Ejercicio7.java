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
public class Ejercicio7 {
    public static void main(String[] args) {
        //GASPAR PAUCAR WILBER ANDRIHU
    //VARIABLES
       float n1,n2,n3,n4,n5,m1,m2,m3,m4,m5,s,s1,m;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Inserte el primer número:");
        n1=teclado.nextInt();
        System.out.println("Inserte el segunda número:");
        n2=teclado.nextInt();
        System.out.println("Inserte el tercer número:");
        n3=teclado.nextInt();
        System.out.println("Inserte el cuarto número:");
        n4=teclado.nextInt();
        System.out.println("Inserte el quinto número:");
        n5=teclado.nextInt();
        System.out.println("Inserte el sexto número:");
        m1=teclado.nextInt();
        System.out.println("Inserte el séptimo número:");
        m2=teclado.nextInt();
        System.out.println("Inserte el octavo número:");
        m3=teclado.nextInt();
        System.out.println("Inserte el noveno número:");
        m4=teclado.nextInt();
        System.out.println("Inserte el décimo número:");
        m5=teclado.nextInt();
        //PROCESO
        s=n1+n2+n3+n4+n5;
        s1=m1+m2+m3+m4+m5;
        m=s*s1;
        //SALIDA
        System.out.println("La suma de los 5 primeros números es:"+s);
        System.out.println("La suma de los 5 últimos números es:"+s1);
        System.out.println("La multiplicación entre la suma de los primeros 5 números y la suma de los 5 últimos números es:"+m);
    }
}
