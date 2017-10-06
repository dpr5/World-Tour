package com.dreaminreality.ranad_000.worldtour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BabylonGardenActivity extends AppCompatActivity {


    private ImageView image;
    private TextView title;
    private TextView title_details;
    private TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babylon_garden);

        image = (ImageView)findViewById(R.id.header_image);
        title = (TextView)findViewById(R.id.title);
        title_details = (TextView)findViewById(R.id.title_details);
        content = (TextView)findViewById(R.id.content);

        image.setImageResource(R.drawable.hanging_gardens_of_babylon);
        title.setText("Hanging Garden in Babylon");
        title_details.setText("Ancient city of Babylon");
        content.setText(getString(R.string.babylon_garden));
    }
}