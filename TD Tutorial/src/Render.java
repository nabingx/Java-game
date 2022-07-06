import java.awt.Graphics;

public class Render {

	private GameScreen gameScreen;
	
	public Render(GameScreen gameScreen) {
		this.gameScreen = gameScreen;
	}
	
	public void render(Graphics g) {
		
		switch(GameStates.gameStates) {
		
		case MENU:
			
			break;
		case PLAYING:
			
			break;
		case SETTINGS:
			
			break;
		
		}
		
	}
	
}
