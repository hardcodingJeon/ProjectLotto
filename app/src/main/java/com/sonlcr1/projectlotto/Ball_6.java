package com.sonlcr1.projectlotto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class Ball_6 extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterBall6 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball_6);
    }

    public void clickRandom(View view) {
    }
}
