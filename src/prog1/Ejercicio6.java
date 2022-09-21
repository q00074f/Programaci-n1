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
public class Ejercicio6 {
    public static void main(String[] args) {
    //GASPAR PAUCAR WILBER ANDRIHU
    //VARIABLES
        float n1,n2,n3,n4,n5,s;
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
    //PROCESO
        s=n1*n2*n3*n4*n5;
     //SALIDA
        System.out.println("La multiplicación de los numeros ingresados es:"+s);
    }
}
