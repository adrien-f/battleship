package fr.epsi.battleship.entity.boat;

public abstract class Boat {
    private String name;
    private int size;
    protected int hitpoints;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void shootBoat() {
        hitpoints =- 1;
    }

    public boolean isAlive() {
        return hitpoints > 0;
    }
}
