package fr.kounecorp.bettercallsam.game2_noname;

import android.graphics.Canvas;
import android.graphics.Rect;

public class Rectangle extends Forme {

    private int x;
    private int y;
    private int L;
    private int l;
    private Rect rect;
    private boolean touched;

    public Rectangle(int x, int y, int longueur, int largeur) {
        super();
        this.touched = false;
        this.x = x;
        this.y = y;
        this.L = longueur;
        this.l = largeur;
        rect = new Rect(this.x, this.y,this.x+this.L,this.y+this.l);
    }

    public boolean contains(int x, int y) {
        return rect.contains(x,y);
    }

    public boolean intersects(Rectangle r) {
        return rect.intersects(r.x, r.y,r.x+r.L,r.y+r.l);
    }

    @Override
    public void display(Canvas canvas) {
        if (touched) {
            canvas.drawRect(rect, this.fillGreen());
        } else {
            canvas.drawRect(rect, this.noFill());
        }
    }

    @Override
    public void testClick(int fingerX, int fingerY) {
        if (contains(fingerX,fingerY)) {
            touched = true;
        }
    }
}
