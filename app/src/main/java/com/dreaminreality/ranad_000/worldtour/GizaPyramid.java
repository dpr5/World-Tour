package com.dreaminreality.ranad_000.worldtour;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GizaPyramid extends AppCompatActivity {

    private ImageView image;
    private TextView title;
    private TextView title_details;
    private TextView content;

    private SectionsPageAdapter sectionsPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giza_pyramid);

        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());


        image = (ImageView)findViewById(R.id.header_image);
        title = (TextView)findViewById(R.id.title);
        title_details = (TextView)findViewById(R.id.title_details);
        content = (TextView)findViewById(R.id.content);

        image.setImageResource(R.drawable.great_pyramid_of_giza);
        title.setText("Pyramid of Giza");
        //title_details.setText("Giza, Egypt");
        content.setText(getString(R.string.giza_content));
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(), "7 Facts");
        adapter.addFragment(new Fragment2(), "More Info");
        //adapter.addFragment(new Fragment3(), "Education");
        viewPager.setAdapter(adapter);
    }
}
