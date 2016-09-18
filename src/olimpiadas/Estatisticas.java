package olimpiadas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Estatisticas {
	
	
	public static void criaEstatisticas(EntradasAtletas atletas) throws IOException {

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
						//////////////////////////////////////
						arqSaida = "estatistica-1-1.txt";
						BufferedWriter bEscrita1 = new BufferedWriter(new FileWriter(arqSaida));
						Scanner in1 = new Scanner(System.in);
												 
						bEscrita1.append("Corrida\n\n");
						
						//////////////////////////////////////////////////////////////////////////
						for (int i = 0; i < atletas.listaCorrida.size(); i++) {
							AtletaCorrida getCorrida = atletas.listaCorrida.get(i);
							
							bEscrita1.append(getCorrida.getNome()+"\t"+getCorrida.getPontuacao());
							
						}
						
						///////////////////////////////////////////////////////////////////////////
						
						
						bEscrita1.close();
						//////////////////////////////////////
						break;
					case 2:
						arqSaida = "estatistica-1-2.txt";
						BufferedWriter bEscrita2 = new BufferedWriter(new FileWriter(arqSaida));
						Scanner in2 = new Scanner(System.in);
												 
						bEscrita2.append("Natação\n\n");
						
						for (int i = 0; i < atletas.listaNatacao.size(); i++) {
							AtletaNatacao getNatacao = atletas.listaNatacao.get(i);
							
							bEscrita2.append(getNatacao.getNome()+"\t"+getNatacao.getPontuacao());
							
						}
						
						bEscrita2.close();
						
						break;
					case 3:
						arqSaida = "estatistica-1-3.txt";
						BufferedWriter bEscrita3 = new BufferedWriter(new FileWriter(arqSaida));
						Scanner in3 = new Scanner(System.in);
												 
						bEscrita3.append("Levantameto de peso\n\n");
						
						for (int i = 0; i < atletas.listaLevantamento.size(); i++) {
							AtletaLevantamento getLevantamento = atletas.listaLevantamento.get(i);
							
							bEscrita3.append(getLevantamento.getNome()+"\t"+getLevantamento.getPontuacao());
							
						}
						
						bEscrita3.close();
						
						break;
					case 4:
						arqSaida = "estatistica-1-4.txt";
						BufferedWriter bEscrita4 = new BufferedWriter(new FileWriter(arqSaida));
						Scanner in4 = new Scanner(System.in);
												 
						bEscrita4.append("Salto em altura\n\n");
						
						for (int i = 0; i < atletas.listaSalto.size(); i++) {
							AtletaSalto getSalto = atletas.listaSalto.get(i);
							
							bEscrita4.append(getSalto.getNome()+"\t"+getSalto.getPontuacao());
							
						}
						
						bEscrita4.close();
						
						break;
					case 5:
						arqSaida = "estatistica-1-5.txt";
						BufferedWriter bEscrita5 = new BufferedWriter(new FileWriter(arqSaida));
						Scanner in5 = new Scanner(System.in);
												 
						bEscrita5.append("Ginástica artística\n\n");
						
						for (int i = 0; i < atletas.listaGinastica.size(); i++) {
							AtletaGinastica getGinastica = atletas.listaGinastica.get(i);
							
							bEscrita5.append(getGinastica.getNome()+"\t"+getGinastica.getPontuacao());
							
						}
						
						bEscrita5.close();
						
						break;
					default:
						 System.out.println("Erro: esporte procurado não existente");
						break;
					}
					
				}else if(Integer.parseInt(tokens[0]) == 2){
					//fazer
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
