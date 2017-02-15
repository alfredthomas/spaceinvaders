package com.aj.spaceinvaders;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aj.spaceinvaders.SpaceCraft.MovingObject;
import com.aj.spaceinvaders.SpaceCraft.Ship;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final View rootView = new View(this);
        rootView.setBackgroundColor(Color.BLACK);
        setContentView(rootView);

        final ArrayList<MovingObject> objects = new ArrayList<>();

        final Ship ship = new Ship((int)(rootView.getWidth()*.45),(int)(rootView.getHeight()*.9),(int)(rootView.getWidth()*.1),(int)(rootView.getHeight()*.1));
        objects.add(ship);

        rootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ship.shoot();
            }
        });


        final Handler handler = new Handler();
        Runnable updateCanvas = new Runnable() {
            @Override
            public void run() {
                Bitmap b = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas= new Canvas(b);
                for(MovingObject object:objects)
                {
                    object.draw(canvas);
                }
                rootView.draw(canvas);
                handler.postDelayed(this, 100);
            }
        };
        handler.postDelayed(updateCanvas, 100);




    }


}
