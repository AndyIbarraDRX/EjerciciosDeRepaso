/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosUnidad1PrimeraParte;
import java.util.Scanner;
public class Radio 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double radio,area;
        System.out.print("Capture el radio del circulo: ");
        radio = scanner.nextDouble();
        
        area = Math.PI *(Math.pow(radio,2));
        System.out.println("El area del circulo es: " + area);
            
    }
}
