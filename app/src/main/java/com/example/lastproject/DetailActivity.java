package com.example.lastproject;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    public TextView textD;
    public ImageView imgPt;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textD = findViewById(R.id.tv_description);

        imgPt = findViewById(R.id.img_item_photo);

        Masjid extra = getIntent().getParcelableExtra("objek");
        textD.setText(extra.getDetail());
        imgPt.setImageResource(extra.getPhoto());
    }
}
