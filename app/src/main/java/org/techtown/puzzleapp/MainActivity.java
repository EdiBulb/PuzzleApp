package org.techtown.puzzleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyGraphicView(this));


    }

    private class MyGraphicView extends View{
        public MyGraphicView(Context context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            Bitmap ori_img = BitmapFactory.decodeResource(getResources(), R.drawable.img);

            Bitmap bm1 = Bitmap.createBitmap(ori_img, 0, 0, ori_img.getWidth()/2, ori_img.getHeight());
            Bitmap bm2 = Bitmap.createBitmap(ori_img, ori_img.getWidth()/2, 0, ori_img.getWidth()/2, ori_img.getHeight());

            ImageView img1 = new ImageView(MainActivity.this);
            img1.setLayoutParams(new WindowManager.LayoutParams(100, 100));
            img1.setImageBitmap(bm1);

            ImageView img2 = new ImageView(getApplicationContext());
            img2.setImageBitmap(bm2);
        }
    }

}