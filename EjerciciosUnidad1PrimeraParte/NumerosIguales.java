/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosUnidad1PrimeraParte;
import java.util.Scanner;
public class NumerosIguales 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n1,n2;
        System.out.print("Introduce un número: ");
        n1 = scanner.nextInt();
        System.out.print("Introduce otro número: ");
        n2 = scanner.nextInt();
        if (n1 == n2) 
            System.out.println("Son iguales.");
        else
            System.out.println("No son iguales.");
            
    }
}
