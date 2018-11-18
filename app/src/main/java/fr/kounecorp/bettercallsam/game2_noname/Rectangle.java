package fr.kounecorp.bettercallsam.game2_noname;

import android.graphics.Canvas;
import android.graphics.Rect;

public class Rectangle extends Forme {

    private Rect rect;

    public Rectangle(int x, int y, int longueur, int largeur) {
        super();
        rect = new Rect(x, y,x+longueur,y+largeur);
    }


    @Override
    public void display(Canvas canvas) {
        canvas.drawRect(rect, this.noFill());
    }

    @Override
    public void testClick(int fingerX, int fingerY, Canvas canvas) {
        if (rect.contains(fingerX,fingerY)) {
            canvas.drawRect(rect, fillGreen());
        }
    }
}
