package com.aj.spaceinvaders.SpaceCraft;

import android.graphics.Point;

/**
 * Created by AJ on 1/20/2017.
 */

public class Bullet extends MovingObject {

    public Bullet(int x,int y, int width,int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
