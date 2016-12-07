package exercice3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

@SuppressWarnings("serial")
public class VueTexte extends Vue 
{
	final int LARGEUR = 250;
	final int LONGUEUR = 500;
	private JTextField barr;
	
	public VueTexte(Thermometre thermo)
	{
		super(thermo, "Vue TexteBar");
		configureVueTexte();
		setSize(LONGUEUR, LARGEUR);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
	}

	void configureVueTexte()
	{
		JPanel PanelBar = new JPanel();
		PanelBar.setLayout(new BorderLayout());
		
		JLabel lab = new JLabel("Format Text");
		
		barr = new JTextField();
		barr.setPreferredSize(new Dimension(150, 20));
		barr.setText(Integer.toString(t.getTemperatureCourante()));
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	t.setTemperatureCourante(t.getTemperatureCourante() + 1);
            	}
        });
		
		JButton moins = new JButton("-");
		moins.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	t.setTemperatureCourante(t.getTemperatureCourante() - 1);
            	if(t.getTemperatureCourante() <= -70)
            		moins.setEnabled(false);
            	else
            		moins.setEnabled(true);
            	}
            });
		
		JPanel North = new JPanel();
		JPanel Center = new JPanel();
		JPanel South = new JPanel();
		
		PanelBar.add(North, BorderLayout.NORTH);
		PanelBar.add(South, BorderLayout.SOUTH);
		PanelBar.add(Center, BorderLayout.CENTER);
		
		South.setLayout(new GridLayout());
		South.add(plus);
		South.add(moins);
		
		North.add(lab);
		Center.add(barr);
		
		add(PanelBar);
	
	}

	
	void mettreAJour(Thermometre t) 
	{
		
		barr.setText(Integer.toString(t.getTemperatureCourante()));
	}
	

}
