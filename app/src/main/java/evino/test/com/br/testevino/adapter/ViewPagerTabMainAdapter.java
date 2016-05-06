package evino.test.com.br.testevino.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import evino.test.com.br.testevino.fragments.FragmentTabCart;
import evino.test.com.br.testevino.fragments.FragmentTabWine;

/**
 * Created by techresult on 05/05/2016.
 */
public class ViewPagerTabMainAdapter extends FragmentStatePagerAdapter {
    CharSequence titles[];
    int numOfTabs;

    public ViewPagerTabMainAdapter(FragmentManager fm, CharSequence titles[], int numOfTabs) {
        super(fm);

        this.titles = titles;
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new FragmentTabWine();
        }
        else{
            return new FragmentTabCart();
        }
    }

    public CharSequence getPageTitle(int position){
        return titles[position];
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
