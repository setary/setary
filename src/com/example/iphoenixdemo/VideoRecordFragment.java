package com.example.iphoenixdemo;

import com.kedacom.platform2mc.ntv.IPhoenixSDK;
import com.kedacom.platform2mc.ntv.IPhoenixSDK_Android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class VideoRecordFragment extends Fragment {
	
	private TextView textView;
	public static IPhoenixSDK_Android mCuSdk = new IPhoenixSDK_Android();
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.fragment_video_record, null);
		textView = (TextView)view.findViewById(R.id.PlatformType);
		final int a[] = {0};
		int platform = mCuSdk.PlatTypeDetect("172.16.251.34", a);
		textView.setText("平台类型：" + platform);
		return view;
	}
}
