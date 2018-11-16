package fr.kounecorp.bettercallsam.game1_reacttime;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import fr.kounecorp.bettercallsam.R;

public class ScorePopUp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.score_pop_up_window);
        int r = ReactTime.ROUGE;
        int g = ReactTime.VERT;

        TextView avgScore = findViewById(R.id.avgScore);
        int avg = getIntent().getIntExtra("avg",0);
        if (avg >= 450) {
            avgScore.setTextColor(r);
        } else {
            avgScore.setTextColor(g);
        }
        avgScore.setText(getString(R.string.moyenneValeur, avg));

        Button continuer = findViewById(R.id.btnContinuer);

        continuer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO start activity jeu 2
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Empeche l'utilisateur a faire retour, il est obliger de cliquer sur "Continuer"
        Toast.makeText(getApplicationContext(), R.string.BackInfo, Toast.LENGTH_SHORT).show();
    }

}
