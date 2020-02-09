import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window extends Frame implements MouseListener {
	private Menu menu;
	private Game game;
	
	public Window() {
		
        setVisible(true);
        setTitle("Void Quest");
	    setLayout(null);
	    setSize(1920,1080); 
	    setBackground(new Color(50,50,50));
	    
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