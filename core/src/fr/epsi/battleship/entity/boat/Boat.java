package fr.epsi.battleship.entity.boat;

public abstract class Boat {

    public abstract String getName();
    public abstract int getSize();
    public abstract int getHitPoints();
    public abstract void shootBoat();
    public abstract boolean isAlive();
}
