package olimpiadas;

public class AtletaSalto extends Atleta {

	private final int idCorrida = 4;
	
	private double altura1, altura2, altura3, altura4, altura5;
	
	public AtletaSalto(int id, String nome, Pais atletaPais, double altura1, double altura2, double altura3, double altura4, double altura5){
		super(id, nome, atletaPais);
		this.altura1 = altura1;
		this.altura2 = altura2;
		this.altura3 = altura3;
		this.altura4 = altura4;
		this.altura5 = altura5;
	}
	
	@Override
	public void setPontuacao(){
		if(Math.max(altura1, altura2) == altura1 && Math.max(altura1, altura3) == altura1 && Math.max(altura1, altura4) == altura1 && Math.max(altura1, altura5) == altura1){
			super.pontuacao = altura1;
		}
		else if(Math.max(altura2, altura1) == altura2 && Math.max(altura2, altura3) == altura2 && Math.max(altura2, altura4) == altura2 && Math.max(altura2, altura5) == altura2){
			super.pontuacao = altura2;
		}
		else if(Math.max(altura3, altura2) == altura3 && Math.max(altura3, altura1) == altura3 && Math.max(altura3, altura4) == altura3 && Math.max(altura3, altura5) == altura3){
			super.pontuacao = altura3;
		}
		else if(Math.max(altura4, altura2) == altura4 && Math.max(altura4, altura3) == altura4 && Math.max(altura4, altura1) == altura4 && Math.max(altura4, altura5) == altura4){
			super.pontuacao = altura4;
		}
		else{
			super.pontuacao = altura5;
		}
	}

	public int getIdCorrida() {
		return idCorrida;
	}
	
}
