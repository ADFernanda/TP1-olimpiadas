package olimpiadas;

public class SaltoEmAltura extends Esporte{
	
	private double altura1, altura2, altura3, altura4, altura5;
	
	public SaltoEmAltura(int id, double altura1, double altura2, double altura3, double altura4, double altura5){
		super(id, "Salto em altura");
		this.altura1 = altura1;
		this.altura2 = altura2;
		this.altura3 = altura3;
		this.altura4 = altura4;
		this.altura5 = altura5;
	}
	
	@Override
	public double calculaPontuacao(){
		if(Math.max(altura1, altura2) == altura1 && Math.max(altura1, altura3) == altura1 && Math.max(altura1, altura4) == altura1 && Math.max(altura1, altura5) == altura1){
			return altura1;
		}
		if(Math.max(altura2, altura1) == altura2 && Math.max(altura2, altura3) == altura2 && Math.max(altura2, altura4) == altura2 && Math.max(altura2, altura5) == altura2){
			return altura2;
		}
		if(Math.max(altura3, altura2) == altura3 && Math.max(altura3, altura1) == altura3 && Math.max(altura3, altura4) == altura3 && Math.max(altura3, altura5) == altura3){
			return altura3;
		}
		if(Math.max(altura4, altura2) == altura4 && Math.max(altura4, altura3) == altura4 && Math.max(altura4, altura1) == altura4 && Math.max(altura4, altura5) == altura4){
			return altura4;
		}
		else{
			return altura5;
		}
	}
		
	
}
