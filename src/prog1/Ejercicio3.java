//3. Realizar un programa que permita calcular la suma de 5 números
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
public class Ejercicio3{
    public static void main(String[] args) {
    //GASPAR PAUCAR WILBER ANDRIHU
    //variables
        float n1,n2,n3,n4,n5,s;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Numero 1:");
        n1=teclado.nextInt();
        System.out.println("Numero 2:");
        n2=teclado.nextInt();
        System.out.println("Numero 3:");
        n3=teclado.nextInt();
        System.out.println("Numero 4:");
        n4=teclado.nextInt();
        System.out.println("Numero 5:");
        n5=teclado.nextInt();
        //proceso
        s=n1+n2+n3+n4+n5;
        //SALIDA
        System.out.println("Suma:"+s);
    }
}
