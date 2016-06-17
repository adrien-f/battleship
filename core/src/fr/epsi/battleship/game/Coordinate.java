package fr.epsi.battleship.game;

import fr.epsi.battleship.entity.boat.Boat;

public class Coordinate {
    private int x;
    private int y;
    private Boat boat;
    private boolean shot = false;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public boolean isShot() {
        return shot;
    }

    public void setShot(boolean shot) {
        this.shot = shot;
    }

    public boolean isHit() {
        return this.shot && this.boat != null;
    }

    public boolean isDestroyed() {
        return this.shot && this.boat != null && !this.boat.isAlive();
    }
}
