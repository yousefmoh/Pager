package com.example.hp.testfragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



/**
 * Created by hp on 7/29/2018.
 */
public class PagerFragmentAdapter extends FragmentPagerAdapter {

    private int mCount = 4;
    private Context context;

    //    public PagerFragmentAdapter(FragmentManager fm) {
//        super(fm);
//    }
 /*public PagerFragmentAdapter(FragmentManager fm, Context mContext) { //add Context to contructor
    super(fm);
    context = mContext; //pass context
}*/

    public PagerFragmentAdapter(FragmentManager fragmentManager, Context m_context) {
        super(fragmentManager);
        context=m_context;
    }

    int mNumOfTabs;


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return  new pagerFragment1();
            case 1: // Fragment # 0 - This will show FirstFragment different title

                return  new pagerFragment2();
            case 2: // Fragment # 1 - This will show SecondFragment
                return  new pagerFragment3();
            case 3: // Fragment # 1 - This will show SecondFragment
                return  new pagerFragment4();
            default:
                return null;
        }
    }


//    public PagerFragmentAdapter(FragmentManager fm,int numTabs) {
//        super(fm);
//        this.mNumOfTabs = numTabs;
//    }
    /*
    @Override
    public Fragment getItem(int position) {

//        Fragment fragment = null;
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
//                PagerFragment1 pagerFragment1 = new PagerFragment1();
//            fragment = pagerFragment1;
                Toast.makeText(context, "swithc1", Toast.LENGTH_SHORT).show();

           return  new PagerFragment1();

            case 1: // Fragment # 0 - This will show FirstFragment different title
//                PagerFragment2 pagerFragment2 = new PagerFragment2();
//                fragment = pagerFragment2;
                Toast.makeText(context, "swithc2", Toast.LENGTH_SHORT).show();
              return  new PagerFragment2();
            case 2:
//                PagerFragment3 pagerFragment3=new PagerFragment3();
//                fragment =pagerFragment3;
               Toast.makeText(context, "swithc3", Toast.LENGTH_SHORT).show();
                return new PagerFragment3();
            case 3:
//                PagerFragment4 pagerFragment4=new PagerFragment4();
//                fragment = pagerFragment4;
                Toast.makeText(context, "swithc4", Toast.LENGTH_SHORT).show();
                return new PagerFragment4();
            default:
                return null;}

        }
*/



//    @Override
//    public Fragment getItem(int position) {
//        // getItem is called to instantiate the fragment for the given page.
//        Fragment fragment1 = null;
//        ArrayList <Fragment> fragments = new ArrayList <Fragment>();
//        fragments.add(new PagerFragment1());
//        fragments.add(new PagerFragment2());
//        fragments.add(new PagerFragment3());
//        fragments.add(new PagerFragment4());
//        Fragment fragment = fragments.get(position);
//        Bundle args = new Bundle();
//        fragment.setArguments(args);
//
//        if(position==0){
//            fragment1=fragments.get(0);
//
//        }
//         else if (position==1){
//            fragment1=fragments.get(1);
//
//        }
//       else if (position==2){
//            fragment1=fragments.get(2);
//
//        }
//       else if (position==3){
//            fragment1=fragments.get(3);
//
//        }
//        return fragment1;
//    }

//    @Override
//    public int getIconResId(int index) {
//        return ICONS[index % ICONS.length];
//    }



    @Override
    public int getCount() {
        return mCount;
    }

    public void setCount(int count) {
        if (count > 0 && count <= 10) {
            mCount = count;
            notifyDataSetChanged();
        }
    }
}
