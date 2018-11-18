package fr.kounecorp.bettercallsam.game2_noname;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public abstract class Forme {

    private Paint fillPaint;
    private Paint strokePaint;

    public Forme() {
        // fill
        fillPaint = new Paint();
        fillPaint.setStyle(Paint.Style.FILL);
        fillPaint.setAntiAlias(true);

        // stroke
        strokePaint = new Paint();
        strokePaint.setStyle(Paint.Style.STROKE);
        strokePaint.setColor(Color.BLACK);
        strokePaint.setAntiAlias(true);
        strokePaint.setStrokeWidth(4f);
    }

    public Paint fillGreen() {
        fillPaint.setColor(Color.GREEN);
        return fillPaint;
    }

    public Paint fillRed() {
        fillPaint.setColor(Color.RED);
        return fillPaint;
    }

    public Paint noFill() {
        return strokePaint;
    }

    public abstract void display(Canvas canvas);

    public abstract void testClick(int fingerX, int fingerY, Canvas canvas);
}
