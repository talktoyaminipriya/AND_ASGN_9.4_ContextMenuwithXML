package com.example.priya.contextmenuwithxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.textView);

        registerForContextMenu(tv1);
    }
@Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    public boolean onContextItemSelected(MenuItem item) {
        //find out which menu item was pressed
        switch (item.getItemId()) {
            case R.id.ac1:
                Toast.makeText(this, "Clicked on Action1...", Toast.LENGTH_LONG).show();
                return true;
            case R.id.ac2:
                Toast.makeText(this, "Clicked on Action2...", Toast.LENGTH_LONG).show();
                return true;
            case R.id.ac3:
                Toast.makeText(this, "Clicked on Action3...", Toast.LENGTH_LONG).show();
                return true;
            default:
                return false;
        }
    }
}



