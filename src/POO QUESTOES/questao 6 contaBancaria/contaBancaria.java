package questoes;

public class contaBancaria {
	
	/*
	 * 6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.
	 */
	private String nomeCliente;
	private String conta;
	private String valorConta;
	
	public contaBancaria ( String usuario, String cadastro, String dinheiro)
	{
		nomeCliente = usuario;
		conta = cadastro ;
		valorConta = dinheiro ;
	}
	public String getdadosBancarios ()
	{
		String dadosBancarios = nomeCliente+ "\t\n "+conta+ "\t\n "+valorConta;
		return dadosBancarios;
		
	}
	
	
	
}
