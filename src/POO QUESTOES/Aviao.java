package POOquestoes ;

public class Aviao {

	/*
	 * 2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
	 */

	//CARACTERISTICAS = ATRIBUTOS
	
	private String passageiro;
	private boolean pouso;
	
	//METODO = CONSTRUTOR
	
	public Aviao (String pass, boolean p)
	{
		this.passageiro=pass;
		this.pouso=p;
	}
	
	//COMPORTAMENTOS = METODOS
	
	public void PassageirosEmPe()
	{
		if(this.pouso==true)
			System.out.println("Passageiros sentados iremos pousar!");
		else
			System.out.println("Senhoras e senhores iremos pousar!");
	}
	
	public void PassageirosSentados()
	{
		if(this.pouso==true)
			System.out.println("passageiros sentados...");
		else
			this.pouso=true;
	}
	
	public void estado()
	{
		System.out.println(" passageiros estao em pé ?"+this.pouso);
		System.out.println(" passageiros estao em pé ?"+this.passageiro);
	}
	
	
	public boolean isPouso()
	{
			return pouso;
		}

	public void setPouso ( boolean pouso) 
	{
		this.pouso = pouso;
	}

	public String getPassageiros() {
		return passageiro;
	}
	
}


