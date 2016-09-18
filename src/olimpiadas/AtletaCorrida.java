package olimpiadas;

public class AtletaCorrida extends Atleta{
	
	private final int idCorrida = 1;
	
	private double tempo1=0, tempo2=0, tempo3=0;
	
	public AtletaCorrida(int id, String nome, Pais atletaPais, double tempo1, double tempo2, double tempo3){
		super(id, nome, atletaPais);
		this.tempo1 = tempo1;
		this.tempo2 = tempo2;
		this.tempo3 = tempo3;
	}
	
	@Override
	public void setPontuacao(){
		if(Math.min(tempo1, tempo2) == tempo1 && Math.min(tempo1, tempo3) == tempo1 ){
			super.pontuacao = tempo1;
		}
		if(Math.min(tempo2, tempo1) == tempo2 && Math.min(tempo2, tempo3) == tempo2 ){
			super.pontuacao = tempo2;
		}
		else{
			super.pontuacao = tempo3;
		}
	}

	public int getIdCorrida() {
		return idCorrida;
	}
}
