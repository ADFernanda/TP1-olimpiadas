package olimpiadas;

public class GinasticaArtistica extends Esporte {
	
	private double nota1, nota2, nota3, nota4;
	
	public GinasticaArtistica(int id, double nota1, double nota2, double nota3, double nota4){
		super(id, "Ginastica artística");
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}
	
	@Override
	public double calculaPontuacao(){
		if(Math.max(nota1, nota2) == nota1 && Math.max(nota1, nota3) == nota1 && Math.max(nota1, nota4) == nota1){
			return nota1;
		}
		if(Math.max(nota2, nota1) == nota2 && Math.max(nota2, nota3) == nota2 && Math.max(nota2, nota4) == nota2){
			return nota2;
		}
		if(Math.max(nota3, nota2) == nota3 && Math.max(nota3, nota1) == nota3 && Math.max(nota3, nota4) == nota3){
			return nota3;
		}	
		else{
			return nota4;
		}
	}
}
