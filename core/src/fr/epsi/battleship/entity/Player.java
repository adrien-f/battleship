package fr.epsi.battleship.entity;

import java.util.UUID;

public class Player {
    private UUID id;
    private String name;
    private Board board;

    public Player(String name, Board board) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.board = board;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Board getBoard() {
        return board;
    }
}
