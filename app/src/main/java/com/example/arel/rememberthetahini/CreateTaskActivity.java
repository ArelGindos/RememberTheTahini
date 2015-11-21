package com.example.arel.rememberthetahini;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Arel on 21/11/2015.
 */
public class CreateTaskActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_task);
    }

    public void create_task(View view) {
        Intent intent = new Intent(this, ListActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);// clear back stack
        startActivity(intent);
        finish();
        return;
    }
}
