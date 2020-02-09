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
	
	private Button ending1 = new Button();
	private Button ending2 = new Button();
	private Button ending3 = new Button();
	private Button ending4 = new Button();
	private Button ending5 = new Button();
	private Button ending6 = new Button();
	private Button ending7 = new Button();
	
	private JTextField inputField = new JTextField();
	private JLabel label = new JLabel("My label");
	private JLabel background;
	private boolean isOn = false;
	private int storyPoint = 0;
	private JLabel goodEnding = new JLabel("Good Ending!");
	private JLabel badEnding = new JLabel("Bad Ending!");
	private JLabel second;
	private JLabel alien;
	private JLabel alienTalkSprite;
	private JLabel backDrop;
	private JLabel alienSad;
	private JLabel alienMad;
	private JLabel alienGlad;
	private JLabel alienBig;
	private JLabel alienRick;
	private JLabel alienBlush;
	private JLabel alienConfuse;
	
	
	public Game(Window x) throws IOException {
		window = x;
		setBackground(new Color(0,0,0));
		
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
		
		
		//Adds options for ending
		window.initButton(ending1, "Yell");
		ending1.setBounds(600, 350, 120, 60);
		ending1.addMouseListener(this);
		x.add(ending1);
		
		window.initButton(ending2, "Scream");
		ending2.setBounds(800, 470, 120, 60);
		ending2.addMouseListener(this);
		x.add(ending2);
		
		window.initButton(ending3, "Smile");
		ending3.setBounds(600, 470, 120, 60);
		ending3.addMouseListener(this);
		x.add(ending3);
		
		window.initButton(ending4, "Laugh");
		ending4.setBounds(400, 470, 120, 60);
		ending4.addMouseListener(this);
		x.add(ending4);
		
		window.initButton(ending5, "Cry");
		ending5.setBounds(400, 595, 120, 60);
		ending5.addMouseListener(this);
		x.add(ending5);

		window.initButton(ending6, "Blush");
		ending6.setBounds(600, 595, 120, 60);
		ending6.addMouseListener(this);
		x.add(ending6);
		
		window.initButton(ending7, "Wubba Lubba Dub Dub!");
		ending7.setBounds(780, 595, 420, 60);
		ending7.addMouseListener(this);
		x.add(ending7);
		
		ending1.setEnabled(false);
		ending1.setVisible(false);
		ending2.setEnabled(false);
		ending2.setVisible(false);
		ending3.setEnabled(false);
		ending3.setVisible(false);
		ending4.setEnabled(false);
		ending4.setVisible(false);
		ending5.setEnabled(false);
		ending5.setVisible(false);
		ending6.setEnabled(false);
		ending6.setVisible(false);
		ending7.setEnabled(false);
		ending7.setVisible(false);
		
		
		// Adds promptLabel
		label.setText(".....");
		label.setBackground(new Color(0,0,0));
		label.setOpaque(true);
		label.setForeground(new Color(255,0,0));
		label.setBounds(200, 500, 800, 60);
		label.setFont(new Font("Serif", Font.PLAIN, label.getHeight() /2));
		x.add(label);
		
		goodEnding.setBackground(new Color(0,0,0));
		goodEnding.setOpaque(true);
		goodEnding.setForeground(new Color(255,0,0));
		goodEnding.setBounds(400, 500, 400, 60);
		goodEnding.setFont(new Font("Serif", Font.PLAIN, label.getHeight() /2));
		x.add(goodEnding);
		goodEnding.setVisible(false);
		
		badEnding.setBackground(new Color(0,0,0));
		badEnding.setOpaque(true);
		badEnding.setForeground(new Color(255,0,0));
		badEnding.setBounds(200, 500, 400, 60);
		badEnding.setFont(new Font("Serif", Font.PLAIN, label.getHeight() /2));
		x.add(badEnding);
		badEnding.setVisible(false);
		
		// Adds Menu background
		BufferedImage myPicture = ImageIO.read(new File("space3.jpg"));
		background = new JLabel(new ImageIcon(myPicture));
		background.setBounds(0, 0, 1920, 1080);
		x.add(background);
		
		//Adds character
		
		BufferedImage talking = ImageIO.read(new File("Alien_Rick.png"));
		alienTalkSprite = new JLabel(new ImageIcon(talking));
		alienTalkSprite.setBounds(750, -40, 600, 600);
		x.add(alienTalkSprite);
		alienTalkSprite.setVisible(false);
		
		
		BufferedImage pose = ImageIO.read(new File("Alien_Rick.png"));
		alien = new JLabel(new ImageIcon(pose));
		alien.setBounds(700, 20, 1000, 1000);
		x.add(alien);
		alien.setVisible(false);
		
		BufferedImage sad = ImageIO.read(new File("Alien_Rick_Sad.png"));
		alienSad = new JLabel(new ImageIcon(sad));
		alienSad.setBounds(700,20,1000,1000);
		x.add(alienSad);
		alienSad.setVisible(false);
		
		
		BufferedImage mad = ImageIO.read(new File("Alien_Rick_ANGRY.png"));
		alienMad = new JLabel(new ImageIcon(mad));
		alienMad.setBounds(700,20,1000,1000);
		x.add(alienMad);
		alienMad.setVisible(false);
		
		BufferedImage glad = ImageIO.read(new File("Alien_Rick_Glad.png"));
		alienGlad = new JLabel(new ImageIcon(glad));
		alienGlad.setBounds(700,20,1000,1000);
		x.add(alienGlad);
		alienGlad.setVisible(false);
		

		BufferedImage brain = ImageIO.read(new File("Alien_Rick_big.png"));
		alienBig = new JLabel(new ImageIcon(brain));
		alienBig.setBounds(700,20,1000,1000);
		x.add(alienBig);
		alienBig.setVisible(false);
		
		BufferedImage confuse = ImageIO.read( new File("Alien_Rick_confused.png"));
		alienConfuse = new JLabel(new ImageIcon(confuse));
		alienConfuse.setBounds(700,20,1000,1000);
		x.add(alienConfuse);
		alienConfuse.setVisible(false);
		
		BufferedImage nervous = ImageIO.read( new File("Alien_Rick_nervos.png"));
		alienBlush = new JLabel(new ImageIcon(nervous));
		alienBlush.setBounds(700,20,1000,1000);
		x.add(alienBlush);
		alienBlush.setVisible(false);
		
		BufferedImage rick = ImageIO.read( new File("Pickle_Rick.png"));
		alienRick = new JLabel(new ImageIcon(rick));
		alienRick.setBounds(700,20,1000,1000);
		x.add(alienRick);
		alienRick.setVisible(false);
		
		//Adds GameBackgrounds
		BufferedImage setting = ImageIO.read(new File("backdrop.jpg"));
		backDrop = new JLabel(new ImageIcon(setting));
		backDrop.setBounds(0, 0, 1920, 1080);
		x.add(backDrop);
		backDrop.setVisible(false);
		
		BufferedImage flashBack = ImageIO.read(new File("space2.jpg"));
		second = new JLabel(new ImageIcon(flashBack));
		second.setBounds(0, 0, 1920, 1080);
		x.add(second);
		second.setVisible(false);
		
		
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
		background.setEnabled(false);
		background.setVisible(false);
		second.setVisible(true);

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
		second.setVisible(true);
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
		} else if (e.getSource() == ending1) {
			storyPoint=100;
			
				storyText(storyPoint);
		
			System.out.println(storyPoint);
		} else if (e.getSource() == ending2) {
			storyPoint = 200;
			
				storyText(storyPoint);
		
			System.out.println(storyPoint);
		} else if (e.getSource() == ending3) {
			storyPoint = 300;
			
				storyText(storyPoint);
		
			System.out.println(storyPoint);
		} else if (e.getSource() == ending4) {
			storyPoint = 400;
			
				storyText(storyPoint);
		
			System.out.println(storyPoint);
		} else if (e.getSource() == ending5) {
			storyPoint = 500;
			
				storyText(storyPoint);
		
			System.out.println(storyPoint);
		} else if (e.getSource() == ending6) {
			storyPoint = 600;
			
				storyText(storyPoint);
		
			System.out.println(storyPoint);
		} else if (e.getSource() == ending7) {
			storyPoint = 700;
			
				storyText(storyPoint);
		
			System.out.println(storyPoint);
		}else if (e.getSource() == backwardButton) {
			if(storyPoint > 0) {
			storyPoint--;
			}
			
				storyText(storyPoint);
		
			
		}
	}
	private void storyText(int storyPoint2)  {	
		switch(storyPoint) {
		  case 0:
			  label.setText("....");
			  window.initButton(forwardButton, "=>");
				forwardButton.setBounds(680, 595, 120, 60);
		    break;
		  case 1:
			  label.setText("You are lost....");
			  window.initButton(forwardButton, "=>");
				forwardButton.setBounds(680, 595, 120, 60);
		    break;
		  case 2:
			  label.setText("Looking around, you realize your crew is gone.");
			  window.initButton(forwardButton, "Check Log Records");
			  forwardButton.setBounds(680, 595, 400, 60);
		    break;
		  case 3:
			  label.setText("You check the log records");
			  window.initButton(forwardButton, "=>");
			forwardButton.setBounds(680, 595, 120, 60);
		    break;
		    
		  case 4:
			  label.setText("SYSTEM MEMORY ERROR: NO RECORDS");
			  window.initButton(forwardButton, "=>");
				forwardButton.setBounds(680, 595, 120, 60);
		    break;
		    
		  case 5:
			  label.setText("The ship is not responding.... No one is piloting either...");
			  window.initButton(forwardButton, "=>");
				forwardButton.setBounds(680, 595, 120, 60);
			  break;
			  
		  case 6:
			
			  break;
			  
		  case 7:
			  
			label.setVisible(true);
			backwardButton.setVisible(true);
			forwardButton.setVisible(true);
			window.initButton(forwardButton, "=>");
			forwardButton.setBounds(680, 595, 120, 60);
			  
		  case 8:
			backDrop.setVisible(true);
			label.setText("You wake up on a strange planet....");
		  	window.initButton(forwardButton, "Leave ship.");
			forwardButton.setBounds(680, 595, 300, 60);
			break;
		  case 9:
			  label.setText("You step out of your space ship, the sky is so red.");
			 window.initButton(forwardButton, "=>");
			forwardButton.setBounds(680, 595, 120, 60);
		    break;
		  case 10:
			  label.setText("*THUD*");
			  window.initButton(forwardButton, "=>");
				forwardButton.setBounds(680, 595, 120, 60);
				break;
		  case 11:
			  label.setText("???: 'Hey there!'");
			  window.initButton(forwardButton, "!?");
				forwardButton.setBounds(680, 595, 120, 60);
			  break;
		
		case 12:
			label.setText("You look up to see who is talking and...");
			window.initButton(forwardButton, "=>");
			forwardButton.setBounds(680, 595, 120, 60);
			break;
			
		case 13:
			label.setText("Alien: 'Sup.");
			alien.setVisible(true);
			 window.initButton(forwardButton, "'R-Rick Astley?!'");
			forwardButton.setBounds(680, 595, 400, 60);
			break;
			
		case 14:
			label.setText("Alien: That's Alien Rick Astley to You, bub.");
			 window.initButton(forwardButton, "=>");
				forwardButton.setBounds(680, 595, 120, 60);
				break;
		
		case 15:
			label.setBounds(300, 200, 800, 60);
			forwardButton.setEnabled(false);
			forwardButton.setVisible(false);
			backwardButton.setEnabled(false);
			backwardButton.setVisible(false);
			ending1.setEnabled(true);
			ending1.setVisible(true);
			ending2.setEnabled(true);
			ending2.setVisible(true);
			ending3.setEnabled(true);
			ending3.setVisible(true);
			ending4.setEnabled(true);
			ending4.setVisible(true);
			ending5.setEnabled(true);
			ending5.setVisible(true);
			ending6.setEnabled(true);
			ending6.setVisible(true);
			ending7.setEnabled(true);
			ending7.setVisible(true);
			break;
			
		case 100:
			ending1.setEnabled(false);
			ending1.setVisible(false);
			ending2.setEnabled(false);
			ending2.setVisible(false);
			ending3.setEnabled(false);
			ending3.setVisible(false);
			ending4.setEnabled(false);
			ending4.setVisible(false);
			ending5.setEnabled(false);
			ending5.setVisible(false);
			ending6.setEnabled(false);
			ending6.setVisible(false);
			ending7.setEnabled(false);
			ending7.setVisible(false);
			badEnding.setVisible(true);
			alien.setVisible(false);
			label.setText("Alien Rick Astley: Wow. So Rude!");
			alienSad.setVisible(true);
			break;
		case 200:
			ending1.setEnabled(false);
			ending1.setVisible(false);
			ending2.setEnabled(false);
			ending2.setVisible(false);
			ending3.setEnabled(false);
			ending3.setVisible(false);
			ending4.setEnabled(false);
			ending4.setVisible(false);
			ending5.setEnabled(false);
			ending5.setVisible(false);
			ending6.setEnabled(false);
			ending6.setVisible(false);
			ending7.setEnabled(false);
			ending7.setVisible(false);
			badEnding.setVisible(true);
			alienSad.setVisible(false);
			alien.setVisible(false);
			label.setText("Alien Rick Astley: Get away, smelly!");
			alienMad.setVisible(true);
			break;
		case 300:
			ending1.setEnabled(false);
			ending1.setVisible(false);
			ending2.setEnabled(false);
			ending2.setVisible(false);
			ending3.setEnabled(false);
			ending3.setVisible(false);
			ending4.setEnabled(false);
			ending4.setVisible(false);
			ending5.setEnabled(false);
			ending5.setVisible(false);
			ending6.setEnabled(false);
			ending6.setVisible(false);
			ending7.setEnabled(false);
			ending7.setVisible(false);
			goodEnding.setVisible(true);
			alienSad.setVisible(false);
			alien.setVisible(false);
			label.setText("Alien Rick Astley: Wow, how nice!");
			alienGlad.setVisible(true);
			break;
		case 400:
		ending1.setEnabled(false);
		ending1.setVisible(false);
		ending2.setEnabled(false);
		ending2.setVisible(false);
		ending3.setEnabled(false);
		ending3.setVisible(false);
		ending4.setEnabled(false);
		ending4.setVisible(false);
		ending5.setEnabled(false);
		ending5.setVisible(false);
		ending6.setEnabled(false);
		ending6.setVisible(false);
		ending7.setEnabled(false);
		ending7.setVisible(false);
		goodEnding.setVisible(true);
		alienSad.setVisible(false);
		alien.setVisible(false);
		label.setText("Alien Rick Astley: Haha, aren't I great?!");
		alienBig.setVisible(true);
		break;
		case 500:
			ending1.setEnabled(false);
			ending1.setVisible(false);
			ending2.setEnabled(false);
			ending2.setVisible(false);
			ending3.setEnabled(false);
			ending3.setVisible(false);
			ending4.setEnabled(false);
			ending4.setVisible(false);
			ending5.setEnabled(false);
			ending5.setVisible(false);
			ending6.setEnabled(false);
			ending6.setVisible(false);
			ending7.setEnabled(false);
			ending7.setVisible(false);
			badEnding.setVisible(true);
			alienSad.setVisible(false);
			alien.setVisible(false);
			label.setText("Alien Rick Astley: Um, are you okay...?");
			alienConfuse.setVisible(true);
			break;
		case 600:
			ending1.setEnabled(false);
			ending1.setVisible(false);
			ending2.setEnabled(false);
			ending2.setVisible(false);
			ending3.setEnabled(false);
			ending3.setVisible(false);
			ending4.setEnabled(false);
			ending4.setVisible(false);
			ending5.setEnabled(false);
			ending5.setVisible(false);
			ending6.setEnabled(false);
			ending6.setVisible(false);
			ending7.setEnabled(false);
			ending7.setVisible(false);
			badEnding.setVisible(true);
			alienSad.setVisible(false);
			alien.setVisible(false);
			label.setText("Alien Rick Astley: Oh, um, uh, geez....bye.");
			alienBlush.setVisible(true);
			break;
		case 700:
			ending1.setEnabled(false);
			ending1.setVisible(false);
			ending2.setEnabled(false);
			ending2.setVisible(false);
			ending3.setEnabled(false);
			ending3.setVisible(false);
			ending4.setEnabled(false);
			ending4.setVisible(false);
			ending5.setEnabled(false);
			ending5.setVisible(false);
			ending6.setEnabled(false);
			ending6.setVisible(false);
			ending7.setEnabled(false);
			ending7.setVisible(false);
			goodEnding.setVisible(true);
			goodEnding.setText("Best Ending!");
			alienSad.setVisible(false);
			alien.setVisible(false);
			label.setText("Pickle Alien Rick Astley: I'm Pickle Rick!!!!");
			alienRick.setVisible(true);
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