package olimpiadas;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException, NumberFormatException, ParseException {
		
		List<Pais> listaPais = new ArrayList<Pais>();
		EntradasAtletas entradaAtletas = new EntradasAtletas();
		
		
		listaPais = GerenciaEntradas.lePaises();
		entradaAtletas = GerenciaEntradas.leAtletas(listaPais);
		
		Ranking.rank(entradaAtletas);
		
		
		Estatisticas.criaEstatisticas(entradaAtletas, listaPais);
		
		System.out.println("Terminou");
		
	}
	
}
