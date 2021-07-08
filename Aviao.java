package Gabriel;

public class Aviao {

	private String Passageiro;
	private String Poltrona;
	private String CPF;
	
	public Aviao (String Passageiro, String Poltrona, String CPF)
	{
		this.Passageiro = Passageiro;
		this.Poltrona = Poltrona;
		this.CPF = CPF;
	}
	
	public void imprimirInfo()
	{
		System.out.println(Passageiro+ " com o a poltrona" +Poltrona+ " portador do CPF" +CPF);
	}

	public String getPassageiro() {
		return Passageiro;
	}

	public void setPassageiro(String passageiro) {
		Passageiro = passageiro;
	}

	public String getPoltrona() {
		return Poltrona;
	}

	public void setPoltrona(String poltrona) {
		Poltrona = poltrona;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
	
	
	
}
