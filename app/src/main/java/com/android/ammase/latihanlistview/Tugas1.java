package com.android.ammase.latihanlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tugas1 extends AppCompatActivity {
    private EditText edit1;
    String vedit = "saya";
    String u;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1);

        edit1 = (EditText)findViewById(R.id.editText);

        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u = edit1.getText().toString();
                if( u.equals( vedit ) )
                    Toast.makeText(getApplicationContext(), "Matches", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "salah", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
