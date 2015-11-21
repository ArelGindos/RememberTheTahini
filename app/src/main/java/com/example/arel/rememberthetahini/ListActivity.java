package com.example.arel.rememberthetahini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String[] mylist = {"Mock task 1","Mock task 2","Mock task 3","Mock task 4","Mock task 5","Mock task 6","Mock task 7","Mock task 8",
                "Mock task 9","Mock task 10", "Mock task 11","Mock task 12","Mock task 13","Mock task 14","Mock task 15","Mock task 16","Mock task 17",
                "Mock task 18","Mock task 19","Mock task 20",};
        ListAdapter my_list_adapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , mylist);
        ListView arelsList = (ListView) findViewById(R.id.MainList);
        arelsList.setAdapter(my_list_adapter);
    }

    public void add_Activity(View view)
    {
        Intent intent = new Intent(this, CreateTaskActivity.class);
        startActivity(intent);
    }
}
