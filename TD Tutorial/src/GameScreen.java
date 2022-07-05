import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GameScreen extends JPanel{

	public GameScreen() {
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.fillRect(50, 50, 100, 100);
		//g.drawRect(50, 50, 100, 100);
		
	}
	
}
