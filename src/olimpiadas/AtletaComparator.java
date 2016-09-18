package olimpiadas;

import java.util.Comparator;

public class AtletaComparator implements Comparator<Atleta> {
	@Override
	public int compare(Atleta atleta, Atleta outroAtleta) {
        return outroAtleta.getNome().
                compareTo(atleta.getNome());
    }
}
