package com.extoix.android.portfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
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

    public void loadApplication(View view) {

        switch(view.getId()){
            case R.id.button_spotify:
                Toast.makeText(getApplicationContext(), R.string.toast_spotify, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_scores:
                Toast.makeText(getApplicationContext(), R.string.toast_scores, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_library:
                Toast.makeText(getApplicationContext(), R.string.toast_library, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_bigger:
                Toast.makeText(getApplicationContext(), R.string.toast_bigger, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_reader:
                Toast.makeText(getApplicationContext(), R.string.toast_reader, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_capstone:
                Toast.makeText(getApplicationContext(), R.string.toast_capstone, Toast.LENGTH_SHORT).show();
                break;
        }

    }

}
