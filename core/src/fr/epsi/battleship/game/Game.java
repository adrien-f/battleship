package fr.epsi.battleship.game;

import fr.epsi.battleship.entity.Board;
import fr.epsi.battleship.entity.Player;

import java.util.HashMap;
import java.util.List;

public class Game {
    public HashMap<Player, Board> boards;

    public Game() {
        this.boards = new HashMap<Player, Board>();
    }

    public void addPlayer(Player player) {
        this.boards.put(player, new Board());
    }
}
