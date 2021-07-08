package Gabriel;

public class Eletronico {
	
	private String Bateria;
	private String Carregador;
	private String FoneDeOuvido;
	private String Case;
	
	public Eletronico (String Bateria, String Carregador, String FoneDeOuvido, String Case)
	{
		this.Bateria = Bateria;
		this.Carregador = Carregador;
		this.FoneDeOuvido = FoneDeOuvido;
		this.Case = Case;
	}
	
	public void Todasinformações()
	{
		System.out.println("\nO celular possui uma " +Bateria+ " Maravilhosa e um " +Carregador+ " extremamente potente, e alem disso vem com um " +FoneDeOuvido+ " Bluethooth e uma " +Case+ " Anti impacto, compre já....");
	}

	public String getBateria() {
		return Bateria;
	}

	public void setBateria(String bateria) {
		Bateria = bateria;
		System.out.println("\nBateria com até 24 horas de duracao com o uso moderado");
	}

	public String getCarregador() {
		return Carregador;
	}

	public void setCarregador(String carregador) {
		Carregador = carregador;
		System.out.println("\nEste Carregador promete dar uma carga de 100% em até 30 minutos");
	}

	public String getFoneDeOuvido() {
		return FoneDeOuvido;
		
	}

	public void setFoneDeOuvido(String foneDeOuvido) {
		FoneDeOuvido = foneDeOuvido;
		System.out.println("\nCom este Fone de ouvido além do seu dispositivo você pode conectar no seu video game ou computador, imperdivel");
	}

	public String getCase() {
		return Case;
	}

	public void setCase(String case1) {
		Case = case1;
	}

	
}
