package xyz.gooin.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//    Team A
    public void displayForTeamA(int score) {
        scoreTeamA += score;
        TextView scoreView = (TextView) findViewById(R.id.text_view_team_a);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void addThreeForTeamA(View v) {
        displayForTeamA(3);
    }

    public void addTwoForTeamA(View v) {
        displayForTeamA(2);
    }

    public void addOneForTeamA(View v) {
        displayForTeamA(1);
    }


//    Team B
public void displayForTeamB(int score) {
    scoreTeamB += score;
    TextView scoreView = (TextView) findViewById(R.id.text_view_team_b);
    scoreView.setText(String.valueOf(scoreTeamB));
}
    public void addThreeForTeamB(View v) {
        displayForTeamB(3);
    }

    public void addTwoForTeamB(View v) {
        displayForTeamB(2);
    }

    public void addOneForTeamB(View v) {
        displayForTeamB(1);
    }

    //   Reset score to 0
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);

    }
}
