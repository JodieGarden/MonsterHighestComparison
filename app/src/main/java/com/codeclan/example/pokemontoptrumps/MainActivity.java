package com.codeclan.example.pokemontoptrumps;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button playBtn;
    ArrayList<Player> players;
    Dealer dealer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playBtn = (Button) findViewById(R.id.playBtn);


    }

    public void OnPlayBtnClicked(View view) {
        Game game = new Game(players, dealer);
        game.play();
        startActivity(new Intent(MainActivity.this, PlayActivity.class));
    }
}