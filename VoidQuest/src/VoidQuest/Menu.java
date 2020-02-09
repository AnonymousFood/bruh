package VoidQuest;

import java.awt.*;
import java.awt.event.*;

public class Menu extends Frame implements MouseListener {
	private Button playButton = new Button();
	private Button closeButton = new Button();
	private Window window;
	private boolean isOn = true;
	
	public Menu(Window x) {
		window = x;
        // Adds Play Button
		playButton.setBounds(100,100,300,80);
		playButton.setLabel("Play Void Quest");
		playButton.addMouseListener(this);
		x.add(playButton);

		// Adds close button
		closeButton.setBounds(100,200, 300, 80);
		closeButton.setLabel("Quit");
		closeButton.addMouseListener(this);
		x.add(closeButton);
	}
	
	public void on() {
		playButton.setEnabled(true);
		closeButton.setEnabled(true);

		playButton.setVisible(true);
		closeButton.setVisible(true);
		isOn = true;
	}
	
	public void off() {
		playButton.setEnabled(false);
		closeButton.setEnabled(false);

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
			playButton.setLabel("pressed");
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
