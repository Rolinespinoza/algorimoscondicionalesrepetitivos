
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author alum.fial7
 */
public class imprimir
{
    public static void main(String[] args)
    {
     int n; // tamaño del lado
 Scanner entrada= new Scanner(System.in);
 System.out.print ("Lado del cuadrado: ");
 n = entrada.nextInt();
 while(n!=0)
 {
 for (int fila=1; fila<=n; fila++)
 {
 for (int col=1; col<=n; col++)
 System.out.print ("* ");
  System.out.println ("");
 }
 System.out.print ("ingrese un nuevo Lado del cuadrado: ");
 n = entrada.nextInt();
 }
    }
}
