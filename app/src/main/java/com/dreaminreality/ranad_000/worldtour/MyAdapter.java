package com.dreaminreality.ranad_000.worldtour;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by ranad_000 on 10/12/2017.
 */

public class MyAdapter extends PagerAdapter {


    private Context context;
    private  LayoutInflater layoutInflater;
    private Integer[] images = {R.drawable.giza_pyramid, R.drawable.channel_tunnel, R.drawable.colossus_of_rhodes};


    public MyAdapter(Context context, Integer[] image) {
        this.context = context;
        this.images= image;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout, null);
        ImageView image = (ImageView) view.findViewById(R.id.images_for_slide);
        image.setImageResource(images[position]);

        ViewPager vp = (ViewPager)container;
        vp.addView( view, 0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp = (ViewPager)container;
        View view = (View)object;
        vp.removeView(view);
    }
}