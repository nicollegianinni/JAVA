package JAVA;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		  int mv=0,mc=0,idade;
		  
		    
		    System.out.println("\n Digite sua idade:");
		    idade = ler.nextInt();
		    while(idade!=-99)
		    {
			
			if (idade<21)
				mv++;
			
			if (idade>50)
				mc++;
			
		    System.out.println("\n Digite sua idade:");
		    idade = ler.nextInt();

		  }
		    System.out.println("\n o total de pessoas menores de 21:"+mv);
		    System.out.println("\n o total de pessoas maiores de 51:"+mv);
		 }
			
		

}


