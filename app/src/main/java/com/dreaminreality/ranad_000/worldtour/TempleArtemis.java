package com.dreaminreality.ranad_000.worldtour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TempleArtemis extends AppCompatActivity {

    private ImageView image;
    private TextView title;
    private TextView title_details;
    private TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple_artemis);

        image = (ImageView)findViewById(R.id.header_image);
        title = (TextView)findViewById(R.id.title);
        title_details = (TextView)findViewById(R.id.title_details);
        content = (TextView)findViewById(R.id.content);

        image.setImageResource(R.drawable.temple_of_artemis_at_ephesus);
        title.setText("Temple of Artemis");
        title_details.setText("Somewhere in the World");
        content.setText(getString(R.string.temple_artemis));
    }
}
