package com.example.iphoenixdemo;

import java.util.ArrayList;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class DeviceListActivity extends ActionBarActivity {
	
	private ListView listview;
	private Button SelectAllBnt;
	private Button CancelSelectBnt;
	private Button StartPreview;
	private ArrayList<DeviceInfo> deviceInfos = new ArrayList<DeviceInfo>();
	private SQLiteData sqliteData;
	private SQLiteDatabase db;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_device_list);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        
        listview = (ListView)findViewById(R.id.DeviceListView);
        SelectAllBnt = (Button)findViewById(R.id.SelectAll);
        StartPreview = (Button)findViewById(R.id.StartPreview);
        CancelSelectBnt = (Button)findViewById(R.id.CancelSelect);
        
        sqliteData = new SQLiteData(this);
        db = sqliteData.getWritableDatabase();
        insertData(db, "DeviceList");
        deviceInfos = getAllDevice(db,"DeviceList");
        for(int i=0;i<deviceInfos.size();i++)
        	System.out.println(deviceInfos.get(i).getDeviceName());				
        final MyAdapter adapter = new MyAdapter(this,deviceInfos);
        listview.setAdapter(adapter);
        
        SelectAllBnt.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				for(int i=0;i<deviceInfos.size();i++){
					MyAdapter.getIsSelected().put(i,true);
				}
				adapter.notifyDataSetChanged();
			}
        	
        });
        
        CancelSelectBnt.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				for(int i=0;i<deviceInfos.size();i++){
					if(MyAdapter.getIsSelected().get(i))
						MyAdapter.getIsSelected().put(i,false);
				}
				adapter.notifyDataSetChanged();
			}
        	
        });
        
        StartPreview.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
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
        if (id == android.R.id.home){
        	finish();
        } else if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void insertData(SQLiteDatabase db, String table){
		ContentValues cv = new ContentValues();
		cv.put("deviceName", "设备1");
		cv.put("isDirectory", 0);
		cv.put("isOnline",1);
		db.insert(table, null, cv);
		
		cv.put("deviceName", "设备2");
		cv.put("isDirectory", 0);
		cv.put("isOnline",1);
		db.insert(table, null, cv);
		
		cv.put("deviceName", "设备3");
		cv.put("isDirectory", 0);
		cv.put("isOnline",0);
		db.insert(table, null, cv);
	}
    
    public ArrayList<DeviceInfo> getAllDevice(SQLiteDatabase db, String table){
		Cursor c = db.rawQuery("select * from "+table, null);
		int columnSize = c.getColumnCount();
		c.moveToFirst();
		while(c.moveToNext()){
			DeviceInfo deviceInfo = new DeviceInfo();
			deviceInfo.setDeviceName(c.getString(c.getColumnIndex("deviceName")));
			deviceInfo.setDirectory(c.getInt(c.getColumnIndex("isDirectory")));
			deviceInfo.setStatus(c.getInt(c.getColumnIndex("isOnline")));
			deviceInfos.add(deviceInfo);
		}
		return deviceInfos;
		
	}
}
