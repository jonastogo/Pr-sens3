package gp2.p3.ex1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Starter extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Starter frame = new Starter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Starter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Bitte geben sie die Anzahl der Lampen ein. Hurensohn...");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JButton starter = new JButton("Start");
		contentPane.add(starter, BorderLayout.SOUTH);
		starter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sogehtdas frame1 = new sogehtdas("Doppelt, du Bot", Integer.parseInt(textField.getText()));
				frame1.setVisible(true);
				dispose();
			}
		});
	}

}
