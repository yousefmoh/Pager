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

public class pagerFragment2 extends Fragment {
    private static final String KEY_CONTENT = "PagerFragment:Content";
    int imageSource; TextView txtfragment2;
    @SuppressLint("ResourceType")
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {




        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.activity_delivery, null);
        txtfragment2=(TextView) root.findViewById(R.id.txtfragment2);
        txtfragment2.setText("FR 2");
      //  Toast.makeText(getActivity(),"Fragment 2",Toast.LENGTH_SHORT).show();

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


