package olimpiadas;

import java.util.Collections;

public class Ranking{
 
	public static EntradasAtletas rank(EntradasAtletas atletas){
		
		
		AtletaComparator comparator1 = new  AtletaComparator();
		Collections.sort(atletas.listaCorrida, comparator1);
		Collections.sort(atletas.listaCorrida);
		
		AtletaComparator comparator2 = new  AtletaComparator();
		Collections.sort(atletas.listaNatacao, comparator2);
		Collections.sort(atletas.listaNatacao);
		
		AtletaComparator comparator3 = new  AtletaComparator();
		Collections.sort(atletas.listaLevantamento, comparator3);
		Collections.sort(atletas.listaLevantamento);
		
		AtletaComparator comparator4 = new  AtletaComparator();
		Collections.sort(atletas.listaSalto, comparator4);
		Collections.sort(atletas.listaSalto);
		
		AtletaComparator comparator5 = new  AtletaComparator();
		Collections.sort(atletas.listaGinastica, comparator5);
		Collections.sort(atletas.listaGinastica);

		return atletas;
	}
}
