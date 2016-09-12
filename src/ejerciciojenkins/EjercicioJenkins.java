/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojenkins;

import java.util.Scanner;


public class EjercicioJenkins {

    
    public static void main(String[] args) {
       
        int aleatorio= (int)(Math.random()*100);
	Scanner Entrada= new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
		while (numero!=aleatorio){
			intentos++;
			System.out.println("Introduce un numero por favor");
			numero=Entrada.nextInt();
		
			if (aleatorio<numero){
			System.out.println("Mas bajo");
			
			}
			else
				if (aleatorio>numero){
				System.out.println("Mas alto");	
				}
		System.out.println("intento numero: " + intentos);	
		}
		System.out.println("Correcto");		
    }
    
} //comentario!!!
