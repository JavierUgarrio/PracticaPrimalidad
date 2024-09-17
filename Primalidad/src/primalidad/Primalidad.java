
package primalidad;

import java.util.Scanner;


public class Primalidad {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = teclado.nextInt();
        if(esPrimo(numero)){
            System.out.println("Es un numero primo");
        }else{
            System.out.println("No es un numero primo");
        }
        
    }
    static boolean esPrimo(int number){
        int contador = 0;
        int []numeros= new int [number];
        for(int i =0; i<numeros.length;i++ ){
            numeros[i]= i+1;
        }
        for(int i:numeros){
            if(i==1|| i== number){
                continue;
            }
            if(number%i ==0){
               contador++; 
            }
        }
        return contador==0;
    }
}
