package evino.test.com.br.testevino.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import evino.test.com.br.testevino.R;
import evino.test.com.br.testevino.adapter.ViewPagerTabMainAdapter;
import evino.test.com.br.testevino.utils.SlidingTabLayout;

/**
 * Created by techresult on 05/05/2016.
 */
public class FragmentTabsMain extends Fragment {

    private AppCompatActivity appCompatActivity;
    private ViewPagerTabMainAdapter adapter;
    private ViewPager viewPager;
    private SlidingTabLayout tabs;
    int numOfTabs = 2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        appCompatActivity = (AppCompatActivity) getActivity();

        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.fragment_tabs_main, container, false);
        CharSequence[] titles = {getResources().getString(R.string.tab_wines), getResources().getString(R.string.tab_cart)};

        adapter = new ViewPagerTabMainAdapter(appCompatActivity.getSupportFragmentManager(), titles, numOfTabs);

        //ViewPager
        viewPager = (ViewPager) layout.findViewById(R.id.pager);
        viewPager.setAdapter(adapter);

        //Sliding Tab Layout view
        tabs = (SlidingTabLayout) layout.findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true);

        tabs.setViewPager(viewPager);

        return layout;
    }

}
