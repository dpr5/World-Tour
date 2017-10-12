package com.dreaminreality.ranad_000.worldtour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NaturalWondersActivity extends AppCompatActivity implements RecyclerViewClickListener {


    private SectionsPageAdapter sectionsPageAdapter;
    private ViewPager mViewPager;

    private CardAdapter adapter;
    private RecyclerView recView;

    private List<Data_for_Cards> Data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natural_wonders);

        recView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new CardAdapter(Data, this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setLayoutManager(layoutManager);
        recView.setHasFixedSize(true);
        recView.setAdapter(adapter);

        initData();


    }


    private void initData() {
        Data_for_Cards card = new Data_for_Cards("Grand Canyon", R.drawable.grand_canyon);
        Data.add(card);

        card = new Data_for_Cards("Mount Everest", R.drawable.mt_everest);
        Data.add(card);

        card = new Data_for_Cards("Victory Falls", R.drawable.victory_falls);
        Data.add(card);

        card = new Data_for_Cards("Great Barrier Reef", R.drawable.great_reef);
        Data.add(card);

        card = new Data_for_Cards("Northern Lights", R.drawable.northern_lights);
        Data.add(card);

        card = new Data_for_Cards("Paricutin Volcano", R.drawable.paricutin_volcano);
        Data.add(card);

        card = new Data_for_Cards("Harbor of Rio de Janeiro", R.drawable.rio_harbor_top);
        Data.add(card);

    }

    @Override
    public void onListItemClick(int position) {
//        String toastMessage = "Item #" + position + " clicked";
//        mToast = Toast.makeText(this, toastMessage, Toast.LENGTH_LONG);
//        mToast.show();
        switch (position) {
            case 0:
                Intent act0 = new Intent(NaturalWondersActivity.this, GrandCanyon.class);
                startActivity(act0);
                break;
            case 1:
                Intent act1 = new Intent(NaturalWondersActivity.this, MountEverest.class);
                startActivity(act1);
                break;
            case 2:
                Intent act2 = new Intent(NaturalWondersActivity.this, VictoryFalls.class);
                startActivity(act2);
                break;
            case 3:
                Intent act3 = new Intent(NaturalWondersActivity.this, BarrierReef.class);
                startActivity(act3);
                break;
            case 4:
                Intent act4 = new Intent(NaturalWondersActivity.this, NorthernLights.class);
                startActivity(act4);
                break;
            case 5:
                Intent act5 = new Intent(NaturalWondersActivity.this, ParicutinVolcano.class);
                startActivity(act5);
                break;
            case 6:
                Intent act6 = new Intent(NaturalWondersActivity.this, RioDeJaneiro.class);
                startActivity(act6);
                break;
        }
    }
}