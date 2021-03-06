package com.example.hp.testfragment;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by hp on 8/17/2018.
 */

public class pagerFragment4 extends Fragment {
    private static final String KEY_CONTENT = "PagerFragment:Content";
    int imageSource;TextView txtfragment4;

    public pagerFragment4() {

    }

   /* @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        if ((savedInstanceState != null) && savedInstanceState.containsKey(KEY_CONTENT)) {
            imageSource = savedInstanceState.getInt(KEY_CONTENT);
        }
    }*/
    @SuppressLint("ResourceType")
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.activity_addressenderto, null);
       // Toast.makeText(getActivity(),"Fragment 4",Toast.LENGTH_SHORT).show();
        txtfragment4=(TextView) root.findViewById(R.id.txtfragment4);
        txtfragment4.setText("FR 4");

        return root;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_CONTENT, imageSource);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==android.R.id.home){
            getActivity().finish();
        }
        return super.onOptionsItemSelected(item);
    }

}

