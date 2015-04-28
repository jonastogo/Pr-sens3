package gp2.p3.ex1;

import java.awt.Color;

/**
 * Simple drawable circle that represents a lamp.
 * 
 * @author swalther
 * 
 */
public class Lamp {

	static final Color COLOR_ON = new Color(0, 255, 0);
	static final Color COLOR_OFF = new Color(255, 0, 0);

	static final int DIAMETER = 15;

	private String name;
	private int x;
	private int y;

	private Color color;

	/**
	 * Creates a lamp with a given name/label and a position in pixel.
	 * 
	 * @param name
	 * @param x
	 * @param y
	 */
	public Lamp(String name, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.color = Color.BLACK;
	}

	/**
	 * Sets the color of the lamp.
	 * 
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Gets the color of the lamp.
	 * 
	 * @return
	 */
	public Color getColor() {
		return this.color;
	}

	/**
	 * Gets the name of the lamp.
	 * 
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Gets the X coordinate.
	 * 
	 * @return
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * Gets the Y coordinate.
	 * 
	 * @return
	 */
	public int getY() {
		return this.y;
	}
	
	public void vertausche(){
		System.out.println("vertascuhe");
		if(this.getColor()==Lamp.COLOR_OFF){
			this.setColor(Lamp.COLOR_ON);
		}else{
			this.setColor(Lamp.COLOR_OFF);
		}
	}

}
