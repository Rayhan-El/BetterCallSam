package fr.kounecorp.bettercallsam.game2_noname;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import fr.kounecorp.bettercallsam.R;

public class Game2 extends Activity {

    private CanvasView myCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        myCanvas = findViewById(R.id.canvasView);
    }

    public void clearCanvas(View v) {
        myCanvas.clearCanvas();
    }
}
