package com.sonlcr1.projectlotto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.sonlcr1.projectlotto.adapter.AdapterBall;

import java.util.ArrayList;
import java.util.Random;

public class Ball_1 extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterBall adapterBall;
    ArrayList<Integer> num = new ArrayList<>();
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball_1);

        recyclerView = findViewById(R.id.recycle);
        // 데이터 임의로 생성해서 확인해보기
//        num.add(1);
//        num.add(2);
//        num.add(3);
//        num.add(4);
//        num.add(5);
//        num.add(6);


        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,6,GridLayoutManager.VERTICAL,false);
        adapterBall = new AdapterBall(this, num);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterBall);
    }

    public void clickRandom(View view) {
        //todo : 번호 추출할차례
        num.add(rnd.nextInt(45)+1) ;
        adapterBall.notifyItemInserted(num.size()-1);


    }
}
