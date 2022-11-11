package org.techtown.puzzleapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        
        //params : 파라미터 - baseLayout 용도
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT,4);

        //리니어 레이아웃 만들기 + 설정
        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(0,22,1));
        //params 설정
        setContentView(baseLayout,params);

        //파라미터 params1, params2 생성
        LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT,3);
        LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT,1);

        //리니어 레이아웃 lay1 생성 + 속성 설정
        LinearLayout lay1 = new LinearLayout(this);
        lay1.setOrientation(LinearLayout.HORIZONTAL);
        lay1.setBackgroundColor(Color.rgb(100,20,10));

        //리니어 레이아웃 lay2 생성 + 속성 설정
        LinearLayout lay2 = new LinearLayout(this);
        lay2.setBackgroundColor(Color.rgb(100,20,100));
        lay2.setOrientation(LinearLayout.VERTICAL);

        //버튼1 파라미터
        LinearLayout.LayoutParams btnparams1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        
        //버튼 생성 + 설정
        Button btn1 = new Button(this);
        btn1.setText("버튼1");
        
        //lay1에 버튼1 추가
        lay1.addView(btn1,btnparams1);

        //버튼2 파라미터
        LinearLayout.LayoutParams btnparams2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        
        //버튼 생성 
        Button btn2 = new Button(this);
        btn2.setText("버튼2");
        
        //리니어 레이아웃에 버튼 넣기
        lay1.addView(btn2,btnparams2);

        //버튼3 파라미터
        LinearLayout.LayoutParams btnparams3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        
        //버튼 생성
        Button btn3 = new Button(this);
        btn3.setText("버튼3");
        
        //버튼 넣기
        lay2.addView(btn3,btnparams3);
        
        //버튼4 파라미터
        LinearLayout.LayoutParams btnparams4 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        //버튼 생성
        Button btn4 = new Button(this);
        btn4.setText("버튼4");
        
        //레이아웃에 버튼 넣기
        lay2.addView(btn4,btnparams4);
        
        //베이스 레이아웃에 레이아웃 넣기
        baseLayout.addView(lay1,params1);
        baseLayout.addView(lay2,params2);


    }
}
