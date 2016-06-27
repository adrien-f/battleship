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
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;


public class PlayScreen implements Screen {

    private Battleship game;
    private OrthographicCamera camera;
    private BitmapFont fontTitle;


    public PlayScreen(Battleship g) {

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

        Gdx.gl.glClearColor(52 / 255f, 152 / 255f, 219 / 255f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        final Texture texture = new Texture("core/assets/grille.png");
        final Sprite sprite = new Sprite(texture);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        sprite.setSize(camera.viewportWidth, camera.viewportHeight);

        game.batch.begin();
        sprite.draw(game.batch);
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