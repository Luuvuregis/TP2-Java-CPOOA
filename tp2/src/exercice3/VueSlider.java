package exercice3;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class VueSlider extends Vue
{

	final int LARGEUR = 500;
	final int LONGUEUR = 500;
	final int TemperatureMax = 70;
	final int TemperatureMin = -70;
	private JSlider slid = new JSlider(JSlider.VERTICAL);
	
	public VueSlider(Thermometre thermo) 
	{
		super(thermo, "Vue Slider");
		configureVueSlider();
		setSize(LONGUEUR, LARGEUR);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	void configureVueSlider() 
	{
		//JLabel labSlid = new JLabel("Format Slide");
		slid.setMaximum(TemperatureMax);
		slid.setMinimum(TemperatureMin);
		slid.setValue(t.getTemperatureCourante());
		slid.setPaintTicks(true);
		slid.setPaintLabels(true);
		slid.setMinorTickSpacing(1);
		slid.setMajorTickSpacing(10);
			slid.addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent evt) {
            	t.setTemperatureCourante(slid.getValue());
            }
            });
		add(slid, BorderLayout.CENTER);
		//add(labSlid, BorderLayout.NORTH);
	}
	
	

	
	void mettreAJour(Thermometre t) 
	{
		slid.setValue(t.getTemperatureCourante());
	}

}
