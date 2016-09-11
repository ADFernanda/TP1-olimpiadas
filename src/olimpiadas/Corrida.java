package olimpiadas;

public class Corrida extends Esporte {
	
	private double tempo1, tempo2, tempo3;
	
	public Corrida(int id, double tempo1, double tempo2, double tempo3){
		super(id, "Corrida");
		this.tempo1 = tempo1;
		this.tempo2 = tempo2;
		this.tempo3 = tempo3;
	}

	@Override
	public double calculaPontuacao(){
		if(Math.min(tempo1, tempo2) == tempo1 && Math.min(tempo1, tempo3) == tempo1 ){
			return tempo1;
		}
		if(Math.min(tempo2, tempo1) == tempo2 && Math.min(tempo2, tempo3) == tempo2 ){
			return tempo2;
		}
		else{
			return tempo3;
		}
	}
}
