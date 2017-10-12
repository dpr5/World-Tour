package com.dreaminreality.ranad_000.worldtour;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class StatueZeus extends AppCompatActivity {

    private ImageView image;
    private TextView title;
    private TextView title_details;
    private TextView content;
    private ViewPager viewPager;

    private SectionsPageAdapter sectionsPageAdapter;
    private ViewPager mViewPager;

    private ArrayList<Data_for_Cards> Data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statue_zeus);



        SectionsPageAdapter adpater = new SectionsPageAdapter(getSupportFragmentManager());


        image = (ImageView)findViewById(R.id.header_image);
        title = (TextView)findViewById(R.id.title);
        title_details = (TextView)findViewById(R.id.title_details);
        content = (TextView)findViewById(R.id.content);

        image.setImageResource(R.drawable.statue_of_zeus_at_olympia);
        title.setText("Statue of Zeus");
        //title_details.setText("Ancient Greece");
        content.setText(getString(R.string.statue_zeus));

    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(), "7 Facts");
        adapter.addFragment(new Fragment2(), "More Info");
        //adapter.addFragment(new Fragment3(), "Education");
        viewPager.setAdapter(adapter);
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

}
