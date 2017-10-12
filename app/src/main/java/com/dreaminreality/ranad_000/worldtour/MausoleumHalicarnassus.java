package com.dreaminreality.ranad_000.worldtour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MausoleumHalicarnassus extends AppCompatActivity {

    private ImageView image;
    private TextView title;
    private TextView title_details;
    private TextView content;

    Fragment1 fragment1 = new Fragment1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mausoleum_halicarnassus);



        image = (ImageView)findViewById(R.id.header_image);
        title = (TextView)findViewById(R.id.title);
        title_details = (TextView)findViewById(R.id.title_details);
        content = (TextView)findViewById(R.id.content);

        image.setImageResource(R.drawable.mausoleum_at_halicarnassus);
        title.setText("Mausoleum at Halicarnassus");
        //title_details.setText("City of Halicarnassus");
        content.setText(getString(R.string.mausoleum_halicarnassus));

    }
}
