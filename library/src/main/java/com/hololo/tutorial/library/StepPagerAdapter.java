package com.hololo.tutorial.library;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class StepPagerAdapter extends FragmentPagerAdapter {
    private List<Step> stepList;
    private CurrentFragmentListener currentFragmentListener;

    public StepPagerAdapter(FragmentManager fm, List<Step> stepList, CurrentFragmentListener listener) {
        super(fm);
        this.stepList = stepList;
        this.currentFragmentListener = listener;
    }


    @Override
    public int getCount() {
        return stepList.size();
    }

    @Override
    public Fragment getItem(int position) {
        Step step = stepList.get(position);

        return StepFragment.createFragment(step, currentFragmentListener, position);
    }
}
