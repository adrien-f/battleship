package fr.epsi.battleship.desktop.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import fr.epsi.battleship.desktop.Battleship;
import fr.epsi.battleship.desktop.Colors;



public class StartScreen implements Screen {

    private Battleship game;
    private OrthographicCamera camera;
    private BitmapFont fontTitle;


    public StartScreen(Battleship g) {

        game = g;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 1024, 600);
        FreeTypeFontGenerator.FreeTypeFontParameter freeTypeFontParameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        freeTypeFontParameter.size = 50;
        fontTitle = game.font.generateFont(freeTypeFontParameter);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(Colors.Blue.r, Colors.Blue.g, Colors.Blue.b, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        final GlyphLayout layout = new GlyphLayout(fontTitle, "BattleShip");
        final GlyphLayout playMessage = new GlyphLayout(fontTitle, "Cliquez pour jouer");

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        fontTitle.draw(game.batch, layout, (camera.viewportWidth - layout.width) / 2, (camera.viewportHeight - layout.height) / (5/3) );
        fontTitle.draw(game.batch, playMessage, (camera.viewportWidth - layout.width) / 2 - 75, (camera.viewportHeight - layout.height) / 3);
        game.batch.end();

        if (Gdx.input.isTouched()) {
            Gdx.app.log("test", "e");
            dispose();
            game.setScreen(new PlayScreen(game));
        }

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }


}