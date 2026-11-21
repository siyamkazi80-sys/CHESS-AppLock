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

        Button play = new Button(this);
        play.setText("PLAY CHESS");

        Button lock = new Button(this);
        lock.setText("PROTECTION SETTINGS");

        layout.addView(title);
        layout.addView(play);
        layout.addView(lock);

        setContentView(layout);
    }
}
