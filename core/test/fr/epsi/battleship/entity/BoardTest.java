package fr.epsi.battleship.entity;

import fr.epsi.battleship.entity.boat.Submarine;
import fr.epsi.battleship.game.Coordinate;
import org.junit.Test;

import java.util.*;

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

    @Test
    public void testAddBoat() throws Exception {
        Board board = new Board();
        Coordinate coordinate = board.getCoordinate(3, 4);
        Submarine submarine = new Submarine();
        board.addBoat(submarine, Collections.singletonList(coordinate));
        assertEquals(coordinate.getBoat(), submarine);
    }
}
