package olimpiadas;

import java.util.Collections;

public class Ranking{
 
	public static EntradasAtletas rank(EntradasAtletas atletas){
		
		//ordena por pontuação
		Collections.sort(atletas.listaCorrida);
		Collections.sort(atletas.listaNatacao);
		Collections.sort(atletas.listaLevantamento);
		Collections.sort(atletas.listaSalto);
		Collections.sort(atletas.listaGinastica);

		return atletas;
	}
}
