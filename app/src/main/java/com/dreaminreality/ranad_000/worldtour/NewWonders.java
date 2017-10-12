package com.dreaminreality.ranad_000.worldtour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

//created by Dharmesh Rana for Dream In Reality

public class NewWonders extends AppCompatActivity implements RecyclerViewClickListener {

    private SectionsPageAdapter sectionsPageAdapter;
    private ViewPager mViewPager;

    private CardAdapter adapter;
    private RecyclerView recView;

    private List<Data_for_Cards> Data = new ArrayList<>();

    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new CardAdapter(Data, this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setLayoutManager(layoutManager);
        recView.setHasFixedSize(true);
        recView.setAdapter(adapter);

        initData();


    }


    private void initData() {
        Data_for_Cards card = new Data_for_Cards("Christ the Redeemer", R.drawable.christ_the_redeemer);
        Data.add(card);

        card = new Data_for_Cards("Great Wall of China", R.drawable.great_wall_of_china);
        Data.add(card);

        card = new Data_for_Cards("Taj Mahal", R.drawable.taj_mahal);
        Data.add(card);

        card = new Data_for_Cards("The Colosseum", R.drawable.colosseum_rome);
        Data.add(card);

        card = new Data_for_Cards("Petra", R.drawable.petra_jordan);
        Data.add(card);

        card = new Data_for_Cards("Machu Piccu", R.drawable.machu_pichu);
        Data.add(card);

        card = new Data_for_Cards("Chichén Itzá", R.drawable.chichen_itza_ruins);
        Data.add(card);

    }

    @Override
    public void onListItemClick(int position) {
//        String toastMessage = "Item #" + position + " clicked";
//        mToast = Toast.makeText(this, toastMessage, Toast.LENGTH_LONG);
//        mToast.show();
        switch (position) {
            case 0:
                Intent act0 = new Intent(NewWonders.this, ChristRedeemer.class);
                startActivity(act0);
                break;
            case 1:
                Intent act1 = new Intent(NewWonders.this, GreatWall.class);
                startActivity(act1);
                break;
            case 2:
                Intent act2 = new Intent(NewWonders.this, TajMahal.class);
                startActivity(act2);
                break;
            case 3:
                Intent act3 = new Intent(NewWonders.this, Colosseum.class);
                startActivity(act3);
                break;
            case 4:
                Intent act4 = new Intent(NewWonders.this, Petra.class);
                startActivity(act4);
                break;
            case 5:
                Intent act5 = new Intent(NewWonders.this, MachuPiccu.class);
                startActivity(act5);
                break;
            case 6:
                Intent act6 = new Intent(NewWonders.this, ChichenItza.class);
                startActivity(act6);
                break;
        }
    }
}