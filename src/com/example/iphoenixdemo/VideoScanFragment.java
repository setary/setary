package com.example.iphoenixdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoScanFragment extends Fragment {
	
	private ImageView getDeviceListImg;
	private ImageView snapshotImg;
	private ImageView addImg;
	private ImageView definitionImg;
	private ImageView soundImg;
	private ImageView ptzSettingImg;
	private ImageView alarmImg;
	private ImageView recordVideoImg;
	private VideoView videoView;
	private MediaController media;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		
		View view = inflater.inflate(R.layout.fragment_video_scan, null);
		
		getDeviceListImg = (ImageView)view.findViewById(R.id.getDeviceList);
		snapshotImg = (ImageView)view.findViewById(R.id.snapshot);
		addImg = (ImageView)view.findViewById(R.id.add);
		definitionImg = (ImageView)view.findViewById(R.id.definition);
		soundImg = (ImageView)view.findViewById(R.id.sound);
		ptzSettingImg = (ImageView)view.findViewById(R.id.ptzSetting);
		alarmImg = (ImageView)view.findViewById(R.id.alarm);
		recordVideoImg = (ImageView)view.findViewById(R.id.recordVideo);
		videoView = (VideoView)view.findViewById(R.id.video);
		
		getDeviceListImg.setOnClickListener(new MyOnClickListener(0));
		snapshotImg.setOnClickListener(new MyOnClickListener(1));
		addImg.setOnClickListener(new MyOnClickListener(2));
		definitionImg.setOnClickListener(new MyOnClickListener(3));
		soundImg.setOnClickListener(new MyOnClickListener(4));
		ptzSettingImg.setOnClickListener(new MyOnClickListener(5));
		alarmImg.setOnClickListener(new MyOnClickListener(6));
		recordVideoImg.setOnClickListener(new MyOnClickListener(7));
		
		//videoView与Controller关联
		/*
		 * videoView.setVideoURI(null);
		videoView.setMediaController(media);
		media.setMediaPlayer(videoView);
		videoView.requestFocus();   //videoView获取焦点
*/		
		return view;
	}
	
	class MyOnClickListener implements OnClickListener{

		int num = 0;
		public MyOnClickListener(int num){
			this.num = num;
		}
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(num == 0){
				Intent intent = new Intent(getActivity(), DeviceListActivity.class);
				startActivity(intent);
			}
			if(num == 1) Toast.makeText(getActivity(), "进行抓拍",Toast.LENGTH_SHORT).show();
			if(num == 2) Toast.makeText(getActivity(), "添加",Toast.LENGTH_SHORT).show();
			if(num == 3) Toast.makeText(getActivity(), "请选择清晰度",Toast.LENGTH_SHORT).show();
			if(num == 4) Toast.makeText(getActivity(), "调节声音",Toast.LENGTH_SHORT).show();
			if(num == 5) Toast.makeText(getActivity(), "ptz设置",Toast.LENGTH_SHORT).show();
			if(num == 6) Toast.makeText(getActivity(), "报警",Toast.LENGTH_SHORT).show();
			if(num == 7) Toast.makeText(getActivity(), "录像保存到本地",Toast.LENGTH_SHORT).show();
		}
		
	}	
	
}


