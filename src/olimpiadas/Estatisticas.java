package olimpiadas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;


public class Estatisticas {
	
	public static void criaEstatisticas(EntradasAtletas atletas, List<Pais> listaPaises) throws IOException {

		final String nomeArq="estatisticas.txt";
		String linhaLeitura="";
		//String linhaEscrita="";
		String[] tokens;
		int idEsporte = 0;
		String arqSaida = "";
		
		try{
			FileReader readerEst = new FileReader(nomeArq);
			BufferedReader leitor = new BufferedReader(readerEst);
			
			while( (linhaLeitura=leitor.readLine()) != null ){										
				
				tokens = linhaLeitura.split(";");
				
				if(Integer.parseInt(tokens[0]) == 1){
					idEsporte = Integer.parseInt(tokens[1]);
					switch (idEsporte) {
					case 1:				
						arqSaida = "estatistica-1-1.txt";
						BufferedWriter bEscrita1 = new BufferedWriter(new FileWriter(arqSaida));
												 
						bEscrita1.write("Corrida"+System.lineSeparator()+System.lineSeparator());
											
						for (int i = 0; i < atletas.listaCorrida.size(); i++) {
							AtletaCorrida getCorrida = atletas.listaCorrida.get(i);
							
							String resultado = String.format("%.2f", getCorrida.getPontuacao());
							
							//bEscrita1.write(getCorrida.getNome()+"\t"+resultado + "\n");
							
							bEscrita1.write(String.format("%-11s %s%s",getCorrida.getNome(), resultado,System.lineSeparator()));																				
						}													
						
						bEscrita1.close();				
						break;
					case 2:
						arqSaida = "estatistica-1-2.txt";
						BufferedWriter bEscrita2 = new BufferedWriter(new FileWriter(arqSaida));
												 
						bEscrita2.write("Natação"+System.lineSeparator()+System.lineSeparator());
						
						for (int i = 0; i < atletas.listaNatacao.size(); i++) {
							AtletaNatacao getNatacao = atletas.listaNatacao.get(i);
							
							String resultado = String.format("%.2f", getNatacao.getPontuacao());
							
							//bEscrita2.write(getNatacao.getNome()+"\t"+resultado+"\n");
							bEscrita2.write(String.format("%-11s %s%s",getNatacao.getNome(), resultado,System.lineSeparator()));
							
						}
						
						bEscrita2.close();
						
						break;
					case 3:
						arqSaida = "estatistica-1-3.txt";
						BufferedWriter bEscrita3 = new BufferedWriter(new FileWriter(arqSaida));
												 
						Collections.reverse(atletas.listaLevantamento);						
						
						bEscrita3.write("Levantameto de peso"+System.lineSeparator()+System.lineSeparator());
						
						for (int i = 0; i < atletas.listaLevantamento.size(); i++) {
							AtletaLevantamento getLevantamento = atletas.listaLevantamento.get(i);
							
							String resultado = String.format("%.2f", getLevantamento.getPontuacao());
							
							//bEscrita3.write(getLevantamento.getNome()+"\t"+resultado+"\n");
							
							bEscrita3.write(String.format("%-11s %s%s",getLevantamento.getNome(), resultado,System.lineSeparator()));
							
						}
						
						bEscrita3.close();
						
						break;
					case 4:
						arqSaida = "estatistica-1-4.txt";
						BufferedWriter bEscrita4 = new BufferedWriter(new FileWriter(arqSaida));
												 
						Collections.reverse(atletas.listaSalto);
						
						bEscrita4.write("Salto em altura"+System.lineSeparator()+System.lineSeparator());
						
						for (int i = 0; i < atletas.listaSalto.size(); i++) {
							AtletaSalto getSalto = atletas.listaSalto.get(i);
							
							String resultado = String.format("%.2f", getSalto.getPontuacao());
							
							//bEscrita4.write(getSalto.getNome()+"\t"+resultado+"\n");
							bEscrita4.write(String.format("%-11s %s%s",getSalto.getNome(), resultado,System.lineSeparator()));
							
						}
						
						bEscrita4.close();
						
						break;
					case 5:
						arqSaida = "estatistica-1-5.txt";
						BufferedWriter bEscrita5 = new BufferedWriter(new FileWriter(arqSaida));					
												 
						bEscrita5.write("Ginástica artística"+System.lineSeparator()+System.lineSeparator());
						
						Collections.reverse(atletas.listaGinastica);
						
						for (int i = 0; i < atletas.listaGinastica.size(); i++) {
							AtletaGinastica getGinastica = atletas.listaGinastica.get(i);
							
							String resultado = String.format("%.2f", getGinastica.getPontuacao());
							
							//bEscrita5.write(getGinastica.getNome()+"\t"+resultado+"\n");
							bEscrita5.write(String.format("%-11s %s%s",getGinastica.getNome(), resultado,System.lineSeparator()));
							
						}
						
						bEscrita5.close();
						
						break;
					default:
						 System.out.println("Erro: esporte procurado não existente");
						break;
					}
					
				}else if(Integer.parseInt(tokens[0]) == 2){				
					
					for (int i = 0; i < 3; i++){//corrida
						AtletaCorrida podioCorrida = atletas.listaCorrida.get(i);
						
						Pais paisProcurado = podioCorrida.getMeuPais();
						
						int index = listaPaises.indexOf(paisProcurado);
						
						if(i==0){
							paisProcurado.setOuro(1);
							listaPaises.set(index, paisProcurado);
						}
						else if (i==1){
							paisProcurado.setPrata(1);
							listaPaises.set(index, paisProcurado);
						}else{
							paisProcurado.setBronze(1);
							listaPaises.set(index, paisProcurado);
						}
												
					}
					for (int i = 0; i < 3; i++){//ginastica
											
						AtletaGinastica podioGinastica = atletas.listaGinastica.get(i);
						
						Pais paisProcurado = podioGinastica.getMeuPais();
						
						int index = listaPaises.indexOf(paisProcurado);
						
						if(i==0){
							paisProcurado.setOuro(1);
							listaPaises.set(index, paisProcurado);
						}
						else if (i==1){
							paisProcurado.setPrata(1);
							listaPaises.set(index, paisProcurado);
						}else{
							paisProcurado.setBronze(1);
							listaPaises.set(index, paisProcurado);
						}	
						
					}
					for (int i = 0; i < 3; i++){//natacao
						
						AtletaNatacao podioNatacao = atletas.listaNatacao.get(i);
						
						Pais paisProcurado = podioNatacao.getMeuPais();
						
						int index = listaPaises.indexOf(paisProcurado);
						
						if(i==0){
							paisProcurado.setOuro(1);
							listaPaises.set(index, paisProcurado);
						}
						else if (i==1){
							paisProcurado.setPrata(1);
							listaPaises.set(index, paisProcurado);
						}else{
							paisProcurado.setBronze(1);
							listaPaises.set(index, paisProcurado);
						}	
						
					}
					for (int i = 0; i < 3; i++){//levantamento
						

						
						AtletaLevantamento podioLevantamento = atletas.listaLevantamento.get(i);
						
						Pais paisProcurado = podioLevantamento.getMeuPais();
						
						int index = listaPaises.indexOf(paisProcurado);
						
						if(i==0){
							paisProcurado.setOuro(1);
							listaPaises.set(index, paisProcurado);
						}
						else if (i==1){
							paisProcurado.setPrata(1);
							listaPaises.set(index, paisProcurado);
						}else{
							paisProcurado.setBronze(1);
							listaPaises.set(index, paisProcurado);
						}
						
					}
					for (int i = 0; i < 3; i++){//salto						
						
						AtletaSalto podioSalto = atletas.listaSalto.get(i);
						
						Pais paisProcurado = podioSalto.getMeuPais();
						
						int index = listaPaises.indexOf(paisProcurado);
						
						if(i==0){
							paisProcurado.setOuro(1);
							listaPaises.set(index, paisProcurado);
						}
						else if (i==1){
							paisProcurado.setPrata(1);
							listaPaises.set(index, paisProcurado);
						}else{
							paisProcurado.setBronze(1);
							listaPaises.set(index, paisProcurado);
						}
						
					}
					
					PaisComparator comparator = new  PaisComparator();
					Collections.sort(listaPaises, comparator);
					
					Collections.sort(listaPaises, comparator);
					Collections.sort(listaPaises);
					
					arqSaida = "estatistica-2.txt";
					BufferedWriter bPaises = new BufferedWriter(new FileWriter(arqSaida));					
											 
					bPaises.write("Quadro de medalhas"+System.lineSeparator()+System.lineSeparator());					
					bPaises.write(String.format("%-11s %-11s %-11s %-11s%s","Pais","Ouro","Prata","Bronze",System.lineSeparator()));
															
					for (int i = 0; i < listaPaises.size(); i++) {
						Pais getPaises = listaPaises.get(i);
											
						//bPaises.write(getPaises.getNome()+"\t"+getPaises.getOuro()+"\t"+getPaises.getPrata()+"\t"+getPaises.getBronze()+"\n");
						
						bPaises.write(String.format("%-11s %-11s %-11s %-11s%s",getPaises.getNome(),getPaises.getOuro(),getPaises.getPrata(),getPaises.getBronze(),System.lineSeparator() ));
						
						//bEscrita5.write(String.format("%-11s %s\n",getGinastica.getNome(), resultado));
						
					}
					
					bPaises.close();
					
					
				}else{
					System.out.println("Erro: tipo de estatística "+tokens[0]+ " não existente.");
				}
											
			}
			
			leitor.close();
		}catch (ArrayIndexOutOfBoundsException e) {
			  System.out.println("Erro: "+e);
		}	
		
	}

}
