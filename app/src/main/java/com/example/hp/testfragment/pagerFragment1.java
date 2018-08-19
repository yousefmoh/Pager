package com.example.hp.testfragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by hp on 8/17/2018.
 */

public class pagerFragment1 extends Fragment implements AdapterView.OnItemClickListener {
    private static final String KEY_CONTENT = "PagerFragment:Content";
    int imageSource;
    SendMessage SM;

    TextView txtfragment1;
    public  pagerFragment1() {

    }
    interface SendMessage {
        void sendData(String message);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);


    }

  /*  @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        if ((savedInstanceState != null) && savedInstanceState.containsKey(KEY_CONTENT)) {
            imageSource = savedInstanceState.getInt(KEY_CONTENT);
        }

        //Toast.makeText(getActivity(),"Fragment 1 ", Toast.LENGTH_SHORT).show();
    }*/


    @SuppressLint("ResourceType")
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.choose, null);
        txtfragment1=(TextView) root.findViewById(R.id.txtfragment1);
        txtfragment1.setText("FR 1");
        txtfragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // SM.sendData("Data From Fragment 1 ");

            }
        });
        Singleton.getInstance().setData("Data From Fragment 1 ");


        Toast.makeText(getActivity()," onCreateView Fragment 1",Toast.LENGTH_SHORT).show();

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);


        return root;
    }

    @Override
    public void onStart() {
      //  SM.sendData("Data From Fragment 1 ");

        Toast.makeText(getActivity(),"onStart Fragment 1",Toast.LENGTH_SHORT).show();

        super.onStart();
    }

    @Override
    public void onResume() {
        Toast.makeText(getActivity(),"onResume Fragment 1",Toast.LENGTH_SHORT).show();

        super.onResume();
    }

    @Override
    public void onPause() {

        Toast.makeText(getActivity(),"onPause",Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    public void onDetach() {
        Toast.makeText(getActivity(),"onDetach",Toast.LENGTH_SHORT).show();

        //  SM.sendData("Data From Fragment 1 ");
        super.onDetach();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(getActivity(),"onDestroy",Toast.LENGTH_SHORT).show();

        super.onDestroy();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Toast.makeText(getActivity(),"onSaveInstanceState",Toast.LENGTH_SHORT).show();

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


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }


}

