package com.galacticcoders.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.galacticcoders.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int akaScore = 0;
    int shiroScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void resetScore (View v) {
        akaScore = 0;
        shiroScore = 0;
        displayForTeamA(akaScore);
        displayForTeamB(shiroScore);
    }

    /**
     * Aka.
     */
    public void addOneForAka(View v) {
        akaScore = akaScore + 1;
        displayForTeamA(akaScore);
    }

    public void addHalfForAka(View v) {
        akaScore = akaScore + 0;
        displayForTeamA(akaScore);
    }

    /**
     * Shiro.
     */
    public void addOneForShiro(View v) {
        shiroScore = shiroScore + 1;
        displayForTeamB(shiroScore);
    }

    public void addHalfForShiro(View v) {
        shiroScore = shiroScore + 0;
        displayForTeamB(shiroScore);
    }

    /**
     * Displays the given score for Aka.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.aka_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Shiro.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shiro_score);
        scoreView.setText(String.valueOf(score));
    }
}
