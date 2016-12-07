package exercice3;

import java.util.*;

public class Thermometre 
{
	private int TemperatureCourante;
	private Collection<Vue> ListVue = new ArrayList<Vue>();

	public int getTemperatureCourante() 
	{
		return TemperatureCourante;
	}

	public void setTemperatureCourante(int temperatureCourante) 
	{
		this.TemperatureCourante = temperatureCourante;
		notifierVues();
	}
	
	public void addVue(Vue newVue)
	{
		ListVue.add(newVue);
	}
	
	public void removeVue(Vue newVue)
	{
		ListVue.remove(newVue);
	}
	
	public void notifierVues()
	{
		for(Vue v : ListVue)
			v.mettreAJour(this);
	}

}
