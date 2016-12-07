package exercice2;

public class Affichage 
{
	public static void main(String[] args) 
	{
		//Exo 2
		ExpressionArithmetique e = new NoeudInterne(new NoeudInterne(new Feuille(2),new Feuille(3),'+'), new Feuille(5), '*');
		System.out.println(e.evaluer());     
	}

}
