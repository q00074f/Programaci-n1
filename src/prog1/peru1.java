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
public class peru1 {
    public static void main(String[] args) {
        //variables
        int n1,n2,s;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Numero 1:");
        n1=teclado.nextInt();
        System.out.println("Numero 2:");
        n2=teclado.nextInt();
        
        //proceso
        s=n1+n2;
        //SALIDA
        System.out.println("Suma:"+s);
    }
  }
