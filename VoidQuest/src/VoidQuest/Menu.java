package VoidQuest;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Menu extends JFrame implements MouseListener {
	private Button playButton = new Button();
	private Button closeButton = new Button();
	private Window window;
	private JLabel logo;
	private boolean isOn = true;
	
	public Menu(Window x) throws IOException {
		window = x;
        // Adds Play Button
		playButton.setBounds(150,500,300,80);
		playButton.setLabel("Play Void Quest");
		playButton.addMouseListener(this);
		playButton.setFont(new Font("Serif", Font.PLAIN, 40));
		playButton.setBackground(new Color(0, 0, 0));
		playButton.setForeground(new Color(255, 255, 0));
		x.add(playButton);

		// Adds close button
		closeButton.setBounds(800 ,500, 300, 80);
		closeButton.setLabel("Quit");
		closeButton.addMouseListener(this);
		closeButton.setFont(new Font("Serif", Font.PLAIN, 40));
		closeButton.setBackground(new Color(0, 0, 0));
		closeButton.setForeground(new Color(255, 255, 0));
		x.add(closeButton);
		
		
		BufferedImage myPicture = ImageIO.read(new File("newMainMenu.png"));
		logo = new JLabel(new ImageIcon(myPicture));
		logo.setBounds(50, 150, 1152, 206);
		logo.setFont(new Font("Serif", Font.PLAIN, 100));
		logo.setVisible(false);
		logo.setVisible(true);
		x.add(logo);
		
		
	}
	
	public void on() {
		playButton.setEnabled(true);
		closeButton.setEnabled(true);
		logo.setEnabled(true);
		playButton.setVisible(true);
		closeButton.setVisible(true);
		logo.setVisible(true);
		
		isOn = true;
	}
	
	public void off() {
		playButton.setEnabled(false);
		closeButton.setEnabled(false);
		logo.setEnabled(false);
		playButton.setVisible(false);
		closeButton.setVisible(false);
		logo.setVisible(false);
		isOn = false;
	}
	
	public boolean getActive() {
		return isOn;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		window.toggleInput();
		if(e.getSource() == playButton) {
			off();
			
		} else if(e.getSource() == closeButton) {
			closeButton.setLabel("Goodbye!");
				window.dispose();
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