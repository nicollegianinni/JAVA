package POOquestoes;

public class contaclinete {
	
	/*
	 * 6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.
	 */

		public static void main(String[] args) 
		{
			ContaBancaria = new ContaBancaria();
			ContaBancaria.nomeCliente = "Nicholle Gianinni";
			ContaBancaria.saldo = 1200;
			
			System.out.println("\nCliente: " + ContaBancaria.getCliente());
			System.out.println("\nO seu saldo atual é: R$" + ContaBancaria.getValor());
		}

}

