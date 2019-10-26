package com.ardli.submissiondicoding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.ardli.submissiondicoding.framework.Framework;
import com.ardli.submissiondicoding.framework.FrameworkData;
import com.ardli.submissiondicoding.framework.ListFrameworkAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFrameworkAdapter.OnFrameworkListener {
    private static final String EXTRA_DETAIL_FRAMEWORK = "detail_framework";
    RecyclerView rvFramework;
    private ArrayList<Framework> listFramework = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFramework = findViewById(R.id.rv_frameworks);
        rvFramework.setHasFixedSize(true);

        listFramework.addAll(FrameworkData.getListData());
        showRecyclerList();
    }

    public void showRecyclerList() {
        rvFramework.setLayoutManager(new LinearLayoutManager(this));
        ListFrameworkAdapter listFrameworkAdapter = new ListFrameworkAdapter(listFramework, this);
        rvFramework.setAdapter(listFrameworkAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.about_menu) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFrameworkClick(int position) {
        Framework framework = listFramework.get(position);
        Intent intent = new Intent(this, DetailFrameworkActivity.class);
        intent.putExtra(EXTRA_DETAIL_FRAMEWORK, framework);
        startActivity(intent);
    }
}
