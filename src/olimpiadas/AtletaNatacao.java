package olimpiadas;

public class AtletaNatacao extends Atleta {

	private final int idCorrida = 2;
	
	private double tempo1, tempo2, tempo3;
	
	public AtletaNatacao(int id, String nome, Pais atletaPais, double tempo1, double tempo2, double tempo3){
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
		else if(Math.min(tempo2, tempo1) == tempo2 && Math.min(tempo2, tempo3) == tempo2 ){
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
