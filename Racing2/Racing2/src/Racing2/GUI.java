package Racing2;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;




public class GUI extends JFrame {
	int WIDTH = 500;
	int HEIGHT = 800;
	
	private Image game_screen = new ImageIcon("bgg.gif").getImage();
	
	public GUI() {
		setTitle("Racing");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		init();
	}
	
	
	private void init() {
		

	}
	
	public void drawing(Graphics g) {
		g.drawImage(game_screen, 0, 0, null);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	

}
