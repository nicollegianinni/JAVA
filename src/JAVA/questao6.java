package JAVA;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n1, soma=0, media=0,cont=0;
		
		do
		{
			System.out.println("\n Digite um numero:");
			n1=ler.nextInt();
			if(n1%3==0 && n1!=0)
			{
				
				soma=soma+n1;
				cont++;
				
			}
		}
			while (n1!=0);
			{
			System.out.println("\n multiplos de 3 é"+soma/cont);
			
		}	
	


}

}

		
		
	





	

