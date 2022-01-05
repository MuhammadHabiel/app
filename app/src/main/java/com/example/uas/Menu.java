package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.uas.adapter.RecyclerViewAdapter;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;


public class Menu extends AppCompatActivity {

    RecyclerView list;
    private Object menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        CarouselView carousel = (CarouselView) findViewById(R.id.carousel);
        carousel.setPageCount(4);
        carousel.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                switch (position){
                    case 0:
                        imageView.setImageResource(R.drawable.bromo);
                        break;
                    case 1:
                        imageView.setImageResource(R.drawable.pantai);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.bali);
                        break;
                    default:
                        imageView.setImageResource(R.drawable.laut);
                }
            }
        });

        list = (RecyclerView)findViewById(R.id.list);
        String[] data = {
                "Test 1",
                "Test 2",
                "Test 3",
                "Test 4"};
        RecyclerViewAdapter adapter = new  RecyclerViewAdapter(Menu.this,data);
        list.setAdapter(adapter);
        list.setLayoutManager(new LinearLayoutManager(this));

    }

    public void gambarsatu(View view) {
        Intent intent = new Intent(this,gambarsatu.class);
        startActivity(intent);
    }

    public void gambardua(View view) {
        Intent intent = new Intent(this,gambardua.class);
        startActivity(intent);
    }

    public void gambartiga(View view) {
        Intent intent = new Intent(this,gambartiga.class);
        startActivity(intent);
    }

    public void gambarempat(View view) {
        Intent intent = new Intent(this,gambarempat.class);
        startActivity(intent);
    }

    public void cari(View view) {
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }
}