package com.example.iphoenixdemo;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.ActionBarActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends FragmentActivity {

	private ViewPager viewPager;
	private TextView textView1;
	private TextView textView2;
	private TextView textView3;
	private List<Fragment> fragmentList = new ArrayList<Fragment>();
	private FragmentAdapter fragmentAdapter;
	private VideoScanFragment fragment1;
	private VideoRecordFragment fragment2;
	private PersonalFragment fragment3;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findId();
        initView();
        
        textView1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				viewPager.setCurrentItem(0);
			}
        	
        });
        textView2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				viewPager.setCurrentItem(1);
			}
        	
        });
        textView3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				viewPager.setCurrentItem(2);
			}
        	
        });
        
    }
    public void findId(){
    	viewPager = (ViewPager)findViewById(R.id.viewpager);
        textView1 = (TextView)findViewById(R.id.VideoScan);
        textView2 = (TextView)findViewById(R.id.VideoRecord);
        textView3 = (TextView)findViewById(R.id.Personal);
    }
    public void initView(){
    	textView1.setTextColor(Color.BLUE);
    	
    	fragment1 = new VideoScanFragment();
    	fragment2 = new VideoRecordFragment();
    	fragment3 = new PersonalFragment();
    	
    	fragmentList.add(fragment1);
    	fragmentList.add(fragment2);
    	fragmentList.add(fragment3);
    	
    	fragmentAdapter = new FragmentAdapter(this.getSupportFragmentManager(),fragmentList);
    	viewPager.setAdapter(fragmentAdapter);
    	viewPager.setCurrentItem(0);
    	
    	viewPager.setOnPageChangeListener(new OnPageChangeListener(){

			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onPageSelected(int arg0) {
				// TODO Auto-generated method stub
				if(arg0 == 0){
					textView1.setTextColor(Color.BLUE);
					textView2.setTextColor(Color.BLACK);
					textView3.setTextColor(Color.BLACK);
				}
				if(arg0 == 1){
					textView2.setTextColor(Color.BLUE);
					textView1.setTextColor(Color.BLACK);
					textView3.setTextColor(Color.BLACK);
				}
				if(arg0 == 2){
					textView3.setTextColor(Color.BLUE);
					textView1.setTextColor(Color.BLACK);
					textView2.setTextColor(Color.BLACK);
				}
			}
    		
    	});    	
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
