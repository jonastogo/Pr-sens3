package gp2.p3.ex1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Implements the main frame of a simple switch game.
 * 
 * @author swalther
 * 
 */
@SuppressWarnings("serial")
public class SwitchGame extends JFrame {

	/**
	 * Number of lamps to use
	 */
	private static final int LAMPS = 5;

	SwitchGame(String title) {
		super(title);

		this.setSize(800, 800);
		this.setLayout(new BorderLayout());

		LampPanel lampPanel = new LampPanel(LAMPS);
		this.add(lampPanel, BorderLayout.CENTER);
		JPanel buttonpane = new JPanel();
		this.add(buttonpane);

		BoxLayout layout = new BoxLayout(buttonpane, BoxLayout.Y_AXIS);
		buttonpane.setLayout(layout);

		for (int i = 0; i < LAMPS; i++) {
			int j = i + 1;
			JButton b = new JButton("Lampe: " + j);
			buttonpane.add(b);
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(j-1);
					LampPanel.schalte(j-1);
					getContentPane().repaint();
				}
			});
			System.out.println("Button:" + j + " erzeugt");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame game = new SwitchGame("The SWITCH Game");

		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setVisible(true);
	}
}
