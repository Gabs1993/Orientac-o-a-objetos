package Gabriel;

public class Cliente {
	
	private String Nome;
	private String CPF;
	private String Data;

	
	//Construtores da Classe
		
	public Cliente (String NomedoCliente, String CPF, String Data)
	{
		this.Nome = NomedoCliente;
		
		this.CPF = CPF;
		
		this.Data = Data;	
	}


	public String getInforma��es() {
		String Informa��es = Nome+ "com o CPF" +CPF+ " E faz aniversaio em" +Data;
		return Informa��es;
	}


	
}
	
	
	

	