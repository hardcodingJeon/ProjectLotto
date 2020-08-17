package com.sonlcr1.projectlotto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.sonlcr1.projectlotto.adapter.AdapterBall6;

import java.util.ArrayList;
import java.util.Random;

public class Ball_6 extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterBall6 adapter;
    ArrayList<Integer> num = new ArrayList<>();
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball_6);

        recyclerView = findViewById(R.id.recycler);
        adapter = new AdapterBall6(this,num);
        recyclerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 6);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    public void clickRandom(View view) {
        //랜덤 6번호 뽑기
        Random rnd = new Random();
        Log.e("tag",num.size()+"");
        result = ((num.size())/6)*6;
        //todo : 6개 랜덤이 출력되고 다음줄 출력이 안됨
        for(int i=result;i<result+6;i++) {
            int n = rnd.nextInt(45)+1;
            num.add(i,n);
            for(int j=result;j<i;j++) {
                if(num.get(i)==num.get(j)) {
                    j=0;
                    n = rnd.nextInt(45)+1;
                    num.add(i,n);
                }
            }
        }
        adapter.notifyDataSetChanged();

    }
}
