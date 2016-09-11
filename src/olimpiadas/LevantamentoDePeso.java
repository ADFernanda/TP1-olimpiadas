package olimpiadas;

public class LevantamentoDePeso extends Esporte{
	
	private double peso1, peso2, peso3, peso4, peso5;
	
	public LevantamentoDePeso(int id, double peso1, double peso2, double peso3, double peso4, double peso5){
		super(id, "Levantamento de peso");
		this.peso1 = peso1;
		this.peso2 = peso2;
		this.peso3 = peso3;
		this.peso4 = peso4;
		this.peso5 = peso5;
	}
	
	@Override
	public double calculaPontuacao(){
		if(Math.min(peso1, peso2) == peso1 && Math.min(peso1, peso3) == peso1 && Math.min(peso1, peso4) == peso1 && Math.min(peso1, peso5) == peso1){
			return peso1;
		}
		if(Math.min(peso2, peso1) == peso2 && Math.min(peso2, peso3) == peso2 && Math.min(peso2, peso4) == peso2 && Math.min(peso2, peso5) == peso2){
			return peso2;
		}
		if(Math.min(peso3, peso2) == peso3 && Math.min(peso3, peso1) == peso3 && Math.min(peso3, peso4) == peso3 && Math.min(peso3, peso5) == peso3){
			return peso3;
		}
		if(Math.min(peso4, peso2) == peso4 && Math.min(peso4, peso3) == peso4 && Math.min(peso4, peso1) == peso4 && Math.min(peso4, peso5) == peso4){
			return peso4;
		}
		else{
			return peso5;
		}
	}	
	
}
