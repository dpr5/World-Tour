package com.dreaminreality.ranad_000.worldtour;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ranad_000 on 10/6/2017.
 */
public class Fragment2 extends android.support.v4.app.Fragment {


    private List<String> projects= new ArrayList<String>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag1,container,false);
    }


    public void addProject(String s){
        projects.add(s);
    }
}