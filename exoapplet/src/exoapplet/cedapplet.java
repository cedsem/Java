package exoapplet;

import java.awt.Color;

//import javax.swing.JApplet;

import java.awt.Graphics;

import javax.swing.*;

//public class cedapplet extends JApplet {
public class cedapplet extends JApplet {

	/**
	 * Create the applet.
	 */
	public void paint(Graphics g) {
		g.setColor(Color.yellow);
		g.drawString("Appelt JAVA", 10, 10);
		g.fillOval(75, 30, 70, 90);
	}
}
