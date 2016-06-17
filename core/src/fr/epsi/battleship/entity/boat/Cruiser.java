package fr.epsi.battleship.entity.boat;

public class Cruiser extends Boat {

    private static final String name = "Cruiser";
    private static final int size = 3;
    private int hitPoints;

    public Cruiser() {
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
