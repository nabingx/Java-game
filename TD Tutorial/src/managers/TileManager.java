package managers;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import helpz.ImgFix;
import helpz.LoadSave;
import objects.Tile;

public class TileManager {

	public Tile GRASS, WATER, ROAD_LR, ROAD_TB, ROAD_B_TO_R, ROAD_L_TO_B, ROAD_L_TO_T, ROAD_T_TO_R, BL_WATER_CORNER,
			TL_WATER_CORNER, TR_WATER_CORNER, BR_WATER_CORNER, T_WATER, R_WATER, B_WATER, L_WATER, TL_ISLE, TR_ISLE,
			BR_ISLE, BL_ISLE;

	private BufferedImage atlas;
	public ArrayList<Tile> tiles = new ArrayList<>();

	public ArrayList<Tile> roadsS = new ArrayList<>();
	public ArrayList<Tile> roadsC = new ArrayList<>();
	public ArrayList<Tile> corners = new ArrayList<>();
	public ArrayList<Tile> beaches = new ArrayList<>();
	public ArrayList<Tile> islands = new ArrayList<>();

	public TileManager() {

		loadAtalas();
		createTiles();

	}

	private void createTiles() {

		int id = 0;

		tiles.add(GRASS = new Tile(getSprite(9, 0), id++, "Grass"));
		tiles.add(WATER = new Tile(getSprite(0, 0), id++, "Water"));

		roadsS.add(ROAD_LR = new Tile(getSprite(8, 0), id++, "Road_LR"));
		roadsS.add(ROAD_TB = new Tile(ImgFix.getRotImg(getSprite(8, 0), 90), id++, "TB_Road"));

		roadsC.add(ROAD_B_TO_R = new Tile(getSprite(7, 0), id++, "Road_Bottom_To_Right"));
		roadsC.add(ROAD_L_TO_B = new Tile(ImgFix.getRotImg(getSprite(7, 0), 90), id++, "Road_Left_To_Bottom"));
		roadsC.add(ROAD_L_TO_T = new Tile(ImgFix.getRotImg(getSprite(7, 0), 180), id++, "Road_Left_To_Top"));
		roadsC.add(ROAD_T_TO_R = new Tile(ImgFix.getRotImg(getSprite(7, 0), 270), id++, "Road_Top_To_Right"));

		corners.add(BL_WATER_CORNER = new Tile(ImgFix.buildImg(getImgs(0, 0, 5, 0)), id++, "BL_Corner"));
		corners.add(TL_WATER_CORNER = new Tile(ImgFix.getBuildRotImg(getImgs(0, 0, 5, 0), 90, 1), id++, "TL_Corner"));
		corners.add(TR_WATER_CORNER = new Tile(ImgFix.getBuildRotImg(getImgs(0, 0, 5, 0), 180, 1), id++, "TR_Corner"));
		corners.add(BR_WATER_CORNER = new Tile(ImgFix.getBuildRotImg(getImgs(0, 0, 5, 0), 270, 1), id++, "BR_Corner"));

		beaches.add(T_WATER = new Tile(ImgFix.buildImg(getImgs(0, 0, 6, 0)), id++, "T_Water"));
		beaches.add(R_WATER = new Tile(ImgFix.getBuildRotImg(getImgs(0, 0, 6, 0), 90, 1), id++, "R_Water"));
		beaches.add(B_WATER = new Tile(ImgFix.getBuildRotImg(getImgs(0, 0, 6, 0), 180, 1), id++, "B_Water"));
		beaches.add(L_WATER = new Tile(ImgFix.getBuildRotImg(getImgs(0, 0, 6, 0), 270, 1), id++, "L_Water"));

		islands.add(TL_ISLE = new Tile(ImgFix.buildImg(getImgs(0, 0, 4, 0)), id++, "TL_Isle"));
		islands.add(TR_ISLE = new Tile(ImgFix.getBuildRotImg(getImgs(0, 0, 4, 0), 90, 1), id++, "TR_Isle"));
		islands.add(BR_ISLE = new Tile(ImgFix.getBuildRotImg(getImgs(0, 0, 4, 0), 180, 1), id++, "BR_Isle"));
		islands.add(BL_ISLE = new Tile(ImgFix.getBuildRotImg(getImgs(0, 0, 4, 0), 270, 1), id++, "BL_Isle"));

		tiles.addAll(roadsS);
		tiles.addAll(roadsC);
		tiles.addAll(corners);
		tiles.addAll(beaches);
		tiles.addAll(islands);
	}

	private BufferedImage[] getImgs(int firstX, int firstY, int secondX, int secondY) {
		return new BufferedImage[] { getSprite(firstX, firstY), getSprite(secondX, secondY) };
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

	public ArrayList<Tile> getRoadsS() {
		return roadsS;
	}

	public ArrayList<Tile> getRoadsC() {
		return roadsC;
	}

	public ArrayList<Tile> getCorners() {
		return corners;
	}

	public ArrayList<Tile> getBeaches() {
		return beaches;
	}

	public ArrayList<Tile> getIslands() {
		return islands;
	}

}
