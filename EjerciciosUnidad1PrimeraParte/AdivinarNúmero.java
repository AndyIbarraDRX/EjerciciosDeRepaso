/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosUnidad1PrimeraParte;
import java.util.Scanner;
/**
 *
 * @author casa
 */
public class AdivinarNúmero 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int numeroJugador=0;
        int numeroAdivinar = (int) ((Math.random() * 100)+1); 
        System.out.println("Adivina el número!");
        do
        {

            System.out.println("Ingrese un número: ");
            numeroJugador=entrada.nextInt();
            if (numeroJugador==numeroAdivinar){
                 System.out.println("Adivinaste el número!!");
            }
            else if(numeroJugador>numeroAdivinar){
                 System.out.println("Mayor");
            }
            else if (numeroJugador<numeroAdivinar){
                System.out.println("Menor");
            }
        }
        while(!(numeroJugador==numeroAdivinar));
    }
}
