package fr.kounecorp.bettercallsam.game1_reacttime;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import fr.kounecorp.bettercallsam.R;

public class ScorePopUp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.score_pop_up_window);
        int r = getResources().getColor(R.color.RTRouge);
        int g = getResources().getColor(R.color.RTVert);


        getWindow().setLayout(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        TextView avgScore = findViewById(R.id.avgScore);
        int avg = getIntent().getIntExtra("avg",0);
        if (avg >= 450) {
            avgScore.setTextColor(r);
        } else {
            avgScore.setTextColor(g);
        }
        avgScore.setText(" " + avg + " ms");
    }

}
