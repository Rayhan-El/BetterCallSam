package fr.kounecorp.bettercallsam.game2_noname;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;


public class CanvasView extends View {

    private Canvas mCanvas;
    private Rectangle r;
    private Random random;
    private Bitmap mBitmap;

    public CanvasView(Context c, AttributeSet attrs) {
        super(c, attrs);
        r = new Rectangle(100,100, 150,50);
    }

    public int test() {
        return random.nextInt(10);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        r.display(canvas);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        // your Canvas will draw onto the defined Bitmap
        mBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        mCanvas = new Canvas(mBitmap);
    }

    public void clearCanvas() {
        invalidate();
    }
}
