package managers;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import helpz.LoadSave;
import objects.Tile;

public class TileManager {

	public Tile GRASS, WATER, ROAD;
	private BufferedImage atlas;
	public ArrayList<Tile> tiles = new ArrayList<>();

	public TileManager() {

		loadAtalas();
		createTiles();

	}

	private void createTiles() {

		int id = 0;
		tiles.add(GRASS = new Tile(getSprite(8, 1), id++, "Grass"));
		tiles.add(WATER = new Tile(getSprite(0, 6), id++, "Water"));
		tiles.add(ROAD = new Tile(getSprite(9, 0), id++, "Road"));

	}

	private void loadAtalas() {

		atlas = LoadSave.getSpriteAtlas();

	}

	public Tile getTile(int id) {
		return tiles.get(id);
	}

	public BufferedImage getSprite(int id) {
		return tiles.get(id).getSprite();
	}

	private BufferedImage getSprite(int xCord, int yCord) {
		return atlas.getSubimage(xCord * 32, yCord * 32, 32, 32);
	}

}
