package fr.epsi.battleship.entity;

import fr.epsi.battleship.game.Coordinate;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void testConstructor() throws Exception {
        Board board = new Board();
        assertEquals(10, board.getCoordinates().size());
        for (Map.Entry<Integer, HashMap<Integer, Coordinate>> entry : board.getCoordinates().entrySet()) {
            assertEquals(10, entry.getValue().size());
        }
    }

    @Test
    public void testGetCoordinate() throws Exception {
        Board board = new Board();
        Coordinate coordinate = board.getCoordinate(3, 4);
        assertEquals(3, coordinate.getX());
        assertEquals(4, coordinate.getY());
    }
}
