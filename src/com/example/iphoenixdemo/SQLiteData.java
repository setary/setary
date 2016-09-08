package com.example.iphoenixdemo;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class SQLiteData extends SQLiteOpenHelper {
	
	private static final String databaseName = "ListSQLite.db";
	private static final String tableName = "DeviceList";
	private static final int version = 1;
	private Context context;
	private SQLiteDatabase db;
	private ArrayList<DeviceInfo> deviceInfos = new ArrayList<DeviceInfo>();
	
	public SQLiteData(Context context){
		super(context, databaseName, null, version);
	 }

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String sql = "CREATE TABLE IF NOT EXISTS " 
				+ tableName
				+ " (id INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ " deviceName STRING, isDirectory Boolean, isOnline Boolean)";
		db.execSQL(sql);
		Log.i("tag", "create table");
		System.out.println("table is created");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		Log.i("tag", "update" + databaseName +"from" + oldVersion + "to"+ newVersion);
	}

}

