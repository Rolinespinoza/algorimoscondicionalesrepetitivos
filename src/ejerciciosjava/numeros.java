
package ejerciciosjava;

import java.util.Scanner;


public class numeros {
    public static void main(String[] args) {
        int j,num,cont_pri;
 boolean primo;
 cont_pri=0;
 Scanner br= new Scanner (System.in);
 System.out.print("Introduce numero: ");
 num=br.nextInt();
 for(int i=1;i<=num;i++){
 primo=true;
 j=2;
 while (j<=i-1 && primo==true)
 {
 if (i%j==0)
 primo=false;
 j++;
 }
 if (primo==true){
 cont_pri++; 
 System.out.println(i+(" es primo"));
 }
 }
 System.out.println("Entre 1.." + num + ", hay "+ cont_pri + " números primos");
    }
}
