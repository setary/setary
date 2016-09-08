package com.example.iphoenixdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

	private Context context;
	private LayoutInflater inflater;
	private ArrayList<DeviceInfo> deviceInfos;
	// 用来控制CheckBox的选中状况
    private static Map<Integer,Boolean> isSelected;
	
	public MyAdapter(Context context, ArrayList<DeviceInfo> deviceInfos){
		this.inflater = LayoutInflater.from(context);
		this.context = context;
		this.deviceInfos = deviceInfos;
		this.setIsSelected(new HashMap<Integer,Boolean>());
		initData();
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return deviceInfos.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup arg2) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;
		if(convertView == null){
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.list_view_item, null);
			holder.imageView = (ImageView)convertView.findViewById(R.id.DeviceIcon);
			holder.textView = (TextView)convertView.findViewById(R.id.DeviceName);
			holder.checkBox = (CheckBox)convertView.findViewById(R.id.ListCheckBox);
					
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder)convertView.getTag();
		}
		
		holder.imageView.setImageResource(R.drawable.device_icon);
		holder.textView.setText(deviceInfos.get(position).getDeviceName());
		if(deviceInfos.get(position).isStatus() == 0) 
			holder.textView.setTextColor(Color.BLACK);		
		
		holder.checkBox.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (getIsSelected().get(position)) {  
                    getIsSelected().put(position, false);
                } else {  
                    getIsSelected().put(position, true);
                }
				notifyDataSetChanged();
			}
			
		});
		holder.checkBox.setChecked(getIsSelected().get(position));
		
		return convertView;
	}
	
    public void initData(){
    	for (int i = 0; i < deviceInfos.size(); i++) {  
    		getIsSelected().put(i, false);  
        } 
    }

	public static Map<Integer,Boolean> getIsSelected() {
		return isSelected;
	}

	public static void setIsSelected(Map<Integer,Boolean> isSelected) {
		MyAdapter.isSelected = isSelected;
	}

	class ViewHolder{
		ImageView imageView;
		TextView textView;
		CheckBox checkBox;
	}
}

