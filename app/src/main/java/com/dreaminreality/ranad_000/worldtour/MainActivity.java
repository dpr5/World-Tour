package com.dreaminreality.ranad_000.worldtour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

//created by Dharmesh Rana for Dream In Reality

public class MainActivity extends AppCompatActivity implements RecyclerViewClickListener {

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
        Data_for_Cards card = new Data_for_Cards("Great Pyramids of Giza", R.drawable.great_pyramid_of_giza);
        Data.add(card);

        card = new Data_for_Cards("Hanging Gardens of Babylon", R.drawable.hanging_gardens_of_babylon);
        Data.add(card);

        card = new Data_for_Cards("Lighthouse of Alexandria", R.drawable.lighthouse_of_alexandria);
        Data.add(card);

        card = new Data_for_Cards("Temple of Artemis At Ephesus", R.drawable.temple_of_artemis_at_ephesus);
        Data.add(card);

        card = new Data_for_Cards("Mausoleum at Halicarnassus", R.drawable.mausoleum_at_halicarnassus);
        Data.add(card);

        card = new Data_for_Cards("Colossus of Rhodes", R.drawable.colossus_of_rhodes);
        Data.add(card);

        card = new Data_for_Cards("Statue of Zeus", R.drawable.statue_of_zeus_at_olympia);
        Data.add(card);

    }

    @Override
    public void onListItemClick(int position) {
//        String toastMessage = "Item #" + position + " clicked";
//        mToast = Toast.makeText(this, toastMessage, Toast.LENGTH_LONG);
//        mToast.show();
        switch (position) {
            case 0:
                Intent act0 = new Intent(MainActivity.this, GizaPyramid.class);
                startActivity(act0);
                break;
            case 1:
                Intent act1 = new Intent(MainActivity.this, BabylonGardenActivity.class);
                startActivity(act1);
                break;
            case 2:
                Intent act2 = new Intent(MainActivity.this, LighthouseAlexandria.class);
                startActivity(act2);
                break;
            case 3:
                Intent act3 = new Intent(MainActivity.this, TempleArtemis.class);
                startActivity(act3);
                break;
            case 4:
                Intent act4 = new Intent(MainActivity.this, MausoleumHalicarnassus.class);
                startActivity(act4);
                break;
            case 5:
                Intent act5 = new Intent(MainActivity.this, ColossusRhodes.class);
                startActivity(act5);
                break;
            case 6:
                Intent act6 = new Intent(MainActivity.this, StatueZeus.class);
                startActivity(act6);
                break;
        }
    }
}