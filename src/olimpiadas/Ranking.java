package olimpiadas;

import java.util.Collections;

public class Ranking{
 
	public static EntradasAtletas rank(EntradasAtletas atletas){
		
		//ordena por pontua��o
		Collections.sort(atletas.listaCorrida);
		Collections.sort(atletas.listaNatacao);
		Collections.sort(atletas.listaLevantamento);
		Collections.sort(atletas.listaSalto);
		Collections.sort(atletas.listaGinastica);

		return atletas;
	}
}
