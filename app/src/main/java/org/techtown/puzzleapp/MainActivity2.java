package org.techtown.puzzleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    Bitmap picture;
    Bitmap yellow;

    Bitmap bm1,bm2,bm3,bm4,bm5,bm6,bm7,bm8,yel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyGraphicView(this));
    }

    class MyGraphicView extends View{

        public MyGraphicView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            picture = BitmapFactory.decodeResource(getResources(), R.drawable.img_1);
            yellow = BitmapFactory.decodeResource(getResources(), R.drawable.img_2);

            //자르기 - 위에 3개
            bm1 = Bitmap.createBitmap(picture, 0, 0, picture.getWidth()/3, picture.getHeight()/3);
            bm2 = Bitmap.createBitmap(picture, picture.getWidth()/3, 0, picture.getWidth()/3, picture.getHeight()/3);
            bm3 = Bitmap.createBitmap(picture, picture.getWidth()/3*2, 0, picture.getWidth()/3, picture.getHeight()/3);

            //자르기 - 중간 3개
            bm4 = Bitmap.createBitmap(picture, 0, picture.getHeight()/3, picture.getWidth()/3, picture.getHeight()/3);
            bm5 = Bitmap.createBitmap(picture, picture.getWidth()/3, picture.getHeight()/3, picture.getWidth()/3, picture.getHeight()/3);
            bm6 = Bitmap.createBitmap(picture, picture.getWidth()/3*2, picture.getHeight()/3, picture.getWidth()/3, picture.getHeight()/3);

            //자르기 - 아래 3개
            bm7 = Bitmap.createBitmap(picture, 0, picture.getHeight()/3*2, picture.getWidth()/3, picture.getHeight()/3);
            bm8 = Bitmap.createBitmap(picture, picture.getWidth()/3, picture.getHeight()/3*2, picture.getWidth()/3, picture.getHeight()/3);
            yel = Bitmap.createBitmap(yellow, yellow.getHeight()/3, yellow.getHeight()/3, picture.getWidth()/3, picture.getHeight()/3);

            //캔버스 그리기 - 위에 3개
            canvas.drawBitmap(bm1,0,0,null);
            canvas.drawBitmap(bm2,picture.getWidth()/3,0,null);
            canvas.drawBitmap(bm3,picture.getWidth()/3*2,0,null);

            //캔버스 그리기 - 중간 3개
            canvas.drawBitmap(bm4,0,picture.getHeight()/3,null);
            canvas.drawBitmap(bm5,picture.getWidth()/3,picture.getHeight()/3,null);
            canvas.drawBitmap(bm6,picture.getWidth()/3*2,picture.getHeight()/3,null);

            //캔버스 그리기 - 아래 3개
            canvas.drawBitmap(bm7,0,picture.getHeight()/3*2,null);
            canvas.drawBitmap(bm8,picture.getWidth()/3,picture.getHeight()/3*2,null);
            canvas.drawBitmap(yel,picture.getWidth()/3*2,picture.getHeight()/3*2,null);

        }
    }
}