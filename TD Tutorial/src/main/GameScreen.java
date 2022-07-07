package main;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class GameScreen extends JPanel{

	private Game game;
	private Dimension size;
	
	public GameScreen(Game game) {
		this.game = game;
		
		setPanelSize();
	}
	
	private void setPanelSize() {
		size = new Dimension(640, 640);
		
		setMinimumSize(size);
		setPreferredSize(size);
		setMaximumSize(size);
		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		game.getRender().render(g);
		
//		g.drawImage(sprites.get(19), 0, 0, null);
		
//		BufferedImage i = img.getSubimage(32 * 0, 32, 32, 32);
//		g.drawImage(i, 0, 0, null);
		
//		repaint();
	}
	
}
