package olimpiadas;

public class Pais  implements  Comparable<Pais> {

	private int id;
	private String nome;
	private int ouro=0, prata=0, bronze=0;
	
	public Pais(int id, String nome){
		this.setId(id);
		this.setNome(nome);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getOuro() {
		return ouro;
	}

	public void setOuro(int ouro) {
		this.ouro += ouro;
	}

	public int getPrata() {
		return prata;
	}

	public void setPrata(int prata) {
		this.prata += prata;
	}

	public int getBronze() {
		return bronze;
	}

	public void setBronze(int bronze) {
		this.bronze += bronze;
	}
	
	@Override
	public int compareTo(Pais outroPais) {
	     if (this.ouro > outroPais.getOuro()) {
	          return -1;
	     }
	     if (this.ouro < outroPais.getOuro()) {
	          return 1;
	     }
	     return 0;
	}
	
}
