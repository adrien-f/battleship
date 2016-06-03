package fr.epsi.battleship.entity;

import fr.epsi.battleship.game.Coordinate;

import java.util.HashMap;

public class Board {
    public static final int width = 10;
    public static final int height = 10;

    private HashMap<Integer, HashMap<Integer, Coordinate>> coordinates;

    public Board() {
        coordinates = new HashMap<Integer, HashMap<Integer, Coordinate>>();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Coordinate coordinate = new Coordinate(i, j);
                HashMap<Integer, Coordinate> coordinateHash = new HashMap<Integer, Coordinate>();
                coordinateHash.put(j, coordinate);
                coordinates.put(i, coordinateHash);
            }
        }
    }

    public Coordinate getCoordinate(int x, int y) {
        return coordinates.get(x).get(y);
    }
}
