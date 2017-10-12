package com.dreaminreality.ranad_000.worldtour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ModernWonders extends AppCompatActivity implements RecyclerViewClickListener {


    private SectionsPageAdapter sectionsPageAdapter;
    private ViewPager mViewPager;

    private CardAdapter adapter;
    private RecyclerView recView;

    private List<Data_for_Cards> Data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modern_wonders);
        recView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new CardAdapter(Data, this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setLayoutManager(layoutManager);
        recView.setHasFixedSize(true);
        recView.setAdapter(adapter);

        initData();


    }


    private void initData() {
        Data_for_Cards card = new Data_for_Cards("Channel Tunnel", R.drawable.channel_tunnel);
        Data.add(card);

        card = new Data_for_Cards("CN Tower", R.drawable.cn_tower);
        Data.add(card);

        card = new Data_for_Cards("Empire State Building", R.drawable.empire_state_building);
        Data.add(card);

        card = new Data_for_Cards("Golden Gate Bridge", R.drawable.golden_gate_bridge);
        Data.add(card);

        card = new Data_for_Cards("Itaipu Dam", R.drawable.itaipu_dam);
        Data.add(card);

        card = new Data_for_Cards("Netherlands North Sea Protection Works", R.drawable.netherlands_north_sea_protection_works);
        Data.add(card);

        card = new Data_for_Cards("Panama Canal", R.drawable.panama_cannal
        );
        Data.add(card);

    }

    @Override
    public void onListItemClick(int position) {
//        String toastMessage = "Item #" + position + " clicked";
//        mToast = Toast.makeText(this, toastMessage, Toast.LENGTH_LONG);
//        mToast.show();
        switch (position) {
            case 0:
                Intent act0 = new Intent(ModernWonders.this, ChannelTunnel.class);
                startActivity(act0);
                break;
            case 1:
                Intent act1 = new Intent(ModernWonders.this, CNTower.class);
                startActivity(act1);
                break;
            case 2:
                Intent act2 = new Intent(ModernWonders.this, EmpireStateBuilding.class);
                startActivity(act2);
                break;
            case 3:
                Intent act3 = new Intent(ModernWonders.this, GoldenGateBridge.class);
                startActivity(act3);
                break;
            case 4:
                Intent act4 = new Intent(ModernWonders.this, ItaipuDam.class);
                startActivity(act4);
                break;
            case 5:
                Intent act5 = new Intent(ModernWonders.this, DeltaWorks.class);
                startActivity(act5);
                break;
            case 6:
                Intent act6 = new Intent(ModernWonders.this, PanamaCanal.class);
                startActivity(act6);
                break;
        }
    }
}