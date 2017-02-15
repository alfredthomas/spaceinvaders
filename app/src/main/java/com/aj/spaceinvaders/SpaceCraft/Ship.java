package com.aj.spaceinvaders.SpaceCraft;

import android.graphics.Point;

/**
 * Created by AJ on 1/20/2017.
 */

public class Ship extends MovingObject{

    public Ship(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean canMoveLeft() {
        return true;
    }

    @Override
    public boolean canMoveRight() {
        return true;
    }

    @Override
    public boolean canShoot() {
        return true;
    }
}
