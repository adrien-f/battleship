package fr.epsi.battleship.game;

import fr.epsi.battleship.entity.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testAddPlayer() throws Exception {
        Player player = new Player("Player 1");
        Game game = new Game();
        game.addPlayer(player);
        assertEquals(1, game.boards.size());
    }
}
