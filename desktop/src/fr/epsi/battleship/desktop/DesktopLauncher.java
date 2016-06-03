package fr.epsi.battleship.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import fr.epsi.battleship.Battleship;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Battleship";
        config.width = 800;
        config.height = 480;
		config.addIcon("core/assets/icon.png", Files.FileType.Internal);
		new LwjglApplication(new Battleship(), config);
	}
}
