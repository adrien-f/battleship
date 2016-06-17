package fr.epsi.battleship.entity.boat;

public class Battleship extends Boat {


    private static final String name = "Battleship";
    private static final int size = 4;
    private int hitPoints;

    public Battleship() {
        hitPoints = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public void shootBoat() {
        hitPoints -= 1;
    }

    @Override
    public boolean isAlive() {
        return hitPoints > 0;
    }
}
