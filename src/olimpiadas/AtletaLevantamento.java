package olimpiadas;

public class AtletaLevantamento extends Atleta  {

	private final int idCorrida = 3;
	
	private double peso1, peso2, peso3, peso4, peso5;
	
	
	public AtletaLevantamento(int id, String nome, Pais atletaPais, double peso1, double peso2, double peso3, double peso4, double peso5){
		super(id, nome, atletaPais);
		this.peso1 = peso1;
		this.peso2 = peso2;
		this.peso3 = peso3;
		this.peso4 = peso4;
		this.peso5 = peso5;
	}
	
	@Override
	public void setPontuacao(){		
			super.pontuacao = peso1 + peso2 + peso3 + peso4 + peso5;
		
	}

	public int getIdCorrida() {
		return idCorrida;
	}	
	
}
