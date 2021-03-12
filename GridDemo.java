// Demostration of the Grid Layout

import javax.swing.*;
import java.awt.*;

public class GridDemo
{
	public static void main(String[] args)
	{
		// create the JFrame object and customise it
		JFrame myFrame = new JFrame("Grid Layout Demo");
		myFrame.setBounds(600, 240, 540, 120);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new GridLayout(3, 2));

		// create multiple JButtons objects
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		JButton button5 = new JButton("Button 5");
		JButton button6 = new JButton("Button 6");

		// add the JButtons to the JFrame
		myFrame.add(button1);
		myFrame.add(button2);
		myFrame.add(button3);
		myFrame.add(button4);
		myFrame.add(button5);
		myFrame.add(button6);

		// make the JFrame visible
		myFrame.setVisible(true);

	}
}