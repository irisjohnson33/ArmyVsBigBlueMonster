package com.polyarch.cs295.armyvsbigbluemonster;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class GameActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        final Button menuButton = (Button) findViewById(R.id.menuButton);
        final Button fightButton = (Button) findViewById(R.id.fightButton);
        final TextView countText = (TextView) findViewById(R.id.countTextView);


        View.OnClickListener menuButtonListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuIntent = new Intent(GameActivity.this, MainActivity.class);
                //Tell Android to do something with the new intent
                startActivity(menuIntent);
            }
        };

        View.OnClickListener fightButtonListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countText.setText("Count: ");
            }
        };

        fightButton.setOnClickListener(fightButtonListener);

        menuButton.setOnClickListener(menuButtonListener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
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
