package olimpiadas;

public abstract class Atleta implements  Comparable<Atleta>{

	private int id=0;
	private String nome;
	private Pais meuPais;
	protected double pontuacao=0;
	
	public Atleta(int id, String nome, Pais meuPais){
		this.setId(id);
		this.setNome(nome);
		this.setMeuPais(meuPais);
	}

	protected abstract void setPontuacao();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pais getMeuPais() {
		return meuPais;
	}

	public void setMeuPais(Pais meuPais) {
		this.meuPais = meuPais;
	}
	
	public double getPontuacao() {
		return this.pontuacao;
	}

	@Override
	public int compareTo(Atleta outroAtleta) {
	     if (this.pontuacao < outroAtleta.getPontuacao()) {
	          return -1;
	     }
	     if (this.pontuacao > outroAtleta.getPontuacao()) {
	          return 1;
	     }
	     return 0;
	}

}
