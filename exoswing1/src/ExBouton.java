import java.awt.*;
import javax.swing.*;

public class ExBouton extends JFrame{
	public ExBouton() {
		super();
		JPanel panel = new JPanel(new BorderLayout());
		
		JLabel label = new JLabel("Exemple de bouton");
		panel.add(label, BorderLayout.NORTH);
		
		JLabel label1 = new JLabel("label EAST");
		panel.add(label1, BorderLayout.EAST);
					
		JButton b = new JButton("Quitter");
		panel.add(b, BorderLayout.SOUTH);
		
		JButton b1 = new JButton("WEST");
		panel.add(b1, BorderLayout.WEST);

		this.setContentPane(panel);
		
		this.pack();
	}

	public static void main(String[] args) {
					ExBouton bouton = new ExBouton();
					bouton.setVisible(true);
	}
}