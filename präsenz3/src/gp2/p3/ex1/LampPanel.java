package gp2.p3.ex1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

/**
 * Implements a JPanel to draw lamps.
 * 
 * @author swalther
 * 
 */
@SuppressWarnings("serial")
public class LampPanel extends JPanel {

	private static List<Lamp> lamps;

	LampPanel(int noOfLamps) {
		this.setSize(600, 600);
		this.lamps = createLamps(noOfLamps);
	}

	/**
	 * Creates the specified number of lamps as drawable lamps.
	 * 
	 * @param noOfLamps
	 * @return
	 */
	private List<Lamp> createLamps(int noOfLamps) {
		List<Lamp> lamps = new ArrayList<Lamp>();

		int offset = 10;
		int x = 100;
		int y = 50;

		// First lamp
		lamps.add(new Lamp(String.format("%d:", 1), offset + x + x / 2, offset
				+ y));
		y += 50;

		// First half of rest
		for (int i = 1; i <= (noOfLamps - 1) / 2; i++) {
			lamps.add(new Lamp(String.format("%d:", i + 1), offset + x, offset
					+ y));
			y += 50;
		}

		// Second half, draw upwards
		for (int i = (noOfLamps - 1) / 2 + 1; i < noOfLamps; i++) {
			y -= 50;
			lamps.add(new Lamp(String.format("%d:", i + 1), offset + 2 * x,
					offset + y));
		}

		boolean on = true;

		// Switch every other lamp on or off.
		for (Lamp lamp : lamps) {
			if (on) {
				lamp.setColor(Lamp.COLOR_ON);
			} else {
				lamp.setColor(Lamp.COLOR_OFF);
			}
			on = !on;
		}

		return lamps;
	}

	@Override
	public void paint(Graphics g) {
		// TODO draw the lamps here and call repaint() where appropriate
		for (Lamp l : lamps) {
			g.setColor(l.getColor());
			g.fillOval(l.getX(), l.getY(), 20, 20);
			g.setColor(Color.BLACK);
			g.drawString(l.getName(), l.getX()+7, l.getY()+15);
			g.setColor(Color.BLACK);
			g.drawOval(l.getX(), l.getY(), 20, 20);
		}
	}

	public static void schalte(int i) {
		System.out.println(lamps.size());
		if (i == lamps.size() - 1) {
			lamps.get(i - 1).vertausche();
			lamps.get(i).vertausche();
			lamps.get(0).vertausche();
			System.out.println("Hier1");
		} else {
			if (i == 0) {
				lamps.get(i).vertausche();
				lamps.get(i + 1).vertausche();
				lamps.get(lamps.size() - 1).vertausche();
				System.out.println("Hier2");
			} else {
				lamps.get(i-1).vertausche();
				lamps.get(i).vertausche();
				lamps.get(i+1).vertausche();
				System.out.println("Hier3");
			}
		}
	}

}
