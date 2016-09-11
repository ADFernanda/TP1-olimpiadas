package olimpiadas;

public abstract class Atleta {

	private int id=0;
	private String nome;
	private Pais meuPais;
	
	public Atleta(int id, String nome, Pais meuPais){
		this.setId(id);
		this.setNome(nome);
		this.setMeuPais(meuPais);
	}

	public abstract void setPontuacao();
	
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


}
