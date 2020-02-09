
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Menu extends JFrame implements MouseListener {
	private Button playButton = new Button();
	private Button closeButton = new Button();
	private Window window;
	private JLabel logo;
	private JLabel background;
	private boolean isOn = true;
	
	public Menu(Window x) throws IOException {
		window = x;
		
        // Adds Play Button
		window.initButton(playButton, "Play Void Quest");
		playButton.setBounds(150,500,300,80);
		playButton.addMouseListener(this);
		x.add(playButton);

		// Adds close button
		window.initButton(closeButton, "Quit");
		closeButton.setBounds(800 ,500, 300, 80);
		closeButton.addMouseListener(this);
		x.add(closeButton);
		
		// Adds main menu image
		BufferedImage myPicture = ImageIO.read(new File("newMainMenu.png"));
		logo = new JLabel(new ImageIcon(myPicture));
		logo.setBounds(50, 150, 1152, 206);
		x.add(logo);
		
		// Adds main menu image
		BufferedImage myPicture2 = ImageIO.read(new File("space3.jpg"));
		background = new JLabel(new ImageIcon(myPicture2));
		background.setBounds(0, 0, 1920, 1080);
		x.add(background);
		
		off();
		on();
		off();
		on();
	}
	
	public void on() {
		logo.setEnabled(true);
		background.setEnabled(true);
		playButton.setEnabled(true);
		closeButton.setEnabled(true);
		logo.setVisible(true);
		background.setVisible(true);
		playButton.setVisible(true);
		closeButton.setVisible(true);
		
		isOn = true;
	}
	
	public void off() {
		logo.setEnabled(false);
		background.setEnabled(false);
		playButton.setEnabled(false);
		closeButton.setEnabled(false);
		logo.setVisible(false);
		background.setVisible(false);
		playButton.setVisible(false);
		closeButton.setVisible(false);
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