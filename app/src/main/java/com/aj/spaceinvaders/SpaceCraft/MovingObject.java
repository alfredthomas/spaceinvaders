package com.aj.spaceinvaders.SpaceCraft;

import android.graphics.Canvas;

/**
 * Created by AJ on 1/23/2017.
 */

public abstract class MovingObject {
    int x,y,width,height;
    int slopex = 0;
    int slopey = 0;

    int increment = 5;

    void setIncrement(int newIncrement)
    {

    }
    public void moveUp(){
        if(canMoveUp())
            slopey = increment;
    }
    public void moveDown()
    {
        if(canMoveDown())
            slopey = -1*increment;
    }
    public void moveLeft()
    {
        if(canMoveLeft())
            slopex = -1*increment;
    }
    public void moveRight()
    {
        if(canMoveRight())
            slopex = increment;
    }
    boolean canMoveLeft()
    {
        return false;
    }
    boolean canMoveRight()
    {
        return false;
    }
    boolean canMoveUp()
    {
        return false;
    }
    boolean canMoveDown(){
        return false;
    }
    public boolean isOutOfBounds(Canvas canvas)
    {
        if((slopex+x<0)||(slopey+y<0)||(x+width> canvas.getWidth())||(y+height>canvas.getHeight()))
            return true;
        return false;
    }
    void updatePosition()
    {
        this.x+=slopex;
        this.y+=slopey;
    }

    public void draw(Canvas canvas)
    {

    }
    public MovingObject shoot()
    {
        if(canShoot())
        {
            return new Bullet((int)(x+width/2),y,width/10,height/5);
        }
        return null;
    }
    boolean canShoot()
    {
        return false;
    }

}
