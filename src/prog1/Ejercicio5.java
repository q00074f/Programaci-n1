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
public class Ejercicio5 {
    public static void main(String[] args) {
        //GASPAR PAUCAR WILBER ANDRIHU
    //VARIABLES
        float n1,n2,n3,n4,n5,s,p;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Inserte la primera nota:");
        n1=teclado.nextInt();
        System.out.println("Inserte la segunda nota:");
        n2=teclado.nextInt();
        System.out.println("Inserte la tercera nota:");
        n3=teclado.nextInt();
        System.out.println("Inserte la cuarta nota:");
        n4=teclado.nextInt();
        System.out.println("Inserte la quinta nota:");
        n5=teclado.nextInt();
        //PROCESO
        s=n1+n2+n3+n4+n5;
        p=s/5;
        //SALIDA
        System.out.println("El promedio de las notas ingresadas es:"+p);
    }
}
