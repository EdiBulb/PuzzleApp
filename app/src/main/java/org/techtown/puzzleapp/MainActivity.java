package org.techtown.puzzleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        //baseLayout 생성
        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);

        //위의 레이아웃
        LinearLayout layout1 = new LinearLayout(this);
        layout1.setOrientation(LinearLayout.HORIZONTAL);

        //중간 레이아웃
        LinearLayout layout2 = new LinearLayout(this);
        layout2.setOrientation(LinearLayout.HORIZONTAL);

        //아래 레이아웃
        LinearLayout layout3 = new LinearLayout(this);
        layout2.setOrientation(LinearLayout.HORIZONTAL);


        //레이아웃 파라미터
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams params3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);


        //레이아웃과 파라미터 연결
        setContentView(baseLayout, params);
//        setContentView(layout1, params1);
//        setContentView(layout2, params2);
//        setContentView(layout3, params3);


        //비트맵 이미지 생성
        Bitmap ori_img = BitmapFactory.decodeResource(getResources(), R.drawable.img_1);

        //위에 3개
        Bitmap bm1 = Bitmap.createBitmap(ori_img, 0, 0, ori_img.getWidth()/3, ori_img.getHeight()/3);
        Bitmap bm2 = Bitmap.createBitmap(ori_img, ori_img.getWidth()/3, 0, ori_img.getWidth()/3, ori_img.getHeight()/3);
        Bitmap bm3 = Bitmap.createBitmap(ori_img, ori_img.getWidth()/3*2, 0, ori_img.getWidth()/3, ori_img.getHeight()/3);

        //중간 3개
        Bitmap bm4 = Bitmap.createBitmap(ori_img, 0, ori_img.getHeight()/3, ori_img.getWidth()/3, ori_img.getHeight()/3);
        Bitmap bm5 = Bitmap.createBitmap(ori_img, ori_img.getWidth()/3, ori_img.getHeight()/3, ori_img.getWidth()/3, ori_img.getHeight()/3);
        Bitmap bm6 = Bitmap.createBitmap(ori_img, ori_img.getWidth()/3*2, ori_img.getHeight()/3, ori_img.getWidth()/3, ori_img.getHeight()/3);

        //아래 3개
        Bitmap bm7 = Bitmap.createBitmap(ori_img, 0, ori_img.getHeight()/3*2, ori_img.getWidth()/3, ori_img.getHeight()/3);
        Bitmap bm8 = Bitmap.createBitmap(ori_img, ori_img.getWidth()/3, ori_img.getHeight()/3*2, ori_img.getWidth()/3, ori_img.getHeight()/3);


        ImageView img1 = new ImageView(this);
        ImageView img2 = new ImageView(this);
        ImageView img3 = new ImageView(this);
        ImageView img4 = new ImageView(this);
        ImageView img5 = new ImageView(this);
        ImageView img6 = new ImageView(this);
        ImageView img7 = new ImageView(this);
        ImageView img8 = new ImageView(this);

        img1.setImageBitmap(bm1);
        img2.setImageBitmap(bm2);
        img3.setImageBitmap(bm3);
        img4.setImageBitmap(bm4);
        img5.setImageBitmap(bm5);
        img6.setImageBitmap(bm6);
        img7.setImageBitmap(bm7);
        img8.setImageBitmap(bm8);


        //위에 세개
        layout1.addView(img1);
        layout1.addView(img2);
        layout1.addView(img3);
        baseLayout.addView(layout1,params1);

        //중간 세게
        layout2.addView(img4);
        layout2.addView(img5);
        layout2.addView(img6);
        baseLayout.addView(layout2,params2);

        //아래 세개
        layout3.addView(img7);
        layout3.addView(img8);

        baseLayout.addView(layout3,params3);

    }
}