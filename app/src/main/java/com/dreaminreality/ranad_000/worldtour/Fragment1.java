package com.dreaminreality.ranad_000.worldtour;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ranad_000 on 10/6/2017.
 */
public class Fragment1 extends android.support.v4.app.Fragment {

    TextView text;

    private List<String> projects= new ArrayList<String>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag1,container,false);


    }

    public void setText(String s){
        TextView t = (TextView)getView().findViewById(R.id.built_in);
        t.setText("Built in 1990");
    }


    public void addProject(String s){
        projects.add(s);
    }
}