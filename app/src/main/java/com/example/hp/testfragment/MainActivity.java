package com.example.hp.testfragment;

import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.viewpagerindicator.CirclePageIndicator;

public class MainActivity extends AppCompatActivity {
    PagerFragmentAdapter mAdapter;
    private BottomNavigationView bottomNavigationView;
    ViewPager mPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new PagerFragmentAdapter(getSupportFragmentManager(),getApplicationContext());
        Toast.makeText(this,"onCreate Activity",Toast.LENGTH_SHORT).show();
        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.getCurrentItem();
        //  mPager.setCurrentItem(0);
        // mPager.setOffscreenPageLimit(1);

       // mPager.setOffscreenPageLimit(4);

        mPager.setAdapter(mAdapter);


        CirclePageIndicator mIndicator = (CirclePageIndicator) findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
//        int limit = (mAdapter. getCount()> 0 ? mAdapter.getCount(): 1);
//        mPager.setOffscreenPageLimit(limit);
        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.d("onPageScrolled",position+"");
              //  Toast.makeText(getApplicationContext(),"onPageScrolled  " + "Position:" +position,Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onPageSelected(int position) {
                System.out.println("selected page is :" + position);
               // Toast.makeText(getApplicationContext(),"onPageSelected" + "Position:" +position,Toast.LENGTH_SHORT).show();

                Log.d("onPageSelected",position+"");

            }

            @Override
            public void onPageScrollStateChanged(int state) {
              //  Toast.makeText(getApplicationContext(),"onPageScrollStateChanged" + "Position:" +state,Toast.LENGTH_SHORT).show();

            }
        });
        final float density = getResources().getDisplayMetrics().density;
        mIndicator.setRadius(7 * density);

        mIndicator.setStrokeWidth(1 * density);
    }



}
