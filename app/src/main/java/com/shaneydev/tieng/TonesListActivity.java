package com.shaneydev.tieng;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import static com.shaneydev.tieng.R.*;

public class TonesListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_tones_list);
        Toolbar toolbar = (Toolbar) findViewById(id.toolbar);
        setSupportActionBar(toolbar);

        Button btnA1 = (Button)findViewById(id.button_A_reg_flat);
        btnA1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(raw.regular_a);
            }
        });


        Button btnA2 = (Button)findViewById(id.button_A_reg_up);
        btnA2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(raw.regular_a);
            }
        });

        Button btnA3 = (Button)findViewById(id.button_A_reg_down);
        btnA3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(raw.regular_a);
            }
        });

        Button btnA4 = (Button)findViewById(id.button_A_reg_hoi);
        btnA4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(raw.regular_a);
            }
        });

        Button btnA5 = (Button)findViewById(id.button_A_reg_wave);
        btnA5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(raw.regular_a);
            }
        });

        Button btnA6 = (Button)findViewById(id.button_A_reg_dot);
        btnA6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(raw.regular_a);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void playSound(int soundURI) {
        MediaPlayer mp = MediaPlayer.create(TonesListActivity.this, soundURI);
        mp.start();
    }
}
