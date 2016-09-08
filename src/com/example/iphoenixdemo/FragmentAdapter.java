package com.example.iphoenixdemo;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

	private List<Fragment> fragmentList = new ArrayList<Fragment>();
	public FragmentAdapter(FragmentManager fm, List<Fragment> fragmentList) {
		super(fm);
		this.fragmentList = fragmentList;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Fragment getItem(int position){
		return fragmentList.get(position);
	}
	
	@Override
	public int getCount(){
		return fragmentList.size();
	}

}
