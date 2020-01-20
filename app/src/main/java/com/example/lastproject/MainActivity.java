package com.example.lastproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

//1.Main Activity
//2.Adapter
//3.Data Activity
//4.POJO
//5.POJOData (Sumber Data )
//6.Profile

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMasjid;
    private ArrayList<Masjid> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMasjid = findViewById(R.id.rv_masjid);
        rvMasjid.setHasFixedSize(true);

        list.addAll(MasjidData.getListData());
        showRecyclerlist();
    }

    private void showRecyclerlist() {
        rvMasjid.setLayoutManager(new LinearLayoutManager(this));
        ListMasjidAdapter listMasjidAdapter = new ListMasjidAdapter(list);
        rvMasjid.setAdapter(listMasjidAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode){
            case R.id.btn_profile:
                Intent profileku = new Intent(MainActivity.this, profil.class);
                startActivity(profileku);
                break;
        }

    }

}
