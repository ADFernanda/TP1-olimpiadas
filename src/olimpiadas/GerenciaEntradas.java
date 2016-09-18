package olimpiadas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciaEntradas{
	
	
	public static List<Pais> lePaises() throws IOException {
		
		String nomePais="";
		int idPais = 0;
	    final String nomeArq="paises.txt";
	    String linha="";
	    String[] tokens;
	    List<Pais> listaPaises = new ArrayList<Pais>();
	 
		
		try{
			FileReader readerPaises = new FileReader(nomeArq);
			BufferedReader leitor = new BufferedReader(readerPaises);
			
			while( (linha=leitor.readLine()) != null ){
//				System.out.println(linha);
				
				tokens = linha.split(";");
				
				idPais = Integer.parseInt(tokens[0]);
				nomePais = tokens[1];
				
				Pais pais = new Pais(idPais,nomePais);
				
				listaPaises.add(pais);
				
//				System.out.println("id: "+pais.getId()+" nome: "+pais.getNome());
				
			}
			
			leitor.close();
		}catch (ArrayIndexOutOfBoundsException e) {
			  System.out.println("Erro : "+e);
		}
		
		return listaPaises;
	}
	
	public static EntradasAtletas leAtletas(List<Pais> listaPaises) throws IOException {
		
		EntradasAtletas atletas = new EntradasAtletas();
		
		final String nomeArq = "atletas.txt";
		int idEsporte = 0;
		
		String linha="";
		String[] tokens;
		
		try{
			FileReader readerAtletas = new FileReader(nomeArq);
			BufferedReader leitor = new BufferedReader(readerAtletas);
			
			while( (linha=leitor.readLine()) != null ){
				
				tokens = linha.split("[;|] *| +");	
				
				idEsporte = Integer.parseInt(tokens[2]);
				
				Pais atletaPais = listaPaises.get(Integer.parseInt(tokens[1])-1);
				
				switch (idEsporte) {
				case 1: //corrida				
					AtletaCorrida atletaCorrida = new AtletaCorrida(Integer.parseInt(tokens[0]), tokens[3], atletaPais, Double.parseDouble(tokens[4]) , Double.parseDouble(tokens[5]), Double.parseDouble(tokens[6]));
					atletaCorrida.setPontuacao();
					
					atletas.listaCorrida.add(atletaCorrida);
					
					break;
				case 2: //natacao	
					
					AtletaNatacao atletaNatacao = new AtletaNatacao(Integer.parseInt(tokens[0]), tokens[3], atletaPais, Double.parseDouble(tokens[4]) , Double.parseDouble(tokens[5]), Double.parseDouble(tokens[6]));
					atletaNatacao.setPontuacao();
					
					atletas.listaNatacao.add(atletaNatacao);
					
					break;
				case 3: //levantamento
					
					AtletaLevantamento atletaLevantamento = new AtletaLevantamento(Integer.parseInt(tokens[0]), tokens[3], atletaPais, Double.parseDouble(tokens[4]) , Double.parseDouble(tokens[5]), Double.parseDouble(tokens[6]), Double.parseDouble(tokens[7]), Double.parseDouble(tokens[8]));
					atletaLevantamento.setPontuacao();
					
					atletas.listaLevantamento.add(atletaLevantamento);
					
					break;
				case 4: //salto

					AtletaSalto atletaSalto = new AtletaSalto(Integer.parseInt(tokens[0]), tokens[3], atletaPais, Double.parseDouble(tokens[4]) , Double.parseDouble(tokens[5]), Double.parseDouble(tokens[6]), Double.parseDouble(tokens[7]), Double.parseDouble(tokens[8]));
					atletaSalto.setPontuacao();
					
					atletas.listaSalto.add(atletaSalto);
					
					break;
				case 5: //ginastica
					
					AtletaGinastica atletaGinastica = new AtletaGinastica(Integer.parseInt(tokens[0]), tokens[3], atletaPais, Double.parseDouble(tokens[4]) , Double.parseDouble(tokens[5]), Double.parseDouble(tokens[6]), Double.parseDouble(tokens[7]));
					atletaGinastica.setPontuacao();
					
					atletas.listaGinastica.add(atletaGinastica);
					
					break;

				default:
					System.out.println("Erro: atleta possui id de esporte inexistente");
					break;
				}
			}
					
			leitor.close();
		}catch (ArrayIndexOutOfBoundsException e) {
			  System.out.println("Erro: "+e);
		}						
		
		return atletas;
	}
	
	
	
	

}
