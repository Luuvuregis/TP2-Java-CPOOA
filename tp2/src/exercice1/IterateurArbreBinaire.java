package exercice1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterateurArbreBinaire <T> implements Iterator<T> {

	ArbreBinaire<T> suivant;
	public IterateurArbreBinaire(ArbreBinaire <T> noeud) 
	{
		suivant = getNoeudLePlusAGauche(noeud);		
	}
	
	
	private ArbreBinaire<T> getNoeudLePlusAGauche(ArbreBinaire<T> noeud) 
	{
		if(noeud.getFilsGauche() != null)
			return getNoeudLePlusAGauche(noeud.getFilsGauche());
		return noeud;
	}


	@Override
	public boolean hasNext() 
	{
		return suivant != null;
	}

	@Override
	public T next() 
	{
		if (suivant == null) throw new NoSuchElementException();
		T contenu = suivant.getContenu();
		setSuivant();
		return contenu;
	}


	private void setSuivant() 
	{
		if (suivant.getFilsDroit() != null)
			suivant = getNoeudLePlusAGauche(suivant.getFilsDroit());
		else
		{
			ArbreBinaire <T> pere = suivant.getFilsDroit();
			ArbreBinaire <T> noeudAuxilliaire = suivant;
			while(pere != null && pere.getFilsDroit() != noeudAuxilliaire)
			{
				noeudAuxilliaire = pere;
				pere = pere.getPere();
			}
			suivant = pere;
		}
			
	}

}
