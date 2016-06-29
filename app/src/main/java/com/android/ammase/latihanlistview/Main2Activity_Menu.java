package com.android.ammase.latihanlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Main2Activity_Menu extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_activity__menu);

        toolbar = (Toolbar) findViewById(R.id.tool);
        setSupportActionBar(toolbar);
        toolbar.setTitle("uuuuu");




        toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                finish();
            }
        });
    }



    public void listView(View view) {
        Intent i = new Intent(Main2Activity_Menu.this, MainActivity.class);
        startActivity(i);
    }

    public void customeListView(View view) {
        Intent i = new Intent(Main2Activity_Menu.this, CustomeListView.class);
        startActivity(i);
    }

    public void tugas1(View view) {

        Intent i = new Intent(Main2Activity_Menu.this, Tugas1.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_layout, menu);
        return true;
    }





    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action) {
        Intent i = new Intent(Main2Activity_Menu.this, Tugas1.class);
            startActivity(i);


            return true;
        } else  if (id == R.id.action1){

        }

        return super.onOptionsItemSelected(item);
    }




}
