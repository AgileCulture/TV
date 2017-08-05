package com.shaneydev.tieng;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class TiengListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tieng_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnA1 = (Button)findViewById(R.id.button_A_regular);
             btnA1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    playSound(R.raw.regular_a);
                }
             });
            btnA1.setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View v) {
                    Intent moveToTonesView = new Intent(TiengListActivity.this, TonesListActivity.class);
                    startActivity(moveToTonesView);
                    return true;
                }
            });

        Button btnA2 = (Button)findViewById(R.id.button_A_smiley);
            btnA2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    playSound(R.raw.smiley_a);
                }
            });
//               btnA1.setOnLongClickListener(new View.OnLongClickListener() {
//                public boolean onLongClick(View v) {
//                    return true;
//                }
//            });


        Button btnA3 = (Button)findViewById(R.id.button_A_hat);
                btnA3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        playSound(R.raw.a_hat);
                    }
                });
                btnA3.setOnLongClickListener(new View.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        playSound(R.raw.regular_a);
                        return true;
                    }
                });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    private void genericOnClickListener() {
        // Think if there's a possible solution to refactor all the onClicks in one place, passing in the button obj and sound URI
    }

    private void playSound(int soundFile) {
        MediaPlayer mp = MediaPlayer.create(TiengListActivity.this, soundFile);
        mp.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tieng_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
