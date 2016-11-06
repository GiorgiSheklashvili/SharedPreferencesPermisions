package com.example.gio.sharedpreferencespermisions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class ColorActivity extends AppCompatActivity {
    RelativeLayout layout;
    public final String KEY="color";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        WrapperClass.Initialize(this);
        layout=(RelativeLayout) findViewById(R.id.activity_color);
        layout.setBackgroundColor(getResources().getColor((WrapperClass.getColor(KEY))));
    }

    public void buttonClickBlack(View view) {
        layout.setBackgroundColor(getResources().getColor(R.color.black));
        WrapperClass.saveColor(KEY,R.color.black);

    }

    public void buttonClickRed(View view) {
        layout.setBackgroundColor(getResources().getColor(R.color.red));
        WrapperClass.saveColor(KEY,R.color.red);
    }

    public void buttonClickBlackGreen(View view) {
        layout.setBackgroundColor(getResources().getColor(R.color.green));
        WrapperClass.saveColor(KEY,R.color.green);
    }
}
