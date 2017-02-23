package com.example.deepak.cricketscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int runsIndia = 0;
    int wicketsIndia = 0;
    int runsPakisthan = 0;
    int wicketsPakisthan = 0;

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForIndia(0);
        displayForPakisthan(0);
    }

    // @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for india by 1 run.
     */
    public void addOneForindia(View v) {
        runsIndia = runsIndia + 1;
        displayForIndia(runsIndia);
    }

    /**
     * Increase the score for india by 4 runs.
     */
    public void addFourForIndia(View v) {
        runsIndia = runsIndia + 4;
        displayForIndia(runsIndia);
    }

    /**
     * Increase the score for india by 6 runs.
     */
    public void addSixForIndia(View v) {
        runsIndia = runsIndia + 6;
        displayForIndia(runsIndia);
    }

    /**
     * Displays the given score for India.
     */
    public void displayForIndia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.india_runs);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given wickets for India.
     */
    public void displayForIndiawickets(int score) {
        TextView scoreView = (TextView) findViewById(R.id.india_wickets);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase the wickets for india by 1.
     */
    public void add1ForIndiawickets(View v) {
        wicketsIndia = wicketsIndia + 1;
        displayForIndiawickets(wicketsIndia);
    }

    /**
     * Displays the given score for Pakisthan.
     */
    public void displayForPakisthan(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pakisthan_runs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for india by 1 run.
     */
    public void addOneForPakisthan(View v) {
        runsPakisthan = runsPakisthan + 1;
        displayForPakisthan(runsPakisthan);
    }

    /**
     * Increase the score for Pakisthan by 4 runs.
     */
    public void addFourForPakisthan(View v) {
        runsPakisthan = runsPakisthan + 4;
        displayForPakisthan(runsPakisthan);
    }

    /**
     * Increase the score for Pakisthan by 6 runs.
     */
    public void addSixForPakisthan(View v) {
        runsPakisthan = runsPakisthan + 6;
        displayForPakisthan(runsPakisthan);
    }


    /**
     * Displays the given wickets for India.
     */
    public void displayForPakisthanwickets(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pakisthan_wickets);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the wickets for Pakisthan by 1.
     */
    public void add1ForPakisthanwickets(View v) {
        wicketsPakisthan = wicketsPakisthan + 1;
        displayForPakisthanwickets(wicketsPakisthan);
    }

    public void reset(View V) {
        runsIndia = 0;
        wicketsIndia = 0;
        runsPakisthan = 0;
        wicketsPakisthan = 0;
        displayForIndia(0);
        displayForPakisthan(0);
        displayForPakisthanwickets(0);
        displayForIndiawickets(0);

    }

}
