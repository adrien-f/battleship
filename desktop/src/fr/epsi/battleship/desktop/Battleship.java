package fr.epsi.battleship.desktop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.epsi.battleship.desktop.screens.StartScreen;

public class Battleship extends Game {

	public SpriteBatch batch;
	public BitmapFont font;

	@Override
	public void create () {
		batch = new SpriteBatch();
		//Use LibGDX's default Arial font.
		font = new BitmapFont();
		setScreen(new StartScreen(this));
	}

	public void render() {
		super.render(); //important!
	}

	public void dispose() {
		batch.dispose();
		font.dispose();
	}



}

