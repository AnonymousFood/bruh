package VoidQuest;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JFrame;

public class Window extends JFrame implements MouseListener {
	private Menu menu;
	private Game game;
	
	public Window() throws IOException {
		
		this.getContentPane().setBackground(new Color(40,40,40));
        setVisible(true);
        setTitle("Void Quest");
	    setLayout(null);
	    setSize(1920,1080); 
	    
	    // Closes window when X is pressed
        addWindowListener(new WindowAdapter(){  
        	public void windowClosing(WindowEvent e) {  
        		dispose();  
            }  
        });
        menu = new Menu(this);
        game = new Game(this);
	}
	
	public void toggleInput() {
		if(menu.getActive() == true) {
			menu.off();
			game.on();
		}
			else{
				menu.on();
				game.off();
			}
		}

	@Override
	public void mouseClicked(MouseEvent e) {
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