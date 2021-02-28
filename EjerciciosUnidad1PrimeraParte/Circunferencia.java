/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosUnidad1PrimeraParte;
import java.util.Scanner;
public class Circunferencia 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double r,c;
        System.out.print("Capture el valor del radio: ");
        r = scanner.nextDouble();
        
        c = 2*Math.PI*r;
        System.out.println("La circunferencia es: " + c);
            
    }
}
