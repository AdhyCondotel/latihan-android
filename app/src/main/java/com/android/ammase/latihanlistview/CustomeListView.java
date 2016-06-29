package com.android.ammase.latihanlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class CustomeListView extends AppCompatActivity {


    String[] itemname ={
            "Safari",
            "Camera",
            "Global",
            "FireFox",
            "UC Browser",
            "Android Folder",
            "VLC Player",
            "Safari",
            "Camera",
            "Cold War"
    };
    String[] itemname2 ={
            "Safari2",
            "Camera2",
            "Global2",
            "FireFox2",
            "UC Browser2",
            "Android Folder2",
            "VLC Player2",
            "Safari2",
            "Camera2",
            "Cold War2"
    };

    Integer[] imgid={
            R.drawable.bn,
            R.drawable.china,
            R.drawable.cr,
            R.drawable.malaysia,
            R.drawable.singapore,
            R.drawable.inggris,
            R.drawable.indonesia,
            R.drawable.malaysia,
            R.drawable.singapore,
            R.drawable.indonesia,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custome_list_view);

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, itemname2, imgid);
        ListView list=(ListView)findViewById(R.id.listView);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }
}
