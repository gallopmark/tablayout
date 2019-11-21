package com.grallopmark.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import pony.xcode.tablayout.CommonTabLayout;
import pony.xcode.tablayout.SegmentTabLayout;
import pony.xcode.tablayout.SlidingTabLayout;
import pony.xcode.tablayout.TabEntity;
import pony.xcode.tablayout.CustomTabEntity;
import pony.xcode.tablayout.OnTabSelectListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CommonTabLayout mCommonTabLayout = findViewById(R.id.mCommonTabLayout);
        List<CustomTabEntity> entities = new ArrayList<>();
        entities.add(new TabEntity("微信"));
        entities.add(new TabEntity("通讯录"));
        entities.add(new TabEntity("发现"));
        entities.add(new TabEntity("我"));
        mCommonTabLayout.setTabData(entities);
        mCommonTabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                Log.e("onTabSelect", CommonTabLayout.class.getSimpleName() + "选择了第" + position + "项");
            }

            @Override
            public void onTabReselect(int position) {
                Log.e("onTabReselect", CommonTabLayout.class.getSimpleName() + "选择了第" + position + "项");
            }
        });
        SegmentTabLayout mSegmentTabLayout = findViewById(R.id.mSegmentTabLayout);
        mSegmentTabLayout.setTabData(new String[]{"微信", "通讯录", "发现", "我"});
        mSegmentTabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                Log.e("onTabSelect", SegmentTabLayout.class.getSimpleName() + "选择了第" + position + "项");
            }

            @Override
            public void onTabReselect(int position) {
                Log.e("onTabReselect", SegmentTabLayout.class.getSimpleName() + "选择了第" + position + "项");
            }
        });
        SlidingTabLayout tabLayout = findViewById(R.id.mSlidingTabLayout);
        ViewPager mViewPager = findViewById(R.id.mViewPager);
        final List<String> list = new ArrayList<>();
        list.add("微信");
        list.add("通讯录");
        list.add("发现");
        list.add("我");
        list.add("朋友圈");
        list.add("设置");
        list.add("钱包");
        list.add("微粒贷");
        list.add("摩拜");
        list.add("哈啰");
        list.add("滴滴");
//        mViewPager.setAdapter(new PagerAdapter() {
//            @Override
//            public int getCount() {
//                return list.size();
//            }
//
//            @Override
//            public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
//                return view == object;
//            }
//
//            @NonNull
//            @Override
//            public Object instantiateItem(@NonNull ViewGroup container, int position) {
//                View view = new View(container.getContext());
//                container.addView(view);
//                return view;
//            }
//
//            @Override
//            public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//                container.removeView((View) object);
//            }
//        });
        tabLayout.setupViewPager(mViewPager, list.toArray(new String[0]));
        tabLayout.setCurrentTab(6);
        tabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                Log.e("onTabSelect", SlidingTabLayout.class.getSimpleName() + "选择了第" + position + "项");
            }

            @Override
            public void onTabReselect(int position) {
                Log.e("onTabReselect", SlidingTabLayout.class.getSimpleName() + "选择了第" + position + "项");
            }
        });
//        tabLayout.setupViewPager(mViewPager, list.toArray(new String[0]));
    }
}
