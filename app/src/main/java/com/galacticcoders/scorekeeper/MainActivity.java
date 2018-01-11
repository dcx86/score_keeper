package com.galacticcoders.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.galacticcoders.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    float akaScore = 0;
    float shiroScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScore(View v) {
        akaScore = 0;
        shiroScore = 0;
        displayForAka((int) akaScore);
        displayForShiro((int) shiroScore);
    }

    /**
     * Aka.
     */
    public void addOneForAka(View v) {
        akaScore = akaScore + 1;
        displayForAka((int) akaScore);
    }

    public void addHalfForAka(View v) {
        akaScore = akaScore + 0.5f;
        displayForAka((int) akaScore);
    }

    /**
     * Shiro.
     */
    public void addOneForShiro(View v) {
        shiroScore = shiroScore + 1;
        displayForShiro((int) shiroScore);
    }

    public void addHalfForShiro(View v) {
        shiroScore = shiroScore + 0.5f;
        displayForShiro((int) shiroScore);
    }

    /**
     * Displays the given score for Aka.
     */
    public void displayForAka(int score) {
        TextView scoreView = (TextView) findViewById(R.id.aka_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Shiro.
     */
    public void displayForShiro(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shiro_score);
        scoreView.setText(String.valueOf(score));
    }
}
