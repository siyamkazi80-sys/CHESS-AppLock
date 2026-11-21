package com.chess.applock;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(30, 30, 30, 30);
        layout.setBackgroundColor(Color.rgb(245, 240, 225));

        TextView title = new TextView(this);
        title.setText("♟ CHESS");
        title.setTextSize(36);
        title.setTextColor(Color.BLACK);
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("Classic Chess Experience");
        subtitle.setTextSize(16);
        subtitle.setTextColor(Color.DKGRAY);

        Button play = new Button(this);
        play.setText("PLAY CHESS");

        Button protection = new Button(this);
        protection.setText("PROTECTION SETTINGS");

        layout.addView(title);
        layout.addView(subtitle);
        layout.addView(play);
        layout.addView(protection);

        setContentView(layout);
    }
}
