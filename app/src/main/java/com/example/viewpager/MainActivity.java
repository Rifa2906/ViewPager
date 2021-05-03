package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TextView tv_page_counter,tv_next;
    int total = 3 , count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        tv_page_counter = findViewById(R.id.pageCounter);
        tv_page_counter.setText(count +"/"+ total);
        tv_next = findViewById(R.id.tv_next);



        //set adapter
        viewPager.setAdapter(new SliderAdapter(getSupportFragmentManager()));

        //change control on control
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                count = 0;
                count = position + 1;
                tv_page_counter.setText(count +"/"+ total);

                tv_next.setText("Next");
                if(count == total){
                    tv_next.setText("Continue");
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }
}