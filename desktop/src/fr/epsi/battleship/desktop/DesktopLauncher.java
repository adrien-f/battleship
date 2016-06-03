package fr.epsi.battleship.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Battleship";
        config.width = 1024;
        config.height = 600;
		config.addIcon("core/assets/icon.png", Files.FileType.Internal);
		new LwjglApplication(new Battleship(), config);
	}
}
