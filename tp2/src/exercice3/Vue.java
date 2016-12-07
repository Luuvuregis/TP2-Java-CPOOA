package exercice3;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public abstract class Vue extends JFrame
{
	protected Thermometre t;
	public Vue(Thermometre thermo, String title)
	 {
		super(title);
	  	t = thermo;
	 }
	 
	abstract void mettreAJour(Thermometre t);
}

