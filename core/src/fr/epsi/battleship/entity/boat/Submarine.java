package fr.epsi.battleship.entity.boat;

public class Submarine extends Boat {

    private static final String name = "Submarine";
    private static final int size = 1;
    private int hitPoints;

    public Submarine() {
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
