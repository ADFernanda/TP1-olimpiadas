package olimpiadas;

public class AtletaGinastica extends Atleta{

	private final int idCorrida = 5;
	
	private double nota1, nota2, nota3, nota4;
	
	public AtletaGinastica(int id, String nome, Pais atletaPais, double nota1, double nota2, double nota3, double nota4){
		super(id, nome, atletaPais);
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}
	
	@Override
	public void setPontuacao(){
		
		super.pontuacao = (this.nota1 + this.nota2 + this.nota3 + this.nota4)/4;
	}

	public int getIdCorrida() {
		return idCorrida;
	}
	
}