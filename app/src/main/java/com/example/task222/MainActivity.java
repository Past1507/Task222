package com.example.task222;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_open_notes) {
            Intent intentNotes = new Intent(MainActivity.this, Task221Activity.class);
            startActivity(intentNotes);
        }
        if (id == R.id.action_open_calendar) {
            Intent intentNotes = new Intent(MainActivity.this, Task213Activity.class);
            startActivity(intentNotes);
        }
        if (id == R.id.action_open_cities) {
            Intent intentNotes = new Intent(MainActivity.this, Task212Activity.class);
            startActivity(intentNotes);
        }
        if (id == R.id.action_open_pay) {
            Intent intentNotes = new Intent(MainActivity.this, Task211Activity.class);
            startActivity(intentNotes);
        }
        if (id == R.id.action_open_subs) {
            Intent intentNotes = new Intent(MainActivity.this, SubsActivity.class);
            startActivity(intentNotes);
        }
        if (id == R.id.action_open_photo) {
            Intent intentNotes = new Intent(MainActivity.this, PhotoActivity.class);
            startActivity(intentNotes);
        }
        return super.onOptionsItemSelected(item);
    }
}
