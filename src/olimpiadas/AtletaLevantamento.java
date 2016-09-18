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
		if(Math.min(peso1, peso2) == peso1 && Math.min(peso1, peso3) == peso1 && Math.min(peso1, peso4) == peso1 && Math.min(peso1, peso5) == peso1){
			super.pontuacao = peso1;
		}
		if(Math.min(peso2, peso1) == peso2 && Math.min(peso2, peso3) == peso2 && Math.min(peso2, peso4) == peso2 && Math.min(peso2, peso5) == peso2){
			super.pontuacao = peso2;
		}
		if(Math.min(peso3, peso2) == peso3 && Math.min(peso3, peso1) == peso3 && Math.min(peso3, peso4) == peso3 && Math.min(peso3, peso5) == peso3){
			super.pontuacao = peso3;
		}
		if(Math.min(peso4, peso2) == peso4 && Math.min(peso4, peso3) == peso4 && Math.min(peso4, peso1) == peso4 && Math.min(peso4, peso5) == peso4){
			super.pontuacao = peso4;
		}
		else{
			super.pontuacao = peso5;
		}
	}

	public int getIdCorrida() {
		return idCorrida;
	}	
	
}
