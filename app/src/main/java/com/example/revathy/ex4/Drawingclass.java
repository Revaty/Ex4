package com.example.revathy.ex4;

/**
 * Created by revathy on 29-02-2016.
 */
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import java.util.jar.Attributes;

public class Drawingclass extends View {
    public Drawingclass(Context context,AttributeSet set)
    {
        super(context, set);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(10);
        canvas.drawLine(10,10,200,200,paint);
        paint.setColor(Color.GREEN);
        canvas.drawCircle(300,300,100,paint);
        paint.setColor(Color.BLUE);
        canvas.drawRect(400,400,800,800,paint);
    }
}
