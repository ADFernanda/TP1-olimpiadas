package olimpiadas;

import java.util.Comparator;

public class PaisComparator implements Comparator<Pais> {
	@Override
	public int compare(Pais pais, Pais outroPais) {
        return pais.getNome().
                compareTo(outroPais.getNome());
    }
}
