package com.dreaminreality.ranad_000.worldtour;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StatueZeus extends AppCompatActivity {

    private ImageView image;
    private TextView title;
    private TextView title_details;
    private TextView content;

    private SectionsPageAdapter sectionsPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statue_zeus);


        image = (ImageView)findViewById(R.id.header_image);
        title = (TextView)findViewById(R.id.title);
        title_details = (TextView)findViewById(R.id.title_details);
        content = (TextView)findViewById(R.id.content);

        image.setImageResource(R.drawable.statue_of_zeus_at_olympia);
        title.setText("Statue of Zeus");
        title_details.setText("Ancient Greece");
        content.setText(getString(R.string.statue_zeus));

    }
}
