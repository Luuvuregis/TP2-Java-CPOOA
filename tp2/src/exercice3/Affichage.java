package exercice3;

public class Affichage {

	public static void main(String[] args) 
	{
		Thermometre t = new Thermometre();
		t.setTemperatureCourante(20);
		Vue v1 = new VueTexte(t);
		Vue v2 = new VueSlider(t);
		Vue v3 = new VueProgress(t);
		t.addVue(v1);
		t.addVue(v2);
		t.addVue(v3);
		t.notifierVues();
	}

}
