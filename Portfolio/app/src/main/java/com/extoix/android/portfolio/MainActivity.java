package com.extoix.android.portfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void loadSpotify(View view) {
        CharSequence message = "Load Spotify Streamer";
        displayToast(message);
    }

    public void loadScores(View view) {
        CharSequence message = "Load Football Scores App";
        displayToast(message);
    }

    public void loadLibrary(View view) {
        CharSequence message = "Load Library App";
        displayToast(message);
    }

    public void loadBigger(View view) {
        CharSequence message = "Load Build It Bigger App";
        displayToast(message);
    }

    public void loadReader(View view) {
        CharSequence message = "Load XYZ Reader App";
        displayToast(message);
    }

    public void loadCapstone(View view) {
        CharSequence message = "Load Capstone App";
        displayToast(message);
    }

    private void displayToast(CharSequence message) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

}
