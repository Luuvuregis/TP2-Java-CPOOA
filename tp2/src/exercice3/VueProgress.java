package exercice3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

@SuppressWarnings("serial")
public class VueProgress extends Vue
{
	final int LARGEUR = 250;
	final int LONGUEUR = 600;
	private JProgressBar PBar;

	public VueProgress(Thermometre thermo) 
	{
		super(thermo, "Vue Progressive");
		configureVueProgress();
		setSize(LONGUEUR, LARGEUR);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pack();
		setVisible(true);

	}

	private void configureVueProgress() 
	{
		JPanel PanProgress = new JPanel();
		PBar = new JProgressBar();
		PBar.setPreferredSize(new Dimension(150, 30));
		PBar.setMaximum(70);
		PBar.setMinimum(-70);
		PBar.setStringPainted(true);
		PBar.setString(Integer.toString(t.getTemperatureCourante()));
		PanProgress.setLayout(new BorderLayout());
		
		JPanel Center = new JPanel();
		Center.add(PBar);
		PanProgress.add(Center, BorderLayout.CENTER);
		JPanel South = new JPanel();
		PanProgress.add(South, BorderLayout.SOUTH);
		JPanel North = new JPanel();
		PanProgress.add(North, BorderLayout.NORTH);
		JLabel labP = new JLabel("Format Progress");
		North.add(labP);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                t.setTemperatureCourante(t.getTemperatureCourante() + 1);
                PBar.setString(Integer.toString(t.getTemperatureCourante()) + " " + "°C");
            }
        });
		
		JButton moins = new JButton("-");
		moins.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	t.setTemperatureCourante(t.getTemperatureCourante() - 1);
            	PBar.setString(Integer.toString(t.getTemperatureCourante()) + " " + "°C");
            }
            });
		
		South.add(moins);
		South.add(plus);
		
		add(PanProgress);
		
	}

	@Override
	void mettreAJour(Thermometre t) 
	{
		PBar.setValue(t.getTemperatureCourante());
		PBar.setString(Integer.toString(t.getTemperatureCourante()) + " " + "°C");
		
	}

}
