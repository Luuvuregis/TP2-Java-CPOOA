package exercice1;

import java.util.Iterator;

public class ArbreBinaire <T> implements Iterable<T>
{
	private T element;
	private ArbreBinaire <T> fDroit;
	private ArbreBinaire <T> fGauche;
	private ArbreBinaire<T> pere;
	
	public ArbreBinaire(ArbreBinaire <T> filsGauche, T elm, ArbreBinaire<T> filsDroit)
	{
		element = elm;
		fGauche = filsGauche;
		fDroit = filsDroit;
		if (filsGauche != null)
			fGauche.pere = this;
		if(filsDroit != null)
			fDroit.pere = this;
	}

	public ArbreBinaire<T> getFilsGauche() {
		return fGauche;
	}
	
	public ArbreBinaire<T> getFilsDroit() {
		return fDroit;
	}

	public T getContenu() {
		return element;
	}

	public ArbreBinaire<T> getPere() {
		return pere;
	}


	public Iterator<T> iterator() {
		
		return null;
	}
}


