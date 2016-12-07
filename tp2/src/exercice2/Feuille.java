package exercice2;

public class Feuille implements ExpressionArithmetique
{
	
	public Feuille(int val)
	{
		this.contenu = val;
	}

	private int contenu;
	@Override
	public int evaluer() {
		return contenu;
	}

}
