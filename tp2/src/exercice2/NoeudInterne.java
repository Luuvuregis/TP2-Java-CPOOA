package exercice2;

public class NoeudInterne implements ExpressionArithmetique
{
	private ExpressionArithmetique filsGauche;
	private ExpressionArithmetique filsDroit;
	private char contenu;
	
	public NoeudInterne(ExpressionArithmetique fg, ExpressionArithmetique fd, char c){
		filsGauche = fg;
		filsDroit = fd;
		contenu = c;
	}
	
	@Override
	public int evaluer() 
	{
		switch (contenu) 
		{
		case '*':
			return filsGauche.evaluer() * filsDroit.evaluer();
		case '+':
			return filsGauche.evaluer() + filsDroit.evaluer();
		case '-':
			return filsGauche.evaluer() - filsDroit.evaluer();
		default:
			return filsGauche.evaluer() / filsDroit.evaluer();
		}
	}
	
}
