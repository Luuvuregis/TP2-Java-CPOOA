package exercice1;

import java.util.Iterator;

public class Client 
{
	public static ArbreBinaire<String> feuille (String mot)
	{
		return new ArbreBinaire<String>(null, mot, null);
	}
	
	public static ArbreBinaire<String> noeudInterne(ArbreBinaire<String> a1, String mot, ArbreBinaire<String> a2)
	{
		return new ArbreBinaire<String>(a1, mot, a2);
	}
	
	public static void main(String argc [])
	{
		ArbreBinaire <String> a1 = noeudInterne(noeudInterne(null, "2", feuille("4")),"1", feuille("3"));	
	
		for(Iterator<String> it = new IterateurArbreBinaire<String>(a1); it.hasNext();)
		{
			System.out.println(it.next());
		}
		
	}
}


