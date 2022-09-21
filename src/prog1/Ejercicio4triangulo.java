//4. Realizar un programa que calcule el perímetro y área de las siguientes figuras geométricas:
//TRIÁNGULO
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
public class Ejercicio4triangulo {
    public static void main(String[] args) {
        //GASPAR PAUCAR WILBER ANDRIHU
        //VARIABLES
        float b,h,l,m,n,p,a;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Inserte la base:");
        b=teclado.nextInt();
        System.out.println("Inserte la altura:");
        h=teclado.nextInt();
        System.out.println("Inserte el lado 1:");
        l=teclado.nextInt();
        System.out.println("Inserte el lado 2:");
        m=teclado.nextInt();
        System.out.println("Inserte el lado 3:");
        n=teclado.nextInt();
        
        //PROCESO
        p=l+m+n; 
        a=b*h/2;
        //SALIDA
        System.out.println("El perímetro del triángulo es:"+p);
        System.out.println("El área del triángulo es:"+a);
    }
}

