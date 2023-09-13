package comparableXcomparator;

import java.util.Comparator;
// Classe para comparar Livro por ano
public class CompararAno implements Comparator<Livro> {
	@Override
	public int compare(Livro l1, Livro l2) {
		return Integer.compare(l1.getAno(), l2.getAno());
		/*
		if (l1.getAno() < l2.getAno())
			return -1;
		if (l1.getAno() > l2.getAno())
			return 1;
		else
			return 0;
		 */
	}
}