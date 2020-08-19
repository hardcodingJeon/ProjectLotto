package com.sonlcr1.projectlotto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Random;

public class Ball_6 extends AppCompatActivity {

    GridView gridView;
    ArrayAdapter arrayAdapter;
    ArrayList<Integer> num = new ArrayList<>();
    int n = -1;
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball_6);

        gridView = findViewById(R.id.gridview);
        arrayAdapter = new ArrayAdapter(this,R.layout.random_num,num);

        gridView.setAdapter(arrayAdapter);
    }

    public void clickRandom(View view) {
        //랜덤 6번호 뽑기

        int size = (++n)*6;
        for(int i=0;i<6;i++) {

            int n = rnd.nextInt(45)+1;
            num.add(n);
            for(int j=0;j<i;) {
                if(num.get(size+i)==num.get(size+j)) {
                    j=0;
                    n = rnd.nextInt(45)+1;
                    num.remove(size+i);
                    num.add(size+i,n);
                    continue;
                }
                j++;
            }
        }
        arrayAdapter.notifyDataSetChanged();

    }
}
