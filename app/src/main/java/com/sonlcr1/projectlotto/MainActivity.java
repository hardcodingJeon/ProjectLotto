package com.sonlcr1.projectlotto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAll,btnOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickAll(View view) {
        Intent intent = new Intent(this,Ball_6.class);
        startActivity(intent);

    }

    public void clickOne(View view) {
        Intent intent = new Intent(this, Ball_1.class);
        startActivity(intent);
    }

    public void clickCheck(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dhlottery.co.kr/gameResult.do?method=byWin"));
        startActivity(intent);
    }
}
