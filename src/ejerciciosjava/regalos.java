/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author alum.fial7
 */
public class regalos 
{
    public static void main(String[] args)
    {
         int cant_clientes=20;
     int genero;
     int edad;
     int i=0;
     Scanner br = new Scanner (System.in);
         System.out.println("**************************************************************");
         System.out.println("comenzamos con la lista de los 20 mejores clientes la empresa");
     System.out.println("ingresa tu edad: ");
     edad=br.nextInt();
         System.out.println("ingresa tu genero: 1 si eres varon/ 2 si eres mujer: ");
         genero=br.nextInt();
         while(i<=cant_clientes)
         {
            while(genero==1)
            {
                if(edad>=35)
                {
                    System.out.println("le corresponde un televisor");
                    System.out.println("ingresa tu edad: ");
         edad=br.nextInt();
         System.out.println("ingresa tu genero: 1 si eres varon/ 2 si eres mujer: ");
         genero=br.nextInt();
                }
                else if(edad<35)
                {
                    System.out.println("le corresponde un reloj y un balon de futbol");
                    System.out.println("-------------------------------------------");
                    System.out.println("ingresa tu edad: ");
          edad=br.nextInt();
          System.out.println("ingresa tu genero: 1 si eres varon/ 2 si eres mujer: ");
          genero=br.nextInt();
                }
            }
            while(genero==2)
            {
                 if(edad>=35)
                {
                    System.out.println("le corresponde una lavadora");
         System.out.println("-------------------------------------------");

         System.out.println("ingresa tu edad: ");
         edad=br.nextInt();
         System.out.println("ingresa tu genero: 1 si eres varon/ 2 si eres mujer: ");
         genero=br.nextInt();
                }
                else if(edad<35)
                {
                    System.out.println("le corresponde una cartera y una licuadora"); 
         System.out.println("-------------------------------------------");
         System.out.println("ingresa tu edad: ");
         edad=br.nextInt();
         System.out.println("ingresa tu genero: 1 si eres varon/ 2 si eres mujer: ");
         genero=br.nextInt();
                }
            }
         }
    }
}
