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
public class Ejercicio4romboide {
    public static void main(String[] args) {
    //GASPAR PAUCAR WILBER ANDRIHU
    //VARIABLES
        float b,h,p,a;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Inserte la base del romboide:");
        b=teclado.nextInt();
        System.out.println("Inserte la altura del romboide:");
        h=teclado.nextInt();
        //PROCESO
        p=2*b+2*h; 
        a=b*h;
        //SALIDA
        System.out.println("El perímetro del romboide es:"+p);
        System.out.println("El área del romboide es:"+a);
    }
}
