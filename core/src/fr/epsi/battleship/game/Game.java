package fr.epsi.battleship.game;

import fr.epsi.battleship.entity.Board;
import fr.epsi.battleship.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class Game {
    public HashMap<Player, Board> boards;

    public Game() {
        this.boards = new HashMap<Player, Board>();
    }

    public void addPlayer(Player player) {
        this.boards.put(player, new Board());
    }

    public Player getPlayer(final UUID playerId) {
        return boards.entrySet().stream().filter(player -> player.getKey().getId() == playerId).findFirst().get().getKey();
    }
}
