package fr.epsi.battleship.desktop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import fr.epsi.battleship.desktop.screens.StartScreen;

public class Battleship extends Game {

	public SpriteBatch batch;
	public FreeTypeFontGenerator font;

	@Override
	public void create () {
		batch = new SpriteBatch();
		//Use LibGDX's default Arial font.
		font = new FreeTypeFontGenerator(Gdx.files.internal("core/assets/Roboto-Regular.ttf"));

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

