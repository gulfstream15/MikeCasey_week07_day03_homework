package com.codeclan.example.toprubgygrounds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopGroundsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grounds_list);

        TopGrounds topGrounds = new TopGrounds();
        ArrayList<Ground> list = topGrounds.getList();

        // Where this is the context of our current object
        TopGroundsAdapter groundsAdapter = new TopGroundsAdapter(this, list);

        // the list below refers to the XML layout NOT the ArrayList above
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(groundsAdapter);
    }

    public void getMovie(View listItem) {
        Ground ground = (Ground) listItem.getTag();
        Log.d("Stadium Name:", ground.getName());
    }
}
