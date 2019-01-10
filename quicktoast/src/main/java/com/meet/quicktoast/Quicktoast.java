package com.meet.quicktoast;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class Quicktoast {
    private final Context toastcon;
    public Quicktoast(Context context) {
        this.toastcon = context;
        }
    public Toast ltoast(String text) {
        ttype(text,"#757575",Toast.LENGTH_LONG).show();
        return  null;
    }

    public Toast stoast(String text) {
        ttype(text,"#757575",Toast.LENGTH_SHORT).show();
        return  null;
    }

    public Toast lwarn(String text) {
        ttype(text,"#f44336",Toast.LENGTH_LONG).show();
        return  null;
    }
    public Toast swarn(String text) {
        ttype(text,"#f44336",Toast.LENGTH_SHORT).show();
        return  null;
    }
    public Toast linfo(String text) {
        ttype(text,"#03A9F4",Toast.LENGTH_LONG).show();
        return  null;
    }
    public Toast sinfo(String text) {
        ttype(text,"#03A9F4",Toast.LENGTH_SHORT).show();
        return  null;
    }


    private Toast ttype(String text,String BackgroundColor,Integer duration){
        Toast toast = new Toast(toastcon);
        LayoutInflater inflate = (LayoutInflater) toastcon.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        @SuppressLint("InflateParams") View v =  inflate.inflate(R.layout.toast_layout,null);
        TextView toastText = v.findViewById(R.id.text);
        LinearLayout linear =  v.findViewById(R.id.ln);
        linear.setBackground(toastBackground(BackgroundColor));
        toastText.setTextColor(Color.parseColor("#ffffff"));
        toastText.setText(text);
        toast.setDuration(duration);
        toast.setView(v);
        return toast;
    }

    private LayerDrawable toastBackground(String color){
        float[] outerRadii = new float[]{75.0F, 75.0F, 75.0F, 75.0F, 75.0F, 75.0F, 75.0F, 75.0F};
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape((new RoundRectShape(outerRadii, null, null)));
        Paint paint  = shapeDrawable.getPaint();
        paint.setColor(Color.parseColor(color));
        paint = shapeDrawable.getPaint();
        paint.setStyle(Paint.Style.FILL);
        paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        Drawable[] drawables = new Drawable[]{shapeDrawable};
        return new LayerDrawable(drawables);
    }

}
