package VoidQuest;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Game extends Frame implements MouseListener {
	private Button menuButton = new Button();
	private Window window;
	private JTextField inputField = new JTextField();
	private JLabel label = new JLabel("My label");
	private boolean isOn = false;
	
	public Game(Window x) {
		window = x;
		setBackground(new Color(50,50,50));
		
		// Adds menu button
		menuButton.setBounds(40,40,300,80);
		menuButton.setLabel("Main Menu");
		menuButton.addMouseListener(this);
		menuButton.setFont(new Font("Serif", Font.PLAIN, 40));
		menuButton.setBackground(new Color(0, 0, 0));
		menuButton.setForeground(new Color(255, 255, 0));
		x.add(menuButton);
		
		// Adds input field
		inputField.setBounds(100, 400, 200, 50);
		inputField.setFont(new Font("Serif", Font.PLAIN, 20));
		x.add(inputField);
		
		// Adds promptLabel
		label.setText("Enter your name.");
		label.setBackground(new Color(255,0,0));
		label.setForeground(new Color(255,0,0));
		label.setSize(300, 30);
		label.setLocation(100, 200);
		label.setFont(new Font("Serif", Font.PLAIN, label.getHeight() - 2));
		x.add(label);

		off();	
	}
	
	public void on() {
		label.setEnabled(true);
		label.setVisible(true);
		menuButton.setEnabled(true);
		menuButton.setVisible(true);
		inputField.setEnabled(true);
		inputField.setVisible(true);
		
		isOn = true;
	}
	
	public void off() {
		menuButton.setEnabled(false);
		menuButton.setVisible(false);	
		inputField.setEnabled(false);
		inputField.setVisible(false);
		label.setEnabled(false);
		label.setVisible(false);
		
		isOn = false;
	}
	
	public boolean getActive() {
		return isOn;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == menuButton) {
			window.toggleInput();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
