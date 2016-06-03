package fr.epsi.battleship.desktop.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import fr.epsi.battleship.desktop.Battleship;


public class StartScreen implements Screen {

    private Battleship game;
    OrthographicCamera camera;


    public StartScreen(Battleship g) {

        game = g;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 1024, 600);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(52 / 255f, 152 / 255f, 219 / 255f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        final GlyphLayout layout = new GlyphLayout(game.font, "BattleShip");


        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.font.draw(game.batch, layout, 475, 450);
        game.batch.end();

        if (Gdx.input.isTouched()) {
            Gdx.app.log("test", "e");
            dispose();
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