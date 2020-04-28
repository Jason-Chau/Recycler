package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.recycler.model.ItemArrayAdapter;
import com.example.recycler.model.Item;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Item> dogList = new ArrayList<Item>();

        ItemArrayAdapter itemArrayAdapter = new ItemArrayAdapter(R.layout.list_item, dogList);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.card_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(itemArrayAdapter);

        // Populating list items
        for(int i=0; i<100; i++) {
            dogList.add(new Item("Item: " + i, R.mipmap.ic_launcher));
        }


    }
}
