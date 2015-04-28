package gp2.p3.ex1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class sogehtdas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public int counter = 0;
	private static int LAMPS;
	
	/**
	 * Create the frame.
	 */
	public sogehtdas(String title, int lampen) {
		super(title);
		this.LAMPS = lampen;
		LampPanel panel_1 = new LampPanel(LAMPS);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 150+LAMPS*25);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JLabel zuege = new JLabel("Anzahl Züge: "+counter);
		JPanel panel_2 = new JPanel();
		panel_2.add(zuege);

		for (int i = 0; i < LAMPS; i++) {
			int j = i + 1;
			JButton b = new JButton("Lampe: " + j);
			panel.add(b);
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(j - 1);
					LampPanel.schalte(j - 1);
					getContentPane().repaint();
					counter++;
					zuege.setText("Anzahl Züge: "+counter);
				}
			});

			contentPane.add(panel_1, BorderLayout.CENTER);

			contentPane.add(panel_2, BorderLayout.NORTH);
			
			panel_2.add(zuege);
		}
	}
}
