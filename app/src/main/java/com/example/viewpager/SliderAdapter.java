package com.example.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SliderAdapter extends FragmentStatePagerAdapter {
    public SliderAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public SliderAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        //add you fragment here
        switch (position){
            case 0:
                return  new ScreenOne();

            case 1:
                return new ScreenTwo();

            case 2:
                return new ScreenThree();
            default:
                return new ScreenOne();

        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
