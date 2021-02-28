/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosUnidad1PrimeraParte;
import java.util.Scanner;
public class Ordenar3 
{
   public static void main(String[] args)
   {
       int n1,n2,n3;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Introduzca el primer numero: ");
        n1 = scanner.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        n2 = scanner.nextInt();
        System.out.print("Introduzca el tercer numero: ");
        n3 = scanner.nextInt();
        
        if (n1 > n2) 
            if (n1 > n3) 
                if (n2 > n3) 
                    System.out.println("Ordenado: " + n1 + "," + n2 + "," + n3);
                else
                    System.out.println("Ordenado: " + n1 + "," + n3 + "," + n2);
            else
                System.out.println("Ordenado: " + n3 + "," + n1 + "," + n2);
        else if (n2 > n3) 
            if (n3 > n1) 
                System.out.println("Ordenado: " + n2 + "," + n3 + "," + n1);
            else
                System.out.println("Ordenado: " + n2 + "," + n1 + "," + n2);
        else
            System.out.println("Ordenado: " + n3 + "," + n2 + "," + n1);        
   }
}
