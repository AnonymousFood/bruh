package VoidQuest;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Game extends Frame implements MouseListener {
	private Button menuButton = new Button();
	private Button forwardButton = new Button();
	private Button backwardButton = new Button();
	private Window window;
	private JTextField inputField = new JTextField();
	private JLabel label = new JLabel("My label");
	private JLabel background;
	private boolean isOn = false;
	private int storyPoint = 0;
	
	public Game(Window x) throws IOException {
		window = x;
		setBackground(new Color(50,50,50));
		
		// Adds menu button
		window.initButton(menuButton, "Main Menu");
		menuButton.setBounds(40,40,300,80);
		menuButton.addMouseListener(this);
		x.add(menuButton);
		
		// Adds button to go forward
		window.initButton(forwardButton, "=>");
		forwardButton.setBounds(680, 595, 120, 60);
		forwardButton.addMouseListener(this);
		x.add(forwardButton);
		
		// Adds button to go backward
		window.initButton(backwardButton, "<=");
		backwardButton.setBounds(400, 595, 120, 60);
		backwardButton.addMouseListener(this);
		x.add(backwardButton);
		
		// Adds promptLabel
		label.setText("Your name is Rick Astley");
		label.setBackground(new Color(0,0,0));
		label.setOpaque(true);
		label.setForeground(new Color(255,0,0));
		label.setBounds(200, 500, 800, 60);
		label.setFont(new Font("Serif", Font.PLAIN, label.getHeight() /2));
		x.add(label);
		
		// Adds background
		BufferedImage myPicture = ImageIO.read(new File("space3.jpg"));
		background = new JLabel(new ImageIcon(myPicture));
		background.setBounds(0, 0, 1920, 1080);
		x.add(background);
		
		off();	
	}
	
	public void on() {
		label.setEnabled(true);
		label.setVisible(true);
		menuButton.setEnabled(true);
		menuButton.setVisible(true);
		inputField.setEnabled(true);
		inputField.setVisible(true);
		forwardButton.setEnabled(true);
		forwardButton.setVisible(true);
		backwardButton.setEnabled(true);
		backwardButton.setVisible(true);
		background.setEnabled(true);
		background.setVisible(true);
		
		isOn = true;
	}
	
	public void off() {
		menuButton.setEnabled(false);
		menuButton.setVisible(false);	
		inputField.setEnabled(false);
		inputField.setVisible(false);
		label.setEnabled(false);
		label.setVisible(false);		
		forwardButton.setEnabled(false);
		forwardButton.setVisible(false);
		backwardButton.setEnabled(false);
		backwardButton.setVisible(false);
		background.setEnabled(false);
		background.setVisible(false);
		
		isOn = false;
	}
	
	public boolean getActive() {
		return isOn;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == menuButton) {
			window.toggleInput();
		} else if (e.getSource() == forwardButton) {
			storyPoint++;
			storyText(storyPoint);
			System.out.println(storyPoint);
		} else if (e.getSource() == backwardButton) {
			if(storyPoint > 0) {
			storyPoint--;
			}
			storyText(storyPoint);
		}
	}
	private void storyText(int storyPoint2) {	
		switch(storyPoint) {
		  case 0:
			  label.setText("Your name is Rick Astley");
		    break;
		  case 1:
			  label.setText("You are lost");
		    break;
		  case 2:
			  label.setText("waaa");
		    break;
		  case 3:
			  label.setText("never");
		    break;
		  case 4:
			  label.setText("You are lost");
		    break;
		    
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
}
