package com.sonlcr1.projectlotto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.sonlcr1.projectlotto.adapter.AdapterBall6;

import java.util.ArrayList;
import java.util.Random;

public class Ball_6 extends AppCompatActivity {

    GridView gridView;
    ArrayAdapter arrayAdapter;
    ArrayList<Integer> num = new ArrayList<>();
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball_6);

//        num.add(1);
//        num.add(2);
//        num.add(3);
//        num.add(4);
//        num.add(5);
//        num.add(6);
//        num.add(7);
//        num.add(8);
//        num.add(9);
//        num.add(10);
//        num.add(11);
//        num.add(12);
//        num.add(13);





        gridView = findViewById(R.id.gridview);
        arrayAdapter = new ArrayAdapter(this,R.layout.aaa,num);

        gridView.setAdapter(arrayAdapter);
    }

    public void clickRandom(View view) {
        //랜덤 6번호 뽑기
        Random rnd = new Random();
        Log.e("tag",num.size()+"");
        result = ((num.size())/6)*6;

//        for(int i=result;i<result+6;i++) {
//            int n = rnd.nextInt(45)+1;
//            num.add(i,n);
//            for(int j=result;j<i;j++) {
//                if(num.get(i)==num.get(j)) {
//                    j=0;
//                    n = rnd.nextInt(45)+1;
//                    num.add(i,n);
//                }
//            }
//        }
        //todo : 같은 숫자 출력됨
        for(int i=0;i<6;i++) {
            int n = rnd.nextInt(45)+1;
            num.add(n);
            for(int j=0;j<i;j++) {
                if(num.get(i)==num.get(j)) {
                    j=0;
                    n = rnd.nextInt(45)+1;
                    num.add(num.size()-1,n);
                }
            }
        }
        arrayAdapter.notifyDataSetChanged();

    }
}
